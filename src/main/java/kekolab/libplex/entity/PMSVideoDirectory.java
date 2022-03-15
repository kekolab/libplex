package kekolab.libplex.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;

public class PMSVideoDirectory extends PMSMediaDirectory<PMSVideoContainer, PMSVideoContainer> {
    private Integer year, hasPremiumExtra;
    private String studio, originalTitle, contentRating, tagline, audienceRatingImage, chapterSource, ratingImage;
    private Double rating, audienceRating;
    private Long duration;
    private Date originallyAvailableAt;
    private List<PMSMedia> media = new ArrayList<>(0);
    private List<PMSTag> genres = new ArrayList<>(0);
    private List<PMSTag> directors = new ArrayList<>(0);
    private List<PMSTag> writers = new ArrayList<>(0);
    private List<PMSTag> countries = new ArrayList<>(0);
    private List<PMSRole> roles = new ArrayList<>(0);

    @Override
    public PMSVideoContainer content() {
        return super.content(PMSVideoContainer.class);
    }

    @Override
    public PMSVideoContainer details() {
        return super.content(PMSVideoContainer.class);
    }

    public Integer getYear() {
        return year;
    }

    public Integer getHasPremiumExtra() {
        return hasPremiumExtra;
    }

    public String getStudio() {
        return studio;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public String getContentRating() {
        return contentRating;
    }

    public String getTagline() {
        return tagline;
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
    public void setHasPremiumExtra(Integer hasPremiumExtra) {
        this.hasPremiumExtra = hasPremiumExtra;
    }

    @XmlAttribute
    public void setStudio(String studio) {
        this.studio = studio;
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
    public void setTagline(String tagline) {
        this.tagline = tagline;
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
