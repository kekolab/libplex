package kekolab.libplex.test;

import java.io.IOException;
import java.util.Properties;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import kekolab.libplex.PlexClient;

public abstract class WithPlexClientTests {
    private PlexClient client;

    @BeforeEach
    public void init() throws IOException {
        Properties props = new Properties();
        props.load(AlbumTests.class.getResourceAsStream("/testVariables.properties"));
        client = new PlexClient(props.getProperty("authToken"), "myPlexProduct", "v1.0", "myPlexClientIdentifier", null,
                null, null, null, null);
    }

    public PlexClient getClient() {
        return client;
    }

    @AfterEach
    public void closeClient() {
        client.close();
    }
}
