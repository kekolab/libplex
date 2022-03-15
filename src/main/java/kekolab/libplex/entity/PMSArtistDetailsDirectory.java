package kekolab.libplex.entity;

import java.util.List;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;

public class PMSArtistDetailsDirectory extends PMSArtistDirectory {
    private Integer librarySectionID;
    private String librarySectionTitle, librarySectionKey;
    private List<PMSTag> styles;
    private List<PMSTag> similars;
    private List<PMSTag> moods;
    private List<PMSLocation> locations;

    public PMSMusicSection section() {
        return new PMSItem.Builder<PMSMusicSection>(getClient(), getClient().uriBuilder()
                .fromKey(librarySectionKey, getParent(), getServer())
                .build(), getServer()).build(PMSMusicSection.class);
    }

    public Integer getLibrarySectionID() {
        return librarySectionID;
    }

    public String getLibrarySectionTitle() {
        return librarySectionTitle;
    }

    public String getLibrarySectionKey() {
        return librarySectionKey;
    }

    public List<PMSTag> getStyles() {
        return styles;
    }

    public List<PMSTag> getSimilars() {
        return similars;
    }

    public List<PMSTag> getMoods() {
        return moods;
    }

    public List<PMSLocation> getLocations() {
        return locations;
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
    public void setLibrarySectionKey(String librarySectionKey) {
        this.librarySectionKey = librarySectionKey;
    }

    @XmlElement(name = "Style")
    public void setStyles(List<PMSTag> styles) {
        this.styles = styles;
    }

    @XmlElement(name = "Similar")
    public void setSimilars(List<PMSTag> similars) {
        this.similars = similars;
    }

    @XmlElement(name = "Mood")
    public void setMoods(List<PMSTag> moods) {
        this.moods = moods;
    }

    @XmlElement(name = "Location")
    public void setLocations(List<PMSLocation> locations) {
        this.locations = locations;
    }
}
