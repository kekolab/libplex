package kekolab.libplex.entity;

import java.io.IOException;
import java.net.URI;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;

import javax.net.ssl.HttpsURLConnection;

import jakarta.ws.rs.core.UriBuilder;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import kekolab.libplex.PlexClient;
import kekolab.libplex.xmladapter.TimestampAdapter;

@XmlRootElement(name = "MediaContainer")
public class ServersContainer extends PlexItem {
    private String friendlyName, identifier, machineIdentifier, size;
    private List<Server> servers = new ArrayList<>(0);

    public String getFriendlyName() {
        return friendlyName;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getMachineIdentifier() {
        return machineIdentifier;
    }

    public String getSize() {
        return size;
    }

    public List<Server> getServers() {
        if (servers != null)
            servers.forEach(server -> {
                server.setClient(getClient());
            });
        return servers;
    }

    @XmlAttribute
    public void setFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
    }

    @XmlAttribute
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @XmlAttribute
    public void setMachineIdentifier(String machineIdentifier) {
        this.machineIdentifier = machineIdentifier;
    }

    @XmlAttribute
    public void setSize(String size) {
        this.size = size;
    }

    @XmlElement(name = "Server")
    public void setServers(List<Server> servers) {
        this.servers = servers;
    }

    public static class Server {
        private String accessToken, name, address, version, scheme, host, localAddresses, machineIdentifier;
        private Integer port, owned, synced;
        private Date createdAt, updatedAt;
        private PlexClient client;

        public PlexMediaServer plexMediaServer() throws IOException {
            HttpsURLConnection connection = (HttpsURLConnection) UriBuilder.newInstance()
                    .scheme("https")
                    .host(getHost())
                    .port(getPort())
                    .build()
                    .toURL()
                    .openConnection();
            connection.setHostnameVerifier((hostname, session) -> true);
            connection.connect();
            X509Certificate serverCertificate = (X509Certificate) connection.getServerCertificates()[0];
            String cn = serverCertificate.getSubjectX500Principal()
                    .getName();
            URI uri = UriBuilder.newInstance()
                    .scheme("https")
                    .host(getHost().replaceAll(Pattern.quote("."), "-")
                            .concat(cn.substring(4)))
                    .port(getPort())
                    .build();
            return new PlexItem.Builder<PlexMediaServer>(client, uri).build(PlexMediaServer.class);
        }

        public String getAccessToken() {
            return accessToken;
        }

        protected void setClient(PlexClient client) {
            this.client = client;
        }

        public String getName() {
            return name;
        }

        public String getAddress() {
            return address;
        }

        public String getVersion() {
            return version;
        }

        public String getScheme() {
            return scheme;
        }

        public String getHost() {
            return host;
        }

        public String getLocalAddresses() {
            return localAddresses;
        }

        public String getMachineIdentifier() {
            return machineIdentifier;
        }

        public Integer getPort() {
            return port;
        }

        public Integer getOwned() {
            return owned;
        }

        public Integer getSynced() {
            return synced;
        }

        public Date getCreatedAt() {
            return createdAt;
        }

        public Date getUpdatedAt() {
            return updatedAt;
        }

        @XmlAttribute
        public void setAccessToken(String accessToken) {
            this.accessToken = accessToken;
        }

        @XmlAttribute
        public void setName(String name) {
            this.name = name;
        }

        @XmlAttribute
        public void setAddress(String address) {
            this.address = address;
        }

        @XmlAttribute
        public void setVersion(String version) {
            this.version = version;
        }

        @XmlAttribute
        public void setScheme(String scheme) {
            this.scheme = scheme;
        }

        @XmlAttribute
        public void setHost(String host) {
            this.host = host;
        }

        @XmlAttribute
        public void setLocalAddresses(String localAddresses) {
            this.localAddresses = localAddresses;
        }

        @XmlAttribute
        public void setMachineIdentifier(String machineIdentifier) {
            this.machineIdentifier = machineIdentifier;
        }

        @XmlAttribute
        public void setPort(Integer port) {
            this.port = port;
        }

        @XmlAttribute
        public void setOwned(Integer owned) {
            this.owned = owned;
        }

        @XmlAttribute
        public void setSynced(Integer synced) {
            this.synced = synced;
        }

        @XmlAttribute
        @XmlJavaTypeAdapter(TimestampAdapter.class)
        public void setCreatedAt(Date createdAt) {
            this.createdAt = createdAt;
        }

        @XmlAttribute
        @XmlJavaTypeAdapter(TimestampAdapter.class)
        public void setUpdatedAt(Date updatedAt) {
            this.updatedAt = updatedAt;
        }
    }
}
