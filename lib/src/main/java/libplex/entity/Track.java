package libplex.entity;

import java.net.URI;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import libplex.Plex;
import libplex.plex.entity.Media;

public class Track extends ServerMediaContainerPlexItem {
	private libplex.plex.entity.Track track;
	private List<Medium> media;

	public Track(Plex plex, URI uri, Server server) {
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

	public List<Medium> getMedia() {
		return media;
	}

	public static class Medium {
		private Media media;
		private List<Part> parts;

		public Medium(Plex plex, Server server, Media media) {
			this.media = media;
			this.parts = media.getParts()
					.stream()
					.map(p -> new Part(plex, server, p))
					.collect(Collectors.toList());
		}

		public int getDuration() {
			return media.getDuration();
		}

		public int getBitrate() {
			return media.getBitrate();
		}

		public int getAudioChannels() {
			return media.getAudioChannels();
		}

		public String getAudioCodec() {
			return media.getAudioCodec();
		}

		public String getContainer() {
			return media.getContainer();
		}

		public List<Part> getParts() {
			return parts;
		}
	}

	public static class Part {
		private libplex.plex.entity.Part part;
		private Plex plex;
		private Server server;

		public Part(Plex plex, Server server, libplex.plex.entity.Part part) {
			this.plex = plex;
			this.server = server;
			this.part = part;
		}

		public URI getURI() {
			return plex.uri(part.getKey(), null, server, null);
		}

		public int getDuration() {
			return part.getDuration();
		}

		public String getFile() {
			return part.getFile();
		}

		public int getSize() {
			return part.getSize();
		}

		public String getContainer() {
			return part.getContainer();
		}

		public int getHasThumbnail() {
			return part.getHasThumbnail();
		}
	}

	public static class Stream {
		private libplex.plex.entity.Stream stream;

		public Stream(libplex.plex.entity.Stream stream) {
			this.stream = stream;
		}

		public int getStreamType() {
			return stream.getStreamType();
		}

		public int getSelected() {
			return stream.getSelected();
		}

		public String getCodec() {
			return stream.getCodec();
		}

		public int getIndex() {
			return stream.getIndex();
		}

		public int getChannels() {
			return stream.getChannels();
		}

		public int getBitrate() {
			return stream.getBitrate();
		}

		public double getAlbumGain() {
			return stream.getAlbumGain();
		}

		public double getAlbumPeak() {
			return stream.getAlbumPeak();
		}

		public double getAlbumRange() {
			return stream.getAlbumRange();
		}

		public String getAudioChannelLayout() {
			return stream.getAudioChannelLayout();
		}

		public int getBitDepth() {
			return stream.getBitDepth();
		}

		public double getGain() {
			return stream.getGain();
		}

		public double getLoudness() {
			return stream.getLoudness();
		}

		public double getLra() {
			return stream.getLra();
		}

		public double getPeak() {
			return stream.getPeak();
		}

		public int getSamplingRate() {
			return stream.getSamplingRate();
		}

		public String getDisplayTitle() {
			return stream.getDisplayTitle();
		}

		public String getExtendedDisplayTitle() {
			return stream.getExtendedDisplayTitle();
		}
	}
}
