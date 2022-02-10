package libplex.entity;

import java.net.URI;

import libplex.PlexClient;

public class Part {
    private libplex.plex.entity.Part part;
    private PlexClient plexClient;
    private Server server;

    public Part(PlexClient plex, Server server, libplex.plex.entity.Part part) {
        this.plexClient = plex;
        this.server = server;
        this.part = part;
    }

    public URI getURI() {
        return getPlexClient().uri(getPart().getKey(), null, getServer(), null);
    }

    public int getDuration() {
        return getPart().getDuration();
    }

    public String getFile() {
        return getPart().getFile();
    }

    public int getSize() {
        return getPart().getSize();
    }

    public String getContainer() {
        return getPart().getContainer();
    }

    public int getHasThumbnail() {
        return getPart().getHasThumbnail();
    }

    private PlexClient getPlexClient() {
        return plexClient;
    }

    private libplex.plex.entity.Part getPart() {
        return part;
    }

    private Server getServer() {
        return server;
    }
}