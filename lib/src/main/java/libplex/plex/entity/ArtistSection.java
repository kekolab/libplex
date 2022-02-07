package libplex.plex.entity;

import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import libplex.Plex;

public class ArtistSection implements Parent {
    private int size;
    private int allowSync;
    private String art;
    private String content;
    private String identifier;
    private int librarySectionID;
    private String mediaTagPrefix;
    private int mediaTagVersion;
    private int nocache;
    private String thumb;
    private String title1;
    private String viewGroup;
    private int viewMode;

    private MediaContainer mc;
    private URI uri;
    private Server server;
    private Directory searchForArtists;
    private Plex plex;

    public ArtistSection(MediaContainer mc, URI uri, Server server, Plex plex) {
	this.mc = mc;
	this.uri = uri;
	this.server = server;
	this.plex = plex;
    }

    @Override
    public URI getUri() {
	return uri;
    }

    // TODO
    public List<Void> searchForTracks(String query) {
	return null; // TODO
    }

    // TODO
    public ArtistList searchForArtists(String query) {
	if (searchForArtists == null)
	    searchForArtists = mc.getDirectories()
		    .stream()
		    .filter(d -> "Search for Artists".equals(d.getPrompt()))
		    .findAny()
		    .orElse(null);
	Map<String, Object[]> queryParams = new HashMap<>();
	queryParams.put("query", new Object[] { query });
	URI uri = plex.uri(searchForArtists.getKey(), this, server, queryParams);
	MediaContainer mc = plex.executeGet(uri, MediaContainer.class);
	return new ArtistList(mc, uri, server, plex);
    }

    // TODO
    public List<Void> allArtists() {

	return null;
    }

}
