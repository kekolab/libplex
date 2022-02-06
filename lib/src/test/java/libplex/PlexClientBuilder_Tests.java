package libplex;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import libplex.Plex.Builder;
import libplex.plextv.entity.ArtistSection;
import libplex.plextv.entity.Directory;
import libplex.plextv.entity.Library;
import libplex.plextv.entity.RemotelyAccessibleServerInfo;
import libplex.plextv.entity.SearchDirectory;
import libplex.plextv.entity.Sections;
import libplex.plextv.entity.Server;
import libplex.plextv.entity.Tracks;

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
		Directory<Library> ld = server.getLibraryDirectory();
		Library l = ld.get(Library.class);
		Directory<Sections> ds = l.sections();
		Sections s = ds.get(Sections.class);
		List<Directory<ArtistSection>> artistSections = s.artistSections();
		ArtistSection as = artistSections.get(0)
				.get(ArtistSection.class);
		SearchDirectory<Tracks> searchTracks = as.searchTracks();
		Tracks tracks = searchTracks.query(Tracks.class, "Bruno");
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
