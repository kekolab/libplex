package libplex.plex.entity;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import libplex.Plex;

public class TrackList extends MediaList<Track> {
	public TrackList(MediaContainer mc, URI uri, Server server, Plex plex) {
		super(mc, uri, server, plex);
	}

	@Override
	public List<Track> list() {
		return getMediaContainer().getDirectories()
				.stream()
				.map(d -> new Track(d, getServer(), getPlex()))
				.collect(Collectors.toList());
	}
}
