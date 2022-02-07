package libplex.plex.entity;

import java.net.URI;

import libplex.Plex;

public class Artist extends Medium implements Parent {
    private URI uri;

    public Artist(Directory d, URI uri, Parent parent, Server server, Plex plex) {
	super(d, server, plex);
	this.uri = uri;
    }

    public AlbumList albums() {
	MediaContainer mc = getPlex().executeGet(getDirectory().getKey(), this, getServer(), MediaContainer.class,
		null);
	return new AlbumList(mc, uri, getServer(), getPlex());
    }

    @Override
    public URI getUri() {
	return uri;
    }
}
