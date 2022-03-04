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
    void init() {
        authenticator = new PlexAuthenticator("myPlexProduct", "v1.0", "myPlexClientIdentifier", null, null, null, null,
                null);
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

    @AfterEach
    void close() {
        authenticator.close();
    }
}
