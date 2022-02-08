package libplex.entity;

import java.net.URI;
import java.util.Date;

import libplex.Plex;

public class Track extends ServerMediaContainerPlexItem {
    private libplex.plex.entity.Track track;

    public Track(Plex plex, URI uri, Server server) {
        super(plex, uri, server);
        this.track = getMediaContainer().getTracks()
                .get(0);
    }

    public String getName() {
        return track.getTitle();
    }

    public Artist getArtist() {
        return new Artist(getPlex(), getPlex().uri(track.getGrandParentKey(), null, getServer(), null), getServer());
    }

    public Album getAlbum() {
        return new Album(getPlex(), getPlex().uri(track.getParentKey(), null, getServer(), null), getServer());
    }

    public ArtistSection getSection() {
        return new ArtistSection(getPlex(), getPlex().uri(track.getLibrarySectionKey(), null, getServer(), null),
                getServer());
    }

    public URI getThumb() {
        return getPlex().uri(track.getThumb(), null, getServer(), null);
    }

    public URI getArt() {
        return getPlex().uri(track.getArt(), null, getServer(), null);
    }

    public int getDuration() {
        return track.getDuration();
    }

    public Date getAddedAt() {
        return track.getAddedAt();
    }

    public Date getUpdatedAt() {
        return track.getUpdatedAt();
    }

    public boolean hasPremiumLyrics() {
        return track.getHasPremiumLyrics() == 1;
    }

    /*
     * TODO Media, Part, Stream
     */
}
