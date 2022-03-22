package kekolab.libplex.entity;

import jakarta.xml.bind.annotation.XmlAttribute;

public class BaseDirectory extends PlexMediaServerItem {

	private String key;
	private String title;
	private String type;
	private PlexMediaServerItem parent;

	public BaseDirectory() {
		super();
	}

	protected void setParent(PlexMediaServerItem parent) {
		this.parent = parent;
	}

	protected PlexMediaServerItem getParent() {
		return parent;
	}

	public String getKey() {
		return key;
	}

	public String getTitle() {
		return title;
	}

	public String getType() {
		return type;
	}

	@XmlAttribute
	public void setKey(String key) {
		this.key = key;
	}

	@XmlAttribute
	public void setTitle(String title) {
		this.title = title;
	}

	@XmlAttribute
	public void setType(String type) {
		this.type = type;
	}

}