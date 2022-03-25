package kekolab.libplex.entity;

import java.util.List;
import java.util.Map;

import jakarta.xml.bind.annotation.XmlRootElement;
import kekolab.libplex.misc.Searcher;

@XmlRootElement(name = "MediaContainer")
public class ShowSection extends Section {
    public List<Show> all() {
        return listAndMap("all", Show.class);
    }
    
    public List<Show> unwatched() {
    	return listAndMap("unwatched", Show.class);
    }
    
    public List<Video> newest() {
    	return listAndMap("newest", Video.class);
    }
    
    public List<Video> recentlyAdded() {
    	return listAndMap("recentlyAdded", Video.class);
    }
    
    public List<Video> recentlyViewed() {
    	return listAndMap("recentlyViewed", Video.class);
    }
    
    public List<Show> recentlyViewedShows() {
    	return listAndMap("recentlyViewedShows", Show.class);
    }
    
    public List<Show> onDeck() {
    	return listAndMap("onDeck", Show.class);
    }

    public List<Show> searchShows(String query) {
        return searchShows(query, null);
    }
    
	protected List<Show> searchShows(String query, Map<String, Object[]> queryParameters) {
		Searcher searcher = getSearcher();
		if (queryParameters != null)
			queryParameters.forEach((name, values) -> searcher.addQueryParam(name, values));
		return searcher.searchShows(query);
	}
    
    public List<Video> searchEpisodes(String query) {
        return searchEpisodes(query, null);
    }    
    
	protected List<Video> searchEpisodes(String query, Map<String, Object[]> queryParameters) {
		Searcher searcher = getSearcher();
		if (queryParameters != null)
			queryParameters.forEach((name, values) -> searcher.addQueryParam(name, values));
		return searcher.searchEpisodes(query);
	}
	
    public List<Season> searchSeasons(String query) {
        return searchSeasons(query, null);
    }    

	public List<Season> searchSeasons(String query, Map<String, Object[]> queryParameters) {
		Searcher searcher = getSearcher();
		if (queryParameters != null)
			queryParameters.forEach((name, values) -> searcher.addQueryParam(name, values));
		return searcher.searchSeasons(query);
	}
    
}
