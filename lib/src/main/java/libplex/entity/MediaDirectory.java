package libplex.entity;

import java.net.URI;
import java.util.Date;

import libplex.PlexClient;
import libplex.PlexUriBuilder;
import libplex.plex.entity.Directory;

public abstract class MediaDirectory extends ServerMediaContainerPlexItem {
    private Directory directory;

    protected MediaDirectory(PlexClient plex, URI uri, Server server) {
        super(plex, uri, server);
        this.directory = getMediaContainer().getDirectories()
                .get(0);
    }

    protected Directory getDirectory() {
        return directory;
    }

    public String getTitle() {
        return getDirectory().getTitle();
    }

    public String getSummary() {
        return getDirectory().getSummary();
    }

    public int getViewCount() {
        return getDirectory().getViewCount();
    }

    public URI getArt() {
        return PlexUriBuilder.fromKey(getDirectory().getArt(), this, getServer())
                .build();
    }

    public Date getUpdatedAt() {
        return getDirectory().getUpdatedAt();
    }

    public int getSkipCount() {
        return getDirectory().getSkipCount();
    }

    public Date getLastViewedAt() {
        return getDirectory().getLastViewedAt();
    }

    public Date getAddedAt() {
        return getDirectory().getAddedAt();
    }

    public URI getThumb() {
        return PlexUriBuilder.fromKey(getDirectory().getThumb(), this, getServer())
                .build();
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
