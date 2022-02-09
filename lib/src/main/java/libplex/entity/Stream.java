package libplex.entity;

public class Stream {
    private libplex.plex.entity.Stream stream;

    public Stream(libplex.plex.entity.Stream stream) {
        this.stream = stream;
    }

    public int getStreamType() {
        return getStream().getStreamType();
    }

    public int getSelected() {
        return getStream().getSelected();
    }

    public String getCodec() {
        return getStream().getCodec();
    }

    public int getIndex() {
        return getStream().getIndex();
    }

    public int getChannels() {
        return getStream().getChannels();
    }

    public int getBitrate() {
        return getStream().getBitrate();
    }

    public double getAlbumGain() {
        return getStream().getAlbumGain();
    }

    public double getAlbumPeak() {
        return getStream().getAlbumPeak();
    }

    public double getAlbumRange() {
        return getStream().getAlbumRange();
    }

    public String getAudioChannelLayout() {
        return getStream().getAudioChannelLayout();
    }

    public int getBitDepth() {
        return getStream().getBitDepth();
    }

    public double getGain() {
        return getStream().getGain();
    }

    public double getLoudness() {
        return getStream().getLoudness();
    }

    public double getLra() {
        return getStream().getLra();
    }

    public double getPeak() {
        return getStream().getPeak();
    }

    public int getSamplingRate() {
        return getStream().getSamplingRate();
    }

    public String getDisplayTitle() {
        return getStream().getDisplayTitle();
    }

    public String getExtendedDisplayTitle() {
        return getStream().getExtendedDisplayTitle();
    }

    private libplex.plex.entity.Stream getStream() {
        return stream;
    }
}