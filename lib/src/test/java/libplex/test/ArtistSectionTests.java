package libplex.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.util.Properties;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import libplex.PlexClient;
import libplex.entity.ArtistSection;
import libplex.entity.RemoteServers;
import libplex.entity.Server;

public class ArtistSectionTests {
	private static PlexClient client;
	private static ArtistSection section;

	@BeforeAll
	static void init() throws IOException {
		Properties props = new Properties();
		props.load(ArtistSectionTests.class.getResourceAsStream("/testVariables.properties"));
		client = new PlexClient(props.getProperty("authToken"));
		section = Server.buildRemote(client, new RemoteServers(client).getSummaries()
				.get(0))
				.library()
				.sections()
				.artistSections()
				.get(0);
	}

	@AfterAll
	static void close() throws Exception {
		client.close();
	}

	@Test
	void checkFields() {
		assertNotNull(section);
		assertNotNull(section.getAllowSync());
		assertNotNull(section.getArt());
		assertNotNull(section.getLibrarySectionID());
		assertNotNull(section.getThumb());
		assertNotNull(section.getTitle());
		assertNotNull(section.getUri());
	}

	@Test
	void allAlbumsTest() {
		assertTrue(section.albums()
				.size() > 0);
	}

	@Test
	void allArtistsTest() {
		assertTrue(section.all()
				.size() > 0);
	}

	@Test
	void recentlyAddedTest() {
		assertTrue(section.recentlyAdded()
				.size() > 0);
	}

	@Test
	void searchExistentAlbumTest() {
		assertTrue(section.searchForAlbums("sumness")
				.size() > 0);
	}

	@Test
	void searchNonExistentAlbumTest() {
		assertEquals(0, section.searchForAlbums("90rufoisdcj")
				.size());
	}

	@Test
	void searchExistentArtistTest() {
		assertTrue(section.searchForArtists("Alanis")
				.size() > 0);
	}

	@Test
	void searchNonExistentArtistTest() {
		assertEquals(0, section.searchForArtists("dscjldk")
				.size());
	}

	@Test
	void searchExistentTrackTest() {
		assertTrue(section.searchForTracks("Inside")
				.size() > 0);
	}

	@Test
	void searchNonExistentTrackTest() {
		assertEquals(0, section.searchForTracks("ldksjcdlkf")
				.size());
	}

	/*
	 * .sections() .artistSections() .get(0) .searchForArtists("Alanis") .get(0)
	 * .albums() .get(0) .getTracks(); }
	 */
}
