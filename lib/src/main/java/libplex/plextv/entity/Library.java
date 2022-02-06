package libplex.plextv.entity;

import java.net.URI;

import jakarta.ws.rs.client.Client;

public class Library implements Parent {
	private int size;
	private int allowSync;
	private String art;
	private String content;
	private String identifier;
	private String mediaTagPrefix;
	private int mediaTagVersion;
	private String title1;
	private String title2;

	private MediaContainer mc;
	private URI uri;
	private Server server;
	private Client client;
	private Directory sectionsDirectory;
	private Directory onDeckDirectory;

	public Library(MediaContainer mc, URI uri, Server server, Client client) {
		this.mc = mc;
		this.uri = uri;
		this.server = server;
		this.client = client;
	}

	public Sections sections() {
		if (sectionsDirectory == null)
			sectionsDirectory = mc.getDirectories()
					.stream()
					.filter(d -> "sections".equals(d.getKey()))
					.findAny()
					.orElse(null);
		MediaContainer sectionsMediaContainer = sectionsDirectory.get(this, server, MediaContainer.class, client);
		return new Sections(sectionsMediaContainer, sectionsDirectory.getUri(), server, client);
	}

	public OnDeck onDeck() {
		if (onDeckDirectory == null)
			onDeckDirectory = mc.getDirectories()
					.stream()
					.filter(d -> "onDeck".equals(d.getKey()))
					.findAny()
					.orElse(null);
		MediaContainer onDeckMediaContainer = onDeckDirectory.get(this, server, MediaContainer.class, client);
		return new OnDeck(onDeckMediaContainer, onDeckDirectory.getUri(), server, client);
	}

	@Override
	public URI getUri() {
		return uri;
	}

}
