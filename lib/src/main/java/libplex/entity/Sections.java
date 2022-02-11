package libplex.entity;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import libplex.PlexClient;
import libplex.PlexUriBuilder;

public class Sections extends ServerMediaContainerPlexItem {
    public Sections(PlexClient plex, URI uri, Server server) {
        super(plex, uri, server);
    }

    public List<MediaSection> all() {
        return Stream.concat(artistSections().stream(), movieSections().stream())
                .collect(Collectors.toList());
    }

    public List<ArtistSection> artistSections() {
        return directoriesByType("artist").stream()
                .map(d -> new ArtistSection(getPlexClient(), PlexUriBuilder.fromKey(d.getKey(), this, getServer())
                        .build(), getServer()))
                .collect(Collectors.toList());
    }

    public List<MovieSection> movieSections() {
        return directoriesByType("movie").stream()
                .map(d -> new MovieSection(getPlexClient(), PlexUriBuilder.fromKey(d.getKey(), this, getServer())
                        .build(), getServer()))
                .collect(Collectors.toList());
    }

    /*
     * TODO
     * - TVShow Sections
     */

}
