package libplex.plex.entity;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import libplex.Plex;

public class AlbumList implements Parent {
    private int size;
    private int allowSync;
    private String art;
    private String identifier;
    private String mediaTagPrefix;
    private int mediaTagVersion;
    private int nocache;
    private String thumb;
    private String title1;
    private String title2;
    private String viewGroup;
    private int viewMode;

    private MediaContainer mc;
    private URI uri;
    private Server server;
    private List<Album> albums;
    private Plex plex;

    public AlbumList(MediaContainer mc, URI uri, Server server, Plex plex) {
	this.mc = mc;
	this.uri = uri;
	this.server = server;
	this.plex = plex;
    }

    public List<Album> list() {
	if (albums == null)
	    albums = mc.getDirectories()
		    .stream()
		    .map(d -> new Album(d, uri, this, server, plex))
		    .collect(Collectors.toList());
	return albums;
    }

    @Override
    public URI getUri() {
	return uri;
    }

}
