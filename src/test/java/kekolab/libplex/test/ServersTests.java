//package kekolab.libplex.test;
//
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//
//import java.io.IOException;
//
//import org.junit.jupiter.api.Test;
//
//import kekolab.libplex.entity.ServerContent;
//import kekolab.libplex.entity.Servers;
//
//class ServersTests extends WithPlexClientTests {
//    @Test
//    void fetchRemoteServer() throws IOException {
//        Servers remoteServers = getClient().servers();
//        ServerContent remoteServer = remoteServers.getServers()
//                .get(0)
//                .content();
//        assertNotNull(remoteServer);
//    }
//}
