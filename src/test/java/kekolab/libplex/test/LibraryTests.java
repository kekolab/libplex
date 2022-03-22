package kekolab.libplex.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import kekolab.libplex.entity.Album;
import kekolab.libplex.entity.Library;
import kekolab.libplex.entity.SectionItem;
import kekolab.libplex.entity.Video;

public class LibraryTests extends WithPlexClientTests {
    private Library library;

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

    @Test
    void recentlyAddedTest() {
        List<? extends SectionItem> recentlyAddedItems = library.recentlyAdded();
        assertTrue(recentlyAddedItems.size() > 0);
        assertTrue(recentlyAddedItems.stream()
                .anyMatch(item -> item instanceof Album));
        assertTrue(recentlyAddedItems.stream()
                .anyMatch(item -> item instanceof Video && item.getType()
                        .equals("movie")));
    }

    @Test
    void onDeckTest() {
        List<Video> onDeckItems = library.onDeck();
        assertTrue(onDeckItems.size() > 0);
        assertTrue(onDeckItems.stream()
                .anyMatch(item -> item.getType()
                        .equals("episode")));
        assertTrue(onDeckItems.stream()
                .anyMatch(item -> item.getType()
                        .equals("movie")));
    }
}
