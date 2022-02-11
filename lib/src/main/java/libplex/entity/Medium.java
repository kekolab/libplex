package libplex.entity;

import java.util.List;
import java.util.stream.Collectors;

import libplex.PlexClient;
import libplex.plex.entity.Media;

public class Medium {
    private Media media;
    private List<Part> parts;

    public Medium(PlexClient plex, Server server, Media media) {
        this.media = media;
        this.parts = media.getParts()
                .stream()
                .map(p -> new Part(server, p))
                .collect(Collectors.toList());
    }

    public int getDuration() {
        return getMedia().getDuration();
    }

    public int getBitrate() {
        return getMedia().getBitrate();
    }

    public int getAudioChannels() {
        return getMedia().getAudioChannels();
    }

    public String getAudioCodec() {
        return getMedia().getAudioCodec();
    }

    public String getContainer() {
        return getMedia().getContainer();
    }

    public List<Part> getParts() {
        return parts;
    }

    private Media getMedia() {
        return media;
    }
}