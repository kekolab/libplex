package libplex;

import java.io.IOException;
import java.util.Properties;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import libplex.entity.RemoteServers;
import libplex.entity.Server;

class PlexClientBuilder_Tests {
    private PlexClient plexClient;
    private Properties properties;

    @BeforeEach
    void init() throws IOException {
        properties = new Properties();
        properties.load(getClass().getResourceAsStream("/testVariables.properties"));
        String authToken = properties.getProperty("authToken");
        plexClient = new PlexClient(authToken, "myPlexProduct", "v1.0", "myPlexClientIdentifier");
    }

    @Test
    void tests() throws IOException {
        RemoteServers remoteServers = new RemoteServers(plexClient);
        Server server = Server.buildRemote(plexClient, remoteServers.getSummaries()
                .get(0));
        server.library()
                .sections()
                .artistSections()
                .get(0)
                .searchForArtists("Alanis")
                .get(0)
                .albums()
                .get(0)
                .getTracks();
    }

    @Test
    void testRequestPIN() throws IOException {

    }

    @Test
    void testLocalServer() {

    }
}
