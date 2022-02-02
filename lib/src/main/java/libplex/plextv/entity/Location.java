package libplex.plextv.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public class Location {
	private int id;
	private String path;

	@XmlAttribute
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@XmlAttribute
	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

}
