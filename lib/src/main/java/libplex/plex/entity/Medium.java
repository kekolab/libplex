package libplex.plex.entity;

import java.util.Date;

import libplex.Plex;

public abstract class Medium {
    private Directory directory;
    private Server server;
    private Plex plex;

    public Medium(Directory d, Server server, Plex plex) {
	this.directory = d;
	this.server = server;
	this.plex = plex;
    }

    public String name() {
	return directory.getTitle();
    }

    public String summary() {
	return directory.getSummary();
    }

    public int viewCount() {
	return directory.getViewCount();
    }

    public int skipCount() {
	return directory.getSkipCount();
    }

    public Date lastViewedAt() {
	return directory.getLastViewedAt();
    }

    public Void thumb() {
	// TODO
	return null;
    }

    public Void art() {
	// TODO
	return null;
    }

    public Date addedAt() {
	return directory.getAddedAt();
    }

    public Date updatedAt() {
	return directory.getUpdatedAt();
    }

    protected Directory getDirectory() {
	return directory;
    }

    protected Server getServer() {
	return server;
    }

    protected Plex getPlex() {
	return plex;
    }
}
