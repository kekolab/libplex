//package kekolab.libplex.entity;
//
//import java.net.URI;
//import java.util.List;
//import java.util.stream.Collectors;
//
//import kekolab.libplex.PlexClient;
//
//public class Sections extends ServerMediaContainerPlexItem {
//    public Sections(PlexClient plex, URI uri, ServerContent server) {
//        super(plex, uri, server);
//    }
//
//    public int getSize() {
//        return getMediaContainer().getSize();
//    }
//
//    public Integer getAllowSync() {
//        return getMediaContainer().getAllowSync();
//    }
//
//    public String getIdentifier() {
//        return getMediaContainer().getIdentifier();
//    }
//
//    public String getMediaTagPrefix() {
//        return getMediaContainer().getMediaTagPrefix();
//    }
//
//    public Integer getMediaTagVersion() {
//        return getMediaContainer().getMediaTagVersion();
//    }
//
//    public String getTitle1() {
//        return getMediaContainer().getTitle1();
//    }
//
//    public List<ArtistSection> artistSections() {
//        return directoriesByType("artist").stream()
//                .map(d -> new ArtistSection(getPlexClient(), getPlexClient().uriBuilder()
//                        .fromKey(d.getKey(), this, getServer())
//                        .build(), getServer()))
//                .collect(Collectors.toList());
//    }
//
//    public List<MovieSection> movieSections() {
//        return directoriesByType("movie").stream()
//                .map(d -> new MovieSection(getPlexClient(), getPlexClient().uriBuilder()
//                        .fromKey(d.getKey(), this, getServer())
//                        .build(), getServer()))
//                .collect(Collectors.toList());
//    }
//
//    public List<ShowSection> showSections() {
//        return directoriesByType("show").stream()
//                .map(d -> new ShowSection(getPlexClient(), getPlexClient().uriBuilder()
//                        .fromKey(d.getKey(), this, getServer())
//                        .build(), getServer()))
//                .collect(Collectors.toList());
//    }
//
//    /*
//     * TODO - TVShow Sections
//     */
//
//}
