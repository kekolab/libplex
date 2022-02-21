package libplex.entity;

import java.net.URI;

import libplex.PlexService;

public abstract class ServerMediaContainerPlexItem extends MediaContainerPlexItem {
    private Server server;

    protected ServerMediaContainerPlexItem(PlexService plex, URI uri, Server server) {
        super(plex, uri);
        this.server = server;
    }

    protected Server getServer() {
        return server;
    }
}
