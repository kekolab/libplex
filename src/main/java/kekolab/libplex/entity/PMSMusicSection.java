package kekolab.libplex.entity;

import java.net.URI;

import jakarta.ws.rs.core.UriBuilder;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "MediaContainer")
public class PMSMusicSection extends PMSSection {
    private Integer nocache;

    public PMSArtists all() {
        return new PMSItem.Builder<PMSArtists>(getClient(), UriBuilder.fromUri(getUri())
                .path("all")
                .build(), getServer()).build(PMSArtists.class);
    }

    public PMSAlbums albums() {
        return new PMSItem.Builder<PMSAlbums>(getClient(), UriBuilder.fromUri(getUri())
                .path("albums")
                .build(), getServer()).build(PMSAlbums.class);
    }

    public PMSAlbums recentlyAdded() {
        return new PMSItem.Builder<PMSAlbums>(getClient(), UriBuilder.fromUri(getUri())
                .path("recentlyAdded")
                .build(), getServer()).build(PMSAlbums.class);
    }

    public PMSArtists searchArtist(String query) {
        URI uri = UriBuilder.fromUri(getUri())
                .path("search")
                .queryParam("type", 8)
                .queryParam("query", query)
                .build();
        return new PMSItem.Builder<PMSArtists>(getClient(), uri, getServer()).build(PMSArtists.class);
    }

    public PMSAlbums searchAlbums(String query) {
        URI uri = UriBuilder.fromUri(getUri())
                .path("search")
                .queryParam("type", 9)
                .queryParam("query", query)
                .build();
        return new PMSItem.Builder<PMSAlbums>(getClient(), uri, getServer()).build(PMSAlbums.class);
    }

    public Integer getNocache() {
        return nocache;
    }

    @XmlAttribute
    public void setNocache(Integer nocache) {
        this.nocache = nocache;
    }
}
