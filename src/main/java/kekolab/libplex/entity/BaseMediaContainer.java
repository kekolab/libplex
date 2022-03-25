package kekolab.libplex.entity;

import jakarta.xml.bind.annotation.XmlAttribute;

public class BaseMediaContainer extends PlexMediaServerItem {

	private Integer size;

	public BaseMediaContainer() {
		super();
	}

	public Integer getSize() {
	    return size;
	}

	@XmlAttribute
	public void setSize(Integer size) {
	    this.size = size;
	}

}