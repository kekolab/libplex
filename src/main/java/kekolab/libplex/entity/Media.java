package kekolab.libplex.entity;

import java.util.Collections;
import java.util.List;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;

public class Media {
    @XmlAttribute private Integer id;
    @XmlAttribute private Integer duration;
    @XmlAttribute private Integer bitrate;
    @XmlAttribute private Integer audioChannels;
    @XmlAttribute private String audioCodec;
    @XmlAttribute private String container;
    @XmlElement(name = "Part") private List<Part> parts;
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
}
