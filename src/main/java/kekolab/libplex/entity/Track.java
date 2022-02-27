package kekolab.libplex.entity;

import java.net.URI;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import kekolab.libplex.PlexService;
import kekolab.libplex.PlexUriBuilder;

public class Track extends ServerMediaContainerPlexItem {
	private List<Medium> media;
	private kekolab.libplex.plex.tag.Track track;

	public Track(PlexService plex, URI uri, ServerContent server) {
		super(plex, uri, server);
		this.track = getMediaContainer().getTracks()
				.get(0);
		this.media = track.getMedia()
				.stream()
				.map(m -> new Medium(plex, server, m))
				.collect(Collectors.toList());
	}

	public Integer getSize() {
		return getMediaContainer().getSize();
	}

	public Integer getAllowSync() {
		return getMediaContainer().getAllowSync();
	}

	public String getIdentifier() {
		return getMediaContainer().getIdentifier();
	}

	public String getLibrarySectionUUID() {
		return getMediaContainer().getLibrarySectionUUID();
	}

	public String getMediaTagPrefix() {
		return getMediaContainer().getMediaTagPrefix();
	}

	public Integer getMediaTagVersion() {
		return getMediaContainer().getMediaTagVersion();
	}

	public Integer getRatingKey() {
		return track.getRatingKey();
	}

	public String getKey() {
		return track.getKey();
	}

	public Integer getParentRatingKey() {
		return track.getParentRatingKey();
	}

	public Integer getGrandparentRatingKey() {
		return track.getGrandparentRatingKey();
	}

	public String getGuid() {
		return track.getGuid();
	}

	public String getParentGuid() {
		return track.getParentGuid();
	}

	public String getGrandparentGuid() {
		return track.getGrandparentGuid();
	}

	public String getParentStudio() {
		return track.getParentStudio();
	}

	public String getType() {
		return track.getType();
	}

	public String getGrandparentKey() {
		return track.getGrandparentKey();
	}

	public String getParentKey() {
		return track.getGrandparentKey();
	}

	public String getLibrarySectionTitle() {
		return track.getLibrarySectionKey();
	}

	public Integer getLibrarySectionID() {
		return track.getLibrarySectionID();
	}

	public String getLibrarySectionKey() {
		return track.getLibrarySectionKey();
	}

	public String getGrandparentTitle() {
		return track.getGrandparentTitle();
	}

	public String getParentTitle() {
		return track.getParentTitle();
	}

	public Integer getParentIndex() {
		return track.getParentIndex();
	}

	public Integer getViewCount() {
		return track.getViewCount();
	}

	public Date getLastViewedAt() {
		return track.getLastViewedAt();
	}

	public Integer getParentYear() {
		return track.getParentYear();
	}

	public Date getAddedAt() {
		return track.getAddedAt();
	}

	public URI getArt() {
		return PlexUriBuilder.fromKey(track.getArt(), null, getServer())
				.build();
	}

	public URI getParentThumb() {
		return PlexUriBuilder.fromKey(track.getParentThumb(), null, getServer())
				.build();
	}

	public URI getGrandparentThumb() {
		return PlexUriBuilder.fromKey(track.getGrandparentThumb(), null, getServer())
				.build();
	}

	public URI getGrandparentArt() {
		return PlexUriBuilder.fromKey(track.getGrandparentArt(), null, getServer())
				.build();
	}

	public Integer getDuration() {
		return track.getDuration();
	}

	public Integer getHasPremiumLyrics() {
		return track.getHasPremiumLyrics();
	}

	public Integer getIndex() {
		return track.getIndex();
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

	public Album album() {
		return new Album(getPlexClient(), PlexUriBuilder.fromKey(track.getParentKey(), null, getServer())
				.build(), getServer());
	}

	public Artist artist() {
		return new Artist(getPlexClient(), PlexUriBuilder.fromKey(track.getGrandparentKey(), null, getServer())
				.build(), getServer());
	}
}
