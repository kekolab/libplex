package libplex.test;

import java.io.IOException;
import java.util.Properties;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import libplex.PlexService;
import libplex.entity.Track;

public class TrackTests {
    private static PlexService client;
    private static Track track;

    @BeforeAll
    static void init() throws IOException {
        Properties props = new Properties();
        props.load(TrackTests.class.getResourceAsStream("/testVariables.properties"));
        client = new PlexService.Builder().setPlexToken(props.getProperty("authToken"))
                .setPlexProduct("myPlexProduct")
                .setPlexVersion("v1.0")
                .setPlexClientIdentifier("myPlexClientIdentifier")
                .build();
        track = client.remoteServers()
                .getRemoteServers()
                .get(0)
                .server()
                .library()
                .sections()
                .artistSections()
                .get(0)
                .all()
                .get(0)
                .albums()
                .get(0)
                .getTracks()
                .get(0);
    }

    @AfterAll
    static void close() throws Exception {
        client.close();
    }
    // TODO
}
