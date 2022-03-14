package kekolab.libplex.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public class PMSStream {
    private Integer id;
    private Integer streamType;
    private Integer _default;
    private Integer selected;
    private String codec;
    private Integer index;
    private Integer channels;
    private Integer bitrate;
    private Double albumGain;
    private Double albumPeak;
    private Double albumRange;
    private String audioChannelLayout;
    private Integer bitDepth;
    private Double gain;
    private Double loudness;
    private Double lra;
    private Double peak;
    private Integer samplingRate;
    private String displayTitle;
    private String extendedDisplayTitle;
    private String chromaLocation;
    private String chromaSubsampling;
    private Integer codedHeight;
    private Integer codedWidth;
    private Double frameRate;
    private Integer hasScalingMatrix;
    private Integer height;
    private Integer level;
    private String profile;
    private Integer refFrames;
    private String scanType;
    private Integer width;
    private String language;
    private String languageCode;

    public Integer getId() {
        return id;
    }

    public Integer getStreamType() {
        return streamType;
    }

    public Integer get_default() {
        return _default;
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

    @XmlAttribute
    public void setId(Integer id) {
        this.id = id;
    }

    @XmlAttribute
    public void setStreamType(Integer streamType) {
        this.streamType = streamType;
    }

    @XmlAttribute(name = "default")
    public void set_default(Integer _default) {
        this._default = _default;
    }

    @XmlAttribute
    public void setSelected(Integer selected) {
        this.selected = selected;
    }

    @XmlAttribute
    public void setCodec(String codec) {
        this.codec = codec;
    }

    @XmlAttribute
    public void setIndex(Integer index) {
        this.index = index;
    }

    @XmlAttribute
    public void setChannels(Integer channels) {
        this.channels = channels;
    }

    @XmlAttribute
    public void setBitrate(Integer bitrate) {
        this.bitrate = bitrate;
    }

    @XmlAttribute
    public void setAlbumGain(Double albumGain) {
        this.albumGain = albumGain;
    }

    @XmlAttribute
    public void setAlbumPeak(Double albumPeak) {
        this.albumPeak = albumPeak;
    }

    @XmlAttribute
    public void setAlbumRange(Double albumRange) {
        this.albumRange = albumRange;
    }

    @XmlAttribute
    public void setAudioChannelLayout(String audioChannelLayout) {
        this.audioChannelLayout = audioChannelLayout;
    }

    @XmlAttribute
    public void setBitDepth(Integer bitDepth) {
        this.bitDepth = bitDepth;
    }

    @XmlAttribute
    public void setGain(Double gain) {
        this.gain = gain;
    }

    @XmlAttribute
    public void setLoudness(Double loudness) {
        this.loudness = loudness;
    }

    @XmlAttribute
    public void setLra(Double lra) {
        this.lra = lra;
    }

    @XmlAttribute
    public void setPeak(Double peak) {
        this.peak = peak;
    }

    @XmlAttribute
    public void setSamplingRate(Integer samplingRate) {
        this.samplingRate = samplingRate;
    }

    @XmlAttribute
    public void setDisplayTitle(String displayTitle) {
        this.displayTitle = displayTitle;
    }

    @XmlAttribute
    public void setExtendedDisplayTitle(String extendedDisplayTitle) {
        this.extendedDisplayTitle = extendedDisplayTitle;
    }

    @XmlAttribute
    public void setChromaLocation(String chromaLocation) {
        this.chromaLocation = chromaLocation;
    }

    @XmlAttribute
    public void setChromaSubsampling(String chromaSubsampling) {
        this.chromaSubsampling = chromaSubsampling;
    }

    @XmlAttribute
    public void setCodedHeight(Integer codedHeight) {
        this.codedHeight = codedHeight;
    }

    @XmlAttribute
    public void setCodedWidth(Integer codedWidth) {
        this.codedWidth = codedWidth;
    }

    @XmlAttribute
    public void setFrameRate(Double frameRate) {
        this.frameRate = frameRate;
    }

    @XmlAttribute
    public void setHasScalingMatrix(Integer hasScalingMatrix) {
        this.hasScalingMatrix = hasScalingMatrix;
    }

    @XmlAttribute
    public void setHeight(Integer height) {
        this.height = height;
    }

    @XmlAttribute
    public void setLevel(Integer level) {
        this.level = level;
    }

    @XmlAttribute
    public void setProfile(String profile) {
        this.profile = profile;
    }

    @XmlAttribute
    public void setRefFrames(Integer refFrames) {
        this.refFrames = refFrames;
    }

    @XmlAttribute
    public void setScanType(String scanType) {
        this.scanType = scanType;
    }

    @XmlAttribute
    public void setWidth(Integer width) {
        this.width = width;
    }

    @XmlAttribute
    public void setLanguage(String language) {
        this.language = language;
    }

    @XmlAttribute
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

}
