package kekolab.libplex.entity;

import java.net.URI;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import kekolab.libplex.xmladapter.SectionItemXML;

public class Show extends SectionItem {
    private Integer index, viewCount, skipCount, year, leafCount, viewedLeafCount, childCount, librarySectionID;
    private String studio, originalTitle, contentRating, tagline, theme, audienceRatingImage, librarySectionTitle,
            librarySectionKey;
    private Double audienceRating;
    private Long duration;
    private Date lastViewedAt, originallyAvailableAt;
    private List<Tag> genres;
    private List<Guid> guids;
    private List<Role> roles;
    private List<Tag> similars;
    private List<Location> locations;

    public Show(SectionItemXML v) {
        setAddedAt(v.getAddedAt());
        setArt(v.getArt());
        setAudienceRating(v.getAudienceRating());
        setAudienceRatingImage(v.getAudienceRatingImage());
        setChildCount(v.getChildCount());
        setContentRating(v.getContentRating());
        setDuration(v.getDuration());
        setGenres(v.getGenres());
        setGuid(v.getGuid());
        setGuids(v.getGuids());
        setIndex(v.getIndex());
        setKey(v.getKey());
        setLastViewedAt(v.getLastViewedAt());
        setLeafCount(v.getLeafCount());
        setLibrarySectionID(v.getLibrarySectionID());
        setLibrarySectionKey(v.getLibrarySectionKey());
        setLibrarySectionTitle(v.getLibrarySectionTitle());
        setLocations(v.getLocations());
        setOriginallyAvailableAt(v.getOriginallyAvailableAt());
        setOriginalTitle(v.getOriginalTitle());
        setRatingKey(v.getRatingKey());
        setRoles(v.getRoles());
        setTagline(v.getTagline());
        setTheme(v.getTheme());
        setThumb(v.getThumb());
        setTitle(v.getTitle());
        setType(v.getType());
        setUpdatedAt(v.getUpdatedAt());
        setViewCount(v.getViewCount());
        setViewedLeafCount(v.getViewedLeafCount());
        setYear(v.getYear());
    }

    @Override
    public Show details() {
        SectionItem item = ((SectionItemList) SectionItemList.build(SectionItemList.class, getClient(), ratingKeyUri(),
                getServer())).getItems()
                        .get(0);
        return (Show) item;
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

    public Integer getIndex() {
        return index;
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

    public Integer getLibrarySectionID() {
        return librarySectionID;
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

    public String getLibrarySectionTitle() {
        return librarySectionTitle;
    }

    public String getLibrarySectionKey() {
        return librarySectionKey;
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

    public void setIndex(Integer index) {
        this.index = index;
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

    public void setLibrarySectionID(Integer librarySectionID) {
        this.librarySectionID = librarySectionID;
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

    public void setLibrarySectionTitle(String librarySectionTitle) {
        this.librarySectionTitle = librarySectionTitle;
    }

    public void setLibrarySectionKey(String librarySectionKey) {
        this.librarySectionKey = librarySectionKey;
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
