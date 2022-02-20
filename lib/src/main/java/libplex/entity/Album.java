package libplex.entity;

import java.net.URI;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import libplex.PlexClient;
import libplex.PlexUriBuilder;
import libplex.plex.tag.MediaContainer;

public class Album extends MediaDirectory {

    public Album(PlexClient plex, URI uri, Server server) {
        super(plex, uri, server);
    }

    public List<Track> getTracks() {
        return getPlexClient().executeGet(PlexUriBuilder.fromKey(getDirectory().getKey(), null, getServer())
                .build(), MediaContainer.class)
                .getTracks()
                .stream()
                .map(t -> new Track(getPlexClient(),
                        PlexUriBuilder.fromKey("/library/metadata/{ratingKey}", this, getServer())
                                .build(t.getRatingKey()),
                        getServer()))
                .collect(Collectors.toList());
    }

    public String getStudio() {
        return getDirectory().getStudio();
    }

    public Artist getArtist() {
        return new Artist(getPlexClient(), PlexUriBuilder.fromKey(getDirectory().getParentKey(), null, getServer())
                .build(), getServer());
    }

    public double getRating() {
        return getDirectory().getRating();
    }

    public int getYear() {
        return getDirectory().getYear();
    }

    public Date getOriginallyAvailableAt() {
        return getDirectory().getOriginallyAvailableAt();
    }

    public int getLoudnessAnalysisVersion() {
        return getDirectory().getLoudnessAnalysisVersion();
    }

    public int getLeafCount() {
        return getDirectory().getLeafCount();
    }

    public int getViewedLeafCount() {
        return getDirectory().getViewedtLeafCount();
    }

    public List<String> getGenres() {
        return getDirectory().getGenres()
                .stream()
                .map(g -> g.getTag())
                .collect(Collectors.toList());
    }

    public List<String> getDirectors() {
        return getDirectory().getDirectors()
                .stream()
                .map(g -> g.getTag())
                .collect(Collectors.toList());
    }

    public List<String> getStyles() {
        return getDirectory().getStyles()
                .stream()
                .map(g -> g.getTag())
                .collect(Collectors.toList());
    }

    public List<String> getMoods() {
        return getDirectory().getMoods()
                .stream()
                .map(g -> g.getTag())
                .collect(Collectors.toList());
    }

    @Override
    public ArtistSection getSection() {
        return new ArtistSection(getPlexClient(),
                PlexUriBuilder.fromKey(getDirectory().getLibrarySectionKey(), null, getServer())
                        .build(),
                getServer());
    }
}
