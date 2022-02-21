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
import kekolab.libplex.entity.Server;
import kekolab.libplex.entity.Servers;

public class PlexService implements AutoCloseable {
    private static final Logger LOGGER = LoggerFactory.getLogger(PlexService.class);
    private Client client;
    private String token;
    private String product;
    private String version;
    private String clientIdentifier;
    private String platform;
    private String platformVersion;
    private String device;
    private String deviceName;
    private PlexProvides[] provides;

    private PlexService(String token, String product, String version, String clientIdentifier, String platform,
            String platformVersion, String device, String deviceName, PlexProvides[] provides) {
        this.token = token;
        this.product = product;
        this.version = version;
        this.clientIdentifier = clientIdentifier;
        this.platform = platform;
        this.platformVersion = platformVersion;
        this.device = device;
        this.deviceName = deviceName;
        this.provides = provides;
        this.client = ClientBuilder.newClient()
                .register((ClientRequestFilter) requestContext -> {
                    if (token != null) {
                        URI updatedUri = UriBuilder.fromUri(requestContext.getUri())
                                .queryParam("X-Plex-Token", token)
                                .build();
                        requestContext.setUri(updatedUri);
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
                                LOGGER.debug(t.concat(": "));
                                u.stream()
                                        .map(o -> o.toString())
                                        .reduce((arg0, arg1) -> arg0 != null ? arg0.concat(", ")
                                                .concat(arg1) : arg1)
                                        .ifPresent(LOGGER::debug);
                            });
                    LOGGER.debug("RESPONSE");
                    LOGGER.debug("Status: ".concat(Integer.toString(responseContext.getStatus())));
                    responseContext.getHeaders()
                            .forEach((t, u) -> {
                                LOGGER.debug(t.concat(": "));
                                u.stream()
                                        .map(o -> o.toString())
                                        .reduce((arg0, arg1) -> arg0 != null ? arg0.concat(", ")
                                                .concat(arg1) : arg1)
                                        .ifPresent(LOGGER::debug);
                            });
                    String payload = IOUtils.toString(responseContext.getEntityStream(), "UTF-8");
                    LOGGER.debug(payload);
                    responseContext.setEntityStream(IOUtils.toInputStream(payload, "UTF-8"));
                });

    }

    public Servers remoteServers() {
        return new Servers(this, UriBuilder.fromUri("https://plex.tv/pms/servers.xml")
                .build());
    }

    public Server localServer(String host, int port) {
        return new Server(this, UriBuilder.newInstance()
                .scheme("http")
                .host(host)
                .port(port)
                .build());

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
    public void close() throws Exception {
        client.close();
    }

    public static class Builder {
        private String token;
        private String product;
        private String version;
        private String clientIdentifier;
        private String platform;
        private String platformVersion;
        private String device;
        private String deviceName;
        private PlexProvides[] provides;

        public PlexService build() {
            return new PlexService(token, product, version, clientIdentifier, platform, platformVersion, device,
                    deviceName, provides);
        }

        public Builder setPlexToken(String token) {
            this.token = token;
            return this;
        }

        public Builder setPlexProduct(String product) {
            this.product = product;
            return this;
        }

        public Builder setPlexVersion(String version) {
            this.version = version;
            return this;
        }

        public Builder setPlexClientIdentifier(String clientIdentifier) {
            this.clientIdentifier = clientIdentifier;
            return this;
        }

        public Builder setPlexPlatform(String platform) {
            this.platform = platform;
            return this;
        }

        public Builder setPlexPlatformVersion(String platformVersion) {
            this.platformVersion = platformVersion;
            return this;
        }

        public Builder setPlexDevice(String device) {
            this.device = device;
            return this;
        }

        public Builder setPlexDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }

        public Builder setPlexProvides(PlexProvides[] provides) {
            this.provides = provides;
            return this;
        }
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
}
