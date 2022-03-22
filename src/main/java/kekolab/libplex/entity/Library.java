package kekolab.libplex.entity;

import java.net.URI;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "MediaContainer")
public class Library extends SyncableMediaContainer {
    private String art, content, title1, title2;

    public Sections sections() {
    	URI uri = getClient().uriBuilder().fromKey("sections", this, getServer()).build();
    	return (Sections) Sections.build(Sections.class, getClient(), uri, getServer());
    }
    
    public URI artUri() {
    	String art = getArt();
    	if (art != null)
    		return getClient().uriBuilder().fromKey(art, this, getServer()).build();
    	return null;
    }

    public String getArt() {
        return art;
    }

    public String getContent() {
        return content;
    }

    public String getTitle1() {
        return title1;
    }

    public String getTitle2() {
        return title2;
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
    public void setTitle1(String title1) {
        this.title1 = title1;
    }

    @XmlAttribute
    public void setTitle2(String title2) {
        this.title2 = title2;
    }
}
