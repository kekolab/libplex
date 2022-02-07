package libplex.plex.entity;

import java.util.Date;
import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public class Directory {
    @XmlAttribute private String key;
    @XmlAttribute private String title;
    @XmlAttribute private int count;
    @XmlAttribute private int allowSync;
    @XmlAttribute private String art;
    @XmlAttribute private String composite;
    @XmlAttribute private int filters;
    @XmlAttribute private int refreshing;
    @XmlAttribute private String thumb;
    @XmlAttribute private String type;
    @XmlAttribute private String agent;
    @XmlAttribute private String scanner;
    @XmlAttribute private String language;
    @XmlAttribute private String uuid;
    @XmlAttribute
    @XmlJavaTypeAdapter(TimestampAdapter.class) private Date updatedAt;
    @XmlAttribute
    @XmlJavaTypeAdapter(TimestampAdapter.class) private Date createdAt;
    @XmlAttribute
    @XmlJavaTypeAdapter(TimestampAdapter.class) private Date scannedAt;
    @XmlAttribute private int content;
    @XmlAttribute private int directory;
    @XmlAttribute private String contentChangedAt;
    @XmlAttribute private int hidden;
    @XmlAttribute private int secondary;
    @XmlAttribute private String prompt;
    @XmlAttribute private int search;
    @XmlElement(name = "Location") private Location location;
    @XmlAttribute private int ratingKey;
    @XmlAttribute private String guid;
    @XmlAttribute private String summary;
    @XmlAttribute private int index;
    @XmlAttribute private int viewCount;
    @XmlAttribute private int skipCount;
    @XmlAttribute
    @XmlJavaTypeAdapter(TimestampAdapter.class) private Date lastViewedAt;
    @XmlAttribute
    @XmlJavaTypeAdapter(TimestampAdapter.class) private Date addedAt;
    @XmlAttribute private int albumSort;
    @XmlElement(name = "Genre") private List<Tag> genres;
    @XmlElement(name = "Country") private List<Tag> countries;
    @XmlAttribute private String parentRatingKey;
    @XmlAttribute private String parentGuid;
    @XmlAttribute private String studio;
    @XmlAttribute private String parentKey;
    @XmlAttribute private String parentTitle;
    @XmlAttribute private double rating;
    @XmlAttribute private int year;
    @XmlAttribute private String parentThumb;
    @XmlAttribute
    @XmlJavaTypeAdapter(TimestampAdapter.class) private Date originallyAvailableAt;
    @XmlAttribute private Integer loudnessAnalysisVersion;
    @XmlElement(name = "Director") private List<Tag> directors;

    private Parent parent;
    private Server server;

    public String getKey() {
	return key;
    }

    public String getTitle() {
	return title;
    }

    public int getCount() {
	return count;
    }

    public int getAllowSync() {
	return allowSync;
    }

    public String getArt() {
	return art;
    }

    public String getComposite() {
	return composite;
    }

    public int getFilters() {
	return filters;
    }

    public int getRefreshing() {
	return refreshing;
    }

    public String getThumb() {
	return thumb;
    }

    public String getType() {
	return type;
    }

    public String getAgent() {
	return agent;
    }

    public String getScanner() {
	return scanner;
    }

    public String getLanguage() {
	return language;
    }

    public String getUuid() {
	return uuid;
    }

    public Date getUpdatedAt() {
	return updatedAt;
    }

    public Date getCreatedAt() {
	return createdAt;
    }

    public Date getScannedAt() {
	return scannedAt;
    }

    public int getContent() {
	return content;
    }

    public int getDirectory() {
	return directory;
    }

    public String getContentChangedAt() {
	return contentChangedAt;
    }

    public int getHidden() {
	return hidden;
    }

    public int getSecondary() {
	return secondary;
    }

    public String getPrompt() {
	return prompt;
    }

    public int getSearch() {
	return search;
    }

    public String getSummary() {
	return summary;
    }

    public int getViewCount() {
	return viewCount;
    }

    public Date getLastViewedAt() {
	return lastViewedAt;
    }

    public Date getAddedAt() {
	return addedAt;
    }

    public Location getLocation() {
	return location;
    }

    public int getRatingKey() {
	return ratingKey;
    }

    public String getGuid() {
	return guid;
    }

    public int getIndex() {
	return index;
    }

    public int getSkipCount() {
	return skipCount;
    }

    public int getAlbumSort() {
	return albumSort;
    }

    public List<Tag> getGenres() {
	return genres;
    }

    public List<Tag> getCountries() {
	return countries;
    }

    public String getParentRatingKey() {
	return parentRatingKey;
    }

    public String getParentGuid() {
	return parentGuid;
    }

    public String getStudio() {
	return studio;
    }

    public String getParentKey() {
	return parentKey;
    }

    public String getParentTitle() {
	return parentTitle;
    }

    public double getRating() {
	return rating;
    }

    public int getYear() {
	return year;
    }

    public String getParentThumb() {
	return parentThumb;
    }

    public Date getOriginallyAvailableAt() {
	return originallyAvailableAt;
    }

    public int getLoudnessAnalysisVersion() {
	return loudnessAnalysisVersion;
    }

    public List<Tag> getDirectors() {
	return directors;
    }

    protected Parent getParent() {
	return parent;
    }

    protected Server getServer() {
	return server;
    }
}