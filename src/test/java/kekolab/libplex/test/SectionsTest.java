package kekolab.libplex.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import kekolab.libplex.entity.PMSLibrary;
import kekolab.libplex.entity.PMSSections;

public class SectionsTest extends WithPlexClientTests {
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
    void sectionsTest() {
        PMSSections sections = library.sections();
        assertNotNull(sections);
        assertNotNull(sections.getUri());
        assertTrue(sections.musicSections()
                .size() > 0);
        assertTrue(sections.movieSections()
                .size() > 0);
    }
}
