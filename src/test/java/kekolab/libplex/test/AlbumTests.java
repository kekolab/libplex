package kekolab.libplex.test;

import java.io.IOException;

import org.junit.jupiter.api.BeforeEach;

import kekolab.libplex.entity.Album;

public class AlbumTests extends WithPlexClientTests {
    private Album album;

    @Override
    @BeforeEach
    public void init() throws IOException {
        super.init();
        album = getClient().servers()
                .getServers()
                .get(0)
                .content()
                .library()
                .sections()
                .artistSections()
                .get(0)
                .all()
                .get(0)
                .albums()
                .get(0);
    }
}
