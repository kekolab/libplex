package libplex.plex.entity;

import java.net.URI;

import libplex.Plex;

public abstract class ParentServerItem extends ServerMediaContainerItem implements Parent {

	private URI uri;

	protected ParentServerItem(Plex plex, MediaContainer mediaContainer, Server server, URI uri) {
		super(plex, mediaContainer, server);
		this.uri = uri;
	}

	@Override
	public URI getUri() {
		return uri;
	}

}
