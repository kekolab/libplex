package kekolab.libplex.entity;

import java.net.URI;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import kekolab.libplex.xmladapter.SectionItemXML;

public class Album extends SectionItem {
    private List<Tag> directors = new ArrayList<>(0);
    private List<Tag> genres = new ArrayList<>(0);
    private Integer index;
    private Date lastViewedAt;
    private Integer leafCount;
    private Integer librarySectionID;
    private String librarySectionKey;
    private String librarySectionTitle;
    private Integer loudnessAnalysisVersion;
    private List<Tag> moods = new ArrayList<>(0);
    private Date originallyAvailableAt;
    private String parentGuid;
    private String parentKey;
    private Integer parentRatingKey;
    private String parentThumb;
    private String parentTitle;
    private Double rating;
    private String studio;
    private List<Tag> styles = new ArrayList<>(0);
    private Integer viewCount;
    private Integer year;

    public Album(SectionItemXML v) {
        setAddedAt(v.getAddedAt());
        setArt(v.getArt());
        setDirectors(v.getDirectors());
        setGenres(v.getGenres());
        setGuid(v.getGuid());
        setIndex(v.getIndex());
        setKey(v.getKey());
        setLastViewedAt(v.getLastViewedAt());
        setLeafCount(v.getLeafCount());
        setLibrarySectionID(v.getLibrarySectionID());
        setLibrarySectionKey(v.getLibrarySectionKey());
        setLibrarySectionTitle(v.getLibrarySectionTitle());
        setLoudnessAnalysisVersion(v.getLoudnessAnalysisVersion());
        setMoods(v.getMoods());
        setOriginallyAvailableAt(v.getOriginallyAvailableAt());
        setParentGuid(v.getParentGuid());
        setParentKey(v.getParentKey());
        setParentRatingKey(v.getParentRatingKey());
        setParentThumb(v.getParentThumb());
        setParentTitle(v.getParentTitle());
        setRating(v.getRating());
        setRatingKey(v.getRatingKey());
        setStudio(v.getStudio());
        setStyles(v.getStyles());
        setSummary(v.getSummary());
        setThumb(v.getThumb());
        setTitle(v.getTitle());
        setType(v.getType());
        setUpdatedAt(v.getUpdatedAt());
        setViewCount(v.getViewCount());
        setYear(v.getYear());
    }
    
    public List<Track> tracks() {
        return ((SectionItemList) SectionItemList.build(SectionItemList.class, getClient(), ratingKeyUri(), getServer()))
                .getItems()
                .stream()
                .map(mi -> (Track) mi)
                .collect(Collectors.toList());
    }
    
    @Override
    public Album details() {
    	URI uri = getClient().uriBuilder().fromKey("/library/metadata/{ratingKey}", getParent(), getServer()).build(getRatingKey());
        List<? extends SectionItem> mis = ((SectionItemList) SectionItemList.build(SectionItemList.class, getClient(),
        		uri, getServer())).getItems();
        return mis.size() > 0 ? (Album) mis.get(0) : null;
    }

    public List<Tag> getDirectors() {
        return directors;
    }

    public List<Tag> getGenres() {
        return genres;
    }

    public Integer getIndex() {
        return index;
    }

    public Date getLastViewedAt() {
        return lastViewedAt;
    }

    public Integer getLeafCount() {
        return leafCount;
    }

    public Integer getLibrarySectionID() {
        return librarySectionID;
    }

    public String getLibrarySectionKey() {
        return librarySectionKey;
    }

    public String getLibrarySectionTitle() {
        return librarySectionTitle;
    }

    public Integer getLoudnessAnalysisVersion() {
        return loudnessAnalysisVersion;
    }

    public List<Tag> getMoods() {
        return moods;
    }

    public Date getOriginallyAvailableAt() {
        return originallyAvailableAt;
    }

    public String getParentGuid() {
        return parentGuid;
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

    public Double getRating() {
        return rating;
    }

    public String getStudio() {
        return studio;
    }

    public List<Tag> getStyles() {
        return styles;
    }

    public Integer getViewCount() {
        return viewCount;
    }

    public Integer getYear() {
        return year;
    }

    public URI parentThumbUri() {
    	String parentThumb = getParentThumb();
    	if (parentThumb != null)
    		return getClient().uriBuilder().fromKey(parentThumb, null, getServer()).build();
    	return null;
    }

    public void setDirectors(List<Tag> directors) {
        this.directors = directors;
    }

    public void setGenres(List<Tag> genres) {
        this.genres = genres;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public void setLastViewedAt(Date lastViewedAt) {
        this.lastViewedAt = lastViewedAt;
    }

    public void setLeafCount(Integer leafCount) {
        this.leafCount = leafCount;
    }

    public void setLibrarySectionID(Integer librarySectionID) {
        this.librarySectionID = librarySectionID;
    }

    public void setLibrarySectionKey(String librarySectionKey) {
        this.librarySectionKey = librarySectionKey;
    }

    public void setLibrarySectionTitle(String librarySectionTitle) {
        this.librarySectionTitle = librarySectionTitle;
    }

    public void setLoudnessAnalysisVersion(Integer loudnessAnalysisVersion) {
        this.loudnessAnalysisVersion = loudnessAnalysisVersion;
    }

    public void setMoods(List<Tag> moods) {
        this.moods = moods;
    }

    public void setOriginallyAvailableAt(Date originallyAvailableAt) {
        this.originallyAvailableAt = originallyAvailableAt;
    }

    public void setParentGuid(String parentGuid) {
        this.parentGuid = parentGuid;
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

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public void setStyles(List<Tag> styles) {
        this.styles = styles;
    }

    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}
