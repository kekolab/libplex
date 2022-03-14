package kekolab.libplex.entity;

import jakarta.xml.bind.annotation.XmlAttribute;

public abstract class PMSSection extends PMSItem {
    private Integer size, allowSync, librarySectionID, mediaTagVersion, viewMode;
    private String art, content, identifier, mediaTagPrefix, thumb, title1, viewGroup;

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

    public Integer getViewMode() {
        return viewMode;
    }

    public String getArt() {
        return art;
    }

    public String getContent() {
        return content;
    }

    public String getIdentifier() {
        return identifier;
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

    public String getViewGroup() {
        return viewGroup;
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
    public void setViewMode(Integer viewMode) {
        this.viewMode = viewMode;
    }

    @XmlAttribute
    public void setArt(String art) {
        this.art = art;
    }

    @XmlAttribute
    public void setContent(String content) {
        this.content = content;
    }

    @XmlAttribute
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
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
    public void setViewGroup(String viewGroup) {
        this.viewGroup = viewGroup;
    }
}
