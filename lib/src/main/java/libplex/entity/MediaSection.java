package libplex.entity;

import java.net.URI;

import libplex.PlexService;
import libplex.PlexUriBuilder;

public abstract class MediaSection extends ServerMediaContainerPlexItem {
    public MediaSection(PlexService plex, URI uri, Server server) {
        super(plex, uri, server);
    }

    public Integer getAllowSync() {
        return getMediaContainer().getAllowSync();
    }

    public URI getArt() {
        return PlexUriBuilder.fromKey(getMediaContainer().getArt(), this, getServer())
                .build();
    }

    public Integer getLibrarySectionID() {
        return getMediaContainer().getLibrarySectionID();
    }

    public URI getThumb() {
        return PlexUriBuilder.fromKey(getMediaContainer().getThumb(), this, getServer())
                .build();
    }

    public String getTitle() {
        return getMediaContainer().getTitle1();
    }
}
