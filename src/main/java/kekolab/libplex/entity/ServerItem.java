package kekolab.libplex.entity;

import java.net.URI;

import kekolab.libplex.PlexClient;

public abstract class ServerItem extends PlexItem {
    private PlexMediaServer server;
    
    protected static ServerItem build(Class<? extends ServerItem> cls, PlexClient client, URI uri, PlexMediaServer server) {
    	ServerItem item =  (ServerItem) build(cls, client, uri);
    	item.setServer(server);
    	return item;
    }

    protected void setServer(PlexMediaServer server) {
        this.server = server;
    }

    protected PlexMediaServer getServer() {
        return server;
    }

    @Deprecated
    public static class Builder<A extends ServerItem> extends PlexItem.Builder<A> {
        private PlexMediaServer server;

        public Builder(PlexClient client, URI uri, PlexMediaServer server) {
            super(client, uri);
            this.server = server;
        }

        @Override
        public A build(Class<A> target) {
        	return (A) ServerItem.build(target, getClient(), getUri(), server);
        }
    }
}
