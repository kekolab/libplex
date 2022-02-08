package libplex.entity;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import libplex.Plex;

public class Sections extends ServerMediaContainerPlexItem {
    public Sections(Plex plex, URI uri, Server server) {
        super(plex, uri, server);
    }

    public List<ArtistSection> artistSections() {
        return getMediaContainer().getDirectories()
                .stream()
                .filter(d -> "artist".equals(d.getType()))
                .map(d -> new ArtistSection(getPlex(), getPlex().uri(d.getKey(), this, getServer(), null), getServer()))
                .collect(Collectors.toList());
    }

    public List<MovieSection> movieSections() {
        return getMediaContainer().getDirectories()
                .stream()
                .filter(d -> "movie".equals(d.getType()))
                .map(d -> new MovieSection(getPlex(), getPlex().uri(d.getKey(), this, getServer(), null), getServer()))
                .collect(Collectors.toList());
    }

    /*
     * TODO
     * - TVShow Sections
     */

}
