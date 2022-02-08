package libplex;

import java.net.URI;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Pattern;

import org.apache.commons.io.IOUtils;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.ClientRequestFilter;
import jakarta.ws.rs.client.ClientResponseFilter;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.core.Form;
import jakarta.ws.rs.core.MultivaluedMap;
import jakarta.ws.rs.core.UriBuilder;
import libplex.entity.Parent;
import libplex.entity.Server;
import libplex.plex.entity.MediaContainer;
import libplex.plex.entity.MyPlex;
import libplex.plex.entity.Pin;
import libplex.plex.entity.User;

public class Plex implements AutoCloseable {
    private Client client;

    private Plex(Client client, String xPlexToken) {
	this.client = client;
	this.client.register((ClientRequestFilter) requestContext -> {
	    URI updatedUri = UriBuilder.fromUri(requestContext.getUri())
		    .queryParam("X-Plex-Token", xPlexToken)
		    .build();
	    requestContext.setUri(updatedUri);
	});
    }

    public URI uri(String key, Parent parent, Server server, Map<String, Object[]> queryParams) {
	UriBuilder uriBuilder;
	if (key.startsWith("/"))
	    uriBuilder = UriBuilder.fromUri(server.getUri());
	else
	    uriBuilder = UriBuilder.fromUri(parent.getUri());

	if (!key.contains("?")) {
	    uriBuilder.path(key);
	} else {
	    String[] split = key.split(Pattern.quote("?"));
	    uriBuilder.path(split[0]);
	    split = split[1].split(Pattern.quote("="));
	    uriBuilder.queryParam(split[0], split[1]);
	}
	if (queryParams != null) {
	    Iterator<Entry<String, Object[]>> iterator = queryParams.entrySet()
		    .iterator();
	    while (iterator.hasNext()) {
		Entry<String, Object[]> entry = iterator.next();
		uriBuilder.queryParam(entry.getKey(), entry.getValue());
	    }
	}
	return uriBuilder.build();
    }

    public <A> A executeGet(String key, Parent parent, Server server, Class<A> outputClass,
	    Map<String, Object[]> queryParams) {
	return executeGet(uri(key, parent, server, queryParams), outputClass);
    }

    public <A> A executeGet(URI uri, Class<A> outputClass) {
	return client.target(uri)
		.request()
		.get(outputClass);
    }

    public Server localServer(String host, int port) {
	URI uri = UriBuilder.newInstance()
		.scheme("http")
		.host(host)
		.port(port)
		.build();
	MediaContainer mc = executeGet(uri, MediaContainer.class);
	return new Server(mc, uri, this);
    }

    public MyPlex myPlex() {
	MyPlex mp = executeGet(UriBuilder.fromPath("https://plex.tv/pms/servers.xml")
		.build(), MyPlex.class);
	mp.setPlex(this);
	return mp;
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
	    this.client.register((ClientRequestFilter) requestContext -> requestContext.getHeaders()
		    .putSingle("X-Plex-Platform", plexPlatform));
	    return this;
	}

	public Builder setPlexPlatformVersion(String plexPlatformVersion) {
	    this.client.register((ClientRequestFilter) requestContext -> requestContext.getHeaders()
		    .putSingle("X-Plex-Platform-Version", plexPlatformVersion));
	    return this;
	}

	/**
	 * 
	 * @param plexProvides or more of [player, controller, server]
	 * @return
	 */
	public Builder addPlexProvides(String plexProvides) {
	    this.client.register((ClientRequestFilter) requestContext -> requestContext.getHeaders()
		    .add("X-Plex-Provides", plexProvides));
	    return this;
	}

	public Builder setPlexDevice(String plexDevice) {
	    this.client.register((ClientRequestFilter) requestContext -> requestContext.getHeaders()
		    .add("X-Plex-Device", plexDevice));
	    return this;
	}

	public Builder setPlexDeviceName(String plexDeviceName) {
	    this.client.register((ClientRequestFilter) requestContext -> requestContext.getHeaders()
		    .add("X-Plex-Device-Name", plexDeviceName));
	    return this;
	}

	public Plex signIn(String username, char[] password) {
	    Form form = new Form().param("user[login]", username)
		    .param("user[password]", new String(password));
	    User user = client.target("https://plex.tv/users/sign_in.xml")
		    .request()
		    .post(Entity.form(form), User.class);
	    return withAuthenticationToken(user.getAuthenticationToken());
	}

	public Plex withAuthenticationToken(String authenticationToken) {
	    return new Plex(client, authenticationToken);
	}

	public Pin requestPIN() {
	    return client.target("https://plex.tv/pins.xml")
		    .request()
		    .post(null, Pin.class);
	}

	public Pin verifyPin(int pinId) {
	    return client.target("https://plex.tv/pins/".concat(Integer.toString(pinId))
		    .concat(".xml"))
		    .request()
		    .get(Pin.class);
	}
    }
}