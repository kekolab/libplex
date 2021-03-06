package kekolab.libplex.entity;

import java.net.URI;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import kekolab.libplex.xmladapter.SectionItemXML;

public class Video extends SectionItem {
    private Double audienceRating;
    private String audienceRatingImage;
    private String chapterSource;
    private String contentRating;
    private List<Tag> countries = new ArrayList<>(0);
    private List<Tag> directors = new ArrayList<>(0);
    private Long duration;
    private List<Tag> genres = new ArrayList<>(0);
    private String grandparentArt;
    private String grandparentGuid;
    private String grandparentKey;
    private Integer grandparentRatingKey;
    private String grandparentTheme;
    private String grandparentThumb;
    private String grandparentTitle;
    private Integer hasPremiumExtras;
    private Integer hasPremiumPrimaryExtra;
    private Date lastViewedAt;
    private List<Media> media = new ArrayList<>(0);
    private Date originallyAvailableAt;
    private String originalTitle;
    private String parentGuid;
    private Integer parentIndex;
    private String parentKey;
    private Integer parentRatingKey;
    private String parentThumb;
    private String parentTitle;
    private Integer parentYear;
    private List<Tag> producers = new ArrayList<>(0);
    private Double rating;
    private String ratingImage;
    private List<Role> roles = new ArrayList<>(0);
    private List<Tag> similars = new ArrayList<>(0);
    private Integer skipCount;
    private String studio;
    private String tagline;
    private Integer viewCount;
    private Long viewOffset;
    private List<Tag> writers = new ArrayList<>(0);
    private Integer year;
    private List<Guid> guids;

    public Video(SectionItemXML v) {
    	super(v);
        setAudienceRating(v.getAudienceRating());
        setAudienceRatingImage(v.getAudienceRatingImage());
        setChapterSource(v.getChapterSource());
        setContentRating(v.getContentRating());
        setCountries(v.getCountries());
        setDirectors(v.getDirectors());
        setDuration(v.getDuration());
        setGenres(v.getGenres());
        setGrandparentArt(v.getGrandparentArt());
        setGrandparentGuid(v.getGrandparentGuid());
        setGrandparentKey(v.getGrandparentKey());
        setGrandparentRatingKey(v.getGrandparentRatingKey());
        setGrandparentTheme(v.getGrandparentTheme());
        setGrandparentThumb(v.getGrandparentThumb());
        setGrandparentTitle(v.getGrandparentTitle());
        setGuids(v.getGuids());
        setHasPremiumExtras(v.getHasPremiumExtras());
        setHasPremiumPrimaryExtra(v.getHasPremiumPrimaryExtra());
        setLastViewedAt(v.getLastViewedAt());
        setMedia(v.getMedia());
        setOriginallyAvailableAt(v.getOriginallyAvailableAt());
        setOriginalTitle(v.getOriginalTitle());
        setParentGuid(v.getParentGuid());
        setParentIndex(v.getParentIndex());
        setParentKey(v.getParentKey());
        setParentRatingKey(v.getParentRatingKey());
        setParentThumb(v.getParentThumb());
        setParentTitle(v.getParentTitle());
        setParentYear(v.getParentYear());
        setProducers(v.getProducers());
        setRating(v.getRating());
        setRatingImage(v.getRatingImage());
        setRoles(v.getRoles());
        setSimilars(v.getSimilars());
        setSkipCount(v.getSkipCount());
        setStudio(v.getStudio());
        setTagline(v.getTagline());
        setViewCount(v.getViewCount());
        setViewCount(v.getViewCount());
        setViewOffset(v.getViewOffset());
        setWriters(v.getWriters());
        setYear(v.getYear());
    }
    
    public URI showArtUri() {
    	String key  = getGrandparentArt();
    	if (key != null) 
    		return getClient().uriBuilder().fromKey(key, getParent(), getServer()).build();
    	return null;
    }
    
    public URI showThemeUri() {
    	String key  = getGrandparentTheme();
    	if (key != null) 
    		return getClient().uriBuilder().fromKey(key, getParent(), getServer()).build();
    	return null;
    }
    
    public URI showThumbUri() {
    	String key  = getGrandparentThumb();
    	if (key != null) 
    		return getClient().uriBuilder().fromKey(key, getParent(), getServer()).build();
    	return null;
    }

    public URI seasonThumbUri() {
    	String key  = getParentThumb();
    	if (key != null) 
    		return getClient().uriBuilder().fromKey(key, getParent(), getServer()).build();
    	return null;
    }
    
    public URI showUri() {
    	String key  = getGrandparentKey();
    	if (key != null) 
    		return getClient().uriBuilder().fromKey(key, getParent(), getServer()).build();
    	return null;
    }
    
    public Show show() {
    	URI uri = showUri();
    	if (uri != null)
    		return (Show) Show.build(Show.class, getClient(), uri, getServer());
    	return null;
    }
    
    public URI seasonUri() {
    	String key  = getParentKey();
    	if (key != null) 
    		return getClient().uriBuilder().fromKey(key, getParent(), getServer()).build();
    	return null;
    }
    
    public Season season() {
    	URI uri = seasonUri();
    	if (uri != null)
    		return (Season) Show.build(Season.class, getClient(), uri, getServer());
    	return null;
    }
    
    @Override
    public MovieSection section() {
    	return (MovieSection) MusicSection.build(MovieSection.class, getClient(), sectionUri());
    }
    
    @Override
    public Video details() {
        SectionItemList mil = (SectionItemList) SectionItemList.build(SectionItemList.class, getClient(), ratingKeyUri(),
                getServer());
        if (mil.getItems()
                .size() > 0)
            return (Video) mil.getItems()
                    .get(0);
        return null;
    }

    public Double getAudienceRating() {
        return audienceRating;
    }

    public String getAudienceRatingImage() {
        return audienceRatingImage;
    }

    public String getChapterSource() {
        return chapterSource;
    }

    public String getContentRating() {
        return contentRating;
    }

    public List<Tag> getCountries() {
        return countries;
    }

    public List<Tag> getDirectors() {
        return directors;
    }

    public Long getDuration() {
        return duration;
    }

    public List<Tag> getGenres() {
        return genres;
    }

    public String getGrandparentArt() {
        return grandparentArt;
    }

    public String getGrandparentGuid() {
        return grandparentGuid;
    }

    public String getGrandparentKey() {
        return grandparentKey;
    }

    public Integer getGrandparentRatingKey() {
        return grandparentRatingKey;
    }

    public String getGrandparentTheme() {
        return grandparentTheme;
    }

    public String getGrandparentThumb() {
        return grandparentThumb;
    }

    public String getGrandparentTitle() {
        return grandparentTitle;
    }

    public Integer getHasPremiumExtras() {
        return hasPremiumExtras;
    }

    public Integer getHasPremiumPrimaryExtra() {
        return hasPremiumPrimaryExtra;
    }

    public Date getLastViewedAt() {
        return lastViewedAt;
    }

    public List<Media> getMedia() {
        return media;
    }

    public Date getOriginallyAvailableAt() {
        return originallyAvailableAt;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public String getParentGuid() {
        return parentGuid;
    }

    public Integer getParentIndex() {
        return parentIndex;
    }

    public String getParentKey() {
        return parentKey;
    }

    public Integer getParentRatingKey() {
        return parentRatingKey;
    }

    public String getParentThumb() {
        return parentThumb;
    }

    public String getParentTitle() {
        return parentTitle;
    }

    public Integer getParentYear() {
        return parentYear;
    }

    public List<Tag> getProducers() {
        return producers;
    }

    public Double getRating() {
        return rating;
    }

    public String getRatingImage() {
        return ratingImage;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public List<Tag> getSimilars() {
        return similars;
    }

    public Integer getSkipCount() {
        return skipCount;
    }

    public String getStudio() {
        return studio;
    }

    public String getTagline() {
        return tagline;
    }

    public Integer getViewCount() {
        return viewCount;
    }

    public Long getViewOffset() {
        return viewOffset;
    }

    public List<Tag> getWriters() {
        return writers;
    }

    public Integer getYear() {
        return year;
    }

    public void setAudienceRating(Double audienceRating) {
        this.audienceRating = audienceRating;
    }

    public void setAudienceRatingImage(String audienceRatingImage) {
        this.audienceRatingImage = audienceRatingImage;
    }

    public void setChapterSource(String chapterSource) {
        this.chapterSource = chapterSource;
    }

    public void setContentRating(String contentRating) {
        this.contentRating = contentRating;
    }

    public void setCountries(List<Tag> countries) {
        this.countries = countries;
    }

    public void setDirectors(List<Tag> directors) {
        this.directors = directors;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public void setGenres(List<Tag> genres) {
        this.genres = genres;
    }

    public void setGrandparentArt(String grandparentArt) {
        this.grandparentArt = grandparentArt;
    }

    public void setGrandparentGuid(String grandparentGuid) {
        this.grandparentGuid = grandparentGuid;
    }

    public void setGrandparentKey(String grandparentKey) {
        this.grandparentKey = grandparentKey;
    }

    public void setGrandparentRatingKey(Integer grandparentRatingKey) {
        this.grandparentRatingKey = grandparentRatingKey;
    }

    public void setGrandparentTheme(String grandparentTheme) {
        this.grandparentTheme = grandparentTheme;
    }

    public void setGrandparentThumb(String grandparentThumb) {
        this.grandparentThumb = grandparentThumb;
    }

    public void setGrandparentTitle(String grandparentTitle) {
        this.grandparentTitle = grandparentTitle;
    }

    public void setHasPremiumExtras(Integer hasPremiumExtras) {
        this.hasPremiumExtras = hasPremiumExtras;
    }

    public void setHasPremiumPrimaryExtra(Integer hasPremiumPrimaryExtra) {
        this.hasPremiumPrimaryExtra = hasPremiumPrimaryExtra;
    }

    public void setLastViewedAt(Date lastViewedAt) {
        this.lastViewedAt = lastViewedAt;
    }

    public void setMedia(List<Media> media) {
        this.media = media;
    }

    public void setOriginallyAvailableAt(Date originallyAvailableAt) {
        this.originallyAvailableAt = originallyAvailableAt;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public void setParentGuid(String parentGuid) {
        this.parentGuid = parentGuid;
    }

    public void setParentIndex(Integer parentIndex) {
        this.parentIndex = parentIndex;
    }

    public void setParentKey(String parentKey) {
        this.parentKey = parentKey;
    }

    public void setParentRatingKey(Integer parentRatingKey) {
        this.parentRatingKey = parentRatingKey;
    }

    public void setParentThumb(String parentThumb) {
        this.parentThumb = parentThumb;
    }

    public void setParentTitle(String parentTitle) {
        this.parentTitle = parentTitle;
    }

    public void setParentYear(Integer parentYear) {
        this.parentYear = parentYear;
    }

    public void setProducers(List<Tag> producers) {
        this.producers = producers;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public void setRatingImage(String ratingImage) {
        this.ratingImage = ratingImage;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public void setSimilars(List<Tag> similars) {
        this.similars = similars;
    }

    public void setSkipCount(Integer skipCount) {
        this.skipCount = skipCount;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    public void setViewOffset(Long viewOffset) {
        this.viewOffset = viewOffset;
    }

    public void setWriters(List<Tag> writers) {
        this.writers = writers;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public List<Guid> getGuids() {
        return guids;
    }

    public void setGuids(List<Guid> guids) {
        this.guids = guids;
    }
}
