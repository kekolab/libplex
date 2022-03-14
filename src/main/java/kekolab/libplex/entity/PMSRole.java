package kekolab.libplex.entity;

import jakarta.xml.bind.annotation.XmlAttribute;

public class PMSRole extends PMSTag {
    private String role;

    public String getRole() {
        return role;
    }

    @XmlAttribute
    public void setRole(String role) {
        this.role = role;
    }
}
