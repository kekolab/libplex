package libplex;

import java.net.URI;

import org.apache.commons.io.IOUtils;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.ClientRequestFilter;
import jakarta.ws.rs.client.ClientResponseFilter;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.core.MultivaluedMap;
import jakarta.ws.rs.core.UriBuilder;

public class PlexClient implements AutoCloseable {
    private Client client;

    public PlexClient() {
        setClient(ClientBuilder.newClient()
                .register((ClientResponseFilter) (requestContext, responseContext) -> {
                    String payload = IOUtils.toString(responseContext.getEntityStream(), "UTF-8");
                    responseContext.setEntityStream(IOUtils.toInputStream(payload, "UTF-8"));
                    System.out.println(payload);
                }));
    }

    public PlexClient(String plexToken) {
        this();
        setPlexToken(plexToken);
    }

    PlexClient(String plexProduct, String plexVersion, String plexClientIdentifier) {
        this();
        getClient().register((ClientRequestFilter) requestContext -> {
            MultivaluedMap<String, Object> headers = requestContext.getHeaders();
            headers.add("X-Plex-Product", plexProduct);
            headers.add("X-Plex-Version", plexVersion);
            headers.add("X-Plex-Client-Identifier", plexClientIdentifier);
        });
    }

    public PlexClient(String plexToken, String plexProduct, String plexVersion, String plexClientIdentifier) {
        this(plexProduct, plexVersion, plexClientIdentifier);
        setPlexToken(plexToken);
    }

    public PlexClient setPlexToken(String plexToken) {
        getClient().register((ClientRequestFilter) requestContext -> {
            URI updatedUri = UriBuilder.fromUri(requestContext.getUri())
                    .queryParam("X-Plex-Token", plexToken)
                    .build();
            requestContext.setUri(updatedUri);
        });
        return this;
    }

    public PlexClient setPlexPlatform(String plexPlatform) {
        getClient().register((ClientRequestFilter) requestContext -> requestContext.getHeaders()
                .putSingle("X-Plex-Platform", plexPlatform));
        return this;
    }

    public PlexClient setPlexPlatformVersion(String plexPlatformVersion) {
        getClient().register((ClientRequestFilter) requestContext -> requestContext.getHeaders()
                .putSingle("X-Plex-Platform-Version", plexPlatformVersion));
        return this;
    }

    /**
     * 
     * @param plexProvides
     * @return
     */
    public PlexClient addPlexProvides(PlexProvides plexProvides) {
        getClient().register((ClientRequestFilter) requestContext -> requestContext.getHeaders()
                .add("X-Plex-Provides", plexProvides.getPlexProvides()));
        return this;
    }

    public PlexClient setPlexDevice(String plexDevice) {
        getClient().register((ClientRequestFilter) requestContext -> requestContext.getHeaders()
                .add("X-Plex-Device", plexDevice));
        return this;
    }

    public PlexClient setPlexDeviceName(String plexDeviceName) {
        getClient().register((ClientRequestFilter) requestContext -> requestContext.getHeaders()
                .add("X-Plex-Device-Name", plexDeviceName));
        return this;
    }

    public <A> A executeGet(URI uri, Class<A> outputClass) {
        return getClient().target(uri)
                .request()
                .get(outputClass);
    }

    public <A> A executePost(URI uri, Entity<?> entity, Class<A> cls) {
        return getClient().target(uri)
                .request()
                .post(entity, cls);
    }

    @Override
    public void close() throws Exception {
        getClient().close();
    }

    private Client getClient() {
        return client;
    }

    private void setClient(Client client) {
        this.client = client;
    }
}
