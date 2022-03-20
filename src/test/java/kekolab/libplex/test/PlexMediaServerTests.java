package kekolab.libplex.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import kekolab.libplex.entity.PlexMediaServer;

class PlexMediaServerTests extends WithPlexClientTests {
    private PlexMediaServer server;

    @BeforeEach
    public void init() throws IOException {
        server = getClient().servers()
                .getServers()
                .get(0)
                .plexMediaServer();
    }

    @Test
    void searchExistentAlbumTest() {
        assertTrue(server.searchAlbums("sumness")
                .size() > 0);
    }

    @Test
    void searchNonExistentAlbumTest() {
        assertEquals(0, server.searchAlbums("90rufoisdcj")
                .size());
    }

    @Test
    void searchExistentArtistTest() {
        assertTrue(server.searchArtist("Alanis")
                .size() > 0);
    }

    @Test
    void searchNonExistentArtistTest() {
        assertEquals(0, server.searchArtist("dscjldk")
                .size());
    }

    @Test
    void searchExistentTrackTest() {
        assertTrue(server.searchTracks("Tamatoa")
                .size() > 0);
    }

    @Test
    void searchNonExistentTrackTest() {
        assertEquals(0, server.searchTracks("ldksjcdlkf")
                .size());
    }
}
