package kekolab.libplex;

import jakarta.ws.rs.core.UriBuilder;
import kekolab.libplex.entity.PlexItem;
import kekolab.libplex.entity.PlexMediaServer;

public class PlexClient extends PlexBaseClient {
    public PlexClient(String token, String product, String version, String clientIdentifier, String platform,
            String platformVersion, String device, String deviceName, PlexProvides[] provides) {
        super(token, product, version, clientIdentifier, platform, platformVersion, device, deviceName, provides);
    }

//    public Servers servers() {
//        return new Servers(this, UriBuilder.fromUri("https://plex.tv/pms/servers.xml")
//                .build());
//    }
//
    public PlexMediaServer localServer(String host, int port) {
        return new PlexItem.Builder<PlexMediaServer>(this, UriBuilder.newInstance()
                .scheme("http")
                .host(host)
                .port(port)
                .build()).build(PlexMediaServer.class);
    }
}
