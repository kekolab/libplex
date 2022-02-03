package libplex.plextv.entity;

import java.io.IOException;
import java.util.List;

import jakarta.ws.rs.client.Client;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "MediaContainer")
public class Library implements Parent {
	private int size;
	private int allowSync;
	private String art;
	private String content;
	private String identifier;
	private String mediaTagPrefix;
	private String mediaTagversion;
	private String title1;
	private String title2;
	private List<Directory> directories;
	private Client client;
	private Server server;
	private Parent parent;

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
	public String getArt() {
		return art;
	}

	public void setArt(String art) {
		this.art = art;
	}

	@XmlAttribute
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
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
	public String getMediaTagversion() {
		return mediaTagversion;
	}

	public void setMediaTagversion(String mediaTagversion) {
		this.mediaTagversion = mediaTagversion;
	}

	@XmlAttribute
	public String getTitle1() {
		return title1;
	}

	public void setTitle1(String title1) {
		this.title1 = title1;
	}

	@XmlAttribute
	public String getTitle2() {
		return title2;
	}

	public void setTitle2(String title2) {
		this.title2 = title2;
	}

	@XmlElement(name = "Directory")
	public List<Directory> getDirectories() {
		return directories;
	}

	public void setDirectories(List<Directory> directories) {
		this.directories = directories;
	}

	public Library setClient(Client client) {
		this.client = client;
		return this;
	}

	public Sections sections() throws IOException {
		return directories.stream()
				.filter(d -> d.getKey()
						.equals("sections"))
				.map(d -> new DirectoryService<Sections>(client, d, this, server))
				.findAny()
				.get()
				.get(Sections.class)
				.setClient(client)
				.setParent();
	}

	public Library setParent(Parent parent) {
		this.parent = parent;
		return this;
	}
}
