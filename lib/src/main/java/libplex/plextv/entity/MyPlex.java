package libplex.plextv.entity;

import java.util.List;

import jakarta.ws.rs.client.Client;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "MediaContainer")
@XmlAccessorType(XmlAccessType.NONE)
public class MyPlex {
	@XmlAttribute private String friendlyName;
	@XmlAttribute private String identifier;
	@XmlAttribute private String machineIdentifier;
	@XmlAttribute private int size;
	@XmlElement(name = "Server") private List<RemotelyAccessibleServerInfo> servers;

	private Client client;
	private boolean serversInitialised;

	public MyPlex setClient(Client client) {
		this.client = client;
		return this;
	}

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

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public List<RemotelyAccessibleServerInfo> getServers() {
		if (!serversInitialised) {
			servers.forEach(s -> s.setClient(client));
			serversInitialised = true;
		}
		return servers;
	}

	public void setServers(List<RemotelyAccessibleServerInfo> servers) {
		this.servers = servers;
	}
}
