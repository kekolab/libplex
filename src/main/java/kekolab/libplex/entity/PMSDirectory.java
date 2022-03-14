package kekolab.libplex.entity;

import kekolab.libplex.PlexClient;

public abstract class PMSDirectory<A extends PMSItem> {
    private String key;
    private PlexClient client;
    private PMSItem parent;
    private PlexMediaServer server;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    protected void setClient(PlexClient client) {
        this.client = client;
    }

    protected void setParent(PMSItem parent) {
        this.parent = parent;
    }

    protected void setServer(PlexMediaServer server) {
        this.server = server;
    }

    protected PlexClient getClient() {
        return client;
    }

    protected PlexMediaServer getServer() {
        return server;
    }

    protected A content(Class<A> target) {
        return new PMSItem.Builder<A>(client, client.uriBuilder()
                .fromKey(getKey(), parent, server)
                .build(), server).build(target);
    }

    public abstract A content();
}
