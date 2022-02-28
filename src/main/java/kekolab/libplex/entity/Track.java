package kekolab.libplex.entity;

import java.net.URI;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import kekolab.libplex.PlexService;
import kekolab.libplex.PlexUriBuilder;
import kekolab.libplex.xmladapter.TimestampAdapter;

public class Track {
    @XmlAttribute
    @XmlJavaTypeAdapter(TimestampAdapter.class) private Date addedAt;
    @XmlAttribute private String art;
    @XmlAttribute private Integer duration;
    @XmlAttribute private String grandparentArt;
    @XmlAttribute private String grandparentGuid;
    @XmlAttribute private String grandparentKey;
    @XmlAttribute private Integer grandparentRatingKey;
    @XmlAttribute private String grandparentThumb;
    @XmlAttribute private String grandparentTitle;
    @XmlAttribute private String guid;
    @XmlAttribute private Integer hasPremiumLyrics;
    @XmlAttribute private Integer index;
    @XmlAttribute private String key;
    @XmlAttribute private Integer librarySectionID;
    @XmlAttribute private String librarySectionKey;
    @XmlAttribute private String librarySectionTitle;
    @XmlElement(name = "Media") private List<Media> media;
    @XmlAttribute private String parentGuid;
    @XmlAttribute private Integer parentIndex;
    @XmlAttribute private String parentKey;
    @XmlAttribute private Integer parentRatingKey;
    @XmlAttribute private String parentStudio;
    @XmlAttribute private String parentThumb;
    @XmlAttribute private String parentTitle;
    @XmlAttribute private Integer parentYear;
    @XmlAttribute private Integer ratingCount;
    @XmlAttribute private Integer ratingKey;
    @XmlAttribute private String summary;
    @XmlAttribute private String thumb;
    @XmlAttribute private String title;
    @XmlAttribute private String type;
    @XmlAttribute
    @XmlJavaTypeAdapter(TimestampAdapter.class) private Date updatedAt;
    @XmlAttribute private Integer viewCount;
    @XmlAttribute
    @XmlJavaTypeAdapter(TimestampAdapter.class) private Date lastViewedAt;
    private PlexService plex;
    private ServerContent server;

    public Date getAddedAt() {
        return addedAt;
    }

    public String getArt() {
        return art;
    }

    public Integer getDuration() {
        return duration;
    }

    public String getGrandparentArt() {
        return grandparentArt;
    }

    public String getGrandparentGuid() {
        return grandparentGuid;
    }

    public String getGrandparentKey() {
        return grandparentKey;
    }

    public Integer getGrandparentRatingKey() {
        return grandparentRatingKey;
    }

    public String getGrandparentThumb() {
        return grandparentThumb;
    }

    public String getGrandparentTitle() {
        return grandparentTitle;
    }

    public String getGuid() {
        return guid;
    }

    public Integer getHasPremiumLyrics() {
        return hasPremiumLyrics;
    }

    public Integer getIndex() {
        return index;
    }

    public String getKey() {
        return key;
    }

    public Integer getLibrarySectionID() {
        return librarySectionID;
    }

    public String getLibrarySectionKey() {
        return librarySectionKey;
    }

    public String getLibrarySectionTitle() {
        return librarySectionTitle;
    }

    public List<Media> getMedia() {
        if (media != null) {
            media.forEach(m -> m.setServer(server));
            return media;
        }
        return Collections.emptyList();
    }

    public String getParentGuid() {
        return parentGuid;
    }

    public Integer getParentIndex() {
        return parentIndex;
    }

    public String getParentKey() {
        return parentKey;
    }

    public Integer getParentRatingKey() {
        return parentRatingKey;
    }

    public String getParentStudio() {
        return parentStudio;
    }

    public String getParentThumb() {
        return parentThumb;
    }

    public String getParentTitle() {
        return parentTitle;
    }

    public Integer getParentYear() {
        return parentYear;
    }

    public Integer getRatingCount() {
        return ratingCount;
    }

    public Integer getRatingKey() {
        return ratingKey;
    }

    public String getSummary() {
        return summary;
    }

    public String getThumb() {
        return thumb;
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public Integer getViewCount() {
        return viewCount;
    }

    public Date getLastViewedAt() {
        return lastViewedAt;
    }

    public URI getArtURI() {
        return PlexUriBuilder.fromKey(art, null, server)
                .build();
    }

    public URI getParentThumbURI() {
        return PlexUriBuilder.fromKey(parentThumb, null, server)
                .build();
    }

    public URI getGrandparentThumbURI() {
        return PlexUriBuilder.fromKey(grandparentThumb, null, server)
                .build();
    }

    public URI getGrandparentArtURI() {
        return PlexUriBuilder.fromKey(grandparentArt, null, server)
                .build();
    }

    public URI getThumbURI() {
        return PlexUriBuilder.fromKey(thumb, null, server)
                .build();
    }

    public void setPlex(PlexService plex) {
        this.plex = plex;
    }

    public void setServer(ServerContent server) {
        this.server = server;
    }

    public Album album() {
        return new Album(plex, PlexUriBuilder.fromKey(parentKey, null, server)
                .build(), server);
    }

    public Artist artist() {
        return new Artist(plex, PlexUriBuilder.fromKey(grandparentKey, null, server)
                .build(), server);
    }

}
