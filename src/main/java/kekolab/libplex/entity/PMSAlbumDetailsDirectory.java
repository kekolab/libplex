package kekolab.libplex.entity;

import java.util.Date;
import java.util.List;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import kekolab.libplex.xmladapter.TimestampAdapter;

public class PMSAlbumDetailsDirectory extends PMSAlbumDirectory {
    private Integer viewCount, leafCount;
    private String librarySectionTitle, librarySectionID, librarySectionKey;
    private Date lastViewedAt;
    private List<PMSTag> styles;
    private List<PMSTag> moods;

    public Integer getViewCount() {
        return viewCount;
    }

    public Integer getLeafCount() {
        return leafCount;
    }

    public String getLibrarySectionTitle() {
        return librarySectionTitle;
    }

    public String getLibrarySectionID() {
        return librarySectionID;
    }

    public String getLibrarySectionKey() {
        return librarySectionKey;
    }

    public Date getLastViewedAt() {
        return lastViewedAt;
    }

    public List<PMSTag> getStyles() {
        return styles;
    }

    public List<PMSTag> getMoods() {
        return moods;
    }

    @XmlAttribute
    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    @XmlAttribute
    public void setLeafCount(Integer leafCount) {
        this.leafCount = leafCount;
    }

    @XmlAttribute
    public void setLibrarySectionTitle(String librarySectionTitle) {
        this.librarySectionTitle = librarySectionTitle;
    }

    @XmlAttribute
    public void setLibrarySectionID(String librarySectionID) {
        this.librarySectionID = librarySectionID;
    }

    @XmlAttribute
    public void setLibrarySectionKey(String librarySectionKey) {
        this.librarySectionKey = librarySectionKey;
    }

    @XmlAttribute
    @XmlJavaTypeAdapter(TimestampAdapter.class)
    public void setLastViewedAt(Date lastViewedAt) {
        this.lastViewedAt = lastViewedAt;
    }

    @XmlElement(name = "Style")
    public void setStyles(List<PMSTag> styles) {
        this.styles = styles;
    }

    @XmlElement(name = "Mood")
    public void setMoods(List<PMSTag> moods) {
        this.moods = moods;
    }
}
