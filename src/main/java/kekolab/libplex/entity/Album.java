package kekolab.libplex.entity;

import java.net.URI;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import kekolab.libplex.PlexClient;

public class Album extends MediaDirectory {

    public Album(PlexClient plex, URI uri, ServerContent server) {
        super(plex, uri, server);
    }

    public Integer getParentRatingKey() {
        return getDirectory().getParentRatingKey();
    }

    public String getParentGuid() {
        return getDirectory().getParentGuid();
    }

    public String getStudio() {
        return getDirectory().getStudio();
    }

    public String getParentKey() {
        return getDirectory().getParentKey();
    }

    public String getParentTitle() {
        return getDirectory().getParentTitle();
    }

    public Double getRating() {
        return getDirectory().getRating();
    }

    public Integer getYear() {
        return getDirectory().getYear();
    }

    public URI getParentThumb() {
        return getPlexClient().uriBuilder()
                .fromKey(getDirectory().getParentThumb(), null, getServer())
                .build();
    }

    public Date getOriginallyAvailableAt() {
        return getDirectory().getOriginallyAvailableAt();
    }

    public int getLeafCount() {
        return getDirectory().getLeafCount();
    }

    public int getViewedLeafCount() {
        return getDirectory().getViewedtLeafCount();
    }

    public int getLoudnessAnalysisVersion() {
        return getDirectory().getLoudnessAnalysisVersion();
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
    public ArtistSection section() {
        return new ArtistSection(getPlexClient(), getPlexClient().uriBuilder()
                .fromKey(getDirectory().getLibrarySectionKey(), null, getServer())
                .build(), getServer());
    }

    public List<Track> tracks() {
        List<Track> tracks = getPlexClient().executeGet(getPlexClient().uriBuilder()
                .fromKey(getDirectory().getKey(), null, getServer())
                .build(), MediaContainer.class)
                .getTracks();
        tracks.forEach(t -> {
            t.setPlex(getPlexClient());
            t.setServer(getServer());
        });
        return tracks;
    }

    public Artist artist() {
        return new Artist(getPlexClient(), getPlexClient().uriBuilder()
                .fromKey(getDirectory().getParentKey(), null, getServer())
                .build(), getServer());
    }
}
