package kekolab.libplex.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import kekolab.libplex.entity.ArtistSection;

public class ArtistSectionTests extends WithPlexClientTests {
    private ArtistSection section;

    @Override
    @BeforeEach
    public void init() throws IOException {
        super.init();
        section = getClient().servers()
                .getServers()
                .get(0)
                .content()
                .library()
                .sections()
                .artistSections()
                .get(0);
    }

    @Test
    void checkFields() {
        assertNotNull(section);
        assertNotNull(section.getAllowSync());
        assertNotNull(section.getArt());
        assertNotNull(section.getLibrarySectionID());
        assertNotNull(section.getThumb());
        assertNotNull(section.getTitle());
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
        assertTrue(section.searchForAlbums("sumness")
                .size() > 0);
    }

    @Test
    void searchNonExistentAlbumTest() {
        assertEquals(0, section.searchForAlbums("90rufoisdcj")
                .size());
    }

    @Test
    void searchExistentArtistTest() {
        assertTrue(section.searchForArtists("Alanis")
                .size() > 0);
    }

    @Test
    void searchNonExistentArtistTest() {
        assertEquals(0, section.searchForArtists("dscjldk")
                .size());
    }

    @Test
    void searchExistentTrackTest() {
        assertTrue(section.searchForTracks("Inside")
                .size() > 0);
    }

    @Test
    void searchNonExistentTrackTest() {
        assertEquals(0, section.searchForTracks("ldksjcdlkf")
                .size());
    }
}
