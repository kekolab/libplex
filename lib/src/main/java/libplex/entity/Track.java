package libplex.entity;

import java.net.URI;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import libplex.PlexClient;
import libplex.PlexUriBuilder;

public class Track extends ServerMediaContainerPlexItem {
	private List<Medium> media;
	private libplex.plex.entity.Track track;

	public Track(PlexClient plex, URI uri, Server server) {
		super(plex, uri, server);
		this.track = getMediaContainer().getTracks()
				.get(0);
		this.media = track.getMedia()
				.stream()
				.map(m -> new Medium(plex, server, m))
				.collect(Collectors.toList());
	}

	public Date getAddedAt() {
		return track.getAddedAt();
	}

	public String getArt() {
		return track.getArt();
	}

	public Integer getDuration() {
		return track.getDuration();
	}

	public Artist getArtist() {
		return new Artist(getPlexClient(), PlexUriBuilder.fromKey(track.getGrandparentKey(), null, getServer())
				.build(), getServer());
	}

	public Integer getHasPremiumLyrics() {
		return track.getHasPremiumLyrics();
	}

	public Integer getIndex() {
		return track.getIndex();
	}

	public Album getAlbum() {
		return new Album(getPlexClient(), PlexUriBuilder.fromKey(track.getParentKey(), null, getServer())
				.build(), getServer());
	}

	public Integer getRatingCount() {
		return track.getRatingCount();
	}

	public String getSummary() {
		return track.getSummary();
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

	public List<Medium> getMedia() {
		return media;
	}
}
