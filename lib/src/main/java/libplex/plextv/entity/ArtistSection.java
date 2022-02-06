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
public class ArtistSection implements MediaContainer {
	@XmlAttribute private int size;
	@XmlAttribute private int allowSync;
	@XmlAttribute private String art;
	@XmlAttribute private String content;
	@XmlAttribute private String identifier;
	@XmlAttribute private int librarySectionID;
	@XmlAttribute private String mediaTagPrefix;
	@XmlAttribute private String mediaTagVersion;
	@XmlAttribute private int nocache;
	@XmlAttribute private String thumb;
	@XmlAttribute private String title1;
	@XmlAttribute private String viewGroup;
	@XmlAttribute private int viewMode;
	@XmlElement(name = "Directory") List<Directory<? extends MediaContainer>> directories;
	private URI uri;
	private Server server;
	private Client client;
	private SearchDirectory<Tracks> searchTracks;

	public SearchDirectory<Tracks> searchTracks() {
		if (searchTracks == null) {
			searchTracks = directories.stream()
					.filter(d -> "Search for Tracks".equals(d.getPrompt()))
					.map(d -> {
						SearchDirectory<Tracks> sd = new SearchDirectory<>();
						sd.setClient(client);
						sd.setParent(this);
						sd.setServer(server);
						sd.setKey(d.getKey());
						return sd;
					})
					.findAny()
					.orElse(null);
		}
		return searchTracks;
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

	public int getLibrarySectionID() {
		return librarySectionID;
	}

	public void setLibrarySectionID(int librarySectionID) {
		this.librarySectionID = librarySectionID;
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

	public int getNocache() {
		return nocache;
	}

	public void setNocache(int nocache) {
		this.nocache = nocache;
	}

	public String getThumb() {
		return thumb;
	}

	public void setThumb(String thumb) {
		this.thumb = thumb;
	}

	public String getTitle1() {
		return title1;
	}

	public void setTitle1(String title1) {
		this.title1 = title1;
	}

	public String getViewGroup() {
		return viewGroup;
	}

	public void setViewGroup(String viewGroup) {
		this.viewGroup = viewGroup;
	}

	public int getViewMode() {
		return viewMode;
	}

	public void setViewMode(int viewMode) {
		this.viewMode = viewMode;
	}

}
