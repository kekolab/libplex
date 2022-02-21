package libplex.entity;

import java.net.URI;

import libplex.PlexService;
import libplex.PlexUriBuilder;

public class Library extends ServerMediaContainerPlexItem {
    public Library(PlexService plex, URI uri, Server server) {
        super(plex, uri, server);
    }

    public Sections sections() {
        return new Sections(getPlexClient(), PlexUriBuilder.fromKey(directoriesByKey("sections").get(0)
                .getKey(), this, getServer())
                .build(), getServer());
    }

    public OnDeck onDeck() {
        return new OnDeck(getPlexClient(), PlexUriBuilder.fromKey(directoriesByKey("onDeck").get(0)
                .getKey(), this, getServer())
                .build(), getServer());
    }

    /*
     * TODO
     * - recentlyAdded
     */
}
