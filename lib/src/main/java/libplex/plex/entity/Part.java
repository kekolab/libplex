package libplex.plex.entity;

import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public class Part {
	@XmlAttribute private int id;
	@XmlAttribute private String key;
	@XmlAttribute private int duration;
	@XmlAttribute private String file;
	@XmlAttribute private int size;
	@XmlAttribute private String container;
	@XmlAttribute private int hasThumbnail;
	@XmlElement(name = "Stream") private List<Stream> streams;

	public int getId() {
		return id;
	}

	public String getKey() {
		return key;
	}

	public int getDuration() {
		return duration;
	}

	public String getFile() {
		return file;
	}

	public int getSize() {
		return size;
	}

	public String getContainer() {
		return container;
	}

	public int getHasThumbnail() {
		return hasThumbnail;
	}

	public List<Stream> getStreams() {
		return streams;
	}
}
