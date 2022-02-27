package kekolab.libplex.entity;

import java.net.URI;

import kekolab.libplex.PlexService;

public abstract class ServerMediaContainerPlexItem extends MediaContainerPlexItem {
    private ServerContent server;

    protected ServerMediaContainerPlexItem(PlexService plex, URI uri, ServerContent server) {
        super(plex, uri);
        this.server = server;
    }

    protected ServerContent getServer() {
        return server;
    }
}
