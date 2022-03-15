package kekolab.libplex.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import kekolab.libplex.entity.PlexMediaServer;
import kekolab.libplex.entity.ServersContainer;

class ServersTests extends WithPlexClientTests {
    @Test
    void fetchRemoteServer() throws IOException {
        ServersContainer remoteServers = getClient().servers();
        PlexMediaServer remoteServer = remoteServers.getServers()
                .get(0)
                .plexMediaServer();
        assertNotNull(remoteServer);
    }
}
