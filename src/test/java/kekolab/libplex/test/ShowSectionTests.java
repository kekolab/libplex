//package kekolab.libplex.test;
//
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//
//import java.io.IOException;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import kekolab.libplex.entity.ShowSection;
//
//public class ShowSectionTests extends WithPlexClientTests {
//    private ShowSection section;
//
//    @Override
//    @BeforeEach
//    public void init() throws IOException {
//        super.init();
//        section = getClient().servers()
//                .getServers()
//                .get(0)
//                .content()
//                .library()
//                .sections()
//                .showSections()
//                .get(0);
//    }
//
//    @Test
//    void checkFields() {
//        assertNotNull(section);
//        assertNotNull(section.getAllowSync());
//        assertNotNull(section.getArt());
//        assertNotNull(section.getLibrarySectionID());
//        assertNotNull(section.getThumb());
//        assertNotNull(section.getTitle1());
//        assertNotNull(section.getUri());
//    }
//
//    @Test
//    void allShows() {
//        assertTrue(section.all()
//                .size() > 0);
//    }
//
//    @Test
//    void onDeckTest() {
//        assertTrue(section.onDeck()
//                .size() > 0);
//    }
//
//    @Test
//    void recentlyAddedTest() {
//        assertTrue(section.recentlyAdded()
//                .size() > 0);
//    }
//
//    @Test
//    void recentlyReleasedTest() {
//        assertTrue(section.recentlyReleased()
//                .size() > 0);
//    }
//
//    @Test
//    void recentlyViewedTest() {
//        assertTrue(section.recentlyViewed()
//                .size() > 0);
//    }
//}
