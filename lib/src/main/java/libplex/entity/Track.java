package libplex.entity;

import java.net.URI;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import libplex.PlexClient;
import libplex.PlexUriBuilder;

public class Track extends ServerMediaContainerPlexItem {
    private libplex.plex.entity.Track track;
    private List<Medium> media;

    public Track(PlexClient plex, URI uri, Server server) {
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
        return new Artist(getPlexClient(), PlexUriBuilder.fromKey(getTrack().getGrandParentKey(), null, getServer())
                .build(), getServer());
    }

    public Album getAlbum() {
        return new Album(getPlexClient(), PlexUriBuilder.fromKey(getTrack().getParentKey(), null, getServer())
                .build(), getServer());
    }

    public ArtistSection getSection() {
        return new ArtistSection(getPlexClient(),
                PlexUriBuilder.fromKey(getTrack().getLibrarySectionKey(), null, getServer())
                        .build(),
                getServer());
    }

    public URI getThumb() {
        return PlexUriBuilder.fromKey(getTrack().getThumb(), null, getServer())
                .build();
    }

    public URI getArt() {
        return PlexUriBuilder.fromKey(getTrack().getArt(), null, getServer())
                .build();
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
