package kekolab.libplex.entity;

import java.util.List;
import java.util.Map;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import kekolab.libplex.misc.Searcher;

@XmlRootElement(name = "MediaContainer")
public class MusicSection extends Section {
	private Integer nocache;

	public List<Artist> all() {
		return listAndMap("all", Artist.class);
	}

	public List<Album> albums() {
		return listAndMap("albums", Album.class);
	}

	public List<Album> recentlyAdded() {
		return listAndMap("recentlyAdded", Album.class);
	}

	public List<Artist> searchArtists(String query) {
		return searchArtists(query, null);
	}

	protected List<Artist> searchArtists(String query, Map<String, Object[]> queryParameters) {
		Searcher searcher = getSearcher();
		if (queryParameters != null)
			queryParameters.forEach((name, values) -> searcher.addQueryParam(name, values));
		return searcher.searchArtists(query);
	}

	public List<Album> searchAlbums(String query) {
		return searchAlbums(query, null);
	}
	
	protected List<Album> searchAlbums(String query, Map<String, Object[]> queryParameters) {
		Searcher searcher = getSearcher();
		if (queryParameters != null)
			queryParameters.forEach((name, values) -> searcher.addQueryParam(name, values));
		return searcher.searchAlbums(query);
	}

	public List<Track> searchTracks(String query) {
		return searchTracks(query, null);
	}
	
	protected List<Track> searchTracks(String query, Map<String, Object[]> queryParameters) {
		Searcher searcher = getSearcher();
		if (queryParameters != null)
			queryParameters.forEach((name, values) -> searcher.addQueryParam(name, values));
		return searcher.searchTracks(query);
	}

	public Integer getNocache() {
		return nocache;
	}

	@XmlAttribute
	public void setNocache(Integer nocache) {
		this.nocache = nocache;
	}
}
