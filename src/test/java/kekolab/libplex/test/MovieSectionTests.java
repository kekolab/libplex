package kekolab.libplex.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import kekolab.libplex.entity.PMSMovieSection;

public class MovieSectionTests extends WithPlexClientTests {
    private PMSMovieSection section;

    @BeforeEach
    public void init() throws IOException {
        section = getClient().servers()
                .getServers()
                .get(0)
                .plexMediaServer()
                .library()
                .sections()
                .movieSections()
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
    void allMoviesTest() {
        assertTrue(section.all()
                .getVideos()
                .size() > 0);
    }
//    @Test
//    void recentlyAddedTest() {
//        assertTrue(section.recentlyAdded()
//                .size() > 0);
//    }
//    @Test
//    void recentlyReleasedTest() {
//        assertTrue(section.recentlyReleased()
//                .size() > 0);
//    }
//    @Test
//    void onDeckTest() {
//        assertTrue(section.onDeck()
//                .size() > 0);
//    }
//    @Test
//    void recentlyViewedTest() {
//        assertTrue(section.recentlyViewed()
//                .size() > 0);
//    }
}
