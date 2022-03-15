package kekolab.libplex.test;

import java.io.IOException;

import org.junit.jupiter.api.BeforeEach;

import kekolab.libplex.entity.PMSAlbumDetailsDirectory;

public class AlbumTests extends WithPlexClientTests {
    private PMSAlbumDetailsDirectory album;

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
                .content()
                .albums()
                .getAlbums()
                .get(0)
                .details()
                .getAlbum();
    }
}
