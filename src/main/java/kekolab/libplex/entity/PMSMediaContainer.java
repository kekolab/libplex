//package kekolab.libplex.entity;
//
//import java.net.URI;
//
//import kekolab.libplex.PlexClient;
//
//public abstract class PMSMediaContainer extends MediaContainer {
//    private PlexMediaServer server;
//    private MediaContainer mc;
//
//    protected PMSMediaContainer(PlexClient client, URI uri, PlexMediaServer server) {
//        super.setClient(client);
//        super.setUri(uri);
//        this.server = server;
//        this.mc = getClient().executeGet(uri, MediaContainer.class);
//    }
//
//    protected PlexMediaServer getServer() {
//        return server;
//    }
//
//    protected MediaContainer getMediaContainer() {
//        return mc;
//    }
//}
