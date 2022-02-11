package libplex.entity;

import java.net.URI;

import libplex.PlexUriBuilder;

public class Part {
    private libplex.plex.entity.Part part;
    private Server server;

    public Part(Server server, libplex.plex.entity.Part part) {
        this.server = server;
        this.part = part;
    }

    public URI getURI() {
        return PlexUriBuilder.fromKey(getPart().getKey(), null, getServer())
                .build();
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

    private libplex.plex.entity.Part getPart() {
        return part;
    }

    private Server getServer() {
        return server;
    }
}