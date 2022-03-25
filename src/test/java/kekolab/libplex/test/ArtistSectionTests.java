package kekolab.libplex.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import kekolab.libplex.entity.MusicSection;

public class ArtistSectionTests extends WithPlexClientTests {
    private MusicSection section;

    @BeforeEach
    public void init() throws IOException {
        section = getClient().servers()
                .getServers()
                .get(0)
                .plexMediaServer()
                .library()
                .sections()
                .musicSections()
                .get(0)
                .section();
    }

    @Test
    void checkFields() {
        assertNotNull(section);
        assertNotNull(section.getAllowSync());
        assertNotNull(section.getArt());
        assertNotNull(section.getLibrarySectionID());
        assertNotNull(section.getThumb());
        assertNotNull(section.getTitle1());
        assertNotNull(section.getUri());
    }

    @Test
    void allAlbumsTest() {
        assertTrue(section.albums()
                .size() > 0);
    }

    @Test
    void allArtistsTest() {
        assertTrue(section.all()
                .size() > 0);
    }

    @Test
    void recentlyAddedTest() {
        assertTrue(section.recentlyAdded()
                .size() > 0);
    }

    @Test
    void searchExistentAlbumTest() {
        assertTrue(section.searchAlbums("sumness")
                .size() > 0);
    }

    @Test
    void searchNonExistentAlbumTest() {
        assertEquals(0, section.searchAlbums("90rufoisdcj")
                .size());
    }

    @Test
    void searchExistentArtistTest() {
        assertTrue(section.searchArtists("Alanis")
                .size() > 0);
    }

    @Test
    void searchNonExistentArtistTest() {
        assertEquals(0, section.searchArtists("dscjldk")
                .size());
    }

    @Test
    void searchExistentTrackTest() {
        assertTrue(section.searchTracks("Tamatoa")
                .size() > 0);
    }

    @Test
    void searchNonExistentTrackTest() {
        assertEquals(0, section.searchTracks("ldksjcdlkf")
                .size());
    }
}
