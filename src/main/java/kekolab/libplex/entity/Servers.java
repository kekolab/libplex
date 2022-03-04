package kekolab.libplex.entity;

import java.net.URI;
import java.util.List;

import kekolab.libplex.PlexClient;

public class Servers extends MediaContainerPlexItem {
    public Servers(PlexClient plex, URI uri) {
        super(plex, uri);
        getMediaContainer().getServers()
                .forEach(server -> server.setPlexService(plex));
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

    public int getSize() {
        return getMediaContainer().getSize();
    }

    public List<Server> getServers() {
        return getMediaContainer().getServers();
    }
}
