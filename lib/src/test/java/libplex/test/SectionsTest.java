package libplex.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.util.Properties;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import libplex.PlexClient;
import libplex.entity.Library;
import libplex.entity.RemoteServers;
import libplex.entity.Sections;
import libplex.entity.Server;

public class SectionsTest {
	private static PlexClient client;
	private static Library library;

	@BeforeAll
	static void init() throws IOException {
		Properties props = new Properties();
		props.load(SectionsTest.class.getResourceAsStream("/testVariables.properties"));
		client = new PlexClient(props.getProperty("authToken"));
		library = Server.buildRemote(client, new RemoteServers(client).getSummaries()
				.get(0))
				.library();
	}

	@AfterAll
	static void close() throws Exception {
		client.close();
	}

	@Test
	void sectionsTest() {
		Sections sections = library.sections();
		assertNotNull(sections);
		assertNotNull(sections.getUri());
		assertTrue(sections.all()
				.size() > 0);
		assertTrue(sections.artistSections()
				.size() > 0);
		assertTrue(sections.movieSections()
				.size() > 0);
	}
}
