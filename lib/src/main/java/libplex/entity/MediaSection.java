package libplex.entity;

import java.net.URI;

import libplex.Plex;
import libplex.plex.entity.MediaContainer;

public abstract class MediaSection extends ParentServerItem {
    public MediaSection(MediaContainer mc, URI uri, Server server, Plex plex) {
        super(plex, mc, server, uri);
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
}
