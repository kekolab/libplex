package kekolab.libplex;

import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.core.Form;
import jakarta.ws.rs.core.UriBuilder;
import kekolab.libplex.entity.Pin;
import kekolab.libplex.entity.User;

public class PlexAuthenticator extends PlexBaseClient {
    public PlexAuthenticator(String product, String version, String clientIdentifier, String platform,
            String platformVersion, String device, String deviceName, PlexProvides[] provides) {
        super(null, product, version, clientIdentifier, platform, platformVersion, device, deviceName, provides);
    }

    public String signIn(String username, char[] password) {
        Form form = new Form().param("user[login]", username)
                .param("user[password]", new String(password));
        User user = executePost(UriBuilder.fromUri("https://plex.tv/users/sign_in.xml")
                .build(), Entity.form(form), User.class);
        return user.getAuthenticationToken();
    }

    public Pin requestPIN() {
        return executePost(UriBuilder.fromUri("https://plex.tv/pins.xml")
                .build(), null, Pin.class);
    }

    public Pin verifyPin(Pin pin) {
        return verifyPin(pin.getId());
    }

    public Pin verifyPin(int pinId) {
        return executeGet(UriBuilder.fromUri("https://plex.tv/pins/{pinId}.xml")
                .build(pinId), Pin.class);
    }
}