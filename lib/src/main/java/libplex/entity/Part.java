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
        return PlexUriBuilder.fromKey(part.getKey(), null, server)
                .build();
    }

    public int getDuration() {
        return part.getDuration();
    }

    public String getFile() {
        return part.getFile();
    }

    public int getSize() {
        return part.getSize();
    }

    public String getContainer() {
        return part.getContainer();
    }

    public int getHasThumbnail() {
        return part.getHasThumbnail();
    }
}