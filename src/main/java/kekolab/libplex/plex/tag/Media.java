package kekolab.libplex.plex.tag;

import java.util.Collections;
import java.util.List;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;

public class Media {
	@XmlAttribute private Integer id;
	@XmlAttribute private Integer duration;
	@XmlAttribute private Integer bitrate;
	@XmlAttribute private Integer audioChannels;
	@XmlAttribute private String audioCodec;
	@XmlAttribute private String container;
	@XmlElement(name = "Part") private List<Part> parts;

	public Integer getId() {
		return id;
	}

	public Integer getDuration() {
		return duration;
	}

	public Integer getBitrate() {
		return bitrate;
	}

	public Integer getAudioChannels() {
		return audioChannels;
	}

	public String getAudioCodec() {
		return audioCodec;
	}

	public String getContainer() {
		return container;
	}

	public List<Part> getParts() {
		return parts != null ? parts : Collections.emptyList();
	}
}
