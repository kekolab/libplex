package kekolab.libplex.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.IOException;
import java.util.Properties;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import kekolab.libplex.PlexService;
import kekolab.libplex.entity.Server;
import kekolab.libplex.entity.Servers;

class ServersTests {
    private PlexService client;
    private Properties props;

    @BeforeEach
    void init() throws IOException {
        props = new Properties();
        props.load(getClass().getResourceAsStream("/testVariables.properties"));
        client = new PlexService.Builder().setPlexToken(props.getProperty("authToken"))
                .setPlexProduct("myPlexProduct")
                .setPlexVersion("v1.0")
                .setPlexClientIdentifier("myPlexClientIdentifier")
                .build();
    }

    @AfterEach
    void close() throws Exception {
        client.close();
    }

    @Test
    void fetchRemoteServer() throws IOException {
        Servers remoteServers = client.remoteServers();
        Server remoteServer = remoteServers.getRemoteServers()
                .get(0)
                .server();
        assertNotNull(remoteServer);
    }
}
