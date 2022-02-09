package libplex.plex.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public class Tag {
    @XmlAttribute private Integer id;
    @XmlAttribute private String filter;
    @XmlAttribute private String tag;

    public String getTag() {
        return tag;
    }
}
