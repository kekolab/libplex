package libplex.test;

import java.io.IOException;
import java.util.Properties;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import libplex.PlexClient;
import libplex.entity.RemoteServers;
import libplex.entity.Server;
import libplex.entity.Track;

public class TrackTests {
	private static PlexClient client;
	private static Track track;

	@BeforeAll
	static void init() throws IOException {
		Properties props = new Properties();
		props.load(TrackTests.class.getResourceAsStream("/testVariables.properties"));
		client = new PlexClient(props.getProperty("authToken"));
		track = Server.buildRemote(client, new RemoteServers(client).getSummaries()
				.get(0))
				.library()
				.sections()
				.artistSections()
				.get(0)
				.all()
				.get(0)
				.albums()
				.get(0)
				.getTracks()
				.get(0);
	}

	@AfterAll
	static void close() throws Exception {
		client.close();
	}
	// TODO
}
