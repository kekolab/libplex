package libplex;

import java.io.IOException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import libplex.PlexClient.Builder;
import libplex.plextv.entity.ServerDetails;

class PlexClientBuilder_Tests {

	private Builder builder;

	@BeforeEach
	void init() {
		this.builder = new Builder("myPlexProduct", "v1.0", "myPlexClientIdentifier");
	}

	@Test
	void testRequestPIN() throws IOException {
		int pinId = builder.requestPIN().getId();
		System.in.read();
		PlexClient client = builder.withAuthenticationToken(builder.verifyPin(pinId).getAuthToken());
		client.fetchMyPlex().getServers().forEach(s -> {
			try {
			   ServerDetails sd = s.fetchDetails();
			   sd.getClass();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
	}
}
