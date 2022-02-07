package libplex.plex.entity;

import java.util.List;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;

public class Part {
    @XmlAttribute private int id;
    @XmlAttribute private String key;
    @XmlAttribute private int duration;
    @XmlAttribute private String file;
    @XmlAttribute private int size;
    @XmlAttribute private String container;
    @XmlAttribute private int hasThumbnail;
    @XmlElement(name = "Stream") private List<Stream> streams;
}
