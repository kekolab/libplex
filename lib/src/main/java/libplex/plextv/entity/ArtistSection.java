package libplex.plextv.entity;

import java.net.URI;
import java.util.List;

import jakarta.ws.rs.client.Client;

public class ArtistSection implements Parent {
	private int size;
	private int allowSync;
	private String art;
	private String content;
	private String identifier;
	private int librarySectionID;
	private String mediaTagPrefix;
	private int mediaTagVersion;
	private int nocache;
	private String thumb;
	private String title1;
	private String viewGroup;
	private int viewMode;

	private MediaContainer mc;
	private URI uri;
	private Server server;
	private Client client;

	public ArtistSection(MediaContainer mc, URI uri, Server server, Client client) {
		this.mc = mc;
		this.uri = uri;
		this.server = server;
		this.client = client;
	}

	@Override
	public URI getUri() {
		return uri;
	}

	// TODO
	public List<Void> searchForTracks(String query) {
		mc.getDirectories()
				.stream()
				.filter(d -> "Search for Tracks".equals(d.getPrompt()))
				.findAny()
				.get()
				.query(this, server, MediaContainer.class, query, client);
		return null; // TODO
	}

	// TODO
	public List<Void> searchForArtists(String query) {
		mc.getDirectories()
				.stream()
				.filter(d -> "Search for Artists".equals(d.getPrompt()))
				.findAny()
				.get()
				.query(this, server, MediaContainer.class, query, client);
		return null;
	}

	// TODO
	public List<Void> allArtists() {
		mc.getDirectories()
				.stream()
				.filter(d -> "all".equals(d.getKey()))
				.findAny()
				.get()
				.get(this, server, MediaContainer.class, client);
		return null;
	}

}
