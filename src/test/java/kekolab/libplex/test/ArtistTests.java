package kekolab.libplex.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.io.IOException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import kekolab.libplex.entity.Artist;

public class ArtistTests extends WithPlexClientTests {
    private Artist artist;

    @BeforeEach
    public void init() throws IOException {
        artist = getClient().servers()
                .getServers()
                .get(0)
                .plexMediaServer()
                .library()
                .sections()
                .musicSections()
                .get(0)
                .content()
                .all()
                .get(0);
    }

    @Test
    public void fetchDetailsTest() {
        assertNull(artist.getLibrarySectionID());
        Artist detiled = artist.details();
        assertNotNull(detiled.getLibrarySectionID());
    }
    // TODO
}
