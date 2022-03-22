package kekolab.libplex.entity;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import jakarta.xml.bind.annotation.XmlRootElement;
import kekolab.libplex.misc.SearchType;

@XmlRootElement(name = "MediaContainer")
public class MovieSection extends Section {
    public List<Video> all() {
        URI uri = getClient().uriBuilder()
                .fromKey("all", this, getServer())
                .build();
        SectionItemList mediaInfoList = (SectionItemList) SectionItemList.build(SectionItemList.class, getClient(), uri,
                getServer());
        return mediaInfoList.getItems()
                .stream()
                .map(mediaInfo -> (Video) mediaInfo)
                .collect(Collectors.toList());
    }
    
    public List<Video> unwatched() {
        URI uri = getClient().uriBuilder()
                .fromKey("unwatched", this, getServer())
                .build();
        SectionItemList mediaInfoList = (SectionItemList) SectionItemList.build(SectionItemList.class, getClient(), uri,
                getServer());
        return mediaInfoList.getItems()
                .stream()
                .map(mediaInfo -> (Video) mediaInfo)
                .collect(Collectors.toList());
    }
    
    public List<Video> newest() {
        URI uri = getClient().uriBuilder()
                .fromKey("newest", this, getServer())
                .build();
        SectionItemList mediaInfoList = (SectionItemList) SectionItemList.build(SectionItemList.class, getClient(), uri,
                getServer());
        return mediaInfoList.getItems()
                .stream()
                .map(mediaInfo -> (Video) mediaInfo)
                .collect(Collectors.toList());
    }
    
    public List<Video> recentlyAdded() {
        URI uri = getClient().uriBuilder()
                .fromKey("recentlyAdded", this, getServer())
                .build();
        SectionItemList mediaInfoList = (SectionItemList) SectionItemList.build(SectionItemList.class, getClient(), uri,
                getServer());
        return mediaInfoList.getItems()
                .stream()
                .map(mediaInfo -> (Video) mediaInfo)
                .collect(Collectors.toList());
    }
    
    public List<Video> recentlyViewed() {
        URI uri = getClient().uriBuilder()
                .fromKey("recentlyViewed", this, getServer())
                .build();
        SectionItemList mediaInfoList = (SectionItemList) SectionItemList.build(SectionItemList.class, getClient(), uri,
                getServer());
        return mediaInfoList.getItems()
                .stream()
                .map(mediaInfo -> (Video) mediaInfo)
                .collect(Collectors.toList());
    }
    
    public List<Video> onDeck() {
        URI uri = getClient().uriBuilder()
                .fromKey("onDeck", this, getServer())
                .build();
        SectionItemList mediaInfoList = (SectionItemList) SectionItemList.build(SectionItemList.class, getClient(), uri,
                getServer());
        return mediaInfoList.getItems()
                .stream()
                .map(mediaInfo -> (Video) mediaInfo)
                .collect(Collectors.toList());
    }


    public List<Video> searchMovies(String query) {
        return getSearcher().searchMovies(query);
    }

    public List<? extends SectionItem> search(String query) {
        return getSearcher().search(query, SearchType.ANYTHING);
    }


}
