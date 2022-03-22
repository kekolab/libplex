package kekolab.libplex.entity;

import java.net.URI;

import jakarta.xml.bind.annotation.XmlAttribute;

public class Section extends SyncableMediaContainer {
    private Integer librarySectionID, viewMode;
    private String art, content, thumb, title1, viewGroup;

    public URI artUri() {
    	String art = getArt();
    	if (art != null)
    		return getClient().uriBuilder().fromKey(art, this, getServer()).build();
    	return null;
    }
    
    public URI thumbUri() {
    	String thumb = getThumb();
    	if (thumb != null)
    		return getClient().uriBuilder().fromKey(thumb, this, getServer()).build();
    	return null;
    }
    
    public Integer getLibrarySectionID() {
        return librarySectionID;
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
    public void setLibrarySectionID(Integer librarySectionID) {
        this.librarySectionID = librarySectionID;
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
