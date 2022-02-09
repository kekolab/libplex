package libplex.entity;

import java.net.URI;

import libplex.Plex;
import libplex.plex.entity.MediaContainer;

public abstract class MediaSection extends ServerMediaContainerPlexItem {
    private MediaContainer mediaContainer;

    public MediaSection(Plex plex, URI uri, Server server) {
        super(plex, uri, server);
    }

    public URI getArt() {
        return getPlex().uri(getMediaContainer().getArt(), this, getServer(), null);
    }

    public int getSectionId() {
        return getMediaContainer().getLibrarySectionID();
    }

    public URI getThumb() {
        return getPlex().uri(getMediaContainer().getThumb(), this, getServer(), null);
    }

    public String getTitle() {
        return getMediaContainer().getTitle1();
    }

    public Integer getAllowSync() {
        return mediaContainer.getAllowSync();
    }

    public Integer getLibrarySectionID() {
        return mediaContainer.getLibrarySectionID();
    }
}
