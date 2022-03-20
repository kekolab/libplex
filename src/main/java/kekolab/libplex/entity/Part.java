package kekolab.libplex.entity;

import java.util.List;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Part {
    private Integer id; // Track, Video, Episode
    private String key; // Track, Video, Episode
    private Integer duration; // Track, Video, Episode
    private String file; // Track, Video, Episode
    private Integer size; // Track, Video, Episode
    private String container; // Track, Video, Episode
    private Integer hasThumbnail; // Track
    private List<Stream> streams; // Track, Episode
    private String audioProfile; // Video
    private String videoProfile; // Video, Episode

    public Integer getId() {
        return id;
    }

    public String getKey() {
        return key;
    }

    public Integer getDuration() {
        return duration;
    }

    public String getFile() {
        return file;
    }

    public Integer getSize() {
        return size;
    }

    public String getContainer() {
        return container;
    }

    public Integer getHasThumbnail() {
        return hasThumbnail;
    }

    public List<Stream> getStreams() {
        return streams;
    }

    public String getAudioProfile() {
        return audioProfile;
    }

    public String getVideoProfile() {
        return videoProfile;
    }

    @XmlAttribute
    public void setId(Integer id) {
        this.id = id;
    }

    @XmlAttribute
    public void setKey(String key) {
        this.key = key;
    }

    @XmlAttribute
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    @XmlAttribute
    public void setFile(String file) {
        this.file = file;
    }

    @XmlAttribute
    public void setSize(Integer size) {
        this.size = size;
    }

    @XmlAttribute
    public void setContainer(String container) {
        this.container = container;
    }

    @XmlAttribute
    public void setHasThumbnail(Integer hasThumbnail) {
        this.hasThumbnail = hasThumbnail;
    }

    @XmlElement(name = "Stream")
    public void setStreams(List<Stream> streams) {
        this.streams = streams;
    }

    @XmlAttribute
    public void setAudioProfile(String audioProfile) {
        this.audioProfile = audioProfile;
    }

    @XmlAttribute
    public void setVideoProfile(String videoProfile) {
        this.videoProfile = videoProfile;
    }
}
