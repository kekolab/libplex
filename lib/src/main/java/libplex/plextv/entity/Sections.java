package libplex.plextv.entity;

import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "MediaContainer")
@XmlAccessorType(XmlAccessType.NONE)
public class Sections {
	private int size;
	private int allowSync;
	private String identifier;
	private String mediaTagPrefix;
	private String mediaTagVersion;
	private String title1;
	private List<Directory> directories;

	@XmlAttribute
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@XmlAttribute
	public int getAllowSync() {
		return allowSync;
	}

	public void setAllowSync(int allowSync) {
		this.allowSync = allowSync;
	}

	@XmlAttribute
	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	@XmlAttribute
	public String getMediaTagPrefix() {
		return mediaTagPrefix;
	}

	public void setMediaTagPrefix(String mediaTagPrefix) {
		this.mediaTagPrefix = mediaTagPrefix;
	}

	@XmlAttribute
	public String getMediaTagVersion() {
		return mediaTagVersion;
	}

	public void setMediaTagVersion(String mediaTagVersion) {
		this.mediaTagVersion = mediaTagVersion;
	}

	@XmlAttribute
	public String getTitle1() {
		return title1;
	}

	public void setTitle1(String title1) {
		this.title1 = title1;
	}

	@XmlElement(name = "Directory")
	public List<Directory> getDirectories() {
		return directories;
	}

	public void setDirectories(List<Directory> directories) {
		this.directories = directories;
	}
}
