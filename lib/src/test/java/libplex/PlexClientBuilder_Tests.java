package libplex;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import libplex.Plex.Builder;
import libplex.plextv.entity.Directory;
import libplex.plextv.entity.LibraryDetails;
import libplex.plextv.entity.LibraryDirectory;
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
		List<Server> servers = plex.fetchMyPlex()
				.getServers();
		for (Server server : servers) {
			LibraryDetails ld = server.fetchDetails()
					.getDirectories()
					.stream()
					.filter(d -> d instanceof LibraryDirectory)
					.map(d -> (LibraryDirectory) d)
					.findAny()
					.get()
					.fetchDetails();
			for (Directory<?> d : ld.getDirectories()) {
				d.fetchDetails();
			}
		}
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
