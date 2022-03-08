package kekolab.libplex.entity;

import java.util.Collections;
import java.util.List;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;

public class Media {
    @XmlAttribute private Integer id; // Track, Video, Episode
    @XmlAttribute private Integer duration; // Track, Video, Episode
    @XmlAttribute private Integer bitrate; // Track, Video, Episode
    @XmlAttribute private Integer audioChannels; // Track, Video, Episode
    @XmlAttribute private String audioCodec; // Track, Video, Episode
    @XmlAttribute private String container; // Track, Video, Episode
    @XmlAttribute private Integer width; // Video, Episode
    @XmlAttribute private Integer height; // Video, Episode
    @XmlAttribute private Double aspectRatio; // Video, Episode
    @XmlAttribute private String videoCodec; // Video, Episode
    @XmlAttribute private String videoResolution; // String in Video, Integer in Episode
    @XmlAttribute private String videoFrameRate; // Video, Episode
    @XmlAttribute private String audioProfile; // Video
    @XmlAttribute private String videoProfile; // Video, Episode
    @XmlElement(name = "Part") private List<Part> parts; // Track, Video
    private ServerContent server;

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

    public void setServer(ServerContent server) {
        this.server = server;
    }

    public List<Part> getParts() {
        if (parts != null) {
            parts.forEach(p -> p.setServer(server));
            return parts;
        }
        return Collections.emptyList();
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
}
