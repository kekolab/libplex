package kekolab.libplex.entity;

import jakarta.xml.bind.annotation.XmlAttribute;

public class Guid {
    private String id;

    public String getId() {
        return id;
    }

    @XmlAttribute
    public void setId(String id) {
        this.id = id;
    }
}
