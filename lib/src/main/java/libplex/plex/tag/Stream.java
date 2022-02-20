package libplex.plex.tag;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public class Stream {
    @XmlAttribute private Integer id;
    @XmlAttribute private Integer streamType;
    @XmlAttribute private Integer selected;
    @XmlAttribute private String codec;
    @XmlAttribute private Integer index;
    @XmlAttribute private Integer channels;
    @XmlAttribute private Integer bitrate;
    @XmlAttribute private Double albumGain;
    @XmlAttribute private Double albumPeak;
    @XmlAttribute private Double albumRange;
    @XmlAttribute private String audioChannelLayout;
    @XmlAttribute private Integer bitDepth;
    @XmlAttribute private Double gain;
    @XmlAttribute private Double loudness;
    @XmlAttribute private Double lra;
    @XmlAttribute private Double peak;
    @XmlAttribute private Integer samplingRate;
    @XmlAttribute private String displayTitle;
    @XmlAttribute private String extendedDisplayTitle;

    public Integer getId() {
        return id;
    }

    public Integer getStreamType() {
        return streamType;
    }

    public Integer getSelected() {
        return selected;
    }

    public String getCodec() {
        return codec;
    }

    public Integer getIndex() {
        return index;
    }

    public Integer getChannels() {
        return channels;
    }

    public Integer getBitrate() {
        return bitrate;
    }

    public Double getAlbumGain() {
        return albumGain;
    }

    public Double getAlbumPeak() {
        return albumPeak;
    }

    public Double getAlbumRange() {
        return albumRange;
    }

    public String getAudioChannelLayout() {
        return audioChannelLayout;
    }

    public Integer getBitDepth() {
        return bitDepth;
    }

    public Double getGain() {
        return gain;
    }

    public Double getLoudness() {
        return loudness;
    }

    public Double getLra() {
        return lra;
    }

    public Double getPeak() {
        return peak;
    }

    public Integer getSamplingRate() {
        return samplingRate;
    }

    public String getDisplayTitle() {
        return displayTitle;
    }

    public String getExtendedDisplayTitle() {
        return extendedDisplayTitle;
    }
}
