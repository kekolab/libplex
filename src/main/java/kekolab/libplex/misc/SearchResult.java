//package kekolab.libplex.misc;
//
//import java.net.URI;
//import java.util.List;
//import java.util.stream.Collectors;
//
//import kekolab.libplex.PlexClient;
//import kekolab.libplex.entity.Album;
//import kekolab.libplex.entity.Artist;
//import kekolab.libplex.entity.ServerContent;
//import kekolab.libplex.entity.ServerMediaContainerPlexItem;
//import kekolab.libplex.entity.Show;
//import kekolab.libplex.entity.Track;
//import kekolab.libplex.entity.Video;
//
//public class SearchResult extends ServerMediaContainerPlexItem {
//
//    public SearchResult(PlexClient plex, URI uri, ServerContent server) {
//        super(plex, uri, server);
//    }
//
//    public List<Video> movies() {
//        return getMediaContainer().getVideos()
//                .stream()
//                .filter(video -> video.getType()
//                        .equals("movie"))
//                .map(video -> {
//                    video.setPlex(getPlexClient());
//                    video.setServer(getServer());
//                    return video;
//                })
//                .collect(Collectors.toList());
//    }
//
//    public List<Show> shows() {
//        return directoriesByType("show").stream()
//                .map(d -> new Show(getPlexClient(), d, getServer()))
//                .collect(Collectors.toList());
//    }
//
//    public List<Video> episodes() {
//        return getMediaContainer().getVideos()
//                .stream()
//                .filter(video -> video.getType()
//                        .equals("episode"))
//                .map(video -> {
//                    video.setPlex(getPlexClient());
//                    video.setServer(getServer());
//                    return video;
//                })
//                .collect(Collectors.toList());
//    }
//
//    public List<Artist> artists() {
//        return directoriesByType("artist").stream()
//                .map(d -> new Artist(getPlexClient(), d, getServer()))
//                .collect(Collectors.toList());
//    }
//
//    public List<Album> albums() {
//        return directoriesByType("album").stream()
//                .map(d -> new Album(getPlexClient(), d, getServer()))
//                .collect(Collectors.toList());
//    }
//
//    public List<Track> tracks() {
//        return getMediaContainer().getTracks()
//                .stream()
//                .map(track -> {
//                    track.setPlex(getPlexClient());
//                    track.setServer(getServer());
//                    return track;
//                })
//                .collect(Collectors.toList());
//    }
//}
