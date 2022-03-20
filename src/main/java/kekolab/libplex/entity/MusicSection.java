package kekolab.libplex.entity;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import kekolab.libplex.misc.SearchType;
import kekolab.libplex.misc.Searcher;

@XmlRootElement(name = "MediaContainer")
public class MusicSection extends Section {
    private Integer nocache;
    private Searcher searcher;

    public List<Artist> all() {
        URI uri = getClient().uriBuilder()
                .fromKey("all", this, getServer())
                .build();
        SectionItemList mediaInfoList = (SectionItemList) SectionItemList.build(SectionItemList.class, getClient(), uri,
                getServer());
        return mediaInfoList.getItems()
                .stream()
                .map(mediaInfo -> (Artist) mediaInfo)
                .collect(Collectors.toList());
    }

    public List<Album> albums() {
        URI uri = getClient().uriBuilder()
                .fromKey("albums", this, getServer())
                .build();
        SectionItemList mil = (SectionItemList) SectionItemList.build(SectionItemList.class, getClient(), uri, getServer());
        return mil.getItems()
                .stream()
                .map(mi -> (Album) mi)
                .collect(Collectors.toList());
    }

    public List<Album> recentlyAdded() {
        URI uri = getClient().uriBuilder()
                .fromKey("recentlyAdded", this, getServer())
                .build();
        SectionItemList mil = (SectionItemList) SectionItemList.build(SectionItemList.class, getClient(), uri, getServer());
        return mil.getItems()
                .stream()
                .map(mi -> (Album) mi)
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

    public List<? extends SectionItem> search(String query) {
        return getSearcher().search(query, SearchType.ANYTHING);
    }

    public Integer getNocache() {
        return nocache;
    }

    @XmlAttribute
    public void setNocache(Integer nocache) {
        this.nocache = nocache;
    }

    private Searcher getSearcher() {
        if (searcher == null)
            setSearcher(new Searcher(getClient(), this, getServer()));
        return searcher;
    }

    private void setSearcher(Searcher searcher) {
        this.searcher = searcher;
    }
}
