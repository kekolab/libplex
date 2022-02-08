package libplex.plex.entity;

import java.util.Date;
import java.util.List;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import libplex.plex.entity.adapter.TimestampAdapter;

public class Track {
	@XmlAttribute private Integer ratingKey;
	@XmlAttribute private String key;
	@XmlAttribute private Integer parentRatingKey;
	@XmlAttribute private Integer grandparentRatingKey;
	@XmlAttribute private String guid;
	@XmlAttribute private String parentGuid;
	@XmlAttribute private String grandparentGuid;
	@XmlAttribute private String parentStudio;
	@XmlAttribute private String type;
	@XmlAttribute private String title;
	@XmlAttribute private String grandparentKey;
	@XmlAttribute private String parentKey;
	@XmlAttribute private String grandparentTitle;
	@XmlAttribute private String parentTitle;
	@XmlAttribute private String summary;
	@XmlAttribute private Integer index;
	@XmlAttribute private Integer parentIndex;
	@XmlAttribute private Integer ratingCount;
	@XmlAttribute private Integer parentYear;
	@XmlAttribute private String thumb;
	@XmlAttribute private String art;
	@XmlAttribute private String parentThumb;
	@XmlAttribute private String grandparentThumb;
	@XmlAttribute private String grandparentArt;
	@XmlAttribute private Integer duration;
	@XmlAttribute
	@XmlJavaTypeAdapter(TimestampAdapter.class) private Date addedAt;
	@XmlAttribute
	@XmlJavaTypeAdapter(TimestampAdapter.class) private Date updatedAt;
	@XmlElement(name = "Media") private List<Media> media;
	@XmlAttribute private String librarySectionTitle;
	@XmlAttribute private Integer librarySectionID;
	@XmlAttribute private String librarySectionKey;
	@XmlAttribute private Integer hasPremiumLyrics;

	public String getKey() {
		return key;
	}

	public String getTitle() {
		return title;
	}

	public String getGrandParentKey() {
		return grandparentKey;
	}

	public String getParentKey() {
		return parentKey;
	}

	public String getLibrarySectionKey() {
		return librarySectionKey;
	}

	public String getThumb() {
		return thumb;
	}

	public String getArt() {
		return art;
	}

	public int getDuration() {
		return duration;
	}

	public Date getAddedAt() {
		return addedAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public int getHasPremiumLyrics() {
		return hasPremiumLyrics;
	}

	public Integer getRatingKey() {
		return ratingKey;
	}

	public Integer getGrandParentRatingKey() {
		return grandparentRatingKey;
	}

	public Integer getParentRatingKey() {
		return parentRatingKey;
	}

	public Integer getGrandparentRatingKey() {
		return grandparentRatingKey;
	}

	public String getGuid() {
		return guid;
	}

	public String getParentGuid() {
		return parentGuid;
	}

	public String getGrandparentGuid() {
		return grandparentGuid;
	}

	public String getParentStudio() {
		return parentStudio;
	}

	public String getType() {
		return type;
	}

	public String getGrandparentKey() {
		return grandparentKey;
	}

	public String getGrandparentTitle() {
		return grandparentTitle;
	}

	public String getParentTitle() {
		return parentTitle;
	}

	public String getSummary() {
		return summary;
	}

	public Integer getIndex() {
		return index;
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

	public String getParentThumb() {
		return parentThumb;
	}

	public String getGrandparentThumb() {
		return grandparentThumb;
	}

	public String getGrandparentArt() {
		return grandparentArt;
	}

	public List<Media> getMedia() {
		return media;
	}

	public String getLibrarySectionTitle() {
		return librarySectionTitle;
	}

	public Integer getLibrarySectionID() {
		return librarySectionID;
	}
}
