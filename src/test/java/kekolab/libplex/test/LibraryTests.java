package kekolab.libplex.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.IOException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import kekolab.libplex.entity.Library;
import kekolab.libplex.entity.ServerContent;

public class LibraryTests extends WithPlexClientTests {
    private ServerContent server;

    @Override
    @BeforeEach
    public void init() throws IOException {
        super.init();
        server = getClient().servers()
                .getServers()
                .get(0)
                .content();
    }

    @Test
    void libraryTest() throws IOException {
        Library library = server.library();
        assertNotNull(library);
        assertNotNull(library.getUri());
        assertNotNull(library.onDeck());
        assertNotNull(library.sections());
    }
}
