package libplex.plex.entity;

import java.net.URI;

import libplex.Plex;

public abstract class MediaSection implements Parent {
    private MediaContainer mc;
    private URI uri;
    private Server server;
    private Plex plex;

    public MediaSection(MediaContainer mc, URI uri, Server server, Plex plex) {
	this.mc = mc;
	this.uri = uri;
	this.server = server;
	this.plex = plex;
    }

    public URI getArtUri() {
	return plex.uri(mc.getArt(), this, server, null);
    }

    public int getSectionId() {
	return mc.getLibrarySectionID();
    }

    public URI getThumbUri() {
	return plex.uri(mc.getThumb(), this, server, null);
    }

    public String getTitle() {
	return mc.getTitle1();
    }

    @Override
    public URI getUri() {
	return uri;
    }
}
