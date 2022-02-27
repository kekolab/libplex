package kekolab.libplex.entity;

import java.io.IOException;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.regex.Pattern;

import javax.net.ssl.HttpsURLConnection;

import jakarta.ws.rs.core.UriBuilder;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import kekolab.libplex.PlexService;

@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public class Server {
	private kekolab.libplex.plex.tag.Server server;
	private PlexService plex;

	public Server(PlexService plex, kekolab.libplex.plex.tag.Server server) {
		this.plex = plex;
		this.server = server;
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

	public String getAccessToken() {
		return server.getAccessToken();
	}

	public String getName() {
		return server.getName();
	}

	public String getAddress() {
		return server.getAddress();
	}

	public Integer getPort() {
		return server.getPort();
	}

	public String getVersion() {
		return server.getVersion();
	}

	public String getScheme() {
		return server.getScheme();
	}

	public String getHost() {
		return server.getHost();
	}

	public String getLocalAddresses() {
		return server.getLocalAddresses();
	}

	public String getMachineIdentifier() {
		return server.getMachineIdentifier();
	}

	public Date getCreatedAt() {
		return server.getCreatedAt();
	}

	public Date getUpdatedAt() {
		return server.getUpdatedAt();
	}

	public Integer getOwned() {
		return server.getOwned();
	}

	public Integer getSynced() {
		return server.getSynced();
	}
}
