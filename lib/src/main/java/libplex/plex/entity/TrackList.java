package libplex.plex.entity;

import java.net.URI;

import libplex.Plex;

public class TrackList implements Parent {
    private int size;
    private int allowSync;
    private String art;
    private int grandparentRatingKey;
    private String grandparentThumb;
    private String grandparentTitle;
    private String identifier;
    private int key;
    private int librarySectionID;
    private String librarySectionTitle;
    private String librarySectionUUID;
    private String mediaTagPrefix;
    private int mediaTagVersion;
    private int nocache;
    private int parentIndex;
    private String parentTitle;
    private int parentYear;
    private String summary;
    private String thumb;
    private String title1;
    private String title2;
    private String viewGroup;
    private int viewMode;

    private MediaContainer mc;
    private URI uri;
    private Server server;
    private Plex plex;

    public TrackList(MediaContainer mc, URI uri, Server server, Plex plex) {
	this.mc = mc;
	this.uri = uri;
	this.server = server;
	this.plex = plex;
    }

    @Override
    public URI getUri() {
	return uri;
    }

}
