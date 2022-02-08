package libplex.entity;

import java.net.URI;

import libplex.Plex;
import libplex.plex.entity.Directory;
import libplex.plex.entity.MediaContainer;

public class Artist extends Medium implements Parent {
    private URI uri;

    public Artist(Directory d, URI uri, Parent parent, Server server, Plex plex) {
	super(plex, server, d);
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
