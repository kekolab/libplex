package libplex.entity;

import java.net.URI;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import libplex.PlexClient;
import libplex.PlexUriBuilder;

public class Track extends ServerMediaContainerPlexItem {
	private List<AudioMedium> media;
	private libplex.plex.entity.Track track;

	public Track(PlexClient plex, URI uri, Server server) {
		super(plex, uri, server);
		this.track = getMediaContainer().getTracks()
				.get(0);
		this.media = track.getMedia()
				.stream()
				.map(m -> new AudioMedium(plex, server, m))
				.collect(Collectors.toList());
	}

	public Date getAddedAt() {
		return track.getAddedAt();
	}

	public Album getAlbum() {
		return new Album(getPlexClient(), PlexUriBuilder.fromKey(track.getParentKey(), null, getServer())
				.build(), getServer());
	}

	public URI getArt() {
		return PlexUriBuilder.fromKey(track.getArt(), null, getServer())
				.build();
	}

	public Artist getArtist() {
		return new Artist(getPlexClient(), PlexUriBuilder.fromKey(track.getGrandParentKey(), null, getServer())
				.build(), getServer());
	}

	public int getDuration() {
		return track.getDuration();
	}

	public boolean getHasPremiumLyrics() {
		return track.getHasPremiumLyrics() == 1;
	}

	public List<AudioMedium> getMedia() {
		return media;
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

	public String getTitle() {
		return track.getTitle();
	}

	public Date getUpdatedAt() {
		return track.getUpdatedAt();
	}
}
