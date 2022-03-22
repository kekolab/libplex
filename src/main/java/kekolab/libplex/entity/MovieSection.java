package kekolab.libplex.entity;

import java.util.List;
import java.util.stream.Collectors;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "MediaContainer")
public class MovieSection extends Section {
    public List<Video> all() {
        return listAndMap("all");
    }
    
    public List<Video> unwatched() {
    	return listAndMap("unwatched");
    }
    
    public List<Video> newest() {
    	return listAndMap("newest");
    }
    
    public List<Video> recentlyAdded() {
    	return listAndMap("recentlyAdded");
    }
    
    public List<Video> recentlyViewed() {
    	return listAndMap("recentlyViewed");
    }
    
    public List<Video> onDeck() {
    	return listAndMap("onDeck");
    }
    
	private List<Video> listAndMap(String key) {
		return super.itemListByKey(key)
                .stream()
                .map(mediaInfo -> (Video) mediaInfo)
                .collect(Collectors.toList());
	}

    public List<Video> searchMovies(String query) {
        return getSearcher().searchMovies(query);
    }    
}
