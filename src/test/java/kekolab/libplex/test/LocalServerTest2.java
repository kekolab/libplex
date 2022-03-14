package kekolab.libplex.test;

import java.io.IOException;
import java.util.Properties;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import jakarta.ws.rs.core.UriBuilder;
import kekolab.libplex.PlexClient;
import kekolab.libplex.entity.PlexItem;
import kekolab.libplex.entity.PlexMediaServer;

public class LocalServerTest2 {
    private PlexClient client;
    private Properties properties;

    @BeforeEach
    void init() throws IOException {
        properties = new Properties();
        properties.load(getClass().getResourceAsStream("/testVariables.properties"));
        client = new PlexClient(null, null, null, null, null, null, null, null, null);
    }

    @Test
    void testLocalServer() throws Exception {
        PlexMediaServer pms = new PlexItem.Builder<PlexMediaServer>(client,
                UriBuilder.fromPath("http://192.168.1.232:32400")
                        .build()).build(PlexMediaServer.class);
        pms.library()
                .sections()
                .musicSections()
                .get(0)
                .content()
                .all()
                .getArtists()
                .get(0)
                .getTitle();
    }

    @AfterEach
    void close() throws Exception {
        client.close();
    }
}
