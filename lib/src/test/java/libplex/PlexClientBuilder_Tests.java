package libplex;

import java.io.IOException;
import java.util.Properties;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import jakarta.ws.rs.core.UriBuilderException;
import libplex.Plex.Builder;
import libplex.plextv.entity.LibraryDetails;
import libplex.plextv.entity.LibraryDirectory;
import libplex.plextv.entity.ServerDetails;

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
    void tests() {
	plex.fetchMyPlex()
		.getServers()
		.forEach(s -> {
		    try {
			ServerDetails sd = s.fetchDetails();
			sd.getDirectories()
				.forEach(d -> {
				    try {
					System.out.println(d.getUri());
				    } catch (IllegalArgumentException | UriBuilderException | IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				    }
				});
			LibraryDetails ld = sd.getDirectories()
				.stream()
				.filter(d -> d instanceof LibraryDirectory)
				.map(d -> (LibraryDirectory) d)
				.findAny()
				.get()
				.fetchDetails();
			ld.getDirectories()
				.forEach(d -> {
				    try {
					d.fetchDetails();
				    } catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				    }
				});
		    } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		    }
		});
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
