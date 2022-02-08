package libplex.entity;

import java.net.URI;

import libplex.Plex;
import libplex.plex.entity.MediaContainer;

public abstract class MediaContainerPlexItem extends PlexItem {
    private MediaContainer mediaContainer;

    protected MediaContainerPlexItem(Plex plex, URI uri) {
        super(plex, uri);
        this.mediaContainer = plex.executeGet(uri, MediaContainer.class);
    }

    protected MediaContainer getMediaContainer() {
        return mediaContainer;
    }
}
