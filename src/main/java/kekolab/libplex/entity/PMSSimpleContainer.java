package kekolab.libplex.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import kekolab.libplex.xmladapter.TimestampAdapter;

public abstract class PMSSimpleContainer extends ServerItem {
    private Integer size;
    private Integer mediaTagVersion;
    private String identifier;
    private String mediaTagPrefix;

    public Integer getSize() {
        return size;
    }

    public Integer getMediaTagVersion() {
        return mediaTagVersion;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getMediaTagPrefix() {
        return mediaTagPrefix;
    }

    
    @XmlAttribute public void setSize(Integer size) {
        this.size = size;
    }

    
    @XmlAttribute public void setMediaTagVersion(Integer mediaTagVersion) {
        this.mediaTagVersion = mediaTagVersion;
    }

    
    @XmlAttribute public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    
    @XmlAttribute public void setMediaTagPrefix(String mediaTagPrefix) {
        this.mediaTagPrefix = mediaTagPrefix;
    }
    
    @XmlRootElement(name = "MediaContainer")
    public static class MediaInfoList extends PMSSimpleContainer {
    	private List<? extends MediaInfo> items;

		public List<? extends MediaInfo> getItems() {
			return items;
		}

		@XmlElements({ @XmlElement(name = "Directory"), @XmlElement(name = "Video"), @XmlElement(name = "Track") })
		@XmlJavaTypeAdapter(value = MediaItemAdapter.class)
		@XmlAttribute public void setItems(List<? extends MediaInfo> items) {
			this.items = items;
		}
    }
    
    public static class MediaItemAdapter extends XmlAdapter<CompleteMediaInfo, MediaInfo> {

		@Override
		public MediaInfo unmarshal(CompleteMediaInfo v) throws Exception {
			switch(v.getType().toLowerCase()) {
			case "artist":
				return new ArtistInfo(v);
				break;
			case "album":
				return new AlbumInfo(v);
				break;
			case "track":
				return new TrackInfo(v);
				break;
			}
			return null;
		}

		@Override
		public CompleteMediaInfo marshal(MediaInfo v) throws Exception {
			// TODO Auto-generated method stub
			return null;
		}
    	
    }
    
    public static class CompleteMediaInfo {
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
        private List<PMSTag> countries = new ArrayList<>(0);
        private List<PMSTag> genres = new ArrayList<>(0);
        private List<PMSTag> directors = new ArrayList<>(0);
        private List<PMSMedia> media = new ArrayList<>(0);
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
		public List<PMSTag> getCountries() {
			return countries;
		}
		public List<PMSTag> getGenres() {
			return genres;
		}
		public List<PMSTag> getDirectors() {
			return directors;
		}
		public List<PMSMedia> getMedia() {
			return media;
		}
		@XmlAttribute public void setKey(String key) {
			this.key = key;
		}
		@XmlAttribute public void setArt(String art) {
			this.art = art;
		}
		@XmlAttribute public void setThumb(String thumb) {
			this.thumb = thumb;
		}
		@XmlAttribute public void setTitle(String title) {
			this.title = title;
		}
		@XmlAttribute public void setType(String type) {
			this.type = type;
		}
		@XmlAttribute public void setRatingKey(Integer ratingKey) {
			this.ratingKey = ratingKey;
		}
		@XmlAttribute public void setGuid(String guid) {
			this.guid = guid;
		}
		@XmlAttribute public void setSummary(String summary) {
			this.summary = summary;
		}
		@XmlAttribute @XmlJavaTypeAdapter(TimestampAdapter.class) public void setAddedAt(Date addedAt) {
			this.addedAt = addedAt;
		}
		@XmlAttribute @XmlJavaTypeAdapter(TimestampAdapter.class) public void setUpdatedAt(Date updatedAt) {
			this.updatedAt = updatedAt;
		}
		@XmlAttribute public void setViewCount(Integer viewCount) {
			this.viewCount = viewCount;
		}
		@XmlAttribute public void setSkipCount(Integer skipCount) {
			this.skipCount = skipCount;
		}
		@XmlAttribute public void setAlbumSort(Integer albumSort) {
			this.albumSort = albumSort;
		}
		@XmlAttribute @XmlJavaTypeAdapter(TimestampAdapter.class) public void setLastViewedAt(Date lastViewedAt) {
			this.lastViewedAt = lastViewedAt;
		}
		@XmlAttribute public void setYear(Integer year) {
			this.year = year;
		}
		@XmlAttribute public void setLoudnessAnalysisVersion(Integer loudnessAnalysisVersion) {
			this.loudnessAnalysisVersion = loudnessAnalysisVersion;
		}
		@XmlAttribute public void setStudio(String studio) {
			this.studio = studio;
		}
		@XmlAttribute public void setRating(Double rating) {
			this.rating = rating;
		}
		@XmlAttribute public void setOriginallyAvailableAt(Date originallyAvailableAt) {
			this.originallyAvailableAt = originallyAvailableAt;
		}
		@XmlAttribute public void setGrandparentRatingKey(Integer grandparentRatingKey) {
			this.grandparentRatingKey = grandparentRatingKey;
		}
		@XmlAttribute public void setParentIndex(Integer parentIndex) {
			this.parentIndex = parentIndex;
		}
		@XmlAttribute public void setRatingCount(Integer ratingCount) {
			this.ratingCount = ratingCount;
		}
		@XmlAttribute public void setParentYear(Integer parentYear) {
			this.parentYear = parentYear;
		}
		@XmlAttribute public void setGrandparentGuid(String grandparentGuid) {
			this.grandparentGuid = grandparentGuid;
		}
		@XmlAttribute public void setParentStudio(String parentStudio) {
			this.parentStudio = parentStudio;
		}
		@XmlAttribute public void setGrandparentKey(String grandparentKey) {
			this.grandparentKey = grandparentKey;
		}
		@XmlAttribute public void setGrandparentTitle(String grandparentTitle) {
			this.grandparentTitle = grandparentTitle;
		}
		@XmlAttribute public void setGrandparentThumb(String grandparentThumb) {
			this.grandparentThumb = grandparentThumb;
		}
		@XmlAttribute public void setGrandparentArt(String grandparentArt) {
			this.grandparentArt = grandparentArt;
		}
		@XmlAttribute public void setDuration(Long duration) {
			this.duration = duration;
		}
		@XmlAttribute public void setIndex(Integer index) {
			this.index = index;
		}
		@XmlAttribute public void setParentRatingKey(Integer parentRatingKey) {
			this.parentRatingKey = parentRatingKey;
		}
		@XmlAttribute public void setParentGuid(String parentGuid) {
			this.parentGuid = parentGuid;
		}
		@XmlAttribute public void setParentKey(String parentKey) {
			this.parentKey = parentKey;
		}
		@XmlAttribute public void setParentTitle(String parentTitle) {
			this.parentTitle = parentTitle;
		}
		@XmlAttribute public void setParentThumb(String parentThumb) {
			this.parentThumb = parentThumb;
		}
		@XmlElement(name = "Country") public void setCountries(List<PMSTag> countries) {
			this.countries = countries;
		}
		@XmlElement(name = "Genre") public void setGenres(List<PMSTag> genres) {
			this.genres = genres;
		}
		@XmlElement(name = "Director") public void setDirectors(List<PMSTag> directors) {
			this.directors = directors;
		}
		@XmlElement(name = "Media") public void setMedia(List<PMSMedia> media) {
			this.media = media;
		}           
    }
}