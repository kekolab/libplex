package kekolab.libplex.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import kekolab.libplex.entity.Track;

public class TrackTests extends WithPlexClientTests {
    private Track track;

    @BeforeEach
    @Test
    public void init() throws IOException {
        track = getClient().servers()
                .getServers()
                .get(0)
                .plexMediaServer()
                .library()
                .sections()
                .musicSections()
                .get(0)
                .section()
                .albums()
                .get(0)
                .tracks()
                .get(0);
    }

    @Test
    public void subElements() {
        assertTrue(track.getMedia()
                .size() > 0);
        assertTrue(track.getMedia()
                .stream()
                .allMatch(medium -> medium.getParts()
                        .size() > 0));
    }
    // TODO
}
