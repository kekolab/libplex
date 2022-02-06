package libplex.plextv.entity;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import jakarta.ws.rs.client.Client;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "MediaContainer")
@XmlAccessorType(XmlAccessType.NONE)
public class Sections implements MediaContainer {
	@XmlAttribute private int size;
	@XmlAttribute private int allowSync;
	@XmlAttribute private String identifier;
	@XmlAttribute private String mediaTagPrefix;
	@XmlAttribute private String mediaTagVersion;
	@XmlAttribute private String title1;
	@XmlElement(name = "Directory") private List<Directory<? extends MediaContainer>> directories;

	private Client client;
	private Server server;
	private URI uri;
	private List<Directory<ArtistSection>> artistSections;

	public List<Directory<ArtistSection>> artistSections() {
		if (artistSections == null) {
			artistSections = directories.stream()
					.filter(d -> d.getType()
							.equals("artist"))
					.map(d -> {
						Directory<ArtistSection> das = (Directory<ArtistSection>) d;
						das.setClient(client);
						das.setParent(this);
						das.setServer(server);
						return das;
					})
					.collect(Collectors.toList());
		}
		return artistSections;
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

	@Override
	public Server getServer() {
		return server;
	}

	@Override
	public void setServer(Server server) {
		this.server = server;
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

}
