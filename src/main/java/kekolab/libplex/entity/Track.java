package kekolab.libplex.entity;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import kekolab.libplex.xmladapter.SectionItemXML;

public class Track extends SectionItem {
    private Long duration;
    private String grandparentArt;
    private String grandparentGuid;
    private String grandparentKey;
    private Integer grandparentRatingKey;
    private String grandparentThumb;
    private String grandparentTitle;
    private Integer hasPremiumLyrics;
    private Integer index;
    private Integer librarySectionID;
    private String librarySectionKey;
    private String librarySectionTitle;
    private List<Media> media = new ArrayList<>(0);
    private String originalTitle;
    private String parentGuid;
    private Integer parentIndex;
    private String parentKey;
    private Integer parentRatingKey;
    private String parentStudio;
    private String parentThumb;
    private String parentTitle;
    private Integer parentYear;
    private Integer ratingCount;

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
    
    @Override
    public Track details() {
        SectionItemList mil = (SectionItemList) SectionItemList.build(SectionItemList.class, getClient(), contentUri(),
                getServer());
        return (Track) mil.getItems()
                .get(0);
    }
    
    public Long getDuration() {
        return duration;
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

    public String getGrandparentThumb() {
        return grandparentThumb;
    }

    public String getGrandparentTitle() {
        return grandparentTitle;
    }

    public Integer getHasPremiumLyrics() {
        return hasPremiumLyrics;
    }

    public Integer getIndex() {
        return index;
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

    public List<Media> getMedia() {
        return media;
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

    public String getParentStudio() {
        return parentStudio;
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

    public Integer getRatingCount() {
        return ratingCount;
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

    public void setDuration(Long duration) {
        this.duration = duration;
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

    public void setGrandparentThumb(String grandparentThumb) {
        this.grandparentThumb = grandparentThumb;
    }

    public void setGrandparentTitle(String grandparentTitle) {
        this.grandparentTitle = grandparentTitle;
    }

    public void setHasPremiumLyrics(Integer hasPremiumLyrics) {
        this.hasPremiumLyrics = hasPremiumLyrics;
    }

    public void setIndex(Integer index) {
        this.index = index;
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

    public void setMedia(List<Media> media) {
        this.media = media;
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

    public void setParentStudio(String parentStudio) {
        this.parentStudio = parentStudio;
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

    public void setRatingCount(Integer ratingCount) {
        this.ratingCount = ratingCount;
    }
}
