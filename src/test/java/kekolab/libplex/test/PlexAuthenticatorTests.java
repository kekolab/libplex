package kekolab.libplex.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.IOException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import kekolab.libplex.PlexAuthenticator;
import kekolab.libplex.entity.Pin;

public class PlexAuthenticatorTests {
	private PlexAuthenticator authenticator;

	@BeforeEach
	void init() throws IOException {
		authenticator = new PlexAuthenticator("myPlexProduct", "v1.0", "myPlexClientIdentifier");
	}

	@Test
	void testRequestPIN() throws IOException {
		Pin pin = authenticator.requestPIN();
		assertNotNull(pin);
		assertEquals(pin.getClientIdentifier(), "myPlexClientIdentifier");
		assertNotNull(pin.getCode());
		assertNotNull(pin.getExpiresAt());
		assertNotNull(pin.getId());
		System.in.read();
		pin = authenticator.verifyPin(pin);
		assertNotNull(pin);
		assertFalse(pin.getAuth_Token()
				.isEmpty());
		assertFalse(pin.getAuthToken()
				.isEmpty());
	}

	@Test
	void requestPin() {
		authenticator = new PlexAuthenticator("wonkru", "v1.0", "wonkru-plex-client");
		authenticator.requestPIN();
	}

	@Test
	void testVerifyPin() {
		Pin pin = new Pin();
		/*
		 * { "id": 382631463, "code": "BZLY", "expiresAt": 1645741319000,
		 * "clientIdentifier":
		 * "amzn1.ask.device.AEZRIRB5CLV4ODUBM3I3PINGTA5B5FGYOUQI4MKEMEOURA3VQR5MUYUWDEZD6B3S7BQGZPEYPYUDWB6EAEHEUD2D4RHX66ALGID6ZJ5MOY4CLZ3RMZ4I3DISKAVZLHS4GNUTYYYDSE4PUZSFVZUU6MACQY2YWEN5TMDY65W7PU2RH5DSBDDV4",
		 * "trusted": false, "userId": 0, "authToken": "", "auth_Token": "" }
		 */
		pin.setId(422610502);
		authenticator = new PlexAuthenticator("wonkru", "v1.0", "wonkru-plex-client");
		authenticator.verifyPin(pin);
	}

	@AfterEach
	void close() throws Exception {
		authenticator.close();
	}
}
