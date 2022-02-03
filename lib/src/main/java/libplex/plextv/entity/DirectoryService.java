package libplex.plextv.entity;

import java.io.IOException;
import java.net.URI;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.core.UriBuilder;

public class DirectoryService<A> {
	private URI uri;
	private String key;
	private Parent parent;
	private Server server;
	private Client client;

	public DirectoryService(Client client, Directory directory, Parent parent, Server server) {
		this.client = client;
		this.key = directory.getKey();
		this.parent = parent;
		this.server = server;
	}

	public URI getUri() throws IOException {
		if (uri == null) {
			UriBuilder uriBuilder;
			if (!key.startsWith("/")) {
				uriBuilder = UriBuilder.fromUri(parent.getUri());
			} else {
				uriBuilder = UriBuilder.fromUri(server.getUri());
			}
			uri = uriBuilder.path(key)
					.build();
		}
		return uri;
	}

	public A get(Class<A> clz) throws IOException {
		return client.target(getUri())
				.request()
				.get(clz);
	}
}
