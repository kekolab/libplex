package libplex.entity;

import java.net.URI;
import java.util.Date;

import libplex.Plex;
import libplex.plex.entity.Directory;

public abstract class MediaDirectory extends ServerMediaContainerPlexItem {
    private Directory directory;

    protected MediaDirectory(Plex plex, URI uri, Server server) {
        super(plex, uri, server);
        this.directory = getMediaContainer().getDirectories()
                .get(0);
    }

    protected Directory getDirectory() {
        return directory;
    }

    public String getTitle() {
        return directory.getTitle();
    }

    public String getSummary() {
        return directory.getSummary();
    }

    public int getViewCount() {
        return directory.getViewCount();
    }

    public URI getArt() {
        return getPlex().uri(directory.getArt(), this, getServer(), null);
    }

    public Date getUpdatedAt() {
        return directory.getUpdatedAt();
    }

    public int getSkipCount() {
        return directory.getSkipCount();
    }

    public Date getLastViewedAt() {
        return directory.getLastViewedAt();
    }

    public Date getAddedAt() {
        return directory.getAddedAt();
    }

    public URI getThumb() {
        return getPlex().uri(directory.getThumb(), this, getServer(), null);
    }

    public abstract MediaSection getSection();

    public Integer getAllowSync() {
        return getMediaContainer().getAllowSync();
    }

    public Integer getLibrarySectionID() { // TODO getLibrary?
        return getMediaContainer().getLibrarySectionID();
    }

    public String getLibrarySectionTitle() { // TODO getSection?
        return getMediaContainer().getLibrarySectionTitle();
    }

    public String getLibrarySectionUUID() {
        return getMediaContainer().getLibrarySectionUUID();
    }
}
