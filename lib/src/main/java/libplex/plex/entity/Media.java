package libplex.plex.entity;

import java.util.List;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;

public class Media {
    @XmlAttribute private int id;
    @XmlAttribute private int duration;
    @XmlAttribute private int bitrate;
    @XmlAttribute private int audioChannels;
    @XmlAttribute private String audioCodec;
    @XmlAttribute private String container;
    @XmlElement(name = "Part") private List<Part> parts;
}
