package libplex.entity;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import libplex.PlexClient;

public class Sections extends ServerMediaContainerPlexItem {
    public Sections(PlexClient plex, URI uri, Server server) {
        super(plex, uri, server);
    }

    public List<MediaSection> all() {
        return Stream.concat(artistSections().stream(), movieSections().stream())
                .collect(Collectors.toList());
    }

    public List<ArtistSection> artistSections() {
        return getMediaContainer().getDirectories()
                .stream()
                .filter(d -> "artist".equals(d.getType()))
                .map(d -> new ArtistSection(getPlexClient(), getPlexClient().uri(d.getKey(), this, getServer(), null), getServer()))
                .collect(Collectors.toList());
    }

    public List<MovieSection> movieSections() {
        return getMediaContainer().getDirectories()
                .stream()
                .filter(d -> "movie".equals(d.getType()))
                .map(d -> new MovieSection(getPlexClient(), getPlexClient().uri(d.getKey(), this, getServer(), null), getServer()))
                .collect(Collectors.toList());
    }

    /*
     * TODO
     * - TVShow Sections
     */

}
