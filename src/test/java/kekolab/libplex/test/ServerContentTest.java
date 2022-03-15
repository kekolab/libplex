package kekolab.libplex.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import kekolab.libplex.entity.PMSAlbumDirectory;
import kekolab.libplex.entity.PMSArtistDirectory;
import kekolab.libplex.entity.PMSTrackDirectory;
import kekolab.libplex.entity.PlexMediaServer;

class ServerContentTest extends WithPlexClientTests {
    private PlexMediaServer server;

    @BeforeEach
    public void init() throws IOException {
        server = getClient().servers()
                .getServers()
                .get(0)
                .plexMediaServer();
    }
//    @Test
//    void searchTestOK() {
//        List<PMSArtistDirectory> results = server.searchArtist()
//                .withQuery("alanis")
//                .results()
//                .artists();
//        assertEquals(1, results.size());
//        Artist artist = results.get(0);
//        assertEquals("Alanis Morissette", artist.getTitle());
//    }
//
//    @Test
//    void searchTestKO() {
//        assertEquals(0, server.search()
//                .withQuery("pippo")
//                .results()
//                .artists()
//                .size());
//    }

    @Test
    void searchArtistTestOK() {
        List<PMSArtistDirectory> results = server.searchArtist("alanis")
                .getResults();
        assertEquals(1, results.size());
        PMSArtistDirectory artist = results.get(0);
        assertEquals("Alanis Morissette", artist.getTitle());
    }

    @Test
    void searchArtistTestKO() {
        assertEquals(0, server.searchArtist("pippo")
                .getResults()
                .size());
    }

    @Test
    void searchAlbumTestOK() {
        List<PMSAlbumDirectory> results = server.searchAlbum("jagged little")
                .getResults();
        assertEquals(1, results.size());
        PMSAlbumDirectory album = results.get(0);
        assertEquals("Jagged Little Pill", album.getTitle());
    }

    @Test
    void searchAlbumTestKO() {
        assertEquals(0, server.searchAlbum("giagghed little pill")
                .getResults()
                .size());
    }

    @Test
    void searchTrackTestOK() {
        List<PMSTrackDirectory> results = server.searchTrack("All I really want")
                .getResults();
        assertEquals(1, results.size());
        PMSTrackDirectory track = results.get(0);
//        assertEquals("Jagged Little Pill", track.album()
//                .getTitle());
    }

    @Test
    void searchTrackTestKO() {
        assertEquals(0, server.searchTrack("giagghed little pill")
                .getResults()
                .size());
    }
}
