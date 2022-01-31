package libplex;

import java.net.URI;

import org.apache.commons.io.IOUtils;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.ClientRequestFilter;
import jakarta.ws.rs.client.ClientResponseFilter;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.core.Form;
import jakarta.ws.rs.core.MultivaluedMap;
import jakarta.ws.rs.core.UriBuilder;
import libplex.entity.Pin;
import libplex.plextv.entity.MyPlex;
import libplex.plextv.entity.User;

public class PlexClient implements AutoCloseable {
	private Client client;

	private PlexClient(Client client, String xPlexToken) {
		this.client = client;
		this.client.register((ClientRequestFilter) requestContext -> {
			URI updatedUri = UriBuilder
					.fromUri(requestContext
							.getUri())
					.queryParam("X-Plex-Token", xPlexToken)
					.build();
			requestContext.setUri(updatedUri);
		});
	}

	public MyPlex fetchMyPlex() {
		return client
				.target("https://plex.tv/pms/servers.xml")
				.request()
				.get(MyPlex.class)
				.setClient(client);
	}

	@Override
	public void close() {
		client.close();
	}

	public static class Builder {
		private Client client;

		public Builder(String plexProduct, String plexVersion, String plexClientIdentifier) {
			this.client = ClientBuilder.newClient()
					.register((ClientRequestFilter) requestContext -> {
						MultivaluedMap<String, Object> headers = requestContext.getHeaders();
						headers.add("X-Plex-Product", plexProduct);
						headers.add("X-Plex-Version", plexVersion);
						headers.add("X-Plex-Client-Identifier", plexClientIdentifier);
					})
					.register((ClientResponseFilter) (requestContext, responseContext) -> {
						String payload = IOUtils.toString(responseContext.getEntityStream(), "UTF-8");
						responseContext.setEntityStream(IOUtils.toInputStream(payload, "UTF-8"));
						System.out.println(payload);
					});
		}

		public Builder setPlexPlatform(String plexPlatform) {
			this.client.register((ClientRequestFilter) requestContext -> requestContext.getHeaders().putSingle("X-Plex-Platform", plexPlatform));
			return this;
		}

		public Builder setPlexPlatformVersion(String plexPlatformVersion) {
			this.client.register((ClientRequestFilter) requestContext -> requestContext.getHeaders().putSingle("X-Plex-Platform-Version", plexPlatformVersion));
			return this;
		}

		/**
		 * 
		 * @param plexProvides or more of [player, controller, server]
		 * @return
		 */
		public Builder addPlexProvides(String plexProvides) {
			this.client.register((ClientRequestFilter) requestContext -> requestContext.getHeaders().add("X-Plex-Provides", plexProvides));
			return this;
		}

		public Builder setPlexDevice(String plexDevice) {
			this.client.register((ClientRequestFilter) requestContext -> requestContext.getHeaders().add("X-Plex-Device", plexDevice));
			return this;
		}

		public Builder setPlexDeviceName(String plexDeviceName) {
			this.client.register((ClientRequestFilter) requestContext -> requestContext.getHeaders().add("X-Plex-Device-Name", plexDeviceName));
			return this;
		}

		public PlexClient signIn(String username, char[] password) {
			Form form = new Form()
					.param("user[login]", username)
					.param("user[password]", new String(password));
			User user = client
					.target("https://plex.tv/users/sign_in.xml")
					.request()
					.post(Entity.form(form), User.class);
			return withAuthenticationToken(user.getAuthenticationToken());
		}

		public PlexClient withAuthenticationToken(String authenticationToken) {
			return new PlexClient(client, authenticationToken);
		}

		public Pin requestPIN() {
			return client
					.target("https://plex.tv/pins.xml")
					.request()
					.post(null, Pin.class);
		}

		public Pin verifyPin(int pinId) {
			return client
					.target("https://plex.tv/pins/"
							.concat(Integer.toString(pinId))
							.concat(".xml"))
					.request()
					.get(Pin.class);	
		}
	}
}