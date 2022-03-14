package kekolab.libplex.entity;

import java.util.List;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;

public class PMSTrackDirectory extends PMSMusicChildDirectory<PMSTrack> {
    private Integer grandparentRatingKey, parentIndex, ratingCount, parentYear;
    private String grandparentGuid, parentStudio, grandparentKey, grandparentTitle, grandparentThumb, grandparentArt;
    private Long duration;
    private List<PMSMedia> media;

    @Override
    public PMSTrack content() {
        return super.content(PMSTrack.class);
    }

    public Integer getGrandparentRatingKey() {
        return grandparentRatingKey;
    }

    public Integer getParentIndex() {
        return parentIndex;
    }

    public Integer getRatingCount() {
        return ratingCount;
    }

    public Integer getParentYear() {
        return parentYear;
    }

    public String getGrandparentGuid() {
        return grandparentGuid;
    }

    public String getParentStudio() {
        return parentStudio;
    }

    public String getGrandparentKey() {
        return grandparentKey;
    }

    public String getGrandparentTitle() {
        return grandparentTitle;
    }

    public String getGrandparentThumb() {
        return grandparentThumb;
    }

    public String getGrandparentArt() {
        return grandparentArt;
    }

    public Long getDuration() {
        return duration;
    }

    public List<PMSMedia> getMedia() {
        return media;
    }

    @XmlAttribute
    public void setGrandparentRatingKey(Integer grandparentRatingKey) {
        this.grandparentRatingKey = grandparentRatingKey;
    }

    @XmlAttribute
    public void setParentIndex(Integer parentIndex) {
        this.parentIndex = parentIndex;
    }

    @XmlAttribute
    public void setRatingCount(Integer ratingCount) {
        this.ratingCount = ratingCount;
    }

    @XmlAttribute
    public void setParentYear(Integer parentYear) {
        this.parentYear = parentYear;
    }

    @XmlAttribute
    public void setGrandparentGuid(String grandparentGuid) {
        this.grandparentGuid = grandparentGuid;
    }

    @XmlAttribute
    public void setParentStudio(String parentStudio) {
        this.parentStudio = parentStudio;
    }

    @XmlAttribute
    public void setGrandparentKey(String grandparentKey) {
        this.grandparentKey = grandparentKey;
    }

    @XmlAttribute
    public void setGrandparentTitle(String grandparentTitle) {
        this.grandparentTitle = grandparentTitle;
    }

    @XmlAttribute
    public void setGrandparentThumb(String grandparentThumb) {
        this.grandparentThumb = grandparentThumb;
    }

    @XmlAttribute
    public void setGrandparentArt(String grandparentArt) {
        this.grandparentArt = grandparentArt;
    }

    @XmlAttribute
    public void setDuration(Long duration) {
        this.duration = duration;
    }

    @XmlElement(name = "Media")
    public void setMedia(List<PMSMedia> media) {
        this.media = media;
    }
}
