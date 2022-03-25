package kekolab.libplex.misc;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import jakarta.ws.rs.core.UriBuilder;
import kekolab.libplex.PlexClient;
import kekolab.libplex.entity.Album;
import kekolab.libplex.entity.Artist;
import kekolab.libplex.entity.PlexItem;
import kekolab.libplex.entity.PlexMediaServer;
import kekolab.libplex.entity.Season;
import kekolab.libplex.entity.SectionItem;
import kekolab.libplex.entity.SectionItemList;
import kekolab.libplex.entity.Show;
import kekolab.libplex.entity.Track;
import kekolab.libplex.entity.Video;

public class Searcher {
	private PlexClient client;
	private PlexMediaServer server;
	private PlexItem parent;
	private Map<String, Object[]> queryParams;

	public Searcher(PlexClient client, PlexItem parent, PlexMediaServer server) {
		setClient(client);
		setParent(parent);
		setServer(server);
		queryParams = new HashMap<String, Object[]>(0);
	}

	public List<Artist> searchArtists(String query) {
		return searchAndMap(query, SearchType.ARTIST, Artist.class);
	}

	public List<Album> searchAlbums(String query) {
		return searchAndMap(query, SearchType.ALBUM, Album.class);
	}

	public List<Track> searchTracks(String query) {
		return searchAndMap(query, SearchType.TRACK, Track.class);
	}

	public List<Video> searchMovies(String query) {
		return searchAndMap(query, SearchType.MOVIE, Video.class);
	}

	public List<Video> searchEpisodes(String query) {
		return searchAndMap(query, SearchType.EPISODE, Video.class);
	}
	
	public List<Season> searchSeasons(String query) {
		return searchAndMap(query, SearchType.SEASON, Season.class);
	}

	public List<Show> searchShows(String query) {
		return searchAndMap(query, SearchType.SHOW, Show.class);
	}

	private <A extends SectionItem> List<A> searchAndMap(String query, SearchType searchType, Class<A> cls) {
		return search(query, searchType).stream()
				.map(mi -> cls.cast(mi))
				.collect(Collectors.toList());
	}

	public List<? extends SectionItem> search(String query, SearchType type) {
		UriBuilder uri = getClient().uriBuilder()
				.fromKey("search", getParent(), getServer());
		if (query != null)
			uri.queryParam("query", query);
		if (type != null && !SearchType.ANYTHING.equals(type))
			uri.queryParam("type", type.getType());
		queryParams.forEach((name, values) -> uri.queryParam(name, values));
		SectionItemList mil = (SectionItemList) SectionItemList.build(SectionItemList.class, getClient(), uri.build(),
				getServer());
		return mil.getItems();
	}

	public void addQueryParam(String name, Object... values) {
		queryParams.put(name, values);
	}

	private PlexItem getParent() {
		return parent;
	}

	private void setParent(PlexItem parent) {
		this.parent = parent;
	}

	private PlexMediaServer getServer() {
		return server;
	}

	private void setServer(PlexMediaServer server) {
		this.server = server;
	}

	private PlexClient getClient() {
		return client;
	}

	private void setClient(PlexClient client) {
		this.client = client;
	}
}
