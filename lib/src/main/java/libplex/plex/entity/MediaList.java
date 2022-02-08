package libplex.plex.entity;

import java.net.URI;
import java.util.List;

import libplex.Plex;

public abstract class MediaList<A extends Medium> extends ParentServerItem {
    protected MediaList(MediaContainer mediaContainer, URI uri, Server server, Plex plex) {
        super(plex, mediaContainer, server, uri);
    }

    public URI getArt() {
        return getPlex().uri(getMediaContainer().getArt(), this, getServer(), null);
    }

    public Integer getLibrarySectionID() {
        return getMediaContainer().getLibrarySectionID();
    }

    public String getLibrarySectionTitle() {
        return getMediaContainer().getLibrarySectionTitle();
    }

    public URI getThumb() {
        return getPlex().uri(getMediaContainer().getThumb(), this, getServer(), null);
    }

    public String getTitle() {
        return getMediaContainer().getTitle1();
    }

    public String getSubtitle() {
        return getMediaContainer().getTitle2();
    }

    public abstract List<A> list();
}
