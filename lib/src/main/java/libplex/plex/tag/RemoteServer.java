package libplex.plex.tag;

import java.util.Date;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import libplex.plex.adapter.TimestampAdapter;

@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public class RemoteServer {
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
}
