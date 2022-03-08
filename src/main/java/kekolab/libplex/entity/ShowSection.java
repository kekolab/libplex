package kekolab.libplex.entity;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import kekolab.libplex.PlexClient;

public class ShowSection extends MediaSection {

    public ShowSection(PlexClient plex, URI uri, ServerContent server) {
        super(plex, uri, server);
    }

    public Integer getNoCache() {
        return getMediaContainer().getNocache();
    }

    public List<Show> all() {
        return fetchShows("all");
    }

    public List<Show> unwatched() {
        return fetchShows("unwatched");
    }

    public List<Show> recentlyReleased() {
        return fetchShows("newest");
    }

    public List<Show> recentlyAdded() {
        return fetchShows("recentlyAdded");
    }

    public List<Show> recentlyViewed() {
        return fetchShows("recentlyViewed");
    }

    public List<Show> onDeck() {
        return fetchShows("onDeck");
    }

    private List<Show> fetchShows(String directoryKey) {
        String key = directoriesByKey(directoryKey).get(0)
                .getKey();
        return getPlexClient().executeGet(getPlexClient().uriBuilder()
                .fromKey(key, this, getServer())
                .build(), MediaContainer.class)
                .getDirectories()
                .stream()
                .map(d -> new Show(getPlexClient(), getPlexClient().uriBuilder()
                        .fromKey("/library/metadata/{ratingKey}", this, getServer())
                        .build(d.getRatingKey()), getServer()))
                .collect(Collectors.toList());
    }

    // TODO byCollection, byFirstLetter, byGenre, byYear, byContentRating, byFolder,
    // search for Shows, search For Episodes

}
