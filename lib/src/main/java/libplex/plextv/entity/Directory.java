package libplex.plextv.entity;

import java.net.URI;
import java.util.Date;
import java.util.regex.Pattern;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.core.UriBuilder;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public class Directory {
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
	@XmlAttribute
	@XmlJavaTypeAdapter(TimestampAdapter.class) private Date updatedAt;
	@XmlAttribute
	@XmlJavaTypeAdapter(TimestampAdapter.class) private Date createdAt;
	@XmlAttribute
	@XmlJavaTypeAdapter(TimestampAdapter.class) private Date scannedAt;
	@XmlAttribute private int content;
	@XmlAttribute private int directory;
	@XmlAttribute private String contentChangedAt;
	@XmlAttribute private int hidden;
	@XmlAttribute private int secondary;
	@XmlAttribute private String prompt;
	@XmlAttribute private int search;
	@XmlElement(name = "Location") private Location location;

	private URI uri;
	private Parent parent;
	private Server server;

	public MediaContainer get(Parent parent, Server server, Class<MediaContainer> clz, Client client) {
		this.parent = parent;
		this.server = server;
		return client.target(getUri())
				.request()
				.get(clz);
	}

	public MediaContainer query(Parent parent, Server server, Class<MediaContainer> clz, String query, Client client) {
		this.parent = parent;
		this.server = server;
		return client.target(UriBuilder.fromUri(getUri())
				.queryParam("query", query)
				.build())
				.request()
				.get(clz);
	}

	public String getKey() {
		return key;
	}

	public String getTitle() {
		return title;
	}

	public int getCount() {
		return count;
	}

	public int getAllowSync() {
		return allowSync;
	}

	public String getArt() {
		return art;
	}

	public String getComposite() {
		return composite;
	}

	public int getFilters() {
		return filters;
	}

	public int getRefreshing() {
		return refreshing;
	}

	public String getThumb() {
		return thumb;
	}

	public String getType() {
		return type;
	}

	public String getAgent() {
		return agent;
	}

	public String getScanner() {
		return scanner;
	}

	public String getLanguage() {
		return language;
	}

	public String getUuid() {
		return uuid;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public Date getScannedAt() {
		return scannedAt;
	}

	public int getContent() {
		return content;
	}

	public int getDirectory() {
		return directory;
	}

	public String getContentChangedAt() {
		return contentChangedAt;
	}

	public int getHidden() {
		return hidden;
	}

	public int getSecondary() {
		return secondary;
	}

	public String getPrompt() {
		return prompt;
	}

	public int getSearch() {
		return search;
	}

	public URI getUri() {
		if (uri == null) {
			UriBuilder uriBuilder;
			if (key.startsWith("/"))
				uriBuilder = UriBuilder.fromUri(server.getUri());
			else
				uriBuilder = UriBuilder.fromUri(parent.getUri());

			if (!key.contains("?")) {
				uri = uriBuilder.path(key)
						.build();
			} else {
				String[] split = key.split(Pattern.quote("?"));
				uriBuilder.path(split[0]);
				split = split[1].split(Pattern.quote("="));
				uriBuilder.queryParam(split[0], split[1]);
				uri = uriBuilder.build();
			}
		}
		return uri;
	}
}