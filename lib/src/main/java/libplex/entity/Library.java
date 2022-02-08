package libplex.entity;

import java.net.URI;

import libplex.Plex;
import libplex.plex.entity.Directory;

public class Library extends ServerMediaContainerPlexItem {
    public Library(Plex plex, URI uri, Server server) {
        super(plex, uri, server);
    }

    public Sections sections() {
        Directory sections = getMediaContainer().getDirectories()
                .stream()
                .filter(d -> "sections".equals(d.getKey()))
                .findAny()
                .orElse(null);
        URI uri = getPlex().uri(sections.getKey(), this, getServer(), null);
        return new Sections(getPlex(), uri, getServer());
    }

    public OnDeck onDeck() {
        Directory onDeck = getMediaContainer().getDirectories()
                .stream()
                .filter(d -> "onDeck".equals(d.getKey()))
                .findAny()
                .orElse(null);
        URI uri = getPlex().uri(onDeck.getKey(), this, getServer(), null);
        return new OnDeck(getPlex(), uri, getServer());
    }

    /*
     * TODO
     * - recentlyAdded
     */
}
