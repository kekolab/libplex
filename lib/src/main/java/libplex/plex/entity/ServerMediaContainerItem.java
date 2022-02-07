package libplex.plex.entity;

import libplex.Plex;

public class ServerMediaContainerItem extends MediaContainerItem {

	private Server server;

	protected ServerMediaContainerItem(Plex plex, MediaContainer mediaContainer, Server server) {
		super(plex, mediaContainer);
		this.server = server;
	}

	protected Server getServer() {
		return server;
	}

}
