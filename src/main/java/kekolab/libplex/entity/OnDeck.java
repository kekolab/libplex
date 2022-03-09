package kekolab.libplex.entity;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import kekolab.libplex.PlexClient;

public class OnDeck extends ServerMediaContainerPlexItem {

    public OnDeck(PlexClient plex, URI uri, ServerContent server) {
        super(plex, uri, server);
    }

    public List<Video> movies() {
        return videosByType("movie");
    }

    public List<Video> episodes() {
        return videosByType("episode");
    }

    private List<Video> videosByType(String videoType) {
        return getMediaContainer().getVideos()
                .stream()
                .filter(video -> video.getType()
                        .equals(videoType))
                .map(video -> {
                    video.setPlex(getPlexClient());
                    video.setServer(getServer());
                    return video;
                })
                .collect(Collectors.toList());
    }
}
