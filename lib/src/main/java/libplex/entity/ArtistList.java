package libplex.entity;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import libplex.Plex;
import libplex.plex.entity.MediaContainer;

public class ArtistList extends MediaList<Artist> {
    public ArtistList(MediaContainer mc, URI uri, Server server, Plex plex) {
	super(mc, uri, server, plex);
    }

    @Override
    public List<Artist> list() {
	return getMediaContainer().getDirectories()
		.stream()
		.map(d -> new Artist(d, getUri(), this, getServer(), getPlex()))
		.collect(Collectors.toList());
    }
}
