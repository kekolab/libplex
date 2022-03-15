package kekolab.libplex.entity;

import jakarta.xml.bind.annotation.XmlAttribute;

public abstract class PMSMusicChildDirectory<Content extends PMSItem, Details extends PMSItem>
        extends PMSMusicDirectory<Content, Details> {
    private Integer parentRatingKey;
    private String parentGuid, parentKey, parentTitle, parentThumb;

    public Integer getParentRatingKey() {
        return parentRatingKey;
    }

    public String getParentGuid() {
        return parentGuid;
    }

    public String getParentKey() {
        return parentKey;
    }

    public String getParentTitle() {
        return parentTitle;
    }

    public String getParentThumb() {
        return parentThumb;
    }

    @XmlAttribute
    public void setParentRatingKey(Integer parentRatingKey) {
        this.parentRatingKey = parentRatingKey;
    }

    @XmlAttribute
    public void setParentGuid(String parentGuid) {
        this.parentGuid = parentGuid;
    }

    @XmlAttribute
    public void setParentKey(String parentKey) {
        this.parentKey = parentKey;
    }

    @XmlAttribute
    public void setParentTitle(String parentTitle) {
        this.parentTitle = parentTitle;
    }

    @XmlAttribute
    public void setParentThumb(String parentThumb) {
        this.parentThumb = parentThumb;
    }

}
