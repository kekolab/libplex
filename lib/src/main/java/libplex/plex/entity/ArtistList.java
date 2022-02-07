package libplex.plex.entity;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import libplex.Plex;

public class ArtistList implements Parent {
    private int size;
    private int allowSync;
    private String art;
    private String identifier;
    private int librarySectionID;
    private String librarySectionTitle;
    private String librarySectionUUID;
    private String mediaTagPrefix;
    private int mediaTagVersion;
    private int nocache;
    private String thumb;
    private String title1;
    private String title2;
    private String viewGroup;
    private int viewMode;

    private List<Artist> artists;
    private URI uri;
    private MediaContainer mc;
    private Server server;
    private Plex plex;

    public ArtistList(MediaContainer mc, URI uri, Server server, Plex plex) {
	this.mc = mc;
	this.uri = uri;
	this.server = server;
	this.plex = plex;
    }

    public List<Artist> list() {
	if (artists == null)
	    artists = mc.getDirectories()
		    .stream()
		    .map(d -> new Artist(d, uri, this, server, plex))
		    .collect(Collectors.toList());
	return artists;
    }

    @Override
    public URI getUri() {
	return uri;
    }

}
