package kekolab.libplex.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

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
}
