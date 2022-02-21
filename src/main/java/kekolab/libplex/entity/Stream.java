package kekolab.libplex.entity;

public class Stream {
	private kekolab.libplex.plex.tag.Stream stream;

	public Stream(kekolab.libplex.plex.tag.Stream stream) {
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