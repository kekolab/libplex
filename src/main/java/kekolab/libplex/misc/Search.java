//package kekolab.libplex.misc;
//
//import java.net.URI;
//
//import jakarta.ws.rs.core.UriBuilder;
//import kekolab.libplex.PlexClient;
//import kekolab.libplex.entity.ServerContent;
//
//public class Search {
//    private URI baseUri;
//    private SearchType type;
//    private String query;
//    private PlexClient plex;
//    private ServerContent server;
//
//    public Search(PlexClient plex, URI baseUri, ServerContent server) {
//        this.plex = plex;
//        this.baseUri = baseUri;
//        this.server = server;
//    }
//
//    public Search withType(SearchType type) {
//        this.type = type;
//        return this;
//    }
//
//    public Search withQuery(String query) {
//        this.query = query;
//        return this;
//    }
//
//    public SearchResult results() {
//        UriBuilder searchUri = UriBuilder.fromUri(baseUri)
//                .path("search");
//        if (type != null)
//            searchUri.queryParam("type", type.getType());
//        if (query != null)
//            searchUri.queryParam("query", query);
//        return new SearchResult(plex, searchUri.build(), server);
//    }
//}
