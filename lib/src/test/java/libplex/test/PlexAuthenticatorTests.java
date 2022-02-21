package libplex.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.IOException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import libplex.PlexAuthenticator;
import libplex.plex.tag.Pin;

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

    @AfterEach
    void close() throws Exception {
        authenticator.close();
    }
}
