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
//import kekolab.libplex.entity.Library;
//import kekolab.libplex.entity.Sections;
//
//public class SectionsTest extends WithPlexClientTests {
//    private Library library;
//
//    @Override
//    @BeforeEach
//    public void init() throws IOException {
//        super.init();
//        library = getClient().servers()
//                .getServers()
//                .get(0)
//                .content()
//                .library();
//    }
//
//    @Test
//    void sectionsTest() {
//        Sections sections = library.sections();
//        assertNotNull(sections);
//        assertNotNull(sections.getUri());
//        assertTrue(sections.artistSections()
//                .size() > 0);
//        assertTrue(sections.movieSections()
//                .size() > 0);
//    }
//}
