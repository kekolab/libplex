package libplex.test;

import java.io.IOException;
import java.util.Properties;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import libplex.PlexClient;
import libplex.entity.Artist;
import libplex.entity.RemoteServers;
import libplex.entity.Server;

public class ArtistTests {
	private static PlexClient client;
	private static Artist artist;

	@BeforeAll
	static void init() throws IOException {
		Properties props = new Properties();
		props.load(ArtistTests.class.getResourceAsStream("/testVariables.properties"));
		client = new PlexClient(props.getProperty("authToken"));
		artist = Server.buildRemote(client, new RemoteServers(client).getSummaries()
				.get(0))
				.library()
				.sections()
				.artistSections()
				.get(0)
				.all()
				.get(0);
	}

	@AfterAll
	static void close() throws Exception {
		client.close();
	}
	// TODO
}
