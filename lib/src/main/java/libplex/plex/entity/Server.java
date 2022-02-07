package libplex.plex.entity;

import java.net.URI;

import libplex.Plex;

public class Server extends MediaContainerItem implements Parent {
	private URI uri;
	private Directory libraryDirectory;

	public Server(MediaContainer mc, URI uri, Plex plex) {
		super(plex, mc);
		this.uri = uri;
	}

	public Library library() {
		if (libraryDirectory == null)
			libraryDirectory = getMediaContainer().getDirectories()
					.stream()
					.filter(d -> "library".equals(d.getKey()))
					.findAny()
					.orElse(null);
		URI uri = getPlex().uri(libraryDirectory.getKey(), this, this, null);
		MediaContainer mc = getPlex().executeGet(uri, MediaContainer.class);
		return new Library(mc, uri, this, getPlex());
	}

	@Override
	public URI getUri() {
		return uri;
	}
}
