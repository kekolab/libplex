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
        this.media = track.getMedia()
                .stream()
                .map(m -> new Medium(plex, server, m))
                .collect(Collectors.toList());
    }

    public String getTitle() {
        return track.getTitle();
    }

    public Artist getArtist() {
        return new Artist(getPlexClient(), PlexUriBuilder.fromKey(track.getGrandParentKey(), null, getServer())
                .build(), getServer());
    }

    public Album getAlbum() {
        return new Album(getPlexClient(), PlexUriBuilder.fromKey(track.getParentKey(), null, getServer())
                .build(), getServer());
    }

    public ArtistSection getSection() {
        return new ArtistSection(getPlexClient(),
                PlexUriBuilder.fromKey(track.getLibrarySectionKey(), null, getServer())
                        .build(),
                getServer());
    }

    public URI getThumb() {
        return PlexUriBuilder.fromKey(track.getThumb(), null, getServer())
                .build();
    }

    public URI getArt() {
        return PlexUriBuilder.fromKey(track.getArt(), null, getServer())
                .build();
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

    public boolean getHasPremiumLyrics() {
        return track.getHasPremiumLyrics() == 1;
    }

    public List<Medium> getMedia() {
        return media;
    }
}
