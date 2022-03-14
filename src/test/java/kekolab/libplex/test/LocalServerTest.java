//package kekolab.libplex.test;
//
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//
//import java.io.IOException;
//import java.util.Properties;
//
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import kekolab.libplex.PlexClient;
//import kekolab.libplex.entity.ServerContent;
//
//public class LocalServerTest {
//    private PlexClient client;
//    private Properties properties;
//
//    @BeforeEach
//    void init() throws IOException {
//        properties = new Properties();
//        properties.load(getClass().getResourceAsStream("/testVariables.properties"));
//        client = new PlexClient(null, null, null, null, null, null, null, null, null);
//    }
//
//    @Test
//    void testLocalServer() throws Exception {
//        ServerContent server = client.localServer(properties.getProperty("localServerHost"),
//                Integer.parseInt(properties.getProperty("localServerPort")));
//        assertNotNull(server);
//    }
//
//    @AfterEach
//    void close() throws Exception {
//        client.close();
//    }
//
//}
