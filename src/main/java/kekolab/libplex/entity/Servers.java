package kekolab.libplex.entity;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import kekolab.libplex.PlexService;

public class Servers extends MediaContainerPlexItem {
	private List<Server> servers;

	public Servers(PlexService plex, URI uri) {
		super(plex, uri);
		servers = getMediaContainer().getServers()
				.stream()
				.map(rs -> new Server(plex, rs))
				.collect(Collectors.toList());
	}

	public String getFriendlyName() {
		return getMediaContainer().getFriendlyName();
	}

	public String getMachineIdentifier() {
		return getMediaContainer().getMachineIdentifier();
	}

	public String getIdentifier() {
		return getMediaContainer().getIdentifier();
	}

	public int getSize() {
		return getMediaContainer().getSize();
	}

	public List<Server> getServers() {
		return servers;
	}
}
