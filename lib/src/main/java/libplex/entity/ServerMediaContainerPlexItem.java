package libplex.entity;

import java.net.URI;

import libplex.Plex;

public abstract class ServerMediaContainerPlexItem extends MediaContainerPlexItem {
    private Server server;

    protected ServerMediaContainerPlexItem(Plex plex, URI uri, Server server) {
        super(plex, uri);
        this.server = server;
    }

    protected Server getServer() {
        return server;
    }
}
