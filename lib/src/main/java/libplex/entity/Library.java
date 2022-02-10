package libplex.entity;

import java.net.URI;

import libplex.PlexClient;
import libplex.plex.entity.Directory;

public class Library extends ServerMediaContainerPlexItem {
    public Library(PlexClient plex, URI uri, Server server) {
        super(plex, uri, server);
    }

    public Sections sections() {
        Directory sections = getMediaContainer().getDirectories()
                .stream()
                .filter(d -> "sections".equals(d.getKey()))
                .findAny()
                .orElse(null);
        URI uri = getPlexClient().uri(sections.getKey(), this, getServer(), null);
        return new Sections(getPlexClient(), uri, getServer());
    }

    public OnDeck onDeck() {
        Directory onDeck = getMediaContainer().getDirectories()
                .stream()
                .filter(d -> "onDeck".equals(d.getKey()))
                .findAny()
                .orElse(null);
        URI uri = getPlexClient().uri(onDeck.getKey(), this, getServer(), null);
        return new OnDeck(getPlexClient(), uri, getServer());
    }

    /*
     * TODO
     * - recentlyAdded
     */
}
