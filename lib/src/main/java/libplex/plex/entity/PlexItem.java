package libplex.plex.entity;

import libplex.Plex;

public abstract class PlexItem {
	protected Plex plex;

	protected PlexItem(Plex plex) {
		this.plex = plex;
	}

	protected Plex getPlex() {
		return plex;
	}
}