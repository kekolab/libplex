package libplex.plex.entity;

import libplex.Plex;

public abstract class Item {
    private Plex plex;
    private MediaContainer mediaContainer;

    protected Item(Plex plex, MediaContainer mediaContainer) {
	this.plex = plex;
	this.mediaContainer = mediaContainer;
    }

    protected Plex getPlex() {
	return plex;
    }

    protected MediaContainer getMediaContainer() {
	return mediaContainer;
    }

}
