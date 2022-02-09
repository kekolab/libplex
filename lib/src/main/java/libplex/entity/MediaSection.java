package libplex.entity;

import java.net.URI;

import libplex.Plex;

public abstract class MediaSection extends ServerMediaContainerPlexItem {
    public MediaSection(Plex plex, URI uri, Server server) {
        super(plex, uri, server);
    }

    public Integer getAllowSync() {
        return getMediaContainer().getAllowSync();
    }

    public URI getArt() {
        return getPlex().uri(getMediaContainer().getArt(), this, getServer(), null);
    }

    public Integer getLibrarySectionID() {
        return getMediaContainer().getLibrarySectionID();
    }

    public URI getThumb() {
        return getPlex().uri(getMediaContainer().getThumb(), this, getServer(), null);
    }

    public String getTitle() {
        return getMediaContainer().getTitle1();
    }
}
