package kekolab.libplex.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.IOException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import kekolab.libplex.entity.PMSLibrary;

public class LibraryTests extends WithPlexClientTests {
    private PMSLibrary library;

    @BeforeEach
    public void init() throws IOException {
        library = getClient().servers()
                .getServers()
                .get(0)
                .plexMediaServer()
                .library();
    }

    @Test
    void libraryTest() throws IOException {
        assertNotNull(library);
        assertNotNull(library.getUri());
//        assertNotNull(library.onDeck());
        assertNotNull(library.sections());
    }
//    @Test
//    void recentlyAddedTest() {
//        SearchResult recentlyAdded = library.recentlyAdded();
//        assertNotNull(recentlyAdded);
//        assertTrue(recentlyAdded.albums()
//                .size() > 0);
//        assertTrue(recentlyAdded.movies()
//                .size() > 0);
//        assertEquals(0, recentlyAdded.artists()
//                .size());
//    }
}
