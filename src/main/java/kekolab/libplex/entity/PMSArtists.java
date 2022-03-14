package kekolab.libplex.entity;

import java.util.List;
import java.util.stream.Collectors;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "MediaContainer")
public class PMSArtists extends PMSItem {
    private Integer size, allowSync, librarySectionID, mediaTagVersion, nocache, viewMode;
    private String art, identifier, librarySectionTitle, librarySectionUUID, mediaTagPrefix, thumb, title1, title2,
            viewGroup;
    private List<PMSArtistDirectory> artists;

    public Integer getSize() {
        return size;
    }

    public Integer getAllowSync() {
        return allowSync;
    }

    public Integer getLibrarySectionID() {
        return librarySectionID;
    }

    public Integer getMediaTagVersion() {
        return mediaTagVersion;
    }

    public Integer getNocache() {
        return nocache;
    }

    public Integer getViewMode() {
        return viewMode;
    }

    public String getArt() {
        return art;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getLibrarySectionTitle() {
        return librarySectionTitle;
    }

    public String getLibrarySectionUUID() {
        return librarySectionUUID;
    }

    public String getMediaTagPrefix() {
        return mediaTagPrefix;
    }

    public String getThumb() {
        return thumb;
    }

    public String getTitle1() {
        return title1;
    }

    public String getTitle2() {
        return title2;
    }

    public String getViewGroup() {
        return viewGroup;
    }

    public List<PMSArtistDirectory> getArtists() {
        if (artists != null)
            setArtists(artists.stream()
                    .map(a -> {
                        a.setClient(getClient());
                        a.setParent(this);
                        a.setServer(getServer());
                        return a;
                    })
                    .collect(Collectors.toList()));
        return artists;
    }

    @XmlAttribute
    public void setSize(Integer size) {
        this.size = size;
    }

    @XmlAttribute
    public void setAllowSync(Integer allowSync) {
        this.allowSync = allowSync;
    }

    @XmlAttribute
    public void setLibrarySectionID(Integer librarySectionID) {
        this.librarySectionID = librarySectionID;
    }

    @XmlAttribute
    public void setMediaTagVersion(Integer mediaTagVersion) {
        this.mediaTagVersion = mediaTagVersion;
    }

    @XmlAttribute
    public void setNocache(Integer nocache) {
        this.nocache = nocache;
    }

    @XmlAttribute
    public void setViewMode(Integer viewMode) {
        this.viewMode = viewMode;
    }

    @XmlAttribute
    public void setArt(String art) {
        this.art = art;
    }

    @XmlAttribute
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @XmlAttribute
    public void setLibrarySectionTitle(String librarySectionTitle) {
        this.librarySectionTitle = librarySectionTitle;
    }

    @XmlAttribute
    public void setLibrarySectionUUID(String librarySectionUUID) {
        this.librarySectionUUID = librarySectionUUID;
    }

    @XmlAttribute
    public void setMediaTagPrefix(String mediaTagPrefix) {
        this.mediaTagPrefix = mediaTagPrefix;
    }

    @XmlAttribute
    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    @XmlAttribute
    public void setTitle1(String title1) {
        this.title1 = title1;
    }

    @XmlAttribute
    public void setTitle2(String title2) {
        this.title2 = title2;
    }

    @XmlAttribute
    public void setViewGroup(String viewGroup) {
        this.viewGroup = viewGroup;
    }

    @XmlElement(name = "Directory")
    public void setArtists(List<PMSArtistDirectory> artists) {
        this.artists = artists;
    }
}
