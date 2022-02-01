package libplex.plextv.entity;

import java.io.IOException;
import java.net.URI;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.core.UriBuilder;
import jakarta.ws.rs.core.UriBuilderException;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlJavaTypeAdapter(DirectoryAdapter.class)
public abstract class Directory<A> implements Parent, WithDetails<A> {
    private String key;
    private String title;

    private Parent parent;
    private Server server;
    private URI uri;
    private Client client;

    public Directory() {
	super();
    }

    public String getKey() {
	return key;
    }

    public void setKey(String key) {
	this.key = key;
    }

    public String getTitle() {
	return title;
    }

    public void setTitle(String title) {
	this.title = title;
    }

    @Override
    public URI getUri() throws IllegalArgumentException, UriBuilderException, IOException {
	if (uri == null) {
	    if (!key.startsWith("/")) {
		uri = UriBuilder.fromUri(parent.getUri())
			.path(key)
			.build();
	    } else {
		uri = UriBuilder.fromUri(server.getUri())
			.path(key)
			.build();
	    }
	}
	return uri;
    }

    public Directory<A> setParent(Parent parent) {
	this.parent = parent;
	return this;
    }

    public Directory<A> setServer(Server server) {
	this.server = server;
	return this;
    }

    public Directory<A> setClient(Client client) {
	this.client = client;
	return this;
    }

    protected Client getClient() {
	return client;
    }

    protected A fetchDetails(Class<A> clz) throws IOException {
	return getClient().target(getUri())
		.request()
		.get(clz);
    }

    protected Server getServer() {
	return server;
    }
}