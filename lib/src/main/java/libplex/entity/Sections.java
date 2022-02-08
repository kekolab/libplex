package libplex.entity;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import libplex.Plex;
import libplex.plex.entity.MediaContainer;

public class Sections extends ParentServerItem {
	public Sections(MediaContainer mediaContainer, URI uri, Server server, Plex plex) {
		super(plex, mediaContainer, server, uri);
	}

	public List<ArtistSection> artistSections() {
		return getMediaContainer().getDirectories()
				.stream()
				.filter(d -> "artist".equals(d.getType()))
				.map(d -> {
					URI uri = getPlex().uri(d.getKey(), this, getServer(), null);
					MediaContainer mc = getPlex().executeGet(uri, MediaContainer.class);
					return new ArtistSection(mc, uri, getServer(), getPlex());
				})
				.collect(Collectors.toList());
	}

	public List<MovieSection> movieSections() {
		return getMediaContainer().getDirectories()
				.stream()
				.filter(d -> "movie".equals(d.getType()))
				.map(d -> {
					URI uri = getPlex().uri(d.getKey(), this, getServer(), null);
					MediaContainer mc = getPlex().executeGet(uri, MediaContainer.class);
					return new MovieSection(mc, uri, getServer(), getPlex());
				})
				.collect(Collectors.toList());
	}

}
