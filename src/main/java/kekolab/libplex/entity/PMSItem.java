package kekolab.libplex.entity;

import java.net.URI;

import kekolab.libplex.PlexClient;

public abstract class PMSItem extends PlexItem {
    private PlexMediaServer server;

    private void setServer(PlexMediaServer server) {
        this.server = server;
    }

    protected PlexMediaServer getServer() {
        return server;
    }

    public static class Builder<A extends PMSItem> extends PlexItem.Builder<A> {
        private PlexMediaServer server;

        public Builder(PlexClient client, URI uri, PlexMediaServer server) {
            super(client, uri);
            this.server = server;
        }

        @Override
        public A build(Class<A> target) {
            A item = super.build(target);
            ((PMSItem) item).setServer(server);
            return item;
        }
    }
}
