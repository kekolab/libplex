package libplex.plextv.entity;

import java.io.IOException;
import java.net.URI;
import java.security.cert.X509Certificate;
import java.util.regex.Pattern;

import javax.net.ssl.HttpsURLConnection;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.core.UriBuilder;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public class Server {
	private String accessToken;
	private String name;
	private String address;
	private int port;
	private String version;
	private String scheme;
	private String host;
	private String localAddresses;
	private String machineIdentifier;
	private long createdAt;
	private long updatedAt;
	private int owned;
	private int synced;
	private URI baseUri;
	private Client client;

	public Server buildBaseUri() throws IOException {

		return this;
	}

	public URI getBaseUri() throws IOException {
		if (baseUri == null) {
			HttpsURLConnection connection = (HttpsURLConnection) UriBuilder.newInstance()
					.scheme("https")
					.host(this.getHost())
					.port(this.getPort())
					.build()
					.toURL()
					.openConnection();
			connection.setHostnameVerifier((arg0, arg1) -> true);
			connection.connect();
			X509Certificate serverCertificate = (X509Certificate) connection.getServerCertificates()[0];
			String cn = serverCertificate
					.getSubjectX500Principal()
					.getName();
			this.baseUri = UriBuilder
					.newInstance()
					.scheme("https")
					.host(this.getHost()
							.replaceAll(Pattern.quote("."), "-")
							.concat(cn.substring(4)))
					.port(this.getPort())
					.build();            
		}
		return baseUri;
	}

	public ServerDetails fetchDetails() throws IOException {
		return client
				.target(getBaseUri())
				.request()
				.get(ServerDetails.class);
	}

	public Server setClient(Client client) {
		this.client = client;
		return this;
	}

	@XmlAttribute
	public String getAccessToken() {
		return accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	@XmlAttribute
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@XmlAttribute
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	@XmlAttribute
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}

	@XmlAttribute
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}

	@XmlAttribute
	public String getScheme() {
		return scheme;
	}
	public void setScheme(String scheme) {
		this.scheme = scheme;
	}

	@XmlAttribute
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}

	@XmlAttribute
	public String getLocalAddresses() {
		return localAddresses;
	}
	public void setLocalAddresses(String localAddresses) {
		this.localAddresses = localAddresses;
	}

	@XmlAttribute
	public String getMachineIdentifier() {
		return machineIdentifier;
	}
	public void setMachineIdentifier(String machineIdentifier) {
		this.machineIdentifier = machineIdentifier;
	}

	@XmlAttribute
	public long getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(long createdAt) {
		this.createdAt = createdAt;
	}

	@XmlAttribute
	public long getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(long updatedAt) {
		this.updatedAt = updatedAt;
	}

	@XmlAttribute
	public int getOwned() {
		return owned;
	}
	public void setOwned(int owned) {
		this.owned = owned;
	}

	@XmlAttribute
	public int getSynced() {
		return synced;
	}
	public void setSynced(int synced) {
		this.synced = synced;
	}
}
