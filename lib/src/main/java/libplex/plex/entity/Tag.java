package libplex.plex.entity;

import jakarta.xml.bind.annotation.XmlAttribute;

public class Tag {
    @XmlAttribute private String tag;

    public String getTag() {
	return tag;
    }
}
