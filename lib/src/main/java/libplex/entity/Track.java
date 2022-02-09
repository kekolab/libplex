package libplex.entity;

import java.net.URI;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import libplex.Plex;

public class Track extends ServerMediaContainerPlexItem {
    private libplex.plex.entity.Track track;
    private List<Medium> media;

    public Track(Plex plex, URI uri, Server server) {
        super(plex, uri, server);
        this.track = getMediaContainer().getTracks()
                .get(0);
        this.media = getTrack().getMedia()
                .stream()
                .map(m -> new Medium(plex, server, m))
                .collect(Collectors.toList());
    }

    public String getTitle() {
        return getTrack().getTitle();
    }

    public Artist getArtist() {
        return new Artist(getPlex(), getPlex().uri(getTrack().getGrandParentKey(), null, getServer(), null),
                getServer());
    }

    public Album getAlbum() {
        return new Album(getPlex(), getPlex().uri(getTrack().getParentKey(), null, getServer(), null), getServer());
    }

    public ArtistSection getSection() {
        return new ArtistSection(getPlex(), getPlex().uri(getTrack().getLibrarySectionKey(), null, getServer(), null),
                getServer());
    }

    public URI getThumb() {
        return getPlex().uri(getTrack().getThumb(), null, getServer(), null);
    }

    public URI getArt() {
        return getPlex().uri(getTrack().getArt(), null, getServer(), null);
    }

    public int getDuration() {
        return getTrack().getDuration();
    }

    public Date getAddedAt() {
        return getTrack().getAddedAt();
    }

    public Date getUpdatedAt() {
        return getTrack().getUpdatedAt();
    }

    public boolean getHasPremiumLyrics() {
        return getTrack().getHasPremiumLyrics() == 1;
    }

    public List<Medium> getMedia() {
        return media;
    }

    private libplex.plex.entity.Track getTrack() {
        return track;
    }
}
