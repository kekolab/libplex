package libplex.entity;

import java.net.URI;

import libplex.PlexService;

public abstract class PlexItem {
    private PlexService plexClient;
    private URI uri;

    protected PlexItem(PlexService plex, URI uri) {
        this.plexClient = plex;
        this.uri = uri;
    }

    protected PlexService getPlexClient() {
        return plexClient;
    }

    public URI getUri() {
        return uri;
    }
}