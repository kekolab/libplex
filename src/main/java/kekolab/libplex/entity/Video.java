package kekolab.libplex.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import kekolab.libplex.xmladapter.SectionItemXML;

public class Video extends SectionItem {
    private Integer year, hasPremiumExtra;
    private String studio, originalTitle, contentRating, tagline, audienceRatingImage, chapterSource, ratingImage;
    private Double rating, audienceRating;
    private Long duration;
    private Date originallyAvailableAt;
    private List<Media> media = new ArrayList<>(0);
    private List<Tag> genres = new ArrayList<>(0);
    private List<Tag> directors = new ArrayList<>(0);
    private List<Tag> writers = new ArrayList<>(0);
    private List<Tag> countries = new ArrayList<>(0);
    private List<Role> roles = new ArrayList<>(0);
    // Details
    private Integer librarySectionID;
    private String librarySectionTitle, librarySectionKey;
    private List<Tag> producers = new ArrayList<>(0), similars = new ArrayList<>(0);

    public Video(SectionItemXML v) {
        setYear(v.getYear());
        setHasPremiumExtra(v.getHasPremiumExtra());
        setStudio(v.getStudio());
        setOriginalTitle(v.getOriginalTitle());
        setContentRating(v.getContentRating());
        setTagline(v.getTagline());
        setAudienceRatingImage(v.getAudienceRatingImage());
        setChapterSource(v.getChapterSource());
        setRatingImage(v.getRatingImage());
        setRating(v.getRating());
        setAudienceRating(v.getAudienceRating());
        setDuration(v.getDuration());
        setOriginallyAvailableAt(v.getOriginallyAvailableAt());
        setMedia(v.getMedia());
        setGenres(v.getGenres());
        setDirectors(v.getDirectors());
        setWriters(v.getWriters());
        setCountries(v.getCountries());
        setRoles(v.getRoles());
        setLibrarySectionID(v.getLibrarySectionID());
        setLibrarySectionKey(v.getLibrarySectionKey());
        setLibrarySectionTitle(v.getLibrarySectionTitle());
        setProducers(v.getProducers());
        setSimilars(v.getSimilars());
    }

    @Override
    public Video details() {
        SectionItemList mil = (SectionItemList) SectionItemList.build(SectionItemList.class, getClient(), detailsUri(),
                getServer());
        return mil.getItems()
                .size() > 0
                        ? (Video) mil.getItems()
                                .get(0)
                        : null;
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

    public List<Media> getMedia() {
        return media;
    }

    public List<Tag> getGenres() {
        return genres;
    }

    public List<Tag> getDirectors() {
        return directors;
    }

    public List<Tag> getWriters() {
        return writers;
    }

    public List<Tag> getCountries() {
        return countries;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setHasPremiumExtra(Integer hasPremiumExtra) {
        this.hasPremiumExtra = hasPremiumExtra;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public void setContentRating(String contentRating) {
        this.contentRating = contentRating;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    public void setAudienceRatingImage(String audienceRatingImage) {
        this.audienceRatingImage = audienceRatingImage;
    }

    public void setChapterSource(String chapterSource) {
        this.chapterSource = chapterSource;
    }

    public void setRatingImage(String ratingImage) {
        this.ratingImage = ratingImage;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public void setAudienceRating(Double audienceRating) {
        this.audienceRating = audienceRating;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public void setOriginallyAvailableAt(Date originallyAvailableAt) {
        this.originallyAvailableAt = originallyAvailableAt;
    }

    public void setMedia(List<Media> media) {
        this.media = media;
    }

    public void setGenres(List<Tag> genres) {
        this.genres = genres;
    }

    public void setDirectors(List<Tag> directors) {
        this.directors = directors;
    }

    public void setWriters(List<Tag> writers) {
        this.writers = writers;
    }

    public void setCountries(List<Tag> countries) {
        this.countries = countries;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public Integer getLibrarySectionID() {
        return librarySectionID;
    }

    public String getLibrarySectionTitle() {
        return librarySectionTitle;
    }

    public String getLibrarySectionKey() {
        return librarySectionKey;
    }

    public List<Tag> getProducers() {
        return producers;
    }

    public List<Tag> getSimilars() {
        return similars;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public void setLibrarySectionID(Integer librarySectionID) {
        this.librarySectionID = librarySectionID;
    }

    public void setLibrarySectionTitle(String librarySectionTitle) {
        this.librarySectionTitle = librarySectionTitle;
    }

    public void setLibrarySectionKey(String librarySectionKey) {
        this.librarySectionKey = librarySectionKey;
    }

    public void setProducers(List<Tag> producers) {
        this.producers = producers;
    }

    public void setSimilars(List<Tag> similars) {
        this.similars = similars;
    }
}
