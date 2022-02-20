package libplex.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.IOException;
import java.util.Properties;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import libplex.PlexClient;
import libplex.entity.Library;
import libplex.entity.RemoteServers;
import libplex.entity.Server;

public class LibraryTests {
	private static PlexClient client;
	private static Server server;

	@BeforeAll
	static void init() throws IOException {
		Properties props = new Properties();
		props.load(LibraryTests.class.getResourceAsStream("/testVariables.properties"));
		client = new PlexClient(props.getProperty("authToken"));
		server = Server.buildRemote(client, new RemoteServers(client).getSummaries()
				.get(0));
	}

	@AfterAll
	static void close() throws Exception {
		client.close();
	}

	@Test
	void libraryTest() throws IOException {
		Library library = server.library();
		assertNotNull(library);
		assertNotNull(library.getUri());
		assertNotNull(library.onDeck());
		assertNotNull(library.sections());
	}
}
