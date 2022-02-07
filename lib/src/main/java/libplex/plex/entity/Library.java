package libplex.plex.entity;

import java.net.URI;

import libplex.Plex;

public class Library implements Parent {
    private int size;
    private int allowSync;
    private String art;
    private String content;
    private String identifier;
    private String mediaTagPrefix;
    private int mediaTagVersion;
    private String title1;
    private String title2;

    private MediaContainer mc;
    private URI uri;
    private Server server;
    private Directory sectionsDirectory;
    private Directory onDeckDirectory;
    private Plex plex;

    public Library(MediaContainer mc, URI uri, Server server, Plex plex) {
	this.mc = mc;
	this.uri = uri;
	this.server = server;
	this.plex = plex;
    }

    public Sections sections() {
	if (sectionsDirectory == null)
	    sectionsDirectory = mc.getDirectories()
		    .stream()
		    .filter(d -> "sections".equals(d.getKey()))
		    .findAny()
		    .orElse(null);
	URI uri = plex.uri(sectionsDirectory.getKey(), this, server, null);
	MediaContainer mc = plex.executeGet(uri, MediaContainer.class);
	return new Sections(mc, uri, server, plex);
    }

    public OnDeck onDeck() {
	if (onDeckDirectory == null)
	    onDeckDirectory = mc.getDirectories()
		    .stream()
		    .filter(d -> "onDeck".equals(d.getKey()))
		    .findAny()
		    .orElse(null);
	URI uri = plex.uri(onDeckDirectory.getKey(), this, server, null);
	MediaContainer mc = plex.executeGet(uri, MediaContainer.class);
	return new OnDeck(mc, uri, server, plex);
    }

    @Override
    public URI getUri() {
	return uri;
    }

}
