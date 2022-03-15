package kekolab.libplex.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import kekolab.libplex.entity.PMSMusicSection;

public class ArtistSectionTests extends WithPlexClientTests {
    private PMSMusicSection section;

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
                .content();
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
                .getAlbums()
                .size() > 0);
    }

    @Test
    void allArtistsTest() {
        assertTrue(section.all()
                .getArtists()
                .size() > 0);
    }

    @Test
    void recentlyAddedTest() {
        assertTrue(section.recentlyAdded()
                .getAlbums()
                .size() > 0);
    }

    @Test
    void searchExistentAlbumTest() {
        assertTrue(section.searchAlbums("sumness")
                .getAlbums()
                .size() > 0);
    }

    @Test
    void searchNonExistentAlbumTest() {
        assertEquals(0, section.searchAlbums("90rufoisdcj")
                .getAlbums()
                .size());
    }

    @Test
    void searchExistentArtistTest() {
        assertTrue(section.searchArtist("Alanis")
                .getArtists()
                .size() > 0);
    }

    @Test
    void searchNonExistentArtistTest() {
        assertEquals(0, section.searchArtist("dscjldk")
                .getArtists()
                .size());
    }

    @Test
    void searchExistentTrackTest() {
        assertTrue(section.searchTrack("Inside")
                .getTracks()
                .size() > 0);
    }

    @Test
    void searchNonExistentTrackTest() {
        assertEquals(0, section.searchTrack("ldksjcdlkf")
                .getTracks()
                .size());
    }
}
