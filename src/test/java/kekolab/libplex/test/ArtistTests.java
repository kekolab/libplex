//package kekolab.libplex.test;
//
//import java.io.IOException;
//
//import org.junit.jupiter.api.BeforeEach;
//
//import kekolab.libplex.entity.Artist;
//
//public class ArtistTests extends WithPlexClientTests {
//    private Artist artist;
//
//    @Override
//    @BeforeEach
//    public void init() throws IOException {
//        artist = getClient().servers()
//                .getServers()
//                .get(0)
//                .content()
//                .library()
//                .sections()
//                .artistSections()
//                .get(0)
//                .all()
//                .get(0);
//    }
//
//    // TODO
//}
