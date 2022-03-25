package kekolab.libplex.entity;

import jakarta.xml.bind.annotation.XmlAttribute;

public class GenericMediaContainer extends BaseMediaContainer {
    private Integer mediaTagVersion;
    private String identifier;
    private String mediaTagPrefix;

    public Integer getMediaTagVersion() {
        return mediaTagVersion;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getMediaTagPrefix() {
        return mediaTagPrefix;
    }

    
    @XmlAttribute public void setMediaTagVersion(Integer mediaTagVersion) {
        this.mediaTagVersion = mediaTagVersion;
    }

    
    @XmlAttribute public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    
    @XmlAttribute public void setMediaTagPrefix(String mediaTagPrefix) {
        this.mediaTagPrefix = mediaTagPrefix;
    }
}