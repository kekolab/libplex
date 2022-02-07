package libplex.plex.entity;

import java.net.URI;
import java.util.List;

import libplex.Plex;

public abstract class MediaList<A extends Medium> implements Parent {
    private MediaContainer mediaContainer;
    private URI uri;
    private Server server;
    private Plex plex;

    protected MediaList(MediaContainer mediaContainer, URI uri, Server server, Plex plex) {
	this.mediaContainer = mediaContainer;
	this.uri = uri;
	this.server = server;
	this.plex = plex;
    }

    @Override
    public URI getUri() {
	return uri;
    }

    public URI getArtUri() {
	return plex.uri(mediaContainer.getArt(), this, server, null);
    }

    public Integer getLibrarySectionID() {
	return mediaContainer.getLibrarySectionID();
    }

    public String getLibrarySectionTitle() {
	return mediaContainer.getLibrarySectionTitle();
    }

    public URI getThumbUri() {
	return plex.uri(mediaContainer.getThumb(), this, server, null);
    }

    public String getTitle() {
	return mediaContainer.getTitle1();
    }

    public String getSubtitle() {
	return mediaContainer.getTitle2();
    }

    protected MediaContainer getMediaContainer() {
	return mediaContainer;
    }

    protected Server getServer() {
	return server;
    }

    protected Plex getPlex() {
	return plex;
    }

    public abstract List<A> list();
}
