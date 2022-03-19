package kekolab.libplex.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;

public class ArtistDetails extends ArtistInfo {
    private Integer librarySectionID;
    private String librarySectionTitle, librarySectionKey;
    private List<PMSTag> styles = new ArrayList<>(0);
    private List<PMSTag> similars = new ArrayList<>(0);
    private List<PMSTag> moods = new ArrayList<>(0);
    private List<PMSLocation> locations = new ArrayList<>(0);

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
