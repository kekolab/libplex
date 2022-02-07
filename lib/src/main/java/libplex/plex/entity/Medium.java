package libplex.plex.entity;

import java.util.Date;

import libplex.Plex;

public abstract class Medium extends ServerDirectoryItem {
	protected Medium(Directory d, Server server, Plex plex) {
		super(plex, server, d);
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
