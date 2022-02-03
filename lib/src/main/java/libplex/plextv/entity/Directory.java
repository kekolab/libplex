package libplex.plextv.entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public class Directory {
	@XmlAttribute
	private String key;
	@XmlAttribute
	private String title;
	@XmlAttribute
	private int count;

	public String getKey() {
		return key;
	}
}