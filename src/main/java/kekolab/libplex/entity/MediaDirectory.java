package kekolab.libplex.entity;

import java.net.URI;
import java.util.Date;

import kekolab.libplex.PlexClient;

public abstract class MediaDirectory extends ServerMediaContainerPlexItem {
    private Directory directory;

    protected MediaDirectory(PlexClient plex, URI uri, ServerContent server) {
        super(plex, uri, server);
        this.directory = getMediaContainer().getDirectories()
                .get(0);
    }

    protected Directory getDirectory() {
        return directory;
    }

    public Integer getSize() {
        return getMediaContainer().getSize();
    }

    public Integer getAllowSync() {
        return getMediaContainer().getAllowSync();
    }

    public String getIdentifier() {
        return getMediaContainer().getIdentifier();
    }

    public String getLibrarySectionUUID() {
        return getMediaContainer().getLibrarySectionUUID();
    }

    public String getMediaTagPrefix() {
        return getMediaContainer().getMediaTagPrefix();
    }

    public Integer getMediaTagVersion() {
        return getMediaContainer().getMediaTagVersion();
    }

    public Integer getRatingKey() {
        return directory.getRatingKey();
    }

    public String getKey() {
        return directory.getKey();
    }

    public String getGuid() {
        return directory.getGuid();
    }

    public String getType() {
        return directory.getType();
    }

    public String getTitle() {
        return directory.getTitle();
    }

    public String getLibrarySectionTitle() {
        return directory.getLibrarySectionTitle();
    }

    public Integer getLibrarySectionID() {
        return directory.getLibrarySectionID();
    }

    public String getLibrarySectionKey() {
        return directory.getLibrarySectionKey();
    }

    public String getSummary() {
        return directory.getSummary();
    }

    public Integer getIndex() {
        return directory.getIndex();
    }

    public Integer getViewCount() {
        return directory.getViewCount();
    }

    public Integer getSkipCount() {
        return directory.getSkipCount();
    }

    public Date getLastViewedAt() {
        return directory.getLastViewedAt();
    }

    public String getThumb() {
        return directory.getThumb();
    }

    public URI getThumbURI() {
        return getPlexClient().uriBuilder()
                .fromKey(directory.getThumb(), this, getServer())
                .build();
    }

    public String getArt() {
        return directory.getArt();
    }

    public URI getArtURI() {
        return getPlexClient().uriBuilder()
                .fromKey(directory.getArt(), this, getServer())
                .build();
    }

    public Date getAddedAt() {
        return directory.getAddedAt();
    }

    public Date getUpdatedAt() {
        return directory.getUpdatedAt();
    }

    public abstract MediaSection section();
}
