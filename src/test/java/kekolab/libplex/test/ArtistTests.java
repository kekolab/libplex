package kekolab.libplex.test;

import java.io.IOException;
import java.util.Properties;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import kekolab.libplex.PlexService;
import kekolab.libplex.entity.Artist;

public class ArtistTests {
    private static PlexService client;
    private static Artist artist;

    @BeforeAll
    static void init() throws IOException {
        Properties props = new Properties();
        props.load(ArtistTests.class.getResourceAsStream("/testVariables.properties"));
        client = new PlexService.Builder().setPlexToken(props.getProperty("authToken"))
                .setPlexProduct("myPlexProduct")
                .setPlexVersion("v1.0")
                .setPlexClientIdentifier("myPlexClientIdentifier")
                .build();
        artist = client.remoteServers()
                .getRemoteServers()
                .get(0)
                .server()
                .library()
                .sections()
                .artistSections()
                .get(0)
                .all()
                .get(0);
    }

    @AfterAll
    static void close() throws Exception {
        client.close();
    }
    // TODO
}
