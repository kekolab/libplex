package libplex;

import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.core.Form;
import jakarta.ws.rs.core.UriBuilder;
import libplex.plex.entity.Pin;
import libplex.plex.entity.User;

public class PlexAuthenticator implements AutoCloseable {
    private PlexClient plexClient;

    public PlexAuthenticator(String plexProduct, String plexVersion, String plexClientIdentifier) {
        this.setPlexClient(new PlexClient(plexProduct, plexVersion, plexClientIdentifier));
    }

    public String signIn(String username, char[] password) {
        Form form = new Form().param("user[login]", username)
                .param("user[password]", new String(password));
        User user = getPlexClient().executePost(UriBuilder.fromUri("https://plex.tv/users/sign_in.xml")
                .build(), Entity.form(form), User.class);
        return user.getAuthenticationToken();
    }

    public Pin requestPIN() {
        return getPlexClient().executePost(UriBuilder.fromUri("https://plex.tv/pins.xml")
                .build(), null, Pin.class);
    }

    public Pin verifyPin(Pin pin) {
        return this.verifyPin(pin.getId());
    }

    public Pin verifyPin(int pinId) {
        return getPlexClient().executeGet(UriBuilder.fromUri("https://plex.tv/pins/{pinId}.xml")
                .build(pinId), Pin.class);
    }

    @Override
    public void close() throws Exception {
        getPlexClient().close();
    }

    private PlexClient getPlexClient() {
        return plexClient;
    }

    private void setPlexClient(PlexClient plexClient) {
        this.plexClient = plexClient;
    }
}