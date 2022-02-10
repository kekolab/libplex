package libplex.plex.entity;

import java.io.IOException;
import java.net.URI;
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
import libplex.PlexClient;
import libplex.entity.Server;
import libplex.plex.entity.adapter.TimestampAdapter;

@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public class RemotelyAccessibleServerInfo {
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

    private URI baseUri;
    private PlexClient plex;

    public URI uri() throws IOException {
        if (baseUri == null) {
            HttpsURLConnection connection = (HttpsURLConnection) UriBuilder.newInstance()
                    .scheme("https")
                    .host(host)
                    .port(port)
                    .build()
                    .toURL()
                    .openConnection();
            connection.setHostnameVerifier((arg0, arg1) -> true);
            connection.connect();
            X509Certificate serverCertificate = (X509Certificate) connection.getServerCertificates()[0];
            String cn = serverCertificate.getSubjectX500Principal()
                    .getName();
            this.baseUri = UriBuilder.newInstance()
                    .scheme("https")
                    .host(host.replaceAll(Pattern.quote("."), "-")
                            .concat(cn.substring(4)))
                    .port(port)
                    .build();
        }
        return baseUri;
    }

    public Server server() throws IOException {
        return new Server(plex, uri());
    }

    public void setPlexClient(PlexClient plex) {
        this.plex = plex;
    }

}
