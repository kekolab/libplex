package kekolab.libplex.entity;

import java.net.URI;

import kekolab.libplex.PlexClient;

public abstract class PlexItem {
    private PlexClient client;
    private URI uri;

    protected PlexClient getClient() {
        return client;
    }

    protected void setClient(PlexClient client) {
        this.client = client;
    }

    public URI getUri() {
        return uri;
    }

    public static class Builder<A extends PlexItem> {
        private URI uri;
        private PlexClient client;

        public Builder(PlexClient client, URI uri) {
            this.client = client;
            this.uri = uri;
        }

        public A build(Class<A> target) {
            A item = client.executeGet(uri, target);
            ((PlexItem) item).setClient(client);
            ((PlexItem) item).uri = uri;
            return item;
        }
    }
}
