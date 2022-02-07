package libplex.plex.entity;

import java.net.URI;

import libplex.Plex;

public class Server implements Parent {
    private URI uri;
    private MediaContainer mc;
    private Directory libraryDirectory;
    private Plex plex;

    public Server(MediaContainer mc, URI uri, Plex plex) {
	this.uri = uri;
	this.mc = mc;
	this.plex = plex;
    }

    public Library library() {
	if (libraryDirectory == null)
	    libraryDirectory = mc.getDirectories()
		    .stream()
		    .filter(d -> "library".equals(d.getKey()))
		    .findAny()
		    .orElse(null);
	URI uri = plex.uri(libraryDirectory.getKey(), this, this, null);
	MediaContainer mc = plex.executeGet(uri, MediaContainer.class);
	return new Library(mc, uri, this, plex);
    }

    @Override
    public URI getUri() {
	return uri;
    }
}
