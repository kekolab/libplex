package kekolab.libplex.entity;

import java.net.URI;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import kekolab.libplex.xmladapter.SectionItemXML;

public class Season extends SectionItem {
    private Integer parentRatingKey, index, parentIndex, viewCount, skipCount, year, leafCount, viewedLeafCount,
            librarySectionID;
    private String parentGuid, parentStudio, titleSort, parentKey, parentTitle, parentThumb, parentTheme,
            librarySectionKey, librarySectionTitle;
    private Date lastViewedAt;
    private List<Tag> guids;

    public Season(SectionItemXML v) {
        setAddedAt(v.getAddedAt());
        setArt(v.getArt());
        setGuid(v.getGuid());
        setGuids(v.getGuids());
        setIndex(v.getIndex());
        setKey(v.getKey());
        setLastViewedAt(v.getLastViewedAt());
        setLeafCount(v.getLeafCount());
        setLibrarySectionID(v.getLibrarySectionID());
        setLibrarySectionKey(v.getLibrarySectionKey());
        setLibrarySectionTitle(v.getLibrarySectionTitle());
        setParentGuid(v.getParentGuid());
        setParentIndex(v.getParentIndex());
        setParentKey(v.getParentKey());
        setParentRatingKey(v.getParentRatingKey());
        setParentStudio(v.getParentStudio());
        setParentTheme(v.getParentTheme());
        setParentThumb(v.getParentThumb());
        setParentTitle(v.getParentTitle());
        setRatingKey(v.getRatingKey());
        setSkipCount(v.getSkipCount());
        setSummary(v.getSummary());
        setThumb(v.getThumb());
        setTitle(v.getTitle());
        setTitleSort(v.getTitleSort());
        setType(v.getType());
        setUpdatedAt(v.getUpdatedAt());
        setViewCount(v.getViewCount());
        setViewedLeafCount(v.getViewedLeafCount());
        setYear(v.getYear());
    }

    public List<Track> tracks() {
        URI uri = getClient().uriBuilder()
                .fromKey(getKey(), getParent(), getServer())
                .build();
        return ((SectionItemList) SectionItemList.build(SectionItemList.class, getClient(), uri, getServer()))
                .getItems()
                .stream()
                .map(mi -> (Track) mi)
                .collect(Collectors.toList());
    }

    @Override
    public Season details() {
        URI uri = getClient().uriBuilder()
                .fromKey("/library/metadata/{ratingKey}", this, getServer())
                .build(getRatingKey());
        List<? extends SectionItem> mis = ((SectionItemList) SectionItemList.build(SectionItemList.class, getClient(),
                uri, getServer())).getItems();
        return mis.size() > 0 ? (Season) mis.get(0) : null;
    }

    public List<Video> episodes() {
        URI uri = getClient().uriBuilder()
                .fromKey("/library/metadata/{ratingKey}", this, getServer())
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

    public Integer getParentIndex() {
        return parentIndex;
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

    public Integer getLibrarySectionID() {
        return librarySectionID;
    }

    public Integer getParentRatingKey() {
        return parentRatingKey;
    }

    public String getParentGuid() {
        return parentGuid;
    }

    public String getParentStudio() {
        return parentStudio;
    }

    public String getTitleSort() {
        return titleSort;
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

    public String getParentTheme() {
        return parentTheme;
    }

    public String getLibrarySectionKey() {
        return librarySectionKey;
    }

    public String getLibrarySectionTitle() {
        return librarySectionTitle;
    }

    public Date getLastViewedAt() {
        return lastViewedAt;
    }

    public List<Tag> getGuids() {
        return guids;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public void setParentIndex(Integer parentIndex) {
        this.parentIndex = parentIndex;
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

    public void setLibrarySectionID(Integer librarySectionID) {
        this.librarySectionID = librarySectionID;
    }

    public void setParentRatingKey(Integer parentRatingKey) {
        this.parentRatingKey = parentRatingKey;
    }

    public void setParentGuid(String parentGuid) {
        this.parentGuid = parentGuid;
    }

    public void setParentStudio(String parentStudio) {
        this.parentStudio = parentStudio;
    }

    public void setTitleSort(String titleSort) {
        this.titleSort = titleSort;
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

    public void setParentTheme(String parentTheme) {
        this.parentTheme = parentTheme;
    }

    public void setLibrarySectionKey(String librarySectionKey) {
        this.librarySectionKey = librarySectionKey;
    }

    public void setLibrarySectionTitle(String librarySectionTitle) {
        this.librarySectionTitle = librarySectionTitle;
    }

    public void setLastViewedAt(Date lastViewedAt) {
        this.lastViewedAt = lastViewedAt;
    }

    public void setGuids(List<Tag> guids) {
        this.guids = guids;
    }
}
