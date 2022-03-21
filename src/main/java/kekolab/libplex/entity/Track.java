package kekolab.libplex.entity;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import kekolab.libplex.xmladapter.SectionItemXML;

public class Track extends SectionItem {
    private Integer grandparentRatingKey, parentIndex, ratingCount, parentYear;
    private String grandparentGuid, parentStudio, grandparentKey, grandparentTitle, grandparentThumb, grandparentArt;
    private Long duration;
    private List<Media> media = new ArrayList<>(0);
    private Integer index;
    private Integer parentRatingKey;
    private String parentGuid, parentKey, parentTitle, parentThumb;
    // Details
    private Integer librarySectionID, hasPremiumLyrics;
    private String librarySectionTitle, librarySectionKey, originalTitle;

    public Track(SectionItemXML v) {
        setAddedAt(v.getAddedAt());
        setArt(v.getArt());
        setDuration(v.getDuration());
        setGrandparentArt(v.getGrandparentArt());
        setGrandparentGuid(v.getGrandparentGuid());
        setGrandparentKey(v.getGrandparentKey());
        setGrandparentRatingKey(v.getGrandparentRatingKey());
        setGrandparentThumb(v.getGrandparentThumb());
        setGrandparentTitle(v.getGrandparentTitle());
        setGuid(v.getGuid());
        setIndex(v.getIndex());
        setKey(v.getKey());
        setMedia(v.getMedia());
        setParentGuid(v.getParentGuid());
        setParentIndex(v.getParentIndex());
        setParentKey(v.getParentKey());
        setParentRatingKey(v.getParentRatingKey());
        setParentStudio(v.getParentStudio());
        setParentThumb(v.getParentThumb());
        setParentTitle(v.getParentTitle());
        setParentYear(v.getParentYear());
        setRatingCount(v.getRatingCount());
        setRatingKey(v.getRatingKey());
        setSummary(v.getSummary());
        setThumb(v.getThumb());
        setTitle(v.getTitle());
        setType(v.getType());
        setUpdatedAt(v.getUpdatedAt());
        setLibrarySectionID(v.getLibrarySectionID());
        setHasPremiumLyrics(v.getHasPremiumLyrics());
        setLibrarySectionKey(v.getLibrarySectionKey());
        setLibrarySectionTitle(v.getLibrarySectionTitle());
        setOriginalTitle(v.getOriginalTitle());
    }
    
    public URI grandparentArtUri() {
    	String grandparentArt = getGrandparentArt();
    	if (grandparentArt != null)
    		return getClient().uriBuilder().fromKey(grandparentArt, null, getServer()).build();
    	return null;
    }
    
    public URI grandparentThumbUri() {
    	String grandparentThumb = getGrandparentThumb();
    	if (grandparentThumb != null)
    		return getClient().uriBuilder().fromKey(grandparentThumb, null, getServer()).build();
    	return null;
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

    @Override
    public Track details() {
        SectionItemList mil = (SectionItemList) SectionItemList.build(SectionItemList.class, getClient(), contentUri(),
                getServer());
        return (Track) mil.getItems()
                .get(0);
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

    public List<Media> getMedia() {
        return media;
    }

    public void setGrandparentRatingKey(Integer grandparentRatingKey) {
        this.grandparentRatingKey = grandparentRatingKey;
    }

    public void setParentIndex(Integer parentIndex) {
        this.parentIndex = parentIndex;
    }

    public void setRatingCount(Integer ratingCount) {
        this.ratingCount = ratingCount;
    }

    public void setParentYear(Integer parentYear) {
        this.parentYear = parentYear;
    }

    public void setGrandparentGuid(String grandparentGuid) {
        this.grandparentGuid = grandparentGuid;
    }

    public void setParentStudio(String parentStudio) {
        this.parentStudio = parentStudio;
    }

    public void setGrandparentKey(String grandparentKey) {
        this.grandparentKey = grandparentKey;
    }

    public void setGrandparentTitle(String grandparentTitle) {
        this.grandparentTitle = grandparentTitle;
    }

    public void setGrandparentThumb(String grandparentThumb) {
        this.grandparentThumb = grandparentThumb;
    }

    public void setGrandparentArt(String grandparentArt) {
        this.grandparentArt = grandparentArt;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public void setMedia(List<Media> media) {
        this.media = media;
    }

    public Integer getLibrarySectionID() {
        return librarySectionID;
    }

    public Integer getHasPremiumLyrics() {
        return hasPremiumLyrics;
    }

    public String getLibrarySectionTitle() {
        return librarySectionTitle;
    }

    public String getLibrarySectionKey() {
        return librarySectionKey;
    }

    public void setLibrarySectionID(Integer librarySectionID) {
        this.librarySectionID = librarySectionID;
    }

    public void setHasPremiumLyrics(Integer hasPremiumLyrics) {
        this.hasPremiumLyrics = hasPremiumLyrics;
    }

    public void setLibrarySectionTitle(String librarySectionTitle) {
        this.librarySectionTitle = librarySectionTitle;
    }

    public void setLibrarySectionKey(String librarySectionKey) {
        this.librarySectionKey = librarySectionKey;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }
}
