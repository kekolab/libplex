package kekolab.libplex.entity;

import java.util.Date;
import java.util.List;

import javax.print.attribute.standard.Media;
import javax.swing.text.html.HTML.Tag;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import kekolab.libplex.xmladapter.TimestampAdapter;

public class PMSVideo {
    private Integer ratingKey; // Movie, Episode
    private String key;// Movie, Episode
    private String guid;// Movie, Episode
    private String studio;// Movie
    private String type;// Movie, Episode
    private String title;// Movie, Episode
    private String originalTitle;// Movie, Episode
    private String contentRating;// Movie, Episode
    private String summary;// Movie, Episode
    private Double rating;// Movie
    private Double audienceRating;// Movie, Episode
    private Integer year;// Movie
    private String tagline;// Movie
    private String thumb;// Movie, Episode
    private String art;// Movie, Episode
    private Long duration;// Movie, Episode
    private Date originallyAvailableAt;// Movie, Episode
    private Date addedAt;// Movie, Episode
    private Date updatedAt;// Movie, Episode
    private String audienceRatingImage;// Movie, Episode
    private String chapterSource;// Movie
    private Integer hasPremiumPrimaryExtra;// Movie
    private String ratingImage;// Movie
    private List<Media> media;// Movie
    private List<Tag> genres;// Movie
    private List<Tag> directors;// Movie
    private List<Tag> writers;// Movie
    private List<Tag> countries;// Movie
    private List<Tag> roles;// Movie
    private Integer parentRatingKey;// Episode
    private Integer grandparentRatingKey;// Episode
    private String parentGuid;// Episode
    private String grandparentGuid; // Episode
    private String grandparentKey; // Episode
    private String parentKey; // Episode
    private String librarySectionTitle; // Episode
    private Integer librarySectionID; // Episode
    private String librarySectionKey; // Episode
    private String grandparentTitle; // Episode
    private String parentTitle; // Episode
    private Integer index; // Episode
    private Integer parentIndex; // Episode
    private Long viewOffset; // Movie, Episode
    private Integer viewCount; // Movie, Episode
    private Integer skipCount; // Movie, Episode
    private Date lastViewedAt; // Movie, Episode
    private Integer parentYear; // Episode
    private String parentThumb; // Episode
    private String grandparentThumb; // Episode
    private String grandparentArt; // Episode
    private String grandparentTheme; // Episode

    public Integer getRatingKey() {
        return ratingKey;
    }

    public String getKey() {
        return key;
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

    public Double getRating() {
        return rating;
    }

    public Double getAudienceRating() {
        return audienceRating;
    }

    public Integer getYear() {
        return year;
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

    public String getAudienceRatingImage() {
        return audienceRatingImage;
    }

    public String getChapterSource() {
        return chapterSource;
    }

    public Integer getHasPremiumPrimaryExtra() {
        return hasPremiumPrimaryExtra;
    }

    public String getRatingImage() {
        return ratingImage;
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

    public List<Tag> getRoles() {
        return roles;
    }

    public Integer getParentRatingKey() {
        return parentRatingKey;
    }

    public Integer getGrandparentRatingKey() {
        return grandparentRatingKey;
    }

    public String getParentGuid() {
        return parentGuid;
    }

    public String getGrandparentGuid() {
        return grandparentGuid;
    }

    public String getGrandparentKey() {
        return grandparentKey;
    }

    public String getParentKey() {
        return parentKey;
    }

    public String getLibrarySectionTitle() {
        return librarySectionTitle;
    }

    public Integer getLibrarySectionID() {
        return librarySectionID;
    }

    public String getLibrarySectionKey() {
        return librarySectionKey;
    }

    public String getGrandparentTitle() {
        return grandparentTitle;
    }

    public String getParentTitle() {
        return parentTitle;
    }

    public Integer getIndex() {
        return index;
    }

    public Integer getParentIndex() {
        return parentIndex;
    }

    public Long getViewOffset() {
        return viewOffset;
    }

    public Integer getViewCount() {
        return viewCount;
    }

    public Integer getSkipCount() {
        return skipCount;
    }

    public Date getLastViewedAt() {
        return lastViewedAt;
    }

    public Integer getParentYear() {
        return parentYear;
    }

    public String getParentThumb() {
        return parentThumb;
    }

    public String getGrandparentThumb() {
        return grandparentThumb;
    }

    public String getGrandparentArt() {
        return grandparentArt;
    }

    public String getGrandparentTheme() {
        return grandparentTheme;
    }

    @XmlAttribute
    public void setRatingKey(Integer ratingKey) {
        this.ratingKey = ratingKey;
    }

    @XmlAttribute
    public void setKey(String key) {
        this.key = key;
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
    public void setRating(Double rating) {
        this.rating = rating;
    }

    @XmlAttribute
    public void setAudienceRating(Double audienceRating) {
        this.audienceRating = audienceRating;
    }

    @XmlAttribute
    public void setYear(Integer year) {
        this.year = year;
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

    @XmlAttribute
    public void setAudienceRatingImage(String audienceRatingImage) {
        this.audienceRatingImage = audienceRatingImage;
    }

    @XmlAttribute
    public void setChapterSource(String chapterSource) {
        this.chapterSource = chapterSource;
    }

    @XmlAttribute
    public void setHasPremiumPrimaryExtra(Integer hasPremiumPrimaryExtra) {
        this.hasPremiumPrimaryExtra = hasPremiumPrimaryExtra;
    }

    @XmlAttribute
    public void setRatingImage(String ratingImage) {
        this.ratingImage = ratingImage;
    }

    @XmlElement(name = "Media")
    public void setMedia(List<Media> media) {
        this.media = media;
    }

    @XmlElement(name = "Genres")
    public void setGenres(List<Tag> genres) {
        this.genres = genres;
    }

    @XmlElement(name = "Director")
    public void setDirectors(List<Tag> directors) {
        this.directors = directors;
    }

    @XmlElement(name = "Writer")
    public void setWriters(List<Tag> writers) {
        this.writers = writers;
    }

    @XmlElement(name = "Country")
    public void setCountries(List<Tag> countries) {
        this.countries = countries;
    }

    @XmlElement(name = "Role")
    public void setRoles(List<Tag> roles) {
        this.roles = roles;
    }

    @XmlAttribute
    public void setParentRatingKey(Integer parentRatingKey) {
        this.parentRatingKey = parentRatingKey;
    }

    @XmlAttribute
    public void setGrandparentRatingKey(Integer grandparentRatingKey) {
        this.grandparentRatingKey = grandparentRatingKey;
    }

    @XmlAttribute
    public void setParentGuid(String parentGuid) {
        this.parentGuid = parentGuid;
    }

    @XmlAttribute
    public void setGrandparentGuid(String grandparentGuid) {
        this.grandparentGuid = grandparentGuid;
    }

    @XmlAttribute
    public void setGrandparentKey(String grandparentKey) {
        this.grandparentKey = grandparentKey;
    }

    @XmlAttribute
    public void setParentKey(String parentKey) {
        this.parentKey = parentKey;
    }

    @XmlAttribute
    public void setLibrarySectionTitle(String librarySectionTitle) {
        this.librarySectionTitle = librarySectionTitle;
    }

    @XmlAttribute
    public void setLibrarySectionID(Integer librarySectionID) {
        this.librarySectionID = librarySectionID;
    }

    @XmlAttribute
    public void setLibrarySectionKey(String librarySectionKey) {
        this.librarySectionKey = librarySectionKey;
    }

    @XmlAttribute
    public void setGrandparentTitle(String grandparentTitle) {
        this.grandparentTitle = grandparentTitle;
    }

    @XmlAttribute
    public void setParentTitle(String parentTitle) {
        this.parentTitle = parentTitle;
    }

    @XmlAttribute
    public void setIndex(Integer index) {
        this.index = index;
    }

    @XmlAttribute
    public void setParentIndex(Integer parentIndex) {
        this.parentIndex = parentIndex;
    }

    @XmlAttribute
    public void setViewOffset(Long viewOffset) {
        this.viewOffset = viewOffset;
    }

    @XmlAttribute
    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    @XmlAttribute
    public void setSkipCount(Integer skipCount) {
        this.skipCount = skipCount;
    }

    @XmlAttribute
    @XmlJavaTypeAdapter(TimestampAdapter.class)
    public void setLastViewedAt(Date lastViewedAt) {
        this.lastViewedAt = lastViewedAt;
    }

    @XmlAttribute
    public void setParentYear(Integer parentYear) {
        this.parentYear = parentYear;
    }

    @XmlAttribute
    public void setParentThumb(String parentThumb) {
        this.parentThumb = parentThumb;
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
    public void setGrandparentTheme(String grandparentTheme) {
        this.grandparentTheme = grandparentTheme;
    }
}
