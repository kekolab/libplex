package libplex.entity;

import java.net.URI;

import libplex.Plex;
import libplex.plex.entity.Directory;
import libplex.plex.entity.MediaContainer;

public class Library extends ParentServerItem {
	private Directory sectionsDirectory;
	private Directory onDeckDirectory;

	public Library(MediaContainer mc, URI uri, Server server, Plex plex) {
		super(plex, mc, server, uri);
	}

	public Sections sections() {
		if (sectionsDirectory == null)
			sectionsDirectory = getMediaContainer().getDirectories()
					.stream()
					.filter(d -> "sections".equals(d.getKey()))
					.findAny()
					.orElse(null);
		URI uri = getPlex().uri(sectionsDirectory.getKey(), this, getServer(), null);
		MediaContainer mc = getPlex().executeGet(uri, MediaContainer.class);
		return new Sections(mc, uri, getServer(), getPlex());
	}

	public OnDeck onDeck() {
		if (onDeckDirectory == null)
			onDeckDirectory = getMediaContainer().getDirectories()
					.stream()
					.filter(d -> "onDeck".equals(d.getKey()))
					.findAny()
					.orElse(null);
		URI uri = getPlex().uri(onDeckDirectory.getKey(), this, getServer(), null);
		MediaContainer mc = getPlex().executeGet(uri, MediaContainer.class);
		return new OnDeck(mc, uri, getServer(), getPlex());
	}
}
