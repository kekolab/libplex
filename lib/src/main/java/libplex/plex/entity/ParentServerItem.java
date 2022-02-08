package libplex.plex.entity;

import java.net.URI;

import libplex.Plex;

public abstract class ParentServerItem extends MediaContainerItem implements Parent {
    private Server server;
    private URI uri;

    protected ParentServerItem(Plex plex, MediaContainer mediaContainer, Server server, URI uri) {
        super(plex, mediaContainer);
        this.uri = uri;
        this.server = server;
    }

    protected Server getServer() {
        return server;
    }

    @Override
    public URI getUri() {
        return uri;
    }
}
