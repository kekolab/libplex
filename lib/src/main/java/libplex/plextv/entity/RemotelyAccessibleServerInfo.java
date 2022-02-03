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
public class RemotelyAccessibleServerInfo {
	@XmlAttribute private String accessToken;
	@XmlAttribute private String name;
	@XmlAttribute private String address;
	@XmlAttribute private int port;
	@XmlAttribute private String version;
	@XmlAttribute private String scheme;
	@XmlAttribute private String host;
	@XmlAttribute private String localAddresses;
	@XmlAttribute private String machineIdentifier;
	@XmlAttribute private long createdAt;
	@XmlAttribute private long updatedAt;
	@XmlAttribute private int owned;
	@XmlAttribute private int synced;
	private URI baseUri;
	private Client client;

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
		Server server = client.target(uri())
				.request()
				.get(Server.class);
		server.setUri(uri());
		server.setClient(client);
		return server;
	}

	public void setClient(Client client) {
		this.client = client;
	}

}
