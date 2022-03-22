package kekolab.libplex.entity;

import jakarta.xml.bind.annotation.XmlAttribute;

public class Role extends Tag {
    private String role;
    private String thumb;

    public String getRole() {
        return role;
    }

    @XmlAttribute
    public void setRole(String role) {
        this.role = role;
    }

    public String getThumb() {
        return thumb;
    }

    @XmlAttribute
    public void setThumb(String thumb) {
        this.thumb = thumb;
    }
}
