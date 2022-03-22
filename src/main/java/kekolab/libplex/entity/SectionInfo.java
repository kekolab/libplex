package kekolab.libplex.entity;

import java.net.URI;
import java.util.Date;

import kekolab.libplex.xmladapter.SectionInfoXML;

public class SectionInfo extends Directory {
	private Integer allowSync, filters, refreshing, content, directory, contentChangedAt, hidden;
	private String composite, agent, scanner, language, uuid;
	private Date createdAt, scannedAt;
	private Location location;

	protected SectionInfo(SectionInfoXML xml) {
		setAllowSync(xml.getAllowSync());
		setFilters(xml.getFilters());
		setRefreshing(xml.getRefreshing());
		setContent(xml.getContent());
		setDirectory(xml.getDirectory());
		setContentChangedAt(xml.getContentChangedAt());
		setHidden(xml.getHidden());
		setArt(xml.getArt());
		setComposite(xml.getComposite());
		setThumb(xml.getThumb());
		setKey(xml.getKey());
		setType(xml.getType());
		setTitle(xml.getTitle());
		setAgent(xml.getAgent());
		setScanner(xml.getScanner());
		setLanguage(xml.getLanguage());
		setUuid(xml.getUuid());
		setCreatedAt(xml.getCreatedAt());
		setScannedAt(xml.getScannedAt());
		setLocation(xml.getLocation());
	}

	public URI compositeUri() {
		String composite = getComposite();
		if (composite != null)
			return getClient().uriBuilder()
					.fromKey(composite, getParent(), getServer())
					.build();
		return null;
	}

	public Integer getAllowSync() {
		return allowSync;
	}

	public Integer getFilters() {
		return filters;
	}

	public Integer getRefreshing() {
		return refreshing;
	}

	public Integer getContent() {
		return content;
	}

	public Integer getDirectory() {
		return directory;
	}

	public Integer getContentChangedAt() {
		return contentChangedAt;
	}

	public Integer getHidden() {
		return hidden;
	}

	public String getComposite() {
		return composite;
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

	public Date getCreatedAt() {
		return createdAt;
	}

	public Date getScannedAt() {
		return scannedAt;
	}

	public Location getLocation() {
		return location;
	}

	public void setAllowSync(Integer allowSync) {
		this.allowSync = allowSync;
	}

	public void setFilters(Integer filters) {
		this.filters = filters;
	}

	public void setRefreshing(Integer refreshing) {
		this.refreshing = refreshing;
	}

	public void setContent(Integer content) {
		this.content = content;
	}

	public void setDirectory(Integer directory) {
		this.directory = directory;
	}

	public void setContentChangedAt(Integer contentChangedAt) {
		this.contentChangedAt = contentChangedAt;
	}

	public void setHidden(Integer hidden) {
		this.hidden = hidden;
	}

	public void setComposite(String composite) {
		this.composite = composite;
	}

	public void setAgent(String agent) {
		this.agent = agent;
	}

	public void setScanner(String scanner) {
		this.scanner = scanner;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public void setScannedAt(Date scannedAt) {
		this.scannedAt = scannedAt;
	}

	public void setLocation(Location location) {
		this.location = location;
	}
}
