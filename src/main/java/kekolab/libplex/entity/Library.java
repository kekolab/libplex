package kekolab.libplex.entity;

import java.net.URI;

import kekolab.libplex.PlexService;
import kekolab.libplex.PlexUriBuilder;

public class Library extends ServerMediaContainerPlexItem {
	public Library(PlexService plex, URI uri, ServerContent server) {
		super(plex, uri, server);
	}

	public int getSize() {
		return getMediaContainer().getSize();
	}

	public URI getArt() {
		return PlexUriBuilder.fromKey(getMediaContainer().getArt(), this, getServer())
				.build();
	}

	public String getContent() {
		return getMediaContainer().getContent();
	}

	public String getIdentifier() {
		return getMediaContainer().getIdentifier();
	}

	public String getMediaTagPrefix() {
		return getMediaContainer().getMediaTagPrefix();
	}

	public Integer getMediaTagVersion() {
		return getMediaContainer().getMediaTagVersion();
	}

	public String getTitle1() {
		return getMediaContainer().getTitle1();
	}

	public String getTitle2() {
		return getMediaContainer().getTitle2();
	}

	public Sections sections() {
		return new Sections(getPlexClient(), PlexUriBuilder.fromKey(directoriesByKey("sections").get(0)
				.getKey(), this, getServer())
				.build(), getServer());
	}

	public OnDeck onDeck() {
		return new OnDeck(getPlexClient(), PlexUriBuilder.fromKey(directoriesByKey("onDeck").get(0)
				.getKey(), this, getServer())
				.build(), getServer());
	}

	/*
	 * TODO - recentlyAdded
	 */
}
