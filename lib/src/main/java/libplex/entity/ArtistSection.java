package libplex.entity;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import libplex.PlexClient;
import libplex.PlexUriBuilder;
import libplex.plex.entity.MediaContainer;

public class ArtistSection extends MediaSection {
    public ArtistSection(PlexClient plex, URI uri, Server server) {
        super(plex, uri, server);
    }

    public List<Artist> all() {
        String key = directoriesByKey("all").get(0)
                .getKey();
        return getPlexClient().executeGet(PlexUriBuilder.fromKey(key, this, getServer())
                .build(), MediaContainer.class)
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
        return getPlexClient().executeGet(PlexUriBuilder.fromKey(key, this, getServer())
                .build(), MediaContainer.class)
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
        return getPlexClient().executeGet(PlexUriBuilder.fromKey(key, this, getServer())
                .build(), MediaContainer.class)
                .getDirectories()
                .stream()
                .map(d -> new Album(getPlexClient(),
                        PlexUriBuilder.fromKey("/library/metadata/{ratingKey}", this, getServer())
                                .build(d.getRatingKey()),
                        getServer()))
                .collect(Collectors.toList());
    }

    public List<Artist> searchForArtists(String query) {
        return getPlexClient().executeGet(PlexUriBuilder.fromKey(directoriesByPrompt("Search for Artists").get(0)
                .getKey(), this, getServer())
                .queryParam("query", query)
                .build(), MediaContainer.class)
                .getDirectories()
                .stream()
                .map(d -> new Artist(getPlexClient(),
                        PlexUriBuilder.fromKey("/library/metadata/{ratingKey}", this, getServer())
                                .build(d.getRatingKey()),
                        getServer()))
                .collect(Collectors.toList());
    }

    public List<Album> searchForAlbums(String query) {
        return getPlexClient().executeGet(PlexUriBuilder.fromKey(directoriesByPrompt("Search for Albums").get(0)
                .getKey(), this, getServer())
                .queryParam("query", query)
                .build(), MediaContainer.class)
                .getDirectories()
                .stream()
                .map(d -> new Album(getPlexClient(),
                        PlexUriBuilder.fromKey("/library/metadata/{ratingKey}", this, getServer())
                                .build(d.getRatingKey()),
                        getServer()))
                .collect(Collectors.toList());
    }

    public List<Track> searchForTracks(String query) {
        return getPlexClient().executeGet(PlexUriBuilder.fromKey(directoriesByPrompt("Search for Tracks").get(0)
                .getKey(), this, getServer())
                .queryParam("query", query)
                .build(), MediaContainer.class)
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
