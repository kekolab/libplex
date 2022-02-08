package libplex;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import libplex.Plex.Builder;
import libplex.entity.Server;
import libplex.plex.entity.RemotelyAccessibleServerInfo;

class PlexClientBuilder_Tests {
    private Builder builder;
    private Plex plex;
    private Properties properties;

    @BeforeEach
    void init() throws IOException {
	builder = new Builder("myPlexProduct", "v1.0", "myPlexClientIdentifier");
	properties = new Properties();
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
		.searchForArtists("Alanis")
		.list()
		.get(0)
		.albums()
		.list()
		.get(0)
		.tracks();
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

    @Test
    void testLocalServer() {
	Server server = plex.localServer(properties.getProperty("localServerHost"),
		Integer.parseInt(properties.getProperty("localServerPort")));
    }
}
