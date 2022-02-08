package libplex.entity;

import libplex.Plex;
import libplex.plex.entity.MediaContainer;

public abstract class MediaContainerItem extends PlexItem {
	private MediaContainer mediaContainer;

	protected MediaContainerItem(Plex plex, MediaContainer mediaContainer) {
		super(plex);
		this.mediaContainer = mediaContainer;
	}

	protected MediaContainer getMediaContainer() {
		return mediaContainer;
	}

}
