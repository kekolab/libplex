package kekolab.libplex.entity;

import java.net.URI;

import kekolab.libplex.PlexClient;

public abstract class PlexItem {
    private PlexClient client;
    private URI uri;
    
    protected static PlexItem build(Class<? extends PlexItem> cls, PlexClient client, URI uri) {
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

    @Deprecated
    public static class Builder<A extends PlexItem> {
        private URI uri;
        private PlexClient client;

        protected URI getUri() {
			return uri;
		}

		protected PlexClient getClient() {
			return client;
		}

		@Deprecated
        public Builder(PlexClient client, URI uri) {
            this.client = client;
            this.uri = uri;
        }

        @Deprecated
        public A build(Class<A> target) {
        	return (A) PlexItem.build(target, client, uri);
        }
    }
}
