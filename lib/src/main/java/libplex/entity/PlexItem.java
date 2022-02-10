package libplex.entity;

import java.net.URI;

import libplex.PlexClient;

public abstract class PlexItem {
    private PlexClient plexClient;
    private URI uri;

    protected PlexItem(PlexClient plex, URI uri) {
        this.plexClient = plex;
        this.uri = uri;
    }

    protected PlexClient getPlexClient() {
        return plexClient;
    }

    public URI getUri() {
        return uri;
    }
}