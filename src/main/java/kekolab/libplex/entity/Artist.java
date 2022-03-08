package kekolab.libplex.entity;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import kekolab.libplex.PlexClient;

public class Artist extends MediaDirectory {
    public Artist(PlexClient plex, Directory d, ServerContent server) {
        this(plex, plex.uriBuilder()
                .fromKey("/library/metadata/{ratingKey}", null, server)
                .build(d.getRatingKey()), server);
    }

    public Artist(PlexClient plex, URI uri, ServerContent server) {
        super(plex, uri, server);
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

    public List<Location> getLocations() {
        return getDirectory().getLocations();
    }

    public List<Album> albums() {
        return getPlexClient().executeGet(getPlexClient().uriBuilder()
                .fromKey(getDirectory().getKey(), null, getServer())
                .build(), MediaContainer.class)
                .getDirectories()
                .stream()
                .map(d -> new Album(getPlexClient(), getPlexClient().uriBuilder()
                        .fromKey(getDirectory().getKey(), this, getServer())
                        .build(), getServer()))
                .collect(Collectors.toList());
    }

    @Override
    public ArtistSection section() {
        return new ArtistSection(getPlexClient(), getPlexClient().uriBuilder()
                .fromKey(getDirectory().getLibrarySectionKey(), this, getServer())
                .build(), getServer());
    }
}
