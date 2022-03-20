package kekolab.libplex.entity;

import java.net.URI;

import kekolab.libplex.PlexClient;

public abstract class PlexItem {
    private PlexClient client;
    private URI uri;

    public static PlexItem build(Class<? extends PlexItem> cls, PlexClient client, URI uri) {
        PlexItem item = client.executeGet(uri, cls);
        item.setClient(client);
        item.setUri(uri);
        return item;
    }

    protected void setUri(URI uri) {
        this.uri = uri;
    }

    protected PlexClient getClient() {
        return client;
    }

    protected void setClient(PlexClient client) {
        this.client = client;
    }

    public URI getUri() {
        return uri;
    }
}
