package kekolab.libplex.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;

public class AlbumInfo extends MediaInfo {
    private Integer year, loudnessAnalysisVersion;
    private String studio;
    private Double rating;
    private Date originallyAvailableAt;
    private List<PMSTag> genres = new ArrayList<>(0);;
    private List<PMSTag> directors = new ArrayList<>(0);;
    private Integer index;
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

    public Integer getIndex() {
        return index;
    }

    @XmlAttribute
    public void setIndex(Integer index) {
        this.index = index;
    }

    @Override
    public PMSTracks content() {
    	return (PMSTracks) PMSTracks.build(PMSTracks.class, getClient(), contentUri(), getServer());
    }

    @Override
    public PMSAlbum details() {
    	return (PMSAlbum) PMSAlbum.build(PMSAlbum.class, getClient(), detailsUri(), getServer());
    }

    public Integer getYear() {
        return year;
    }

    public Integer getLoudnessAnalysisVersion() {
        return loudnessAnalysisVersion;
    }

    public String getStudio() {
        return studio;
    }

    public Double getRating() {
        return rating;
    }

    public Date getOriginallyAvailableAt() {
        return originallyAvailableAt;
    }

    public List<PMSTag> getGenres() {
        return genres;
    }

    public List<PMSTag> getDirectors() {
        return directors;
    }

    @XmlAttribute
    public void setYear(Integer year) {
        this.year = year;
    }

    @XmlAttribute
    public void setLoudnessAnalysisVersion(Integer loudnessAnalysisVersion) {
        this.loudnessAnalysisVersion = loudnessAnalysisVersion;
    }

    @XmlAttribute
    public void setStudio(String studio) {
        this.studio = studio;
    }

    @XmlAttribute
    public void setRating(Double rating) {
        this.rating = rating;
    }

    @XmlAttribute
    public void setOriginallyAvailableAt(Date originallyAvailableAt) {
        this.originallyAvailableAt = originallyAvailableAt;
    }

    @XmlElement(name = "Genre")
    public void setGenres(List<PMSTag> genres) {
        this.genres = genres;
    }

    @XmlElement(name = "Director")
    public void setDirectors(List<PMSTag> directors) {
        this.directors = directors;
    }
}
