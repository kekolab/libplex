package kekolab.libplex.entity;

import java.util.List;
import java.util.Map;

import jakarta.xml.bind.annotation.XmlRootElement;
import kekolab.libplex.misc.Searcher;

@XmlRootElement(name = "MediaContainer")
public class MovieSection extends Section {
    public List<Video> all() {
        return listAndMap("all", Video.class);
    }
    
    public List<Video> unwatched() {
    	return listAndMap("unwatched", Video.class);
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
    
    public List<Video> onDeck() {
    	return listAndMap("onDeck", Video.class);
    }
    

    public List<Video> searchMovies(String query) {
        return searchMovies(query, null);
    }
    
	protected List<Video> searchMovies(String query, Map<String, Object[]> queryParameters) {
		Searcher searcher = getSearcher();
		if (queryParameters != null)
			queryParameters.forEach((name, values) -> searcher.addQueryParam(name, values));
		return searcher.searchMovies(query);
	}
}
