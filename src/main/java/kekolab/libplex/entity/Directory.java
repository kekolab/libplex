package kekolab.libplex.entity;

import java.net.URI;

import jakarta.xml.bind.annotation.XmlAttribute;

public abstract class Directory extends PlexMediaServerItem {
	private String key, art, thumb, title, type;
	private PlexMediaServerItem parent;

	protected void setParent(PlexMediaServerItem parent) {
		this.parent = parent;
	}

	protected PlexMediaServerItem getParent() {
		return parent;
	}

	protected URI contentUri() {
		return getClient().uriBuilder()
				.fromKey(getKey(), getParent(), getServer())
				.build();
	}

	public URI artUri() {
		String art = getArt();
		if (art != null)    		
			return getClient().uriBuilder()
					.fromKey(art, getParent(), getServer())
					.build();
		return null;
	}

	public URI thumbUri() {
		String thumb = getThumb();
		if (thumb != null)
			return getClient().uriBuilder()
					.fromKey(thumb, getParent(), getServer())
					.build();
		return null;
	}

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

	@XmlAttribute
	public void setKey(String key) {
		this.key = key;
	}

	@XmlAttribute
	public void setArt(String art) {
		this.art = art;
	}

	@XmlAttribute
	public void setThumb(String thumb) {
		this.thumb = thumb;
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
