package libplex.plex.entity;

import libplex.Plex;

public abstract class ServerDirectoryItem extends PlexItem {
	private Server server;
	private Directory directory;

	protected ServerDirectoryItem(Plex plex, Server server, Directory directory) {
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
}
