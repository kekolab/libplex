package kekolab.libplex.entity;

import jakarta.xml.bind.annotation.XmlAttribute;

public class Collection extends Tag {
	private String guid;

	public String getGuid() {
		return guid;
	}

	@XmlAttribute
	public void setGuid(String guid) {
		this.guid = guid;
	}	
}
