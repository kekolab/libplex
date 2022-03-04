package kekolab.libplex.entity;

import java.net.URI;

import kekolab.libplex.PlexClient;

public abstract class ServerMediaContainerPlexItem extends MediaContainerPlexItem {
    private ServerContent server;

    protected ServerMediaContainerPlexItem(PlexClient plex, URI uri, ServerContent server) {
        super(plex, uri);
        this.server = server;
    }

    protected ServerContent getServer() {
        return server;
    }
}
