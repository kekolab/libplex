package libplex.entity;

import java.net.URI;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import libplex.PlexClient;
import libplex.plex.entity.MediaContainer;

public class Album extends MediaDirectory {

    public Album(PlexClient plex, URI uri, Server server) {
        super(plex, uri, server);
    }

    public List<Track> getTracks() {
        return getPlexClient().executeGet(getDirectory().getKey(), null, getServer(), MediaContainer.class, null)
                .getTracks()
                .stream()
                .map(t -> new Track(getPlexClient(),
                        getPlexClient().uri("/library/metadata/".concat(Integer.toString(t.getRatingKey())), null,
                                getServer(), null),
                        getServer()))
                .collect(Collectors.toList());
    }

    public String getStudio() {
        return getDirectory().getStudio();
    }

    public Artist getArtist() {
        return new Artist(getPlexClient(), getPlexClient().uri(getDirectory().getParentKey(), null, getServer(), null),
                getServer());
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
                getPlexClient().uri(getDirectory().getLibrarySectionKey(), null, getServer(), null), getServer());
    }
}
