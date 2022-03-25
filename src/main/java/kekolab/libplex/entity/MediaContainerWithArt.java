package kekolab.libplex.entity;

import java.net.URI;

import jakarta.xml.bind.annotation.XmlAttribute;

public class MediaContainerWithArt extends SyncableMediaContainer {

	private String art;

	public MediaContainerWithArt() {
		super();
	}

	public URI artUri() {
	    String art = getArt();
	    if (art != null)
	        return getClient().uriBuilder()
	                .fromKey(art, this, getServer())
	                .build();
	    return null;
	}

	public String getArt() {
	    return art;
	}

	@XmlAttribute
	public void setArt(String art) {
	    this.art = art;
	}

}