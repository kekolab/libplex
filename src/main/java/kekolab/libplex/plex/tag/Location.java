package kekolab.libplex.plex.tag;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public class Location {
    @XmlAttribute private Integer id;
    @XmlAttribute private String path;

    public String getPath() {
        return path;
    }
}
