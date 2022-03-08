package kekolab.libplex.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import kekolab.libplex.entity.Library;
import kekolab.libplex.misc.SearchResult;

public class LibraryTests extends WithPlexClientTests {
    private Library library;

    @Override
    @BeforeEach
    public void init() throws IOException {
        super.init();
        library = getClient().servers()
                .getServers()
                .get(0)
                .content()
                .library();
    }

    @Test
    void libraryTest() throws IOException {
        assertNotNull(library);
        assertNotNull(library.getUri());
        assertNotNull(library.onDeck());
        assertNotNull(library.sections());
    }

    @Test
    void recentlyAddedTest() {
        SearchResult recentlyAdded = library.recentlyAdded();
        assertNotNull(recentlyAdded);
        assertTrue(recentlyAdded.albums()
                .size() > 0);
        assertTrue(recentlyAdded.movies()
                .size() > 0);
        assertEquals(0, recentlyAdded.artists()
                .size());
    }
}
