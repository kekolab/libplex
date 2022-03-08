package kekolab.libplex.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public class Stream {
    @XmlAttribute private Integer id;
    @XmlAttribute private Integer streamType;
    @XmlAttribute private Integer _default;
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
    @XmlAttribute private String chromaLocation;
    @XmlAttribute private String chromaSubsampling;
    @XmlAttribute private Integer codedHeight;
    @XmlAttribute private Integer codedWidth;
    @XmlAttribute private Double frameRate;
    @XmlAttribute private Integer hasScalingMatrix;
    @XmlAttribute private Integer height;
    @XmlAttribute private Integer level;
    @XmlAttribute private String profile;
    @XmlAttribute private Integer refFrames;
    @XmlAttribute private String scanType;
    @XmlAttribute private Integer width;
    @XmlAttribute private String language;
    @XmlAttribute private String languageCode;

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

    public Integer get_default() {
        return _default;
    }

    public String getChromaLocation() {
        return chromaLocation;
    }

    public String getChromaSubsampling() {
        return chromaSubsampling;
    }

    public Integer getCodedHeight() {
        return codedHeight;
    }

    public Integer getCodedWidth() {
        return codedWidth;
    }

    public Double getFrameRate() {
        return frameRate;
    }

    public Integer getHasScalingMatrix() {
        return hasScalingMatrix;
    }

    public Integer getHeight() {
        return height;
    }

    public Integer getLevel() {
        return level;
    }

    public String getProfile() {
        return profile;
    }

    public Integer getRefFrames() {
        return refFrames;
    }

    public String getScanType() {
        return scanType;
    }

    public Integer getWidth() {
        return width;
    }

    public String getLanguage() {
        return language;
    }

    public String getLanguageCode() {
        return languageCode;
    }
}
