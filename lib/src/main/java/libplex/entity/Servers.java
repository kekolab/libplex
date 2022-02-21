package libplex.entity;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import libplex.PlexService;

public class Servers extends MediaContainerPlexItem {
    private List<RemoteServer> remoteServers;

    public Servers(PlexService plex, URI uri) {
        super(plex, uri);
        remoteServers = getMediaContainer().getRemoteServers()
                .stream()
                .map(rs -> new RemoteServer(plex, rs))
                .collect(Collectors.toList());
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

    public List<RemoteServer> getRemoteServers() {
        return remoteServers;
    }

}
