package libplex.entity;

import java.net.URI;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import libplex.Plex;
import libplex.plex.entity.Directory;
import libplex.plex.entity.MediaContainer;

public class Album extends ServerMediaContainerPlexItem {
    private Directory directory;

    public Album(Plex plex, URI uri, Server server) {
        super(plex, uri, server);
        this.directory = getMediaContainer().getDirectories()
                .get(0);
    }

    public List<Track> getTracks() {
        return getPlex().executeGet(directory.getKey(), null, getServer(), MediaContainer.class, null)
                .getTracks()
                .stream()
                .map(t -> new Track(getPlex(),
                        getPlex().uri("/library/metadata/".concat(Integer.toString(t.getRatingKey())), null,
                                getServer(), null),
                        getServer()))
                .collect(Collectors.toList());
    }

    public String getStudio() {
        return directory.getStudio();
    }

    public Artist getArtist() {
        return new Artist(getPlex(), getPlex().uri(directory.getParentKey(), null, getServer(), null), getServer());
    }

    public double getRating() {
        return directory.getRating();
    }

    public int getYear() {
        return directory.getYear();
    }

    public Date getOriginallyAvailable() {
        return directory.getOriginallyAvailableAt();
    }

    public int getLoudnessAnalysisVersion() {
        return directory.getLoudnessAnalysisVersion();
    }

    public List<String> getGenres() {
        return directory.getGenres()
                .stream()
                .map(g -> g.getTag())
                .collect(Collectors.toList());
    }

    public List<String> getDirectors() {
        return directory.getDirectors()
                .stream()
                .map(g -> g.getTag())
                .collect(Collectors.toList());
    }
}
