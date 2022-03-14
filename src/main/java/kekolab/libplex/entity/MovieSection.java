//package kekolab.libplex.entity;
//
//import java.net.URI;
//import java.util.List;
//
//import kekolab.libplex.PlexClient;
//import kekolab.libplex.misc.Search;
//import kekolab.libplex.misc.SearchType;
//
//public class MovieSection extends MediaSection {
//
//    public MovieSection(PlexClient plex, URI uri, ServerContent server) {
//        super(plex, uri, server);
//    }
//
//    public List<Video> all() {
//        return fetchVideos("all");
//    }
//
//    public List<Video> unwatched() {
//        return fetchVideos("unwatched");
//    }
//
//    public List<Video> recentlyReleased() {
//        return fetchVideos("newest");
//    }
//
//    public List<Video> recentlyAdded() {
//        return fetchVideos("recentlyAdded");
//    }
//
//    public List<Video> recentlyViewed() {
//        return fetchVideos("recentlyViewed");
//    }
//
//    public List<Video> onDeck() {
//        return fetchVideos("onDeck");
//    }
//
//    private List<Video> fetchVideos(String directoryKey) {
//        String key = directoriesByKey(directoryKey).get(0)
//                .getKey();
//        List<Video> videos = getPlexClient().executeGet(getPlexClient().uriBuilder()
//                .fromKey(key, this, getServer())
//                .build(), MediaContainer.class)
//                .getVideos();
//        videos.forEach(video -> {
//            video.setPlex(getPlexClient());
//            video.setServer(getServer());
//        });
//        return videos;
//    }
//
//    public List<Video> searchMovies(String query) {
//        return new Search(getPlexClient(), getUri(), getServer()).withType(SearchType.MOVIE)
//                .withQuery(query)
//                .results()
//                .movies();
//    }
//
//    // TODO byCollectio, byYear, byGenre, byDecade, byDirector, byStarringActor,
//    // byContentRating, byCountry, byResolution, byFirstLetter, byFolder
//
//}
