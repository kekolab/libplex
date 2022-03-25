package kekolab.libplex.entity;

import java.net.URI;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import kekolab.libplex.xmladapter.SectionItemXML;
import kekolab.libplex.xmladapter.TimestampAdapter;

public abstract class SectionItem extends SectionItemDirectory {
	private Integer ratingKey;
	private String guid;
	private String summary;
	private Date addedAt;
	private Date updatedAt;
	private Integer librarySectionID;
	private String librarySectionKey;
	private String librarySectionTitle;
	private Integer index;
	private List<Collection> collections = new ArrayList<Collection>(0);

	public abstract SectionItem details();

	protected SectionItem(SectionItemXML v) {
		setAddedAt(v.getAddedAt());
		setArt(v.getArt());
		setGuid(v.getGuid());
		setIndex(v.getIndex());
		setKey(v.getKey());
		setLibrarySectionID(v.getLibrarySectionID());
		setLibrarySectionKey(v.getLibrarySectionKey());
		setLibrarySectionTitle(v.getLibrarySectionTitle());
		setRatingKey(v.getRatingKey());
		setSummary(v.getSummary());
		setThumb(v.getThumb());
		setTitle(v.getTitle());
		setType(v.getType());
		setUpdatedAt(v.getUpdatedAt());
		setCollections(v.getCollections());
	}

	public URI sectionUri() {
		String librarySectionKey = getLibrarySectionKey();
		if (librarySectionKey != null)
			return getClient().uriBuilder().fromKey(librarySectionKey, null, getServer()).build();
		return null;
	}

	public abstract Section section();

	public URI ratingKeyUri() {
		return getClient().uriBuilder().fromKey("/library/metadata/{ratingKey}", getParent(), getServer()).build(getRatingKey());
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

	@XmlAttribute
	public void setRatingKey(Integer ratingKey) {
		this.ratingKey = ratingKey;
	}

	@XmlAttribute
	public void setGuid(String guid) {
		this.guid = guid;
	}

	@XmlAttribute
	public void setSummary(String summary) {
		this.summary = summary;
	}

	@XmlAttribute
	@XmlJavaTypeAdapter(TimestampAdapter.class)
	public void setAddedAt(Date addedAt) {
		this.addedAt = addedAt;
	}

	@XmlAttribute
	@XmlJavaTypeAdapter(TimestampAdapter.class)
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
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

	public void setLibrarySectionID(Integer librarySectionID) {
		this.librarySectionID = librarySectionID;
	}

	public void setLibrarySectionKey(String librarySectionKey) {
		this.librarySectionKey = librarySectionKey;
	}

	public void setLibrarySectionTitle(String librarySectionTitle) {
		this.librarySectionTitle = librarySectionTitle;
	}

	public Integer getIndex() {
		return index;
	}

	public void setIndex(Integer index) {
		this.index = index;
	}

	public List<Collection> getCollections() {
		return collections;
	}

	public void setCollections(List<Collection> collections) {
		this.collections = collections;
	}
}