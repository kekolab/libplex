package kekolab.libplex.entity;

import java.net.URI;

import kekolab.libplex.PlexClient;

public abstract class MediaSection extends ServerMediaContainerPlexItem {
    public MediaSection(PlexClient plex, URI uri, ServerContent server) {
        super(plex, uri, server);
    }

    public int getSize() {
        return getMediaContainer().getSize();
    }

    public Integer getAllowSync() {
        return getMediaContainer().getAllowSync();
    }

    public URI getArt() {
        return getPlexClient().uriBuilder()
                .fromKey(getMediaContainer().getArt(), this, getServer())
                .build();
    }

    public String getContent() {
        return getMediaContainer().getContent();
    }

    public String getIdentifier() {
        return getMediaContainer().getIdentifier();
    }

    public Integer getLibrarySectionID() {
        return getMediaContainer().getLibrarySectionID();
    }

    public String getMediaTagPrefix() {
        return getMediaContainer().getMediaTagPrefix();
    }

    public Integer getMediaTagVersion() {
        return getMediaContainer().getMediaTagVersion();
    }

    public URI getThumb() {
        return getPlexClient().uriBuilder()
                .fromKey(getMediaContainer().getThumb(), this, getServer())
                .build();
    }

    public String getTitle() {
        return getTitle1();
    }

    public String getTitle1() {
        return getMediaContainer().getTitle1();
    }

    public String viewGroup() {
        return getMediaContainer().getViewGroup();
    }

    public Integer getViewMode() {
        return getMediaContainer().getViewMode();
    }
}
