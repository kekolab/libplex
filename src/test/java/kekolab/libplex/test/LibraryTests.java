package kekolab.libplex.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.IOException;
import java.util.Properties;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import kekolab.libplex.PlexService;
import kekolab.libplex.entity.Library;
import kekolab.libplex.entity.ServerContent;

public class LibraryTests {
    private static PlexService client;
    private static ServerContent server;

    @BeforeAll
    static void init() throws IOException {
        Properties props = new Properties();
        props.load(LibraryTests.class.getResourceAsStream("/testVariables.properties"));
        client = new PlexService.Builder().setPlexToken(props.getProperty("authToken"))
                .setPlexProduct("myPlexProduct")
                .setPlexVersion("v1.0")
                .setPlexClientIdentifier("myPlexClientIdentifier")
                .build();
        server = client.servers()
                .getServers()
                .get(0)
                .content();
    }

    @AfterAll
    static void close() throws Exception {
        client.close();
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