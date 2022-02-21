package libplex.entity;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import libplex.PlexService;
import libplex.PlexUriBuilder;
import libplex.plex.tag.MediaContainer;

public class Artist extends MediaDirectory {
    public Artist(PlexService plex, URI uri, Server server) {
        super(plex, uri, server);
    }

    public List<Album> albums() {
        return getPlexClient().executeGet(PlexUriBuilder.fromKey(getDirectory().getKey(), null, getServer())
                .build(), MediaContainer.class)
                .getDirectories()
                .stream()
                .map(d -> new Album(getPlexClient(), PlexUriBuilder.fromKey(getDirectory().getKey(), this, getServer())
                        .build(), getServer()))
                .collect(Collectors.toList());
    }

    public List<String> getGenres() {
        return getDirectory().getGenres()
                .stream()
                .map(t -> t.getTag())
                .collect(Collectors.toList());
    }

    public List<String> getCountries() {
        return getDirectory().getCountries()
                .stream()
                .map(t -> t.getTag())
                .collect(Collectors.toList());
    }

    public List<String> getStyles() {
        return getDirectory().getStyles()
                .stream()
                .map(t -> t.getTag())
                .collect(Collectors.toList());
    }

    public List<String> getSimilars() {
        return getDirectory().getSimilars()
                .stream()
                .map(t -> t.getTag())
                .collect(Collectors.toList());
    }

    public List<String> getMoods() {
        return getDirectory().getMoods()
                .stream()
                .map(t -> t.getTag())
                .collect(Collectors.toList());
    }

    public String getPath() {
        return getDirectory().getLocation()
                .getPath();
    }

    @Override
    public ArtistSection getSection() {
        return new ArtistSection(getPlexClient(),
                PlexUriBuilder.fromKey(getDirectory().getLibrarySectionKey(), this, getServer())
                        .build(),
                getServer());
    }
}
