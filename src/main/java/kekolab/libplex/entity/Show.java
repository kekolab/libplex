package kekolab.libplex.entity;

import java.net.URI;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import kekolab.libplex.xmladapter.SectionItemXML;

public class Show extends SectionItem {
    private Integer viewCount, skipCount, year, leafCount, viewedLeafCount, childCount;
    private String studio, originalTitle, contentRating, tagline, theme, audienceRatingImage;
    private Double audienceRating;
    private Long duration;
    private Date lastViewedAt, originallyAvailableAt;
    private List<Tag> genres;
    private List<Guid> guids;
    private List<Role> roles;
    private List<Tag> similars;
    private List<Location> locations;

    public Show(SectionItemXML v) {
    	super(v);
        setAudienceRating(v.getAudienceRating());
        setAudienceRatingImage(v.getAudienceRatingImage());
        setChildCount(v.getChildCount());
        setContentRating(v.getContentRating());
        setDuration(v.getDuration());
        setGenres(v.getGenres());
        setGuids(v.getGuids());
        setLastViewedAt(v.getLastViewedAt());
        setLeafCount(v.getLeafCount());
        setLocations(v.getLocations());
        setOriginallyAvailableAt(v.getOriginallyAvailableAt());
        setOriginalTitle(v.getOriginalTitle());
        setRoles(v.getRoles());
        setTagline(v.getTagline());
        setTheme(v.getTheme());
        setViewCount(v.getViewCount());
        setViewedLeafCount(v.getViewedLeafCount());
        setYear(v.getYear());
    }

    @Override
    public ShowSection section() {
    	return (ShowSection) MusicSection.build(ShowSection.class, getClient(), sectionUri());
    }
    
    @Override
    public Show details() {
        SectionItem item = ((SectionItemList) SectionItemList.build(SectionItemList.class, getClient(), ratingKeyUri(),
                getServer())).getItems()
                        .get(0);
        return (Show) item;
    }
    
	public URI themeUri() {
		String key = getTheme();
		if (key != null)
			return getClient().uriBuilder().fromKey(key, null, getServer()).build();
		return null;
	}

    public List<Season> seasons() {
        SectionItemList itemList = (SectionItemList) SectionItemList.build(SectionItemList.class, getClient(), keyUri());
        return itemList.getItems()
                .stream()
                .map(item -> (Season) item)
                .collect(Collectors.toList());
    }

    public List<Video> allEpisodes() {
        URI uri = getClient().uriBuilder()
                .fromKey("/library/metadata/{ratingKey}/allLeaves", null, getServer())
                .build(getRatingKey());
        List<? extends SectionItem> mis = ((SectionItemList) SectionItemList.build(SectionItemList.class, getClient(),
                uri, getServer())).getItems();
        return mis.stream()
                .map(item -> (Video) item)
                .collect(Collectors.toList());
    }

    public Integer getViewCount() {
        return viewCount;
    }

    public Integer getSkipCount() {
        return skipCount;
    }

    public Integer getYear() {
        return year;
    }

    public Integer getLeafCount() {
        return leafCount;
    }

    public Integer getViewedLeafCount() {
        return viewedLeafCount;
    }

    public Integer getChildCount() {
        return childCount;
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

    public String getTheme() {
        return theme;
    }

    public String getAudienceRatingImage() {
        return audienceRatingImage;
    }

    public Double getAudienceRating() {
        return audienceRating;
    }

    public Long getDuration() {
        return duration;
    }

    public Date getLastViewedAt() {
        return lastViewedAt;
    }

    public Date getOriginallyAvailableAt() {
        return originallyAvailableAt;
    }

    public List<Tag> getGenres() {
        return genres;
    }

    public List<Guid> getGuids() {
        return guids;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public List<Tag> getSimilars() {
        return similars;
    }

    public List<Location> getLocations() {
        return locations;
    }

    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    public void setSkipCount(Integer skipCount) {
        this.skipCount = skipCount;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public void setLeafCount(Integer leafCount) {
        this.leafCount = leafCount;
    }

    public void setViewedLeafCount(Integer viewedLeafCount) {
        this.viewedLeafCount = viewedLeafCount;
    }

    public void setChildCount(Integer childCount) {
        this.childCount = childCount;
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

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public void setAudienceRatingImage(String audienceRatingImage) {
        this.audienceRatingImage = audienceRatingImage;
    }

    public void setAudienceRating(Double audienceRating) {
        this.audienceRating = audienceRating;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public void setLastViewedAt(Date lastViewedAt) {
        this.lastViewedAt = lastViewedAt;
    }

    public void setOriginallyAvailableAt(Date originallyAvailableAt) {
        this.originallyAvailableAt = originallyAvailableAt;
    }

    public void setGenres(List<Tag> genres) {
        this.genres = genres;
    }

    public void setGuids(List<Guid> guids) {
        this.guids = guids;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public void setSimilars(List<Tag> similars) {
        this.similars = similars;
    }

    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }
}
