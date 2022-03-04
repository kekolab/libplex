package kekolab.libplex.test;

import java.io.IOException;

import org.junit.jupiter.api.BeforeEach;

import kekolab.libplex.entity.Track;

public class TrackTests extends WithPlexClientTests {
    private Track track;

    @Override
    @BeforeEach
    public void init() throws IOException {
        super.init();
        track = getClient().servers()
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
                .get(0)
                .tracks()
                .get(0);
    }

    // TODO
}
