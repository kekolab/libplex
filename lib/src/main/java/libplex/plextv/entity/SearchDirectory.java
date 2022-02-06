package libplex.plextv.entity;

import java.net.URI;
import java.util.regex.Pattern;

import jakarta.ws.rs.core.UriBuilder;

public class SearchDirectory<A extends MediaContainer> extends Directory<A> {

	private URI uri;

	public A query(Class<A> clz, String query) {
		A mc = getClient().target(getUri())
				.queryParam("query", query)
				.request()
				.get(clz);
		mc.setClient(getClient());
		mc.setServer(getServer());
		mc.setUri(getUri());
		return mc;
	}

	@Override
	protected URI getUri() {
		if (uri == null) {
			UriBuilder uriBuilder;
			if (getKey().startsWith("/"))
				uriBuilder = UriBuilder.fromUri(getServer().getUri());
			else
				uriBuilder = UriBuilder.fromUri(getParent().getUri());
			String[] split = getKey().split(Pattern.quote("?"));
			String[] split2 = split[1].split(Pattern.quote("="));
			uri = uriBuilder.path(split[0])
					.queryParam(split2[0], split2[1])
					.build();
		}
		return uri;
	}
}
