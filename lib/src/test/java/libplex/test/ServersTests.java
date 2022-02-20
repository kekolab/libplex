package libplex.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.IOException;
import java.util.Properties;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import libplex.PlexClient;
import libplex.entity.RemoteServers;
import libplex.entity.Server;

class ServersTests {
	private PlexClient client;
	private Properties properties;

	@BeforeEach
	void init() throws IOException {
		properties = new Properties();
		properties.load(getClass().getResourceAsStream("/testVariables.properties"));
		String authToken = properties.getProperty("authToken");
		client = new PlexClient(authToken, "myPlexProduct", "v1.0", "myPlexClientIdentifier");
	}

	@AfterEach
	void close() throws Exception {
		client.close();
	}

	@Test
	void testLocalServer() throws Exception {
		client.close();
		client = new PlexClient();
		Server server = Server.buildLocal(client, properties.getProperty("localServerHost"),
				Integer.parseInt(properties.getProperty("localServerPort")));
		assertNotNull(server);
	}

	@Test
	void fetchRemoteServer() throws IOException {
		RemoteServers remoteServers = new RemoteServers(client);
		Server remoteServer = Server.buildRemote(client, remoteServers.getSummaries()
				.get(0));
		assertNotNull(remoteServer);
	}
}
