package libplex.plextv.entity;

import java.net.URI;
import java.util.Date;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.core.UriBuilder;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public class Directory<A extends MediaContainer> {
	@XmlAttribute private String key;
	@XmlAttribute private String title;
	@XmlAttribute private int count;
	@XmlAttribute private int allowSync;
	@XmlAttribute private String art;
	@XmlAttribute private String composite;
	@XmlAttribute private int filters;
	@XmlAttribute private int refreshing;
	@XmlAttribute private String thumb;
	@XmlAttribute private String type;
	@XmlAttribute private String agent;
	@XmlAttribute private String scanner;
	@XmlAttribute private String language;
	@XmlAttribute private String uuid;
	@XmlAttribute private Date updatedAt; // TODO
	@XmlAttribute private Date createdAt;
	@XmlAttribute private Date scannedAt;
	@XmlAttribute private int content;
	@XmlAttribute private int directory;
	@XmlAttribute private String contentChangedAt;
	@XmlAttribute private int hidden;
	@XmlAttribute private int secondary;
	@XmlAttribute private String prompt;
	@XmlAttribute private int search;
	@XmlElement(name = "Location") private Location location;

	private MediaContainer parent;
	private Server server;
	private URI uri;
	private Client client;

	protected URI getUri() {
		if (uri == null) {
			UriBuilder uriBuilder;
			if (key.startsWith("/"))
				uriBuilder = UriBuilder.fromUri(server.getUri());
			else
				uriBuilder = UriBuilder.fromUri(parent.getUri());
			uri = uriBuilder.path(key)
					.build();
		}
		return uri;
	}

	protected MediaContainer getParent() {
		return parent;
	}

	public A get(Class<A> clz) {
		A mc = client.target(getUri())
				.request()
				.get(clz);
		mc.setUri(getUri());
		mc.setClient(client);
		mc.setServer(server);
		return mc;
	}

	protected void setClient(Client client) {
		this.client = client;
	}

	protected Client getClient() {
		return client;
	}

	public void setParent(MediaContainer parent) {
		this.parent = parent;
	}

	public void setServer(Server server) {
		this.server = server;
	}

	protected String getKey() {
		return key;
	}

	protected void setKey(String key) {
		this.key = key;
	}

	protected String getTitle() {
		return title;
	}

	protected void setTitle(String title) {
		this.title = title;
	}

	protected int getCount() {
		return count;
	}

	protected void setCount(int count) {
		this.count = count;
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

	public String getComposite() {
		return composite;
	}

	public void setComposite(String composite) {
		this.composite = composite;
	}

	public int getFilters() {
		return filters;
	}

	public void setFilters(int filters) {
		this.filters = filters;
	}

	public int getRefreshing() {
		return refreshing;
	}

	public void setRefreshing(int refreshing) {
		this.refreshing = refreshing;
	}

	public String getThumb() {
		return thumb;
	}

	public void setThumb(String thumb) {
		this.thumb = thumb;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAgent() {
		return agent;
	}

	public void setAgent(String agent) {
		this.agent = agent;
	}

	public String getScanner() {
		return scanner;
	}

	public void setScanner(String scanner) {
		this.scanner = scanner;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getScannedAt() {
		return scannedAt;
	}

	public void setScannedAt(Date scannedAt) {
		this.scannedAt = scannedAt;
	}

	public int getContent() {
		return content;
	}

	public void setContent(int content) {
		this.content = content;
	}

	public String getContentChangedAt() {
		return contentChangedAt;
	}

	public void setContentChangedAt(String contentChangedAt) {
		this.contentChangedAt = contentChangedAt;
	}

	public int getHidden() {
		return hidden;
	}

	public void setHidden(int hidden) {
		this.hidden = hidden;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public void setUri(URI uri) {
		this.uri = uri;
	}

	public int getDirectory() {
		return directory;
	}

	public void setDirectory(int directory) {
		this.directory = directory;
	}

	protected Server getServer() {
		return server;
	}

	public int getSecondary() {
		return secondary;
	}

	public void setSecondary(int secondary) {
		this.secondary = secondary;
	}

	public String getPrompt() {
		return prompt;
	}

	public void setPrompt(String prompt) {
		this.prompt = prompt;
	}

	public int getSearch() {
		return search;
	}

	public void setSearch(int search) {
		this.search = search;
	}
}