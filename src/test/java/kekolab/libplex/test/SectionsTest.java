package kekolab.libplex.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.util.Properties;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import kekolab.libplex.PlexService;
import kekolab.libplex.entity.Library;
import kekolab.libplex.entity.Sections;

public class SectionsTest {
	private static PlexService client;
	private static Library library;

	@BeforeAll
	static void init() throws IOException {
		Properties props = new Properties();
		props.load(SectionsTest.class.getResourceAsStream("/testVariables.properties"));
		client = new PlexService.Builder().setPlexToken(props.getProperty("authToken"))
				.setPlexProduct("myPlexProduct")
				.setPlexVersion("v1.0")
				.setPlexClientIdentifier("myPlexClientIdentifier")
				.build();
		library = client.servers()
				.getServers()
				.get(0)
				.content()
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
		assertTrue(sections.artistSections()
				.size() > 0);
		assertTrue(sections.movieSections()
				.size() > 0);
	}
}
