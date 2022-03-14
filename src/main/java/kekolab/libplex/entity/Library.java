//package kekolab.libplex.entity;
//
//import java.net.URI;
//
//import kekolab.libplex.PlexClient;
//import kekolab.libplex.misc.SearchResult;
//
//public class Library extends ServerMediaContainerPlexItem {
//    public Library(PlexClient plex, URI uri, ServerContent server) {
//        super(plex, uri, server);
//    }
//
//    public int getSize() {
//        return getMediaContainer().getSize();
//    }
//
//    public String getArt() {
//        return getMediaContainer().getArt();
//    }
//
//    public URI getArtURI() {
//        return getPlexClient().uriBuilder()
//                .fromKey(getMediaContainer().getArt(), this, getServer())
//                .build();
//    }
//
//    public String getContent() {
//        return getMediaContainer().getContent();
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
//    public String getTitle2() {
//        return getMediaContainer().getTitle2();
//    }
//
//    public Sections sections() {
//        return new Sections(getPlexClient(), getPlexClient().uriBuilder()
//                .fromKey(directoriesByKey("sections").get(0)
//                        .getKey(), this, getServer())
//                .build(), getServer());
//    }
//
//    public OnDeck onDeck() {
//        return new OnDeck(getPlexClient(), getPlexClient().uriBuilder()
//                .fromKey(directoriesByKey("onDeck").get(0)
//                        .getKey(), this, getServer())
//                .build(), getServer());
//    }
//
//    public SearchResult recentlyAdded() {
//        return new SearchResult(getPlexClient(), getPlexClient().uriBuilder()
//                .fromKey(directoriesByKey("recentlyAdded").get(0)
//                        .getKey(), this, getServer())
//                .build(), getServer());
//    }
//}
