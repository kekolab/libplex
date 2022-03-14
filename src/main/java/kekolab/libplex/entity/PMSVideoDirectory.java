package kekolab.libplex.entity;

import java.util.Date;
import java.util.List;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import kekolab.libplex.xmladapter.TimestampAdapter;

public class PMSVideoDirectory extends PMSDirectory<PMSVideoContainer> {
    private Integer ratingKey, year, hasPremiumExtra;
    private String guid, studio, type, title, originalTitle, contentRating, summary, tagline, thumb, art,
            audienceRatingImage, chapterSource, ratingImage;
    private Double rating, audienceRating;
    private Long duration;
    private Date originallyAvailableAt, addedAt, updatedAt;
    private List<PMSMedia> media;
    private List<PMSTag> genres;
    private List<PMSTag> directors;
    private List<PMSTag> writers;
    private List<PMSTag> countries;
    private List<PMSRole> roles;

    @Override
    public PMSVideoContainer content() {
        return super.content(PMSVideoContainer.class);
    }

    public Integer getRatingKey() {
        return ratingKey;
    }

    public Integer getYear() {
        return year;
    }

    public Integer getHasPremiumExtra() {
        return hasPremiumExtra;
    }

    public String getGuid() {
        return guid;
    }

    public String getStudio() {
        return studio;
    }

    public String getType() {
        return type;
    }

    public String getTitle() {
        return title;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public String getContentRating() {
        return contentRating;
    }

    public String getSummary() {
        return summary;
    }

    public String getTagline() {
        return tagline;
    }

    public String getThumb() {
        return thumb;
    }

    public String getArt() {
        return art;
    }

    public String getAudienceRatingImage() {
        return audienceRatingImage;
    }

    public String getChapterSource() {
        return chapterSource;
    }

    public String getRatingImage() {
        return ratingImage;
    }

    public Double getRating() {
        return rating;
    }

    public Double getAudienceRating() {
        return audienceRating;
    }

    public Long getDuration() {
        return duration;
    }

    public Date getOriginallyAvailableAt() {
        return originallyAvailableAt;
    }

    public Date getAddedAt() {
        return addedAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public List<PMSMedia> getMedia() {
        return media;
    }

    public List<PMSTag> getGenres() {
        return genres;
    }

    public List<PMSTag> getDirectors() {
        return directors;
    }

    public List<PMSTag> getWriters() {
        return writers;
    }

    public List<PMSTag> getCountries() {
        return countries;
    }

    public List<PMSRole> getRoles() {
        return roles;
    }

    @XmlAttribute
    public void setRatingKey(Integer ratingKey) {
        this.ratingKey = ratingKey;
    }

    @XmlAttribute
    public void setYear(Integer year) {
        this.year = year;
    }

    @XmlAttribute
    public void setHasPremiumExtra(Integer hasPremiumExtra) {
        this.hasPremiumExtra = hasPremiumExtra;
    }

    @XmlAttribute
    public void setGuid(String guid) {
        this.guid = guid;
    }

    @XmlAttribute
    public void setStudio(String studio) {
        this.studio = studio;
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
    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    @XmlAttribute
    public void setContentRating(String contentRating) {
        this.contentRating = contentRating;
    }

    @XmlAttribute
    public void setSummary(String summary) {
        this.summary = summary;
    }

    @XmlAttribute
    public void setTagline(String tagline) {
        this.tagline = tagline;
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
    public void setAudienceRatingImage(String audienceRatingImage) {
        this.audienceRatingImage = audienceRatingImage;
    }

    @XmlAttribute
    public void setChapterSource(String chapterSource) {
        this.chapterSource = chapterSource;
    }

    @XmlAttribute
    public void setRatingImage(String ratingImage) {
        this.ratingImage = ratingImage;
    }

    @XmlAttribute
    public void setRating(Double rating) {
        this.rating = rating;
    }

    @XmlAttribute
    public void setAudienceRating(Double audienceRating) {
        this.audienceRating = audienceRating;
    }

    @XmlAttribute
    public void setDuration(Long duration) {
        this.duration = duration;
    }

    @XmlAttribute
    public void setOriginallyAvailableAt(Date originallyAvailableAt) {
        this.originallyAvailableAt = originallyAvailableAt;
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

    @XmlElement(name = "Media")
    public void setMedia(List<PMSMedia> media) {
        this.media = media;
    }

    @XmlElement(name = "Genre")
    public void setGenres(List<PMSTag> genres) {
        this.genres = genres;
    }

    @XmlElement(name = "Director")
    public void setDirectors(List<PMSTag> directors) {
        this.directors = directors;
    }

    @XmlElement(name = "Writer")
    public void setWriters(List<PMSTag> writers) {
        this.writers = writers;
    }

    @XmlElement(name = "Country")
    public void setCountries(List<PMSTag> countries) {
        this.countries = countries;
    }

    @XmlElement(name = "Role")
    public void setRoles(List<PMSRole> roles) {
        this.roles = roles;
    }
}
