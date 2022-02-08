package libplex.entity;

import java.net.URI;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import libplex.Plex;
import libplex.plex.entity.Directory;
import libplex.plex.entity.MediaContainer;

public class Album extends Medium implements Parent {
    private URI uri;

    public Album(Directory d, URI uri, Parent parent, Server server, Plex plex) {
	super(plex, server, d);
	this.uri = uri;
    }

    public ArtistList artist() {
	// TODO get directory.parentKey
	return null;
    }

    public String studio() {
	return getDirectory().getStudio();
    }

    public double rating() {
	return getDirectory().getRating();
    }

    public int year() {
	return getDirectory().getYear();
    }

    public Date originallyAvailable() {
	return getDirectory().getOriginallyAvailableAt();
    }

    public int loudnessAnalysisVersion() {
	return getDirectory().getLoudnessAnalysisVersion();
    }

    public List<String> genres() {
	return getDirectory().getGenres()
		.stream()
		.map(g -> g.getTag())
		.collect(Collectors.toList());
    }

    public List<String> directors() {
	return getDirectory().getDirectors()
		.stream()
		.map(g -> g.getTag())
		.collect(Collectors.toList());
    }

    public TrackList tracks() {
	MediaContainer mc = getPlex().executeGet(getDirectory().getKey(), this, getServer(), MediaContainer.class,
		null);
	return new TrackList(mc, uri, getServer(), getPlex());
    }

    @Override
    public URI getUri() {
	return uri;
    }
}
