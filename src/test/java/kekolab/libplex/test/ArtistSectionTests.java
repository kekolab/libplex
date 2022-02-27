package kekolab.libplex.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.util.Properties;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import kekolab.libplex.PlexService;
import kekolab.libplex.entity.ArtistSection;

public class ArtistSectionTests {
    private static PlexService client;
    private static ArtistSection section;

    @BeforeAll
    static void init() throws IOException {
        Properties props = new Properties();
        props.load(ArtistSectionTests.class.getResourceAsStream("/testVariables.properties"));
        client = new PlexService.Builder().setPlexToken(props.getProperty("authToken"))
                .setPlexProduct("myPlexProduct")
                .setPlexVersion("v1.0")
                .setPlexClientIdentifier("myPlexClientIdentifier")
                .build();
        section = client.servers()
                .getServers()
                .get(0)
                .content()
                .library()
                .sections()
                .artistSections()
                .get(0);
    }

    @AfterAll
    static void close() throws Exception {
        client.close();
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
