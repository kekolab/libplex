package libplex.entity;

import java.util.Date;

import libplex.Plex;
import libplex.plex.entity.Directory;

public abstract class Medium extends PlexItem {
    private Server server;
    private Directory directory;

    protected Medium(Plex plex, Server server, Directory directory) {
	super(plex);
	this.server = server;
	this.directory = directory;
    }

    protected Server getServer() {
	return server;
    }

    protected Directory getDirectory() {
	return directory;
    }

    public String name() {
	return getDirectory().getTitle();
    }

    public String summary() {
	return getDirectory().getSummary();
    }

    public int viewCount() {
	return getDirectory().getViewCount();
    }

    public int skipCount() {
	return getDirectory().getSkipCount();
    }

    public Date lastViewedAt() {
	return getDirectory().getLastViewedAt();
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
	return getDirectory().getAddedAt();
    }

    public Date updatedAt() {
	return getDirectory().getUpdatedAt();
    }
}
