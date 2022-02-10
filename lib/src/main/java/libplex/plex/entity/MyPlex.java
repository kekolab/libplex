package libplex.plex.entity;

import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import libplex.PlexClient;

@XmlRootElement(name = "MediaContainer")
@XmlAccessorType(XmlAccessType.NONE)
public class MyPlex {
    @XmlAttribute private String friendlyName;
    @XmlAttribute private String identifier;
    @XmlAttribute private String machineIdentifier;
    @XmlAttribute private Integer size;
    @XmlElement(name = "Server") private List<RemotelyAccessibleServerInfo> servers;
    private PlexClient plex;

    public String getFriendlyName() {
        return friendlyName;
    }

    public void setFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getMachineIdentifier() {
        return machineIdentifier;
    }

    public void setMachineIdentifier(String machineIdentifier) {
        this.machineIdentifier = machineIdentifier;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public List<RemotelyAccessibleServerInfo> getServers() {
        servers.forEach(s -> s.setPlexClient(plex));
        return servers;
    }

    public void setServers(List<RemotelyAccessibleServerInfo> servers) {
        this.servers = servers;
    }

    public void setPlex(PlexClient plex) {
        this.plex = plex;
    }
}
