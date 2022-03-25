package kekolab.libplex.entity;

import java.net.URI;
import java.util.Date;
import java.util.List;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import kekolab.libplex.xmladapter.TimestampAdapter;

public class Playlist extends BaseDirectory {
	private Integer ratingKey, smart, viewCount, leafCount;
	private String guid, summary, playlistType, composite;
	private Date lastViewedAt, addedAt, updatedAt;
	private Long duration;
	
	public List<? extends SectionItem> items() {
		SectionItemList itemList = (SectionItemList) SectionItemList.build(SectionItemList.class, getClient(), keyUri());
		return itemList.getItems();
	}
	
	public URI compositeUri() {
		return getClient().uriBuilder().fromKey(getComposite(), getParent(), getServer()).build();
	}
	
	public Integer getRatingKey() {
		return ratingKey;
	}
	public Integer getSmart() {
		return smart;
	}
	public Integer getViewCount() {
		return viewCount;
	}
	public Integer getLeafCount() {
		return leafCount;
	}
	public String getGuid() {
		return guid;
	}
	public String getSummary() {
		return summary;
	}
	public String getPlaylistType() {
		return playlistType;
	}
	public String getComposite() {
		return composite;
	}
	public Date getLastViewedAt() {
		return lastViewedAt;
	}
	public Date getAddedAt() {
		return addedAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public Long getDuration() {
		return duration;
	}
	@XmlAttribute
	public void setRatingKey(Integer ratingKey) {
		this.ratingKey = ratingKey;
	}
	@XmlAttribute
	public void setSmart(Integer smart) {
		this.smart = smart;
	}
	@XmlAttribute
	public void setViewCount(Integer viewCount) {
		this.viewCount = viewCount;
	}
	@XmlAttribute
	public void setLeafCount(Integer leafCount) {
		this.leafCount = leafCount;
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
	public void setPlaylistType(String playlistType) {
		this.playlistType = playlistType;
	}
	@XmlAttribute
	public void setComposite(String composite) {
		this.composite = composite;
	}
	@XmlAttribute
	@XmlJavaTypeAdapter(TimestampAdapter.class)
	public void setLastViewedAt(Date lastViewedAt) {
		this.lastViewedAt = lastViewedAt;
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
	@XmlAttribute
	public void setDuration(Long duration) {
		this.duration = duration;
	}
	
	
}
