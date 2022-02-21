package kekolab.libplex.entity;

import java.net.URI;
import java.util.Date;

import kekolab.libplex.PlexService;
import kekolab.libplex.PlexUriBuilder;
import kekolab.libplex.plex.tag.Directory;

public abstract class MediaDirectory extends ServerMediaContainerPlexItem {
    private Directory directory;

    protected MediaDirectory(PlexService plex, URI uri, Server server) {
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
        return PlexUriBuilder.fromKey(directory.getArt(), this, getServer())
                .build();
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
        return PlexUriBuilder.fromKey(directory.getThumb(), this, getServer())
                .build();
    }

    public abstract MediaSection getSection();

    public Integer getAllowSync() {
        return getMediaContainer().getAllowSync();
    }
}
