package libplex.entity;

import java.net.URI;

import libplex.Plex;
import libplex.plex.entity.Directory;

public class Server extends MediaContainerPlexItem {
    public Server(Plex plex, URI uri) {
        super(plex, uri);
    }

    public Library library() {
        Directory library = getMediaContainer().getDirectories()
                .stream()
                .filter(d -> "library".equals(d.getKey()))
                .findAny()
                .orElse(null);
        URI uri = getPlex().uri(library.getKey(), this, this, null);
        return new Library(getPlex(), uri, this);
    }

    /*
     * TODO
     * - All properties
     * - Actions
     * - Activities
     * - Butler
     * - Channela
     * - Clients
     * - Devices
     * - Diagnostics
     * - Hubs
     * - Livetv
     * - Media
     * - Metadata
     * - Neighboorhood
     * - playQueues
     * - player
     * - playlists
     * - resources
     * - search
     * - servers
     * - statistics
     * - system
     * - transcode
     * - updater
     * - user
     */
}
