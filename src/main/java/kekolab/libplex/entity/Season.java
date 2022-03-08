package kekolab.libplex.entity;

import java.net.URI;
import java.util.List;

import kekolab.libplex.PlexClient;

public class Season extends MediaDirectory {

    public Season(PlexClient plex, URI uri, ServerContent server) {
        super(plex, uri, server);
    }

    public Integer getParentRatingKey() {
        return getDirectory().getParentRatingKey();
    }

    public String getParentGuid() {
        return getDirectory().getParentGuid();
    }

    public String getParentStudio() {
        return getDirectory().getParentStudio();
    }

    public String getTitleSort() {
        return getDirectory().getTitleSort();
    }

    public String getParentKey() {
        return getDirectory().getParentKey();
    }

    public String getParentTitle() {
        return getDirectory().getParentTitle();
    }

    public String getParentIndex() {
        return getDirectory().getParentIndex();
    }

    public Integer getYear() {
        return getDirectory().getYear();
    }

    public URI getParentThumbURI() {
        return getPlexClient().uriBuilder()
                .fromKey(getDirectory().getParentThumb(), null, getServer())
                .build();
    }

    public String getParentThumb() {
        return getDirectory().getParentThumb();
    }

    public String getParentTheme() {
        return getDirectory().getParentTheme();
    }

    public int getLeafCount() {
        return getDirectory().getLeafCount();
    }

    public int getViewedLeafCount() {
        return getDirectory().getViewedtLeafCount();
    }

    @Override
    public ShowSection section() {
        return new ShowSection(getPlexClient(), getPlexClient().uriBuilder()
                .fromKey(getDirectory().getLibrarySectionKey(), null, getServer())
                .build(), getServer());
    }

    public Show show() {
        return new Show(getPlexClient(), getPlexClient().uriBuilder()
                .fromKey(getDirectory().getParentKey(), null, getServer())
                .build(), getServer());
    }

    public List<Video> episodes() {
        List<Video> episodes = getPlexClient().executeGet(getPlexClient().uriBuilder()
                .fromKey(getDirectory().getKey(), null, getServer())
                .build(), MediaContainer.class)
                .getVideos();
        episodes.forEach(t -> {
            t.setPlex(getPlexClient());
            t.setServer(getServer());
        });
        return episodes;
    }
}
