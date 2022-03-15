package kekolab.libplex.entity;

import java.util.Date;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import kekolab.libplex.xmladapter.TimestampAdapter;

public abstract class PMSMediaDirectory<A extends PMSItem> extends PMSDirectory<A> {

    private Integer ratingKey;
    private String guid;
    private String type;
    private String title;
    private String summary;
    private String thumb;
    private String art;
    private Date addedAt;
    private Date updatedAt;

    public PMSMediaDirectory() {
        super();
    }

    public Integer getRatingKey() {
        return ratingKey;
    }

    public String getGuid() {
        return guid;
    }

    public String getType() {
        return type;
    }

    public String getTitle() {
        return title;
    }

    public String getSummary() {
        return summary;
    }

    public String getThumb() {
        return thumb;
    }

    public String getArt() {
        return art;
    }

    public Date getAddedAt() {
        return addedAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    @XmlAttribute
    public void setRatingKey(Integer ratingKey) {
        this.ratingKey = ratingKey;
    }

    @XmlAttribute
    public void setGuid(String guid) {
        this.guid = guid;
    }

    @XmlAttribute
    public void setType(String type) {
        this.type = type;
    }

    @XmlAttribute
    public void setTitle(String title) {
        this.title = title;
    }

    @XmlAttribute
    public void setSummary(String summary) {
        this.summary = summary;
    }

    @XmlAttribute
    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    @XmlAttribute
    public void setArt(String art) {
        this.art = art;
    }

    @XmlAttribute
    @XmlJavaTypeAdapter(TimestampAdapter.class)
    public void setAddedAt(Date addedAt) {
        this.addedAt = addedAt;
    }

    @XmlAttribute
    @XmlJavaTypeAdapter(TimestampAdapter.class)
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

}