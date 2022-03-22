package kekolab.libplex.entity;

import java.net.URI;

import kekolab.libplex.PlexClient;

public class PlexMediaServerItem extends PlexItem {
    private PlexMediaServer server;

    public static PlexMediaServerItem build(Class<? extends PlexMediaServerItem> cls, PlexClient client, URI uri,
            PlexMediaServer server) {
        PlexMediaServerItem item = (PlexMediaServerItem) build(cls, client, uri);
        item.setServer(server);
        return item;
    }

    protected void setServer(PlexMediaServer server) {
        this.server = server;
    }

    protected PlexMediaServer getServer() {
        return server;
    }
}
