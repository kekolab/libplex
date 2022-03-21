package kekolab.libplex.entity;

import java.net.URI;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import kekolab.libplex.xmladapter.SectionItemXML;

public class Album extends SectionItem {
    private Integer year, loudnessAnalysisVersion;
    private String studio;
    private Double rating;
    private Date originallyAvailableAt;
    private List<Tag> genres = new ArrayList<>(0);;
    private List<Tag> directors = new ArrayList<>(0);;
    private Integer index;
    private Integer parentRatingKey;
    private String parentGuid, parentKey, parentTitle, parentThumb;
    // Details
    private Integer viewCount, leafCount, librarySectionID;
    private String librarySectionTitle, librarySectionKey;
    private Date lastViewedAt;
    private List<Tag> styles = new ArrayList<>(0);
    private List<Tag> moods = new ArrayList<>(0);

    public Album(SectionItemXML v) {
        setAddedAt(v.getAddedAt());
        setArt(v.getArt());
        setDirectors(v.getDirectors());
        setGenres(v.getGenres());
        setGuid(v.getGuid());
        setIndex(v.getIndex());
        setKey(v.getKey());
        setLoudnessAnalysisVersion(v.getLoudnessAnalysisVersion());
        setOriginallyAvailableAt(v.getOriginallyAvailableAt());
        setParentGuid(v.getParentGuid());
        setParentKey(v.getParentKey());
        setParentRatingKey(v.getParentRatingKey());
        setParentThumb(v.getParentThumb());
        setParentTitle(v.getParentTitle());
        setRating(v.getRating());
        setRatingKey(v.getRatingKey());
        setStudio(v.getStudio());
        setSummary(v.getSummary());
        setThumb(v.getThumb());
        setTitle(v.getTitle());
        setType(v.getType());
        setUpdatedAt(v.getUpdatedAt());
        setYear(v.getYear());
        // Details
        setViewCount(v.getViewCount());
        setLeafCount(v.getLeafCount());
        setLibrarySectionID(v.getLibrarySectionID());
        setLibrarySectionKey(v.getLibrarySectionKey());
        setLibrarySectionTitle(v.getLibrarySectionTitle());
        setLastViewedAt(v.getLastViewedAt());
        setStyles(v.getStyles());
        setMoods(v.getMoods());
    }
    
    public URI parentThumbUri() {
    	String parentThumb = getParentThumb();
    	if (parentThumb != null)
    		return getClient().uriBuilder().fromKey(parentThumb, null, getServer()).build();
    	return null;
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

    public void setParentRatingKey(Integer parentRatingKey) {
        this.parentRatingKey = parentRatingKey;
    }

    public void setParentGuid(String parentGuid) {
        this.parentGuid = parentGuid;
    }

    public void setParentKey(String parentKey) {
        this.parentKey = parentKey;
    }

    public void setParentTitle(String parentTitle) {
        this.parentTitle = parentTitle;
    }

    public void setParentThumb(String parentThumb) {
        this.parentThumb = parentThumb;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public List<Track> tracks() {
        return ((SectionItemList) SectionItemList.build(SectionItemList.class, getClient(), contentUri(), getServer()))
                .getItems()
                .stream()
                .map(mi -> (Track) mi)
                .collect(Collectors.toList());
    }

    @Override
    public Album details() {
        List<? extends SectionItem> mis = ((SectionItemList) SectionItemList.build(SectionItemList.class, getClient(),
                detailsUri(), getServer())).getItems();
        return mis.size() > 0 ? (Album) mis.get(0) : null;
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

    public List<Tag> getGenres() {
        return genres;
    }

    public List<Tag> getDirectors() {
        return directors;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public void setLoudnessAnalysisVersion(Integer loudnessAnalysisVersion) {
        this.loudnessAnalysisVersion = loudnessAnalysisVersion;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public void setOriginallyAvailableAt(Date originallyAvailableAt) {
        this.originallyAvailableAt = originallyAvailableAt;
    }

    public void setGenres(List<Tag> genres) {
        this.genres = genres;
    }

    public void setDirectors(List<Tag> directors) {
        this.directors = directors;
    }

    public Integer getViewCount() {
        return viewCount;
    }

    public Integer getLeafCount() {
        return leafCount;
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

    public Date getLastViewedAt() {
        return lastViewedAt;
    }

    public List<Tag> getStyles() {
        return styles;
    }

    public List<Tag> getMoods() {
        return moods;
    }

    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    public void setLeafCount(Integer leafCount) {
        this.leafCount = leafCount;
    }

    public void setLibrarySectionTitle(String librarySectionTitle) {
        this.librarySectionTitle = librarySectionTitle;
    }

    public void setLibrarySectionID(Integer librarySectionID) {
        this.librarySectionID = librarySectionID;
    }

    public void setLibrarySectionKey(String librarySectionKey) {
        this.librarySectionKey = librarySectionKey;
    }

    public void setLastViewedAt(Date lastViewedAt) {
        this.lastViewedAt = lastViewedAt;
    }

    public void setStyles(List<Tag> styles) {
        this.styles = styles;
    }

    public void setMoods(List<Tag> moods) {
        this.moods = moods;
    }
}
