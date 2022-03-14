package kekolab.libplex.entity;

import jakarta.xml.bind.annotation.XmlAttribute;

public class PMSDetailedTrackDirectory extends PMSTrackDirectory {
    private Integer librarySectionID, hasPremiumLyrics;
    private String librarySectionTitle, librarySectionKey;

    @Override
    public PMSTrack content() {
        return super.content(PMSTrack.class);
    }

    public Integer getLibrarySectionID() {
        return librarySectionID;
    }

    public Integer getHasPremiumLyrics() {
        return hasPremiumLyrics;
    }

    public String getLibrarySectionTitle() {
        return librarySectionTitle;
    }

    public String getLibrarySectionKey() {
        return librarySectionKey;
    }

    @XmlAttribute
    public void setLibrarySectionID(Integer librarySectionID) {
        this.librarySectionID = librarySectionID;
    }

    @XmlAttribute
    public void setHasPremiumLyrics(Integer hasPremiumLyrics) {
        this.hasPremiumLyrics = hasPremiumLyrics;
    }

    @XmlAttribute
    public void setLibrarySectionTitle(String librarySectionTitle) {
        this.librarySectionTitle = librarySectionTitle;
    }

    @XmlAttribute
    public void setLibrarySectionKey(String librarySectionKey) {
        this.librarySectionKey = librarySectionKey;
    }
}
