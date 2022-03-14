package kekolab.libplex.entity;

import java.util.List;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;

public class PMSVideoDetailDirectory extends PMSVideoDirectory {
    private Integer librarySectionID;
    private String librarySectionTitle, librarySectionKey;
    private List<PMSTag> producers, similars;

    public Integer getLibrarySectionID() {
        return librarySectionID;
    }

    public String getLibrarySectionTitle() {
        return librarySectionTitle;
    }

    public String getLibrarySectionKey() {
        return librarySectionKey;
    }

    public List<PMSTag> getProducers() {
        return producers;
    }

    public List<PMSTag> getSimilars() {
        return similars;
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

    @XmlElement(name = "Producer")
    public void setProducers(List<PMSTag> producers) {
        this.producers = producers;
    }

    @XmlElement(name = "Similar")
    public void setSimilars(List<PMSTag> similars) {
        this.similars = similars;
    }
}
