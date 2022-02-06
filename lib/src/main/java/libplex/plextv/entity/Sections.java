package libplex.plextv.entity;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import jakarta.ws.rs.client.Client;

public class Sections implements Parent {
	private int size;
	private int allowSync;
	private String identifier;
	private String mediaTagPrefix;
	private int mediaTagVersion;
	private String title1;
	private Location location;

	private MediaContainer mc;
	private URI uri;
	private Server server;
	private Client client;

	public Sections(MediaContainer mc, URI uri, Server server, Client client) {
		this.mc = mc;
		this.uri = uri;
		this.server = server;
		this.client = client;
	}

	@Override
	public URI getUri() {
		return uri;
	}

	public List<ArtistSection> artistSections() {
		return mc.getDirectories()
				.stream()
				.filter(d -> "artist".equals(d.getType()))
				.map(d -> {
					MediaContainer mc = d.get(this, server, MediaContainer.class, client);
					return new ArtistSection(mc, d.getUri(), server, client);
				})
				.collect(Collectors.toList());
	}

	public List<MovieSection> movieSections() {
		return mc.getDirectories()
				.stream()
				.filter(d -> "movie".equals(d.getType()))
				.map(d -> {
					MediaContainer mc = d.get(this, server, MediaContainer.class, client);
					return new MovieSection(mc, d.getUri(), server, client);
				})
				.collect(Collectors.toList());
	}

}
