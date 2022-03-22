package kekolab.libplex.entity;

import java.util.Date;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import kekolab.libplex.xmladapter.TimestampAdapter;

public abstract class SectionItem extends Directory {
    private Integer ratingKey;
    private String guid;
    private String summary;
    private Date addedAt;
    private Date updatedAt;

    public abstract SectionItem details();

    public Integer getRatingKey() {
        return ratingKey;
    }

    public String getGuid() {
        return guid;
    }

    public String getSummary() {
        return summary;
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
    public void setSummary(String summary) {
        this.summary = summary;
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