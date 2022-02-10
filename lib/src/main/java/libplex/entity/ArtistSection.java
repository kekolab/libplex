package libplex.entity;

import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import libplex.PlexClient;
import libplex.PlexUriBuilder;
import libplex.plex.entity.Directory;
import libplex.plex.entity.MediaContainer;

public class ArtistSection extends MediaSection {
    public ArtistSection(PlexClient plex, URI uri, Server server) {
        super(plex, uri, server);
    }

    public List<Artist> all() {
        String key = directoriesByKey("all").get(0)
                .getKey();
        return getPlexClient().executeGet(key, this, getServer(), MediaContainer.class, null)
                .getDirectories()
                .stream()
                .map(d -> new Artist(getPlexClient(),
                        PlexUriBuilder.fromKey("/library/metadata/{ratingKey}", this, getServer())
                                .build(d.getRatingKey()),
                        getServer()))
                .collect(Collectors.toList());
    }

    public List<Album> albums() {
        String key = directoriesByKey("album").get(0)
                .getKey();
        return getPlexClient().executeGet(key, this, getServer(), MediaContainer.class, null)
                .getDirectories()
                .stream()
                .map(d -> new Album(getPlexClient(),
                        PlexUriBuilder.fromKey("/library/metadata/{ratingKey}", this, getServer())
                                .build(d.getRatingKey()),
                        getServer()))
                .collect(Collectors.toList());
    }

    public List<Album> recentlyAdded() {
        String key = directoriesByKey("recentlyAdded").get(0)
                .getKey();
        return getPlexClient().executeGet(key, this, getServer(), MediaContainer.class, null)
                .getDirectories()
                .stream()
                .map(d -> new Album(getPlexClient(),
                        PlexUriBuilder.fromKey("/library/metadata/{ratingKey}", this, getServer())
                                .build(d.getRatingKey()),
                        getServer()))
                .collect(Collectors.toList());
    }

    public List<Artist> searchForArtists(String query) {
        Directory searchForArtists = getMediaContainer().getDirectories()
                .stream()
                .filter(d -> "Search for Artists".equals(d.getPrompt()))
                .findAny()
                .orElse(null);
        Map<String, Object[]> queryParams = new HashMap<>();
        queryParams.put("query", new Object[] { query });
        return getPlexClient()
                .executeGet(searchForArtists.getKey(), this, getServer(), MediaContainer.class, queryParams)
                .getDirectories()
                .stream()
                .map(d -> new Artist(getPlexClient(),
                        PlexUriBuilder.fromKey("/library/metadata/{ratingKey}", this, getServer())
                                .build(d.getRatingKey()),
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
        return getPlexClient()
                .executeGet(searchForAlbums.getKey(), this, getServer(), MediaContainer.class, queryParams)
                .getDirectories()
                .stream()
                .map(d -> new Album(getPlexClient(),
                        PlexUriBuilder.fromKey("/library/metadata/{ratingKey}", this, getServer())
                                .build(d.getRatingKey()),
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
        return getPlexClient()
                .executeGet(searchForTracks.getKey(), this, getServer(), MediaContainer.class, queryParams)
                .getDirectories()
                .stream()
                .map(d -> new Track(getPlexClient(),
                        PlexUriBuilder.fromKey("/library/metadata/{ratingKey}", this, getServer())
                                .build(d.getRatingKey()),
                        getServer()))
                .collect(Collectors.toList());
    }

    /*
     * TODO
     * by genre
     * by decade
     * by year
     * by collection
     * by folder
     */

}
