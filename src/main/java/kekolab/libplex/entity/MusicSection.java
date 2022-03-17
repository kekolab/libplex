package kekolab.libplex.entity;

import java.net.URI;

import jakarta.ws.rs.core.UriBuilder;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "MediaContainer")
public class MusicSection extends PMSSection {
    private Integer nocache;

    public PMSArtists all() {
    	URI uri = getClient().uriBuilder().fromKey("all", this, getServer()).build();
    	return (PMSArtists) PMSArtists.build(PMSArtists.class, getClient(), uri, getServer());
    }

    public PMSAlbums albums() {
        return new ServerItem.Builder<PMSAlbums>(getClient(), UriBuilder.fromUri(getUri())
                .path("albums")
                .build(), getServer()).build(PMSAlbums.class);
    }

    public PMSAlbums recentlyAdded() {
        return new ServerItem.Builder<PMSAlbums>(getClient(), UriBuilder.fromUri(getUri())
                .path("recentlyAdded")
                .build(), getServer()).build(PMSAlbums.class);
    }

    public PMSArtists searchArtist(String query) {
        URI uri = UriBuilder.fromUri(getUri())
                .path("search")
                .queryParam("type", 8)
                .queryParam("query", query)
                .build();
        return new ServerItem.Builder<PMSArtists>(getClient(), uri, getServer()).build(PMSArtists.class);
    }

    public PMSAlbums searchAlbums(String query) {
        URI uri = UriBuilder.fromUri(getUri())
                .path("search")
                .queryParam("type", 9)
                .queryParam("query", query)
                .build();
        return new ServerItem.Builder<PMSAlbums>(getClient(), uri, getServer()).build(PMSAlbums.class);
    }

    public Integer getNocache() {
        return nocache;
    }

    @XmlAttribute
    public void setNocache(Integer nocache) {
        this.nocache = nocache;
    }
}
