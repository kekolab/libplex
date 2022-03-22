package kekolab.libplex.entity;

import java.util.List;
import java.util.stream.Collectors;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;

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

    private <A extends SectionItem> List<A> listAndMap(String key, Class<A> cls) {
    	return super.itemListByKey(key)
                .stream()
                .map(mi -> cls.cast(mi))
                .collect(Collectors.toList());
    }

    public List<Artist> searchArtist(String query) {
        return getSearcher().searchArtists(query);
    }

    public List<Album> searchAlbums(String query) {
        return getSearcher().searchAlbums(query);
    }

    public List<Track> searchTracks(String query) {
        return getSearcher().searchTracks(query);
    }

    public Integer getNocache() {
        return nocache;
    }

    @XmlAttribute
    public void setNocache(Integer nocache) {
        this.nocache = nocache;
    }
}
