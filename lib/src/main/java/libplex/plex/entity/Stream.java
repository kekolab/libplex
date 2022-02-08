package libplex.plex.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public class Stream {
	@XmlAttribute private int id;
	@XmlAttribute private int streamType;
	@XmlAttribute private int selected;
	@XmlAttribute private String codec;
	@XmlAttribute private int index;
	@XmlAttribute private int channels;
	@XmlAttribute private int bitrate;
	@XmlAttribute private double albumGain;
	@XmlAttribute private double albumPeak;
	@XmlAttribute private double albumRange;
	@XmlAttribute private String audioChannelLayout;
	@XmlAttribute private int bitDepth;
	@XmlAttribute private double gain;
	@XmlAttribute private double loudness;
	@XmlAttribute private double lra;
	@XmlAttribute private double peak;
	@XmlAttribute private int samplingRate;
	@XmlAttribute private String displayTitle;
	@XmlAttribute private String extendedDisplayTitle;

	public int getId() {
		return id;
	}

	public int getStreamType() {
		return streamType;
	}

	public int getSelected() {
		return selected;
	}

	public String getCodec() {
		return codec;
	}

	public int getIndex() {
		return index;
	}

	public int getChannels() {
		return channels;
	}

	public int getBitrate() {
		return bitrate;
	}

	public double getAlbumGain() {
		return albumGain;
	}

	public double getAlbumPeak() {
		return albumPeak;
	}

	public double getAlbumRange() {
		return albumRange;
	}

	public String getAudioChannelLayout() {
		return audioChannelLayout;
	}

	public int getBitDepth() {
		return bitDepth;
	}

	public double getGain() {
		return gain;
	}

	public double getLoudness() {
		return loudness;
	}

	public double getLra() {
		return lra;
	}

	public double getPeak() {
		return peak;
	}

	public int getSamplingRate() {
		return samplingRate;
	}

	public String getDisplayTitle() {
		return displayTitle;
	}

	public String getExtendedDisplayTitle() {
		return extendedDisplayTitle;
	}
}
