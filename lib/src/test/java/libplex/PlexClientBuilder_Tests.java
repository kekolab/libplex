package libplex;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import libplex.Plex.Builder;
import libplex.plextv.entity.RemotelyAccessibleServerInfo;
import libplex.plextv.entity.Server;

class PlexClientBuilder_Tests {
	private Builder builder;
	private Plex plex;

	@BeforeEach
	void init() throws IOException {
		builder = new Builder("myPlexProduct", "v1.0", "myPlexClientIdentifier");
		Properties properties = new Properties();
		properties.load(getClass().getResourceAsStream("/testVariables.properties"));
		String authToken = properties.getProperty("authToken");
		plex = builder.withAuthenticationToken(authToken);
	}

	@Test
	void tests() throws IOException {
		List<RemotelyAccessibleServerInfo> servers = plex.myPlex()
				.getServers();
		Server server = servers.get(0)
				.server();
		server.library()
				.sections()
				.artistSections()
				.get(0)
				.searchForTracks("don't");
		System.out.println();
	}

	@Test
	void testRequestPIN() throws IOException {
		int pinId = builder.requestPIN()
				.getId();
		System.in.read();
		Plex client = builder.withAuthenticationToken(builder.verifyPin(pinId)
				.getAuthToken());
	}
}
