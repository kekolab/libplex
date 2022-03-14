package kekolab.libplex.entity;

import jakarta.xml.bind.annotation.XmlAttribute;

public class PMSLocation {
    private Integer id;
    private String path;

    public String getPath() {
        return path;
    }

    public Integer getId() {
        return id;
    }

    @XmlAttribute
    public void setId(Integer id) {
        this.id = id;
    }

    @XmlAttribute
    public void setPath(String path) {
        this.path = path;
    }
}
