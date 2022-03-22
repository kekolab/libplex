package kekolab.libplex.entity;

import java.net.URI;

import jakarta.xml.bind.annotation.XmlAttribute;

public class SectionItemDirectory extends BaseDirectory {
	private String art, thumb;
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

	public String getArt() {
		return art;
	}

	public String getThumb() {
		return thumb;
	}

	@XmlAttribute
	public void setArt(String art) {
		this.art = art;
	}

	@XmlAttribute
	public void setThumb(String thumb) {
		this.thumb = thumb;
	}
}
