package kekolab.libplex.test;

import java.io.IOException;
import java.util.Properties;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import kekolab.libplex.PlexService;
import kekolab.libplex.entity.Album;

public class AlbumTests {
    private static PlexService client;
    private static Album album;

    @BeforeAll
    static void init() throws IOException {
        Properties props = new Properties();
        props.load(AlbumTests.class.getResourceAsStream("/testVariables.properties"));
        client = new PlexService.Builder().setPlexToken(props.getProperty("authToken"))
                .setPlexProduct("myPlexProduct")
                .setPlexVersion("v1.0")
                .setPlexClientIdentifier("myPlexClientIdentifier")
                .build();
        album = client.servers()
                .getServers()
                .get(0)
                .content()
                .library()
                .sections()
                .artistSections()
                .get(0)
                .all()
                .get(0)
                .albums()
                .get(0);
    }

    @AfterAll
    static void close() throws Exception {
        client.close();
    }
    // TODO
}