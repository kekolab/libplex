package kekolab.libplex.entity;

import java.io.IOException;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.regex.Pattern;

import javax.net.ssl.HttpsURLConnection;

import jakarta.ws.rs.core.UriBuilder;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import kekolab.libplex.PlexService;
import kekolab.libplex.xmladapter.TimestampAdapter;

@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public class Server {
    @XmlAttribute private String accessToken;
    @XmlAttribute private String name;
    @XmlAttribute private String address;
    @XmlAttribute private Integer port;
    @XmlAttribute private String version;
    @XmlAttribute private String scheme;
    @XmlAttribute private String host;
    @XmlAttribute private String localAddresses;
    @XmlAttribute private String machineIdentifier;
    @XmlAttribute
    @XmlJavaTypeAdapter(TimestampAdapter.class) private Date createdAt;
    @XmlAttribute
    @XmlJavaTypeAdapter(TimestampAdapter.class) private Date updatedAt;
    @XmlAttribute private Integer owned;
    @XmlAttribute private Integer synced;
    private PlexService plex;

    public String getAccessToken() {
        return accessToken;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Integer getPort() {
        return port;
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

    public Date getCreatedAt() {
        return createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public Integer getOwned() {
        return owned;
    }

    public Integer getSynced() {
        return synced;
    }

    public void setPlexService(PlexService plex) {
        this.plex = plex;
    }

    public ServerContent content() throws IOException {
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
        return new ServerContent(plex, UriBuilder.newInstance()
                .scheme("https")
                .host(getHost().replaceAll(Pattern.quote("."), "-")
                        .concat(cn.substring(4)))
                .port(getPort())
                .build());
    }
}
