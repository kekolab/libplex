package libplex.plextv.entity;

import java.net.URI;
import java.util.List;

import jakarta.ws.rs.client.Client;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "MediaContainer")
@XmlAccessorType(XmlAccessType.NONE)
public class Library implements MediaContainer {
	@XmlAttribute private int size;
	@XmlAttribute private int allowSync;
	@XmlAttribute private String art;
	@XmlAttribute private String content;
	@XmlAttribute private String identifier;
	@XmlAttribute private String mediaTagPrefix;
	@XmlAttribute private String mediaTagVersion;
	@XmlAttribute private String title1;
	@XmlAttribute private String title2;
	@XmlElement(name = "Directory") private List<Directory<?>> directories;

	private URI uri;
	private Client client;
	private Server server;
	private Directory<Sections> sectionsDirectory;

	public Directory<Sections> sections() {
		if (sectionsDirectory == null)
			sectionsDirectory = directories.stream()
					.filter(d -> d.getKey()
							.equals("sections"))
					.map(d -> {
						Directory<Sections> ds = (Directory<Sections>) d;
						ds.setClient(client);
						ds.setParent(this);
						ds.setServer(server);
						return ds;
					})
					.findAny()
					.orElse(null);
		return sectionsDirectory;
	}

	@Override
	public void setUri(URI uri) {
		this.uri = uri;
	}

	@Override
	public URI getUri() {
		return uri;
	}

	@Override
	public void setClient(Client client) {
		this.client = client;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getAllowSync() {
		return allowSync;
	}

	public void setAllowSync(int allowSync) {
		this.allowSync = allowSync;
	}

	public String getArt() {
		return art;
	}

	public void setArt(String art) {
		this.art = art;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public String getMediaTagPrefix() {
		return mediaTagPrefix;
	}

	public void setMediaTagPrefix(String mediaTagPrefix) {
		this.mediaTagPrefix = mediaTagPrefix;
	}

	public String getMediaTagVersion() {
		return mediaTagVersion;
	}

	public void setMediaTagVersion(String mediaTagVersion) {
		this.mediaTagVersion = mediaTagVersion;
	}

	public String getTitle1() {
		return title1;
	}

	public void setTitle1(String title1) {
		this.title1 = title1;
	}

	public String getTitle2() {
		return title2;
	}

	public void setTitle2(String title2) {
		this.title2 = title2;
	}

	@Override
	public Server getServer() {
		return server;
	}

	@Override
	public void setServer(Server server) {
		this.server = server;
	}

}
