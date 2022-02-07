package libplex.plex.entity;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import libplex.Plex;

public class AlbumList extends ParentServerItem {
	private List<Album> albums;

	public AlbumList(MediaContainer mc, URI uri, Server server, Plex plex) {
		super(plex, mc, server, uri);
	}

	public List<Album> list() {
		if (albums == null)
			albums = getMediaContainer().getDirectories()
					.stream()
					.map(d -> new Album(d, getUri(), this, getServer(), getPlex()))
					.collect(Collectors.toList());
		return albums;
	}
}
