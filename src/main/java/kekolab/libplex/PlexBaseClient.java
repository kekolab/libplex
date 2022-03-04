package kekolab.libplex;

import java.net.URI;
import java.util.Arrays;
import java.util.stream.Collectors;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.ClientRequestFilter;
import jakarta.ws.rs.client.ClientResponseFilter;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.core.UriBuilder;

public class PlexBaseClient implements AutoCloseable {
    private static final Logger LOGGER = LoggerFactory.getLogger(PlexBaseClient.class);
    private Client client;
    private PlexUriBuilder uriBuilder;
    private String token;
    private String product;
    private String version;
    private String clientIdentifier;
    private String platform;
    private String platformVersion;
    private String device;
    private String deviceName;
    private PlexProvides[] provides;

    public PlexBaseClient(String token, String product, String version, String clientIdentifier, String platform,
            String platformVersion, String device, String deviceName, PlexProvides[] provides) {
        this.client = ClientBuilder.newClient()
                .register((ClientRequestFilter) requestContext -> {
                    if (token != null) {
                        URI uri = UriBuilder.fromUri(requestContext.getUri())
                                .queryParam("X-Plex-Token", token)
                                .build();
                        requestContext.setUri(uri);
                    }
                    if (product != null)
                        requestContext.getHeaders()
                                .putSingle("X-Plex-Product", product);
                    if (version != null)
                        requestContext.getHeaders()
                                .putSingle("X-Plex-Version", version);
                    if (clientIdentifier != null)
                        requestContext.getHeaders()
                                .putSingle("X-Plex-Client-Identifier", clientIdentifier);
                    if (platform != null)
                        requestContext.getHeaders()
                                .putSingle("X-Plex-Platform", platform);
                    if (platformVersion != null)
                        requestContext.getHeaders()
                                .putSingle("X-Plex-Platform-Version", platformVersion);
                    if (device != null)
                        requestContext.getHeaders()
                                .putSingle("X-Plex-Device", device);
                    if (deviceName != null)
                        requestContext.getHeaders()
                                .putSingle("X-Plex-Device-Name", deviceName);
                    if (provides != null && provides.length > 0)
                        requestContext.getHeaders()
                                .put("X-Plex-Provides", Arrays.stream(provides)
                                        .map(pp -> pp.getPlexProvides())
                                        .collect(Collectors.toList()));

                })
                .register((ClientResponseFilter) (requestContext, responseContext) -> {
                    LOGGER.debug("REQUEST");
                    LOGGER.debug(requestContext.getMethod()
                            .concat(" ")
                            .concat(requestContext.getUri()
                                    .toString()));
                    requestContext.getHeaders()
                            .forEach((t, u) -> {
                                StringBuilder message = new StringBuilder(t).append(": ");
                                u.stream()
                                        .map(o -> o.toString())
                                        .reduce((arg0, arg1) -> arg0 != null ? arg0.concat(", ")
                                                .concat(arg1) : arg1)
                                        .ifPresent(message::append);
                                LOGGER.debug(message.toString());
                            });
                    LOGGER.debug("RESPONSE");
                    LOGGER.debug("Status: ".concat(Integer.toString(responseContext.getStatus())));
                    responseContext.getHeaders()
                            .forEach((t, u) -> {
                                StringBuilder message = new StringBuilder().append(t)
                                        .append(": ");
                                u.stream()
                                        .map(o -> o.toString())
                                        .reduce((arg0, arg1) -> arg0 != null ? arg0.concat(", ")
                                                .concat(arg1) : arg1)
                                        .ifPresent(message::append);
                                LOGGER.debug(message.toString());
                            });
                    String payload = IOUtils.toString(responseContext.getEntityStream(), "UTF-8");
                    LOGGER.debug(payload);
                    responseContext.setEntityStream(IOUtils.toInputStream(payload, "UTF-8"));
                });
        uriBuilder = new PlexUriBuilder();
    }

    public <A> A executeGet(URI uri, Class<A> outputClass) {
        return client.target(uri)
                .request()
                .get(outputClass);
    }

    public <A> A executePost(URI uri, Entity<?> entity, Class<A> cls) {
        return client.target(uri)
                .request()
                .post(entity, cls);
    }

    @Override
    public void close() {
        client.close();
    }

    public String getToken() {
        return token;
    }

    public String getProduct() {
        return product;
    }

    public String getVersion() {
        return version;
    }

    public String getClientIdentifier() {
        return clientIdentifier;
    }

    public String getPlatform() {
        return platform;
    }

    public String getPlatformVersion() {
        return platformVersion;
    }

    public String getDevice() {
        return device;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public PlexProvides[] getProvides() {
        return provides;
    }

    public Client getClient() {
        return client;
    }

    public PlexUriBuilder uriBuilder() {
        return uriBuilder;
    }
}
