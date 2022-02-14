package libplex.entity;

import java.util.List;
import java.util.stream.Collectors;

import libplex.PlexClient;
import libplex.plex.entity.Media;

public class AudioMedium {
    private Media media;
    private List<AudioPart> parts;

    public AudioMedium(PlexClient plex, Server server, Media media) {
        this.media = media;
        this.parts = media.getParts()
                .stream()
                .map(p -> new AudioPart(server, p))
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

    public List<AudioPart> getParts() {
        return parts;
    }
}