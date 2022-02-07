package libplex.plex.entity;

import libplex.Plex;

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
