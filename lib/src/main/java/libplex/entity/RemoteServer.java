package libplex.entity;

import java.io.IOException;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.regex.Pattern;

import javax.net.ssl.HttpsURLConnection;

import jakarta.ws.rs.core.UriBuilder;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import libplex.PlexService;

@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public class RemoteServer {
    private libplex.plex.tag.RemoteServer remoteServer;
    private PlexService plex;

    public RemoteServer(PlexService plex, libplex.plex.tag.RemoteServer remoteServer) {
        this.plex = plex;
        this.remoteServer = remoteServer;
    }

    public Server server() throws IOException {
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
        return new Server(plex, UriBuilder.newInstance()
                .scheme("https")
                .host(getHost().replaceAll(Pattern.quote("."), "-")
                        .concat(cn.substring(4)))
                .port(getPort())
                .build());
    }

    public String getName() {
        return remoteServer.getName();
    }

    public String getAddress() {
        return remoteServer.getAddress();
    }

    public Integer getPort() {
        return remoteServer.getPort();
    }

    public String getVersion() {
        return remoteServer.getVersion();
    }

    public String getScheme() {
        return remoteServer.getScheme();
    }

    public String getHost() {
        return remoteServer.getHost();
    }

    public String getLocalAddresses() {
        return remoteServer.getLocalAddresses();
    }

    public String getMachineIdentifier() {
        return remoteServer.getMachineIdentifier();
    }

    public Date getCreatedAt() {
        return remoteServer.getCreatedAt();
    }

    public Date getUpdatedAt() {
        return remoteServer.getUpdatedAt();
    }

    public Integer getOwned() {
        return remoteServer.getOwned();
    }

    public Integer getSynced() {
        return remoteServer.getSynced();
    }

}
