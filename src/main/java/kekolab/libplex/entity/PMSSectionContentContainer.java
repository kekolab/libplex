package kekolab.libplex.entity;

import jakarta.xml.bind.annotation.XmlAttribute;

public abstract class PMSSectionContentContainer extends PMSContainer {
    private Integer librarySectionID;
    private String librarySectionTitle, librarySectionUUID;

    public Integer getLibrarySectionID() {
        return librarySectionID;
    }

    public String getLibrarySectionTitle() {
        return librarySectionTitle;
    }

    public String getLibrarySectionUUID() {
        return librarySectionUUID;
    }

    @XmlAttribute
    public void setLibrarySectionID(Integer librarySectionID) {
        this.librarySectionID = librarySectionID;
    }

    @XmlAttribute
    public void setLibrarySectionTitle(String librarySectionTitle) {
        this.librarySectionTitle = librarySectionTitle;
    }

    @XmlAttribute
    public void setLibrarySectionUUID(String librarySectionUUID) {
        this.librarySectionUUID = librarySectionUUID;
    }
}
