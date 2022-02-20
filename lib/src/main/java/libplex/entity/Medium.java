package libplex.entity;

import java.util.List;
import java.util.stream.Collectors;

import libplex.PlexClient;
import libplex.plex.tag.Media;

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
        return media.getDuration();
    }

    public int getBitrate() {
        return media.getBitrate();
    }

    public int getAudioChannels() {
        return media.getAudioChannels();
    }

    public String getAudioCodec() {
        return media.getAudioCodec();
    }

    public String getContainer() {
        return media.getContainer();
    }

    public List<Part> getParts() {
        return parts;
    }
}