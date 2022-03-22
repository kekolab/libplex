package kekolab.libplex.xmladapter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import kekolab.libplex.entity.Location;
import kekolab.libplex.entity.Media;
import kekolab.libplex.entity.Role;
import kekolab.libplex.entity.Tag;

public class SectionItemXML {
    private String key, art, thumb, title, type;
    private Integer ratingKey;
    private String guid;
    private String summary;
    private Date addedAt;
    private Date updatedAt;
    private Integer viewCount, skipCount, albumSort;
    private Date lastViewedAt;
    private Integer year, loudnessAnalysisVersion;
    private String studio;
    private Double rating;
    private Date originallyAvailableAt;
    private Integer grandparentRatingKey, parentIndex, ratingCount, parentYear;
    private String grandparentGuid, parentStudio, grandparentKey, grandparentTitle, grandparentThumb, grandparentArt;
    private Long duration;
    private Integer index;
    private Integer parentRatingKey;
    private String parentGuid, parentKey, parentTitle, parentThumb;
    private List<Tag> countries = new ArrayList<>(0);
    private List<Tag> genres = new ArrayList<>(0);
    private List<Tag> directors = new ArrayList<>(0);
    private List<Media> media = new ArrayList<>(0);
    private Integer librarySectionID;
    private String librarySectionTitle, librarySectionKey;
    private List<Tag> styles = new ArrayList<>(0);
    private List<Tag> similars = new ArrayList<>(0);
    private List<Tag> moods = new ArrayList<>(0);
    private List<Location> locations = new ArrayList<>(0);
    private Integer leafCount;
    private Integer hasPremiumLyrics;
    private String originalTitle;
    private List<Tag> producers = new ArrayList<>(0);
    private Integer hasPremiumExtras;
    private String contentRating, tagline, audienceRatingImage, chapterSource, ratingImage;
    private Double audienceRating;
    private List<Tag> writers = new ArrayList<>(0);
    private List<Role> roles = new ArrayList<>(0);
    private Integer hasPremiumPrimaryExtra;// Movie
    private Long viewOffset; // Movie, Episode
    private String grandparentTheme; // Episode
    private Integer viewedLeafCount, childCount;
    private String theme;
    private List<Tag> guids;
    private String titleSort, parentTheme;

    public String getKey() {
        return key;
    }

    public String getArt() {
        return art;
    }

    public String getThumb() {
        return thumb;
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }

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

    public Integer getViewCount() {
        return viewCount;
    }

    public Integer getSkipCount() {
        return skipCount;
    }

    public Integer getAlbumSort() {
        return albumSort;
    }

    public Date getLastViewedAt() {
        return lastViewedAt;
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

    public Integer getIndex() {
        return index;
    }

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

    public List<Tag> getCountries() {
        return countries;
    }

    public List<Tag> getGenres() {
        return genres;
    }

    public List<Tag> getDirectors() {
        return directors;
    }

    public List<Media> getMedia() {
        return media;
    }

    @XmlAttribute
    public void setKey(String key) {
        this.key = key;
    }

    @XmlAttribute
    public void setArt(String art) {
        this.art = art;
    }

    @XmlAttribute
    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    @XmlAttribute
    public void setTitle(String title) {
        this.title = title;
    }

    @XmlAttribute
    public void setType(String type) {
        this.type = type;
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

    @XmlAttribute
    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    @XmlAttribute
    public void setSkipCount(Integer skipCount) {
        this.skipCount = skipCount;
    }

    @XmlAttribute
    public void setAlbumSort(Integer albumSort) {
        this.albumSort = albumSort;
    }

    @XmlAttribute
    @XmlJavaTypeAdapter(TimestampAdapter.class)
    public void setLastViewedAt(Date lastViewedAt) {
        this.lastViewedAt = lastViewedAt;
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

    @XmlAttribute
    public void setIndex(Integer index) {
        this.index = index;
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

    @XmlElement(name = "Country")
    public void setCountries(List<Tag> countries) {
        this.countries = countries;
    }

    @XmlElement(name = "Genre")
    public void setGenres(List<Tag> genres) {
        this.genres = genres;
    }

    @XmlElement(name = "Director")
    public void setDirectors(List<Tag> directors) {
        this.directors = directors;
    }

    @XmlElement(name = "Media")
    public void setMedia(List<Media> media) {
        this.media = media;
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

    public List<Tag> getStyles() {
        return styles;
    }

    public List<Tag> getSimilars() {
        return similars;
    }

    public List<Tag> getMoods() {
        return moods;
    }

    public List<Location> getLocations() {
        return locations;
    }

    @XmlAttribute
    public void setLibrarySectionID(Integer librarySectionID) {
        this.librarySectionID = librarySectionID;
    }

    @XmlAttribute
    public void setLibrarySectionTitle(String librarySectionTitle) {
        this.librarySectionTitle = librarySectionTitle;
    }

    @XmlAttribute
    public void setLibrarySectionKey(String librarySectionKey) {
        this.librarySectionKey = librarySectionKey;
    }

    @XmlElement(name = "Style")
    public void setStyles(List<Tag> styles) {
        this.styles = styles;
    }

    @XmlElement(name = "Similar")
    public void setSimilars(List<Tag> similars) {
        this.similars = similars;
    }

    @XmlElement(name = "Mood")
    public void setMoods(List<Tag> moods) {
        this.moods = moods;
    }

    @XmlElement(name = "Locations")
    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }

    public Integer getLeafCount() {
        return leafCount;
    }

    @XmlAttribute
    public void setLeafCount(Integer leafCount) {
        this.leafCount = leafCount;
    }

    public Integer getHasPremiumLyrics() {
        return hasPremiumLyrics;
    }

    @XmlAttribute
    public void setHasPremiumLyrics(Integer hasPremiumLyrics) {
        this.hasPremiumLyrics = hasPremiumLyrics;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    @XmlAttribute
    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public List<Tag> getProducers() {
        return producers;
    }

    @XmlElement(name = "Producer")
    public void setProducers(List<Tag> producers) {
        this.producers = producers;
    }

    public Integer getHasPremiumExtras() {
        return hasPremiumExtras;
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

    public Double getAudienceRating() {
        return audienceRating;
    }

    public List<Tag> getWriters() {
        return writers;
    }

    public List<Role> getRoles() {
        return roles;
    }

    @XmlAttribute
    public void setHasPremiumExtras(Integer hasPremiumExtras) {
        this.hasPremiumExtras = hasPremiumExtras;
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
    public void setAudienceRating(Double audienceRating) {
        this.audienceRating = audienceRating;
    }

    @XmlElement(name = "Writer")
    public void setWriters(List<Tag> writers) {
        this.writers = writers;
    }

    @XmlElement(name = "Role")
    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public Integer getHasPremiumPrimaryExtra() {
        return hasPremiumPrimaryExtra;
    }

    public Long getViewOffset() {
        return viewOffset;
    }

    public String getGrandparentTheme() {
        return grandparentTheme;
    }

    @XmlAttribute
    public void setHasPremiumPrimaryExtra(Integer hasPremiumPrimaryExtra) {
        this.hasPremiumPrimaryExtra = hasPremiumPrimaryExtra;
    }

    @XmlAttribute
    public void setViewOffset(Long viewOffset) {
        this.viewOffset = viewOffset;
    }

    @XmlAttribute
    public void setGrandparentTheme(String grandparentTheme) {
        this.grandparentTheme = grandparentTheme;
    }

    public Integer getViewedLeafCount() {
        return viewedLeafCount;
    }

    public Integer getChildCount() {
        return childCount;
    }

    public String getTheme() {
        return theme;
    }

    public List<Tag> getGuids() {
        return guids;
    }

    @XmlAttribute
    public void setViewedLeafCount(Integer viewedLeafCount) {
        this.viewedLeafCount = viewedLeafCount;
    }

    @XmlAttribute
    public void setChildCount(Integer childCount) {
        this.childCount = childCount;
    }

    @XmlAttribute
    public void setTheme(String theme) {
        this.theme = theme;
    }

    @XmlElement(name = "Guid")
    public void setGuids(List<Tag> guids) {
        this.guids = guids;
    }

    public String getTitleSort() {
        return titleSort;
    }

    public String getParentTheme() {
        return parentTheme;
    }

    @XmlAttribute
    public void setTitleSort(String titleSort) {
        this.titleSort = titleSort;
    }

    @XmlAttribute
    public void setParentTheme(String parentTheme) {
        this.parentTheme = parentTheme;
    }
}