package kekolab.libplex.entity;

import java.net.URI;

import kekolab.libplex.PlexUriBuilder;

public class Part {
	private kekolab.libplex.plex.tag.Part part;
	private ServerContent server;

	public Part(ServerContent server, kekolab.libplex.plex.tag.Part part) {
		this.server = server;
		this.part = part;
	}

	public Integer getID() {
		return part.getId();
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