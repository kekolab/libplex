package libplex.entity;

import java.net.URI;

import libplex.Plex;

public abstract class PlexItem {
    private Plex plex;
    private URI uri;

    protected PlexItem(Plex plex, URI uri) {
        this.plex = plex;
        this.uri = uri;
    }

    protected Plex getPlex() {
        return plex;
    }

    public URI getUri() {
        return uri;
    }
}