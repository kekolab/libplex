package kekolab.libplex.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.IOException;
import java.util.Properties;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import kekolab.libplex.entity.PlexMediaServer;

public class LocalServerTest extends WithPlexClientTests {
    private Properties properties;

    @BeforeEach
    public void initProperties() throws IOException {
        properties = new Properties();
        properties.load(getClass().getResourceAsStream("/testVariables.properties"));
    }

    @Test
    void testLocalServer() throws Exception {
        PlexMediaServer pms = getClient().localServer(properties.getProperty("localServerHost"),
                Integer.parseInt(properties.getProperty("localServerPort")));
        assertNotNull(pms);
    }
}
