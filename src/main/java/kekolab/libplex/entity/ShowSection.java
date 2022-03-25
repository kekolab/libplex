package kekolab.libplex.entity;

import java.util.List;

import jakarta.xml.bind.annotation.XmlRootElement;

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
        return getSearcher().searchShows(query);
    }
    
    public List<Video> searchEpisodes(String query) {
        return getSearcher().searchEpisodes(query);
    }    
}
