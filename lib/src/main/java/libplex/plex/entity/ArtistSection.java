package libplex.plex.entity;

import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import libplex.Plex;

public class ArtistSection extends MediaSection {
    private MediaContainer mc;
    private URI uri;
    private Server server;
    private Directory searchForArtists;
    private Plex plex;

    public ArtistSection(MediaContainer mc, URI uri, Server server, Plex plex) {
	super(mc, uri, server, plex);
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
