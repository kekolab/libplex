package libplex;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;

import javax.net.ssl.HttpsURLConnection;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.ClientRequestFilter;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.Form;
import jakarta.ws.rs.core.MultivaluedMap;
import jakarta.ws.rs.core.Response;
import libplex.plextv.entity.MediaContainer_Server;
import libplex.plextv.entity.MediaContainer_Servers;
import libplex.plextv.entity.Server;
import libplex.plextv.entity.User;

public class PlexAPI implements AutoCloseable {
    private Client client;
    private String xPlexToken;

    private PlexAPI(Client client, String xPlexToken) {
        this.client = client;
        this.xPlexToken = xPlexToken;
    }
    
    public MediaContainer_Servers listServers() {
        return client.target("https://plex.tv/pms/servers.xml")
        .queryParam("X-Plex-Token", xPlexToken)
        .request()
        .get(MediaContainer_Servers.class);
    }

    public MediaContainer_Server getServer(Server server) throws MalformedURLException, IOException {
        return client.target(server.getPublicBaseLink())
        .queryParam("X-Plex-Token", server.getAccessToken())
        .request()
        .get(MediaContainer_Server.class);
    }

    @Override
    public void close() {
        client.close();
    }

    public static class Builder {
        private Client client;
    
        public Builder(String xPlexProduct, String xPlexVersion, String xPlexClientIdentifier) {
            this.client = ClientBuilder.newClient()
            .register((ClientRequestFilter) requestContext -> {
                MultivaluedMap<String, Object> headers = requestContext.getHeaders();
                headers.add("X-Plex-Product", xPlexProduct);
                headers.add("X-Plex-Version", xPlexVersion);
                headers.add("X-Plex-Client-Identifier", xPlexClientIdentifier);
            });
        }
    
        public PlexAPI authenticate(String username, char[] password) {
            Form form = new Form()
            .param("user[login]", username)
            .param("user[password]", new String(password));
            Invocation invocation = client.target("https://plex.tv/users/sign_in.xml")
            .request()
            .buildPost(Entity.form(form));
            Response response = invocation.invoke();
            User user = response.readEntity(User.class);
            System.out.println(user.getAuthenticationToken());
            return new PlexAPI(client, user.getAuthenticationToken());
        }

        public PlexAPI fromXPlexToken(String xPlexToken) {
            return new PlexAPI(client, xPlexToken);
        }
    }

    public static void main(String[] args) throws MalformedURLException, IOException {
        PlexAPI api = new PlexAPI.Builder("xxx", "xxx", "xxx")
        .authenticate("coviello.gl@gmail.com", "drbenton".toCharArray());
        MediaContainer_Servers mcServers = api.listServers();
        MediaContainer_Server mcServer = api.getServer(mcServers.getServers().get(0));
        api.close();
    }
}