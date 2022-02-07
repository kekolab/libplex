package libplex.plex.entity;

import java.net.URI;

import libplex.Plex;

public abstract class MediaSection extends ParentServerItem {
	public MediaSection(MediaContainer mc, URI uri, Server server, Plex plex) {
		super(plex, mc, server, uri);
	}

	public URI getArtUri() {
		return getPlex().uri(getMediaContainer().getArt(), this, getServer(), null);
	}

	public int getSectionId() {
		return getMediaContainer().getLibrarySectionID();
	}

	public URI getThumbUri() {
		return getPlex().uri(getMediaContainer().getThumb(), this, getServer(), null);
	}

	public String getTitle() {
		return getMediaContainer().getTitle1();
	}
}
