package libplex.plex.entity;

import java.util.Date;
import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import libplex.plex.entity.adapter.TimestampAdapter;

@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public class Directory {
    @XmlAttribute private String key;
    @XmlAttribute private String title;
    @XmlAttribute private Integer count;
    @XmlAttribute private Integer allowSync;
    @XmlAttribute private String art;
    @XmlAttribute private String composite;
    @XmlAttribute private Integer filters;
    @XmlAttribute private Integer refreshing;
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
    @XmlAttribute private Integer content;
    @XmlAttribute private Integer directory;
    @XmlAttribute private String contentChangedAt;
    @XmlAttribute private Integer hidden;
    @XmlAttribute private Integer secondary;
    @XmlAttribute private String prompt;
    @XmlAttribute private Integer search;
    @XmlElement(name = "Location") private Location location;
    @XmlAttribute private Integer ratingKey;
    @XmlAttribute private String guid;
    @XmlAttribute private String summary;
    @XmlAttribute private Integer index;
    @XmlAttribute private Integer viewCount;
    @XmlAttribute private Integer skipCount;
    @XmlAttribute
    @XmlJavaTypeAdapter(TimestampAdapter.class) private Date lastViewedAt;
    @XmlAttribute
    @XmlJavaTypeAdapter(TimestampAdapter.class) private Date addedAt;
    @XmlAttribute private Integer albumSort;
    @XmlElement(name = "Genre") private List<Tag> genres;
    @XmlElement(name = "Country") private List<Tag> countries;
    @XmlElement(name = "Style") private List<Tag> styles;
    @XmlElement(name = "Similar") private List<Tag> similars;
    @XmlElement(name = "Mood") private List<Tag> moods;
    @XmlAttribute private Integer parentRatingKey;
    @XmlAttribute private String parentGuid;
    @XmlAttribute private String studio;
    @XmlAttribute private String parentKey;
    @XmlAttribute private String parentTitle;
    @XmlAttribute private Double rating;
    @XmlAttribute private Integer year;
    @XmlAttribute private String parentThumb;
    @XmlAttribute private Date originallyAvailableAt;
    @XmlAttribute private Integer loudnessAnalysisVersion;
    @XmlElement(name = "Director") private List<Tag> directors;
    @XmlAttribute private String librarySectionKey;
    @XmlAttribute private Integer librarySectionID;
    @XmlAttribute private Integer leafCount;
    @XmlAttribute private Integer viewedLeafCount;

    public String getKey() {
        return key;
    }

    public String getTitle() {
        return title;
    }

    public Integer getCount() {
        return count;
    }

    public Integer getAllowSync() {
        return allowSync;
    }

    public String getArt() {
        return art;
    }

    public String getComposite() {
        return composite;
    }

    public Integer getFilters() {
        return filters;
    }

    public Integer getRefreshing() {
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

    public Integer getContent() {
        return content;
    }

    public Integer getDirectory() {
        return directory;
    }

    public String getContentChangedAt() {
        return contentChangedAt;
    }

    public Integer getHidden() {
        return hidden;
    }

    public Integer getSecondary() {
        return secondary;
    }

    public String getPrompt() {
        return prompt;
    }

    public Integer getSearch() {
        return search;
    }

    public Location getLocation() {
        return location;
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

    public Integer getIndex() {
        return index;
    }

    public Integer getViewCount() {
        return viewCount;
    }

    public Integer getSkipCount() {
        return skipCount;
    }

    public Date getLastViewedAt() {
        return lastViewedAt;
    }

    public Date getAddedAt() {
        return addedAt;
    }

    public Integer getAlbumSort() {
        return albumSort;
    }

    public List<Tag> getGenres() {
        return genres;
    }

    public List<Tag> getCountries() {
        return countries;
    }

    public Integer getParentRatingKey() {
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

    public Double getRating() {
        return rating;
    }

    public Integer getYear() {
        return year;
    }

    public String getParentThumb() {
        return parentThumb;
    }

    public Date getOriginallyAvailableAt() {
        return originallyAvailableAt;
    }

    public Integer getLoudnessAnalysisVersion() {
        return loudnessAnalysisVersion;
    }

    public List<Tag> getDirectors() {
        return directors;
    }

    public List<Tag> getStyles() {
        return styles;
    }

    public List<Tag> getSimilars() {
        return similars;
    }

    public List<Tag> getMoods() {
        return moods;
    }

    public String getLibrarySectionKey() {
        return librarySectionKey;
    }

    public Integer getLibrarySectionID() {
        return librarySectionID;
    }

    public Integer getLeafCount() {
        return leafCount;
    }

    public Integer getViewedtLeafCount() {
        return viewedLeafCount;
    }
}