package libplex.plextv.entity;

import java.net.URI;

import jakarta.ws.rs.client.Client;

public interface MediaContainer {
	void setUri(URI uri);

	URI getUri();

	void setClient(Client client);

	Server getServer();

	void setServer(Server server);
}
