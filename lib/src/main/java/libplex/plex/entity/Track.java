package libplex.plex.entity;

import java.util.Date;
import java.util.List;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import libplex.Plex;

public class Track extends Medium {
	public Track(Directory d, Server server, Plex plex) {
		super(d, server, plex);
	}

	@XmlAttribute private int ratingKey;
	@XmlAttribute private String key;
	@XmlAttribute private int parentRatingKey;
	@XmlAttribute private int grandparentRatingKey;
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
	@XmlAttribute private int index;
	@XmlAttribute private int parentIndex;
	@XmlAttribute private int ratingCount;
	@XmlAttribute private int parentYear;
	@XmlAttribute private String thumb;
	@XmlAttribute private String art;
	@XmlAttribute private String parentThumb;
	@XmlAttribute private String grandparentThumb;
	@XmlAttribute private String grandparentArt;
	@XmlAttribute private int duration;
	@XmlAttribute
	@XmlJavaTypeAdapter(TimestampAdapter.class) private Date addedAt;
	@XmlAttribute
	@XmlJavaTypeAdapter(TimestampAdapter.class) private Date updatedAt;
	@XmlElement(name = "Media") private List<Media> media;
	@XmlAttribute private String librarySectionTitle;
	@XmlAttribute private int librarySectionID;
	@XmlAttribute private String librarySectionKey;
	@XmlAttribute private int hasPremiumLyrics;
}
