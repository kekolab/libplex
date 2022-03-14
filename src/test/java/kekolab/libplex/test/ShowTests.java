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
//import kekolab.libplex.entity.Show;
//
//public class ShowTests extends WithPlexClientTests {
//    private Show show;
//
//    @Override
//    @BeforeEach
//    public void init() throws IOException {
//        super.init();
//        show = getClient().servers()
//                .getServers()
//                .get(0)
//                .content()
//                .library()
//                .sections()
//                .showSections()
//                .get(0)
//                .all()
//                .get(0);
//    }
//
//    @Test
//    void checkFields() {
//        assertNotNull(show);
//        assertNotNull(show.getTitle());
//    }
//
//    @Test
//    void allEpisodes() {
//        assertTrue(show.allEpisodes()
//                .size() > 0);
//    }
//
//    @Test
//    void seasons() {
//        assertTrue(show.seasons()
//                .size() > 0);
//    }
//}
