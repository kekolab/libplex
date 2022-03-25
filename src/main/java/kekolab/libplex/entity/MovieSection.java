package kekolab.libplex.entity;

import java.util.List;

import jakarta.xml.bind.annotation.XmlRootElement;

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
        return getSearcher().searchMovies(query);
    }    
}
