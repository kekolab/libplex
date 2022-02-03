package libplex.plextv.entity;

import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "MediaContainer")
@XmlAccessorType(XmlAccessType.NONE)
public class MyPlex {
	private String friendlyName;
	private String identifier;
	private String machineIdentifier;
	private int size;
	private List<RemotelyAccessibleServerInfo> servers;

	@XmlAttribute
	public String getFriendlyName() {
		return friendlyName;
	}

	public void setFriendlyName(String friendlyName) {
		this.friendlyName = friendlyName;
	}

	@XmlAttribute
	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	@XmlAttribute
	public String getMachineIdentifier() {
		return machineIdentifier;
	}

	public void setMachineIdentifier(String machineIdentifier) {
		this.machineIdentifier = machineIdentifier;
	}

	@XmlAttribute
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@XmlElement(name = "Server")
	public List<RemotelyAccessibleServerInfo> getServers() {
		return servers;
	}

	public void setServers(List<RemotelyAccessibleServerInfo> servers) {
		this.servers = servers;
	}
}
