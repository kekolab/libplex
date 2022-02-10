package libplex;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import libplex.entity.Server;
import libplex.entity.Track;
import libplex.plex.entity.RemotelyAccessibleServerInfo;

class PlexClientBuilder_Tests {
    private PlexClient plex;
    private Properties properties;

    @BeforeEach
    void init() throws IOException {
        properties = new Properties();
        properties.load(getClass().getResourceAsStream("/testVariables.properties"));
        String authToken = properties.getProperty("authToken");
        plex = new PlexClient(authToken, "myPlexProduct", "v1.0", "myPlexClientIdentifier");
    }

    @Test
    void tests() throws IOException {
        List<RemotelyAccessibleServerInfo> servers = plex.myPlex()
                .getServers();
        Server server = servers.get(0)
                .server();
        List<Track> tracks = server.library()
                .sections()
                .artistSections()
                .get(0)
                .searchForArtists("Alanis")
                .get(0)
                .albums()
                .get(0)
                .getTracks();
        System.out.println();
    }

    @Test
    void testRequestPIN() throws IOException {

    }

    @Test
    void testLocalServer() {

    }
}
