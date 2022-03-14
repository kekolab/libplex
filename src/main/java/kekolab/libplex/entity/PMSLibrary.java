package kekolab.libplex.entity;

import jakarta.ws.rs.core.UriBuilder;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "MediaContainer")
public class PMSLibrary extends PMSItem {
    public PMSSections sections() {
        return new PMSItem.Builder<PMSSections>(getClient(), UriBuilder.fromUri(getUri())
                .path("sections")
                .build(), getServer()).build(PMSSections.class);
    }

    private Integer size, allowSync, mediaTagVersion;
    private String art, content, identifier, mediaTagPrefix, title1, title2;

    public Integer getSize() {
        return size;
    }

    public Integer getAllowSync() {
        return allowSync;
    }

    public Integer getMediaTagVersion() {
        return mediaTagVersion;
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

    public String getTitle1() {
        return title1;
    }

    public String getTitle2() {
        return title2;
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
    public void setMediaTagVersion(Integer mediaTagVersion) {
        this.mediaTagVersion = mediaTagVersion;
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
    public void setTitle1(String title1) {
        this.title1 = title1;
    }

    @XmlAttribute
    public void setTitle2(String title2) {
        this.title2 = title2;
    }
}
