package kekolab.libplex.entity;

import java.util.List;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;

public class Media {
    private Integer id; // Track, Video, Episode
    private Integer duration; // Track, Video, Episode
    private Integer bitrate; // Track, Video, Episode
    private Integer audioChannels; // Track, Video, Episode
    private String audioCodec; // Track, Video, Episode
    private String container; // Track, Video, Episode
    private Integer width; // Video, Episode
    private Integer height; // Video, Episode
    private Double aspectRatio; // Video, Episode
    private String videoCodec; // Video, Episode
    private String videoResolution; // String in Video, Integer in Episode
    private String videoFrameRate; // Video, Episode
    private String audioProfile; // Video
    private String videoProfile; // Video, Episode
    private List<Part> parts; // Track, Video

    public Integer getId() {
        return id;
    }

    public Integer getDuration() {
        return duration;
    }

    public Integer getBitrate() {
        return bitrate;
    }

    public Integer getAudioChannels() {
        return audioChannels;
    }

    public String getAudioCodec() {
        return audioCodec;
    }

    public String getContainer() {
        return container;
    }

    public Integer getWidth() {
        return width;
    }

    public Integer getHeight() {
        return height;
    }

    public Double getAspectRatio() {
        return aspectRatio;
    }

    public String getVideoCodec() {
        return videoCodec;
    }

    public String getVideoResolution() {
        return videoResolution;
    }

    public String getVideoFrameRate() {
        return videoFrameRate;
    }

    public String getAudioProfile() {
        return audioProfile;
    }

    public String getVideoProfile() {
        return videoProfile;
    }

    public List<Part> getParts() {
        return parts;
    }

    @XmlAttribute
    public void setId(Integer id) {
        this.id = id;
    }

    @XmlAttribute
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    @XmlAttribute
    public void setBitrate(Integer bitrate) {
        this.bitrate = bitrate;
    }

    @XmlAttribute
    public void setAudioChannels(Integer audioChannels) {
        this.audioChannels = audioChannels;
    }

    @XmlAttribute
    public void setAudioCodec(String audioCodec) {
        this.audioCodec = audioCodec;
    }

    @XmlAttribute
    public void setContainer(String container) {
        this.container = container;
    }

    @XmlAttribute
    public void setWidth(Integer width) {
        this.width = width;
    }

    @XmlAttribute
    public void setHeight(Integer height) {
        this.height = height;
    }

    @XmlAttribute
    public void setAspectRatio(Double aspectRatio) {
        this.aspectRatio = aspectRatio;
    }

    @XmlAttribute
    public void setVideoCodec(String videoCodec) {
        this.videoCodec = videoCodec;
    }

    @XmlAttribute
    public void setVideoResolution(String videoResolution) {
        this.videoResolution = videoResolution;
    }

    @XmlAttribute
    public void setVideoFrameRate(String videoFrameRate) {
        this.videoFrameRate = videoFrameRate;
    }

    @XmlAttribute
    public void setAudioProfile(String audioProfile) {
        this.audioProfile = audioProfile;
    }

    @XmlAttribute
    public void setVideoProfile(String videoProfile) {
        this.videoProfile = videoProfile;
    }

    @XmlElement(name = "Part")
    public void setParts(List<Part> parts) {
        this.parts = parts;
    }

}
