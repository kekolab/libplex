package libplex.entity;

import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import libplex.Plex;
import libplex.plex.entity.Directory;
import libplex.plex.entity.MediaContainer;

public class ArtistSection extends MediaSection {
    public ArtistSection(Plex plex, URI uri, Server server) {
        super(plex, uri, server);
    }

    public List<Artist> searchForArtists(String query) {
        Directory searchForArtists = getMediaContainer().getDirectories()
                .stream()
                .filter(d -> "Search for Artists".equals(d.getPrompt()))
                .findAny()
                .orElse(null);
        Map<String, Object[]> queryParams = new HashMap<>();
        queryParams.put("query", new Object[] { query });
        return getPlex().executeGet(searchForArtists.getKey(), this, getServer(), MediaContainer.class, queryParams)
                .getDirectories()
                .stream()
                .map(d -> new Artist(getPlex(),
                        getPlex().uri("/library/metadata/".concat(Integer.toString(d.getRatingKey())), this,
                                getServer(), null),
                        getServer()))
                .collect(Collectors.toList());
    }

    public List<Artist> all() {
        Directory allArtists = getMediaContainer().getDirectories()
                .stream()
                .filter(d -> "all".equals(d.getKey()))
                .findAny()
                .orElse(null);
        return getPlex().executeGet(allArtists.getKey(), this, getServer(), MediaContainer.class, null)
                .getDirectories()
                .stream()
                .map(d -> new Artist(getPlex(),
                        getPlex().uri("/library/metadata/".concat(Integer.toString(d.getRatingKey())), this,
                                getServer(), null),
                        getServer()))
                .collect(Collectors.toList());
    }

    public List<Album> albums() {
        Directory byAlbum = getMediaContainer().getDirectories()
                .stream()
                .filter(d -> "albums".equals(d.getKey()))
                .findAny()
                .orElse(null);
        return getPlex().executeGet(byAlbum.getKey(), this, getServer(), MediaContainer.class, null)
                .getDirectories()
                .stream()
                .map(d -> new Album(getPlex(),
                        getPlex().uri("/library/metadata/".concat(Integer.toString(d.getRatingKey())), null,
                                getServer(), null),
                        getServer()))
                .collect(Collectors.toList());
    }

    public List<Album> recentlyAdded() {
        Directory recentlyAdded = getMediaContainer().getDirectories()
                .stream()
                .filter(d -> "recentlyAdded".equals(d.getKey()))
                .findAny()
                .orElse(null);
        return getPlex().executeGet(recentlyAdded.getKey(), this, getServer(), MediaContainer.class, null)
                .getDirectories()
                .stream()
                .map(d -> new Album(getPlex(),
                        getPlex().uri("/library/metadata/".concat(Integer.toString(d.getRatingKey())), null,
                                getServer(), null),
                        getServer()))
                .collect(Collectors.toList());
    }

    public List<Album> searchForAlbums(String query) {
        Directory searchForAlbums = getMediaContainer().getDirectories()
                .stream()
                .filter(d -> "Search for Albums".equals(d.getPrompt()))
                .findAny()
                .orElse(null);
        Map<String, Object[]> queryParams = new HashMap<>();
        queryParams.put("query", new Object[] { query });
        return getPlex().executeGet(searchForAlbums.getKey(), this, getServer(), MediaContainer.class, queryParams)
                .getDirectories()
                .stream()
                .map(d -> new Album(getPlex(),
                        getPlex().uri("/library/metadata/".concat(Integer.toString(d.getRatingKey())), null,
                                getServer(), null),
                        getServer()))
                .collect(Collectors.toList());
    }

    public List<Track> searchForTracks(String query) {
        Directory searchForTracks = getMediaContainer().getDirectories()
                .stream()
                .filter(d -> "Search for Tracks".equals(d.getPrompt()))
                .findAny()
                .orElse(null);
        Map<String, Object[]> queryParams = new HashMap<>();
        queryParams.put("query", new Object[] { query });
        return getPlex().executeGet(searchForTracks.getKey(), this, getServer(), MediaContainer.class, queryParams)
                .getDirectories()
                .stream()
                .map(d -> new Track(getPlex(),
                        getPlex().uri("/library/metadata/".concat(Integer.toString(d.getRatingKey())), null,
                                getServer(), null),
                        getServer()))
                .collect(Collectors.toList());
    }

    /*
     * TODO
     * properties/attributes
     * by genre
     * by decade
     * by year
     * by collection
     * by folder
     */

}
