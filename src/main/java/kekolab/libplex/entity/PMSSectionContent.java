package kekolab.libplex.entity;

import java.net.URI;

import jakarta.xml.bind.annotation.XmlAttribute;

public abstract class PMSSectionContent extends PMSContainer {
    private Integer librarySectionID;
    private String librarySectionTitle, librarySectionUUID;

    public abstract Section section();

    protected URI sectionUri() {
        return getClient().uriBuilder()
                .fromKey("/library/sections/{sectionId}", this, getServer())
                .build(librarySectionID);
    }

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
