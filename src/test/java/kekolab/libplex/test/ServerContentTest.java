package kekolab.libplex.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import kekolab.libplex.entity.Album;
import kekolab.libplex.entity.Artist;
import kekolab.libplex.entity.ServerContent;
import kekolab.libplex.entity.Track;
import kekolab.libplex.misc.SearchType;

class ServerContentTest extends WithPlexClientTests {
    private ServerContent server;

    @Override
    @BeforeEach
    public void init() throws IOException {
        super.init();
        server = getClient().servers()
                .getServers()
                .get(0)
                .content();
    }

    @Test
    void searchTestOK() {
        List<Artist> results = server.search()
                .withQuery("alanis")
                .results()
                .getArtists();
        assertEquals(1, results.size());
        Artist artist = results.get(0);
        assertEquals("Alanis Morissette", artist.getTitle());
    }

    @Test
    void searchTestKO() {
        assertEquals(0, server.search()
                .withQuery("pippo")
                .results()
                .getArtists()
                .size());
    }

    @Test
    void searchArtistTestOK() {
        List<Artist> results = server.search()
                .withType(SearchType.ARTIST)
                .withQuery("alanis")
                .results()
                .getArtists();
        assertEquals(1, results.size());
        Artist artist = results.get(0);
        assertEquals("Alanis Morissette", artist.getTitle());
    }

    @Test
    void searchArtistTestKO() {
        assertEquals(0, server.search()
                .withType(SearchType.ARTIST)
                .withQuery("pippo")
                .results()
                .getArtists()
                .size());
    }

    @Test
    void searchAlbumTestOK() {
        List<Album> results = server.search()
                .withType(SearchType.ALBUM)
                .withQuery("jagged little")
                .results()
                .getAlbums();
        assertEquals(1, results.size());
        Album album = results.get(0);
        assertEquals("Jagged Little Pill", album.getTitle());
    }

    @Test
    void searchAlbumTestKO() {
        assertEquals(0, server.search()
                .withType(SearchType.ALBUM)
                .withQuery("giagghed little pill")
                .results()
                .getAlbums()
                .size());
    }

    @Test
    void searchTrackTestOK() {
        List<Track> results = server.search()
                .withType(SearchType.TRACK)
                .withQuery("All I really want")
                .results()
                .getTracks();
        assertEquals(1, results.size());
        Track track = results.get(0);
        assertEquals("Jagged Little Pill", track.album()
                .getTitle());
    }

    @Test
    void searchTrackTestKO() {
        assertEquals(0, server.search()
                .withType(SearchType.TRACK)
                .withQuery("giagghed little pill")
                .results()
                .getTracks()
                .size());
    }
}
