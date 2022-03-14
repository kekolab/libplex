package kekolab.libplex.entity;

import jakarta.xml.bind.annotation.XmlAttribute;

public abstract class PMSContainer extends PMSItem {
    private Integer size, allowSync, mediaTagVersion;
    private String identifier, mediaTagPrefix;

    public Integer getSize() {
        return size;
    }

    public Integer getAllowSync() {
        return allowSync;
    }

    public Integer getMediaTagVersion() {
        return mediaTagVersion;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getMediaTagPrefix() {
        return mediaTagPrefix;
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
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @XmlAttribute
    public void setMediaTagPrefix(String mediaTagPrefix) {
        this.mediaTagPrefix = mediaTagPrefix;
    }

}
