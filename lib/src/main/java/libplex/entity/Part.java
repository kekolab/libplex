package libplex.entity;

import java.net.URI;

import libplex.Plex;

public class Part {
    private libplex.plex.entity.Part part;
    private Plex plex;
    private Server server;

    public Part(Plex plex, Server server, libplex.plex.entity.Part part) {
        this.plex = plex;
        this.server = server;
        this.part = part;
    }

    public URI getURI() {
        return getPlex().uri(getPart().getKey(), null, getServer(), null);
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

    private Plex getPlex() {
        return plex;
    }

    private libplex.plex.entity.Part getPart() {
        return part;
    }

    private Server getServer() {
        return server;
    }
}