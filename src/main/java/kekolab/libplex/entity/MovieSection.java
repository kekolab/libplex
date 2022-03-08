package kekolab.libplex.entity;

import java.net.URI;
import java.util.List;

import kekolab.libplex.PlexClient;

public class MovieSection extends MediaSection {

    public MovieSection(PlexClient plex, URI uri, ServerContent server) {
        super(plex, uri, server);
    }

    public List<Video> all() {
        return fetchVideos("all");
    }

    public List<Video> unwatched() {
        return fetchVideos("unwatched");
    }

    public List<Video> recentlyReleased() {
        return fetchVideos("newest");
    }

    public List<Video> recentlyAdded() {
        return fetchVideos("recentlyAdded");
    }

    public List<Video> recentlyViewed() {
        return fetchVideos("recentlyViewed");
    }

    public List<Video> onDeck() {
        return fetchVideos("onDeck");
    }

    private List<Video> fetchVideos(String directoryKey) {
        String key = directoriesByKey(directoryKey).get(0)
                .getKey();
        List<Video> videos = getPlexClient().executeGet(getPlexClient().uriBuilder()
                .fromKey(key, this, getServer())
                .build(), MediaContainer.class)
                .getVideos();
        videos.forEach(video -> {
            video.setPlex(getPlexClient());
            video.setServer(getServer());
        });
        return videos;
    }

    // TODO byCollectio, byYear, byGenre, byDecade, byDirector, byStarringActor,
    // byContentRating, byCountry, byResolution, byFirstLetter, byFolder, searchFilm

}
