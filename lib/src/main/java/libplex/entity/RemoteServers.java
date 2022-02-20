package libplex.entity;

import java.net.URI;
import java.util.List;

import jakarta.ws.rs.core.UriBuilder;
import libplex.PlexClient;
import libplex.plex.tag.RemoteServer;

public class RemoteServers extends MediaContainerPlexItem {
    public static final URI URI = UriBuilder.fromUri("https://plex.tv/pms/servers.xml")
            .build();

    public RemoteServers(PlexClient plex) {
        super(plex, URI);
    }

    public String getFriendlyName() {
        return getMediaContainer().getFriendlyName();
    }

    public String getMachineIdentifier() {
        return getMediaContainer().getMachineIdentifier();
    }

    public String getIdentifier() {
        return getMediaContainer().getIdentifier();
    }

    public List<RemoteServer> getSummaries() {
        return getMediaContainer().getRemoteServers();
    }

}
