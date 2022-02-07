package libplex.plex.entity;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import libplex.Plex;

public class Sections implements Parent {
    private int size;
    private int allowSync;
    private String identifier;
    private String mediaTagPrefix;
    private int mediaTagVersion;
    private String title1;
    private Location location;

    private MediaContainer mc;
    private URI uri;
    private Server server;
    private Plex plex;

    public Sections(MediaContainer mc, URI uri, Server server, Plex plex) {
	this.mc = mc;
	this.uri = uri;
	this.server = server;
	this.plex = plex;
    }

    @Override
    public URI getUri() {
	return uri;
    }

    public List<ArtistSection> artistSections() {
	return mc.getDirectories()
		.stream()
		.filter(d -> "artist".equals(d.getType()))
		.map(d -> {
		    URI uri = plex.uri(d.getKey(), this, server, null);
		    MediaContainer mc = plex.executeGet(uri, MediaContainer.class);
		    return new ArtistSection(mc, uri, server, plex);
		})
		.collect(Collectors.toList());
    }

    public List<MovieSection> movieSections() {
	return mc.getDirectories()
		.stream()
		.filter(d -> "movie".equals(d.getType()))
		.map(d -> {
		    URI uri = plex.uri(d.getKey(), this, server, null);
		    MediaContainer mc = plex.executeGet(uri, MediaContainer.class);
		    return new MovieSection(mc, uri, server, plex);
		})
		.collect(Collectors.toList());
    }

}
