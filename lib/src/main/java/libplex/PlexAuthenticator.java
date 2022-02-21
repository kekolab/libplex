package libplex;

import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.core.Form;
import jakarta.ws.rs.core.UriBuilder;
import libplex.plex.tag.Pin;
import libplex.plex.tag.User;

public class PlexAuthenticator implements AutoCloseable {
    private PlexService service;

    public PlexAuthenticator(String plexProduct, String plexVersion, String plexClientIdentifier) {
        service = new PlexService.Builder().setPlexProduct(plexProduct)
                .setPlexVersion(plexVersion)
                .setPlexClientIdentifier(plexClientIdentifier)
                .build();
    }

    public String signIn(String username, char[] password) {
        Form form = new Form().param("user[login]", username)
                .param("user[password]", new String(password));
        User user = service.executePost(UriBuilder.fromUri("https://plex.tv/users/sign_in.xml")
                .build(), Entity.form(form), User.class);
        return user.getAuthenticationToken();
    }

    public Pin requestPIN() {
        return service.executePost(UriBuilder.fromUri("https://plex.tv/pins.xml")
                .build(), null, Pin.class);
    }

    public Pin verifyPin(Pin pin) {
        return verifyPin(pin.getId());
    }

    public Pin verifyPin(int pinId) {
        return service.executeGet(UriBuilder.fromUri("https://plex.tv/pins/{pinId}.xml")
                .build(pinId), Pin.class);
    }

    @Override
    public void close() throws Exception {
        service.close();
    }
}