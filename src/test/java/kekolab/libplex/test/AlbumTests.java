package kekolab.libplex.test;

import java.io.IOException;

import org.junit.jupiter.api.BeforeEach;

import kekolab.libplex.entity.Album;

public class AlbumTests extends WithPlexClientTests {
    private Album album;

    @BeforeEach
    public void init() throws IOException {
        album = getClient().servers()
                .getServers()
                .get(0)
                .plexMediaServer()
                .library()
                .sections()
                .musicSections()
                .get(0)
                .section()
                .albums()
                .get(0);
    }
}
