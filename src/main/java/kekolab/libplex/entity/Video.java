//package kekolab.libplex.entity;
//
//import java.net.URI;
//import java.util.Date;
//import java.util.List;
//
//import jakarta.xml.bind.annotation.XmlAttribute;
//import jakarta.xml.bind.annotation.XmlElement;
//import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
//import kekolab.libplex.PlexClient;
//import kekolab.libplex.xmladapter.TimestampAdapter;
//
//public class Video {
//    @XmlAttribute private Integer ratingKey; // Movie, Episode
//    @XmlAttribute private String key;// Movie, Episode
//    @XmlAttribute private String guid;// Movie, Episode
//    @XmlAttribute private String studio;// Movie
//    @XmlAttribute private String type;// Movie, Episode
//    @XmlAttribute private String title;// Movie, Episode
//    @XmlAttribute private String originalTitle;// Movie, Episode
//    @XmlAttribute private String contentRating;// Movie, Episode
//    @XmlAttribute private String summary;// Movie, Episode
//    @XmlAttribute private Double rating;// Movie
//    @XmlAttribute private Double audienceRating;// Movie, Episode
//    @XmlAttribute private Integer year;// Movie
//    @XmlAttribute private String tagline;// Movie
//    @XmlAttribute private String thumb;// Movie, Episode
//    @XmlAttribute private String art;// Movie, Episode
//    @XmlAttribute private Long duration;// Movie, Episode
//    @XmlAttribute private Date originallyAvailableAt;// Movie, Episode
//    @XmlAttribute
//    @XmlJavaTypeAdapter(TimestampAdapter.class) private Date addedAt;// Movie, Episode
//    @XmlAttribute
//    @XmlJavaTypeAdapter(TimestampAdapter.class) private Date updatedAt;// Movie, Episode
//    @XmlAttribute private String audienceRatingImage;// Movie, Episode
//    @XmlAttribute private String chapterSource;// Movie
//    @XmlAttribute private Integer hasPremiumPrimaryExtra;// Movie
//    @XmlAttribute private String ratingImage;// Movie
//    @XmlElement(name = "Media") private List<Media> media;// Movie
//    @XmlElement(name = "Genre") private List<Tag> genres;// Movie
//    @XmlElement(name = "Director") private List<Tag> directors;// Movie
//    @XmlElement(name = "Writer") private List<Tag> writers;// Movie
//    @XmlElement(name = "Country") private List<Tag> countries;// Movie
//    @XmlElement(name = "Role") private List<Tag> roles;// Movie
//    @XmlAttribute private Integer parentRatingKey;// Episode
//    @XmlAttribute private Integer grandparentRatingKey;// Episode
//    @XmlAttribute private String parentGuid;// Episode
//    @XmlAttribute private String grandparentGuid; // Episode
//    @XmlAttribute private String grandparentKey; // Episode
//    @XmlAttribute private String parentKey; // Episode
//    @XmlAttribute private String librarySectionTitle; // Episode
//    @XmlAttribute private Integer librarySectionID; // Episode
//    @XmlAttribute private String librarySectionKey; // Episode
//    @XmlAttribute private String grandparentTitle; // Episode
//    @XmlAttribute private String parentTitle; // Episode
//    @XmlAttribute private Integer index; // Episode
//    @XmlAttribute private Integer parentIndex; // Episode
//    @XmlAttribute private Long viewOffset; // Movie, Episode
//    @XmlAttribute private Integer viewCount; // Movie, Episode
//    @XmlAttribute private Integer skipCount; // Movie, Episode
//    @XmlAttribute
//    @XmlJavaTypeAdapter(TimestampAdapter.class) private Date lastViewedAt; // Movie, Episode
//    @XmlAttribute private Integer parentYear; // Episode
//    @XmlAttribute private String parentThumb; // Episode
//    @XmlAttribute private String grandparentThumb; // Episode
//    @XmlAttribute private String grandparentArt; // Episode
//    @XmlAttribute private String grandparentTheme; // Episode
//
//    private PlexClient plex;
//    private ServerContent server;
//
//    public Integer getRatingKey() {
//        return ratingKey;
//    }
//
//    public String getKey() {
//        return key;
//    }
//
//    public String getGuid() {
//        return guid;
//    }
//
//    public String getStudio() {
//        return studio;
//    }
//
//    public String getType() {
//        return type;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public String getOriginalTitle() {
//        return originalTitle;
//    }
//
//    public String getContentRating() {
//        return contentRating;
//    }
//
//    public String getSummary() {
//        return summary;
//    }
//
//    public Double getRating() {
//        return rating;
//    }
//
//    public Double getAudienceRating() {
//        return audienceRating;
//    }
//
//    public Integer getYear() {
//        return year;
//    }
//
//    public String getTagline() {
//        return tagline;
//    }
//
//    public String getThumb() {
//        return thumb;
//    }
//
//    public String getArt() {
//        return art;
//    }
//
//    public Long getDuration() {
//        return duration;
//    }
//
//    public Date getOriginallyAvailableAt() {
//        return originallyAvailableAt;
//    }
//
//    public Date getAddedAt() {
//        return addedAt;
//    }
//
//    public Date getUpdatedAt() {
//        return updatedAt;
//    }
//
//    public String getAudienceRatingImage() {
//        return audienceRatingImage;
//    }
//
//    public String getChapterSource() {
//        return chapterSource;
//    }
//
//    public Integer getHasPremiumPrimaryExtra() {
//        return hasPremiumPrimaryExtra;
//    }
//
//    public String getRatingImage() {
//        return ratingImage;
//    }
//
//    public List<Media> getMedia() {
//        return media;
//    }
//
//    public List<Tag> getGenres() {
//        return genres;
//    }
//
//    public List<Tag> getDirectors() {
//        return directors;
//    }
//
//    public List<Tag> getWriters() {
//        return writers;
//    }
//
//    public List<Tag> getCountries() {
//        return countries;
//    }
//
//    public List<Tag> getRoles() {
//        return roles;
//    }
//
//    public URI getArtURI() {
//        return plex.uriBuilder()
//                .fromKey(art, null, server)
//                .build();
//    }
//
//    public URI getThumbURI() {
//        return plex.uriBuilder()
//                .fromKey(thumb, null, server)
//                .build();
//    }
//
//    public void setPlex(PlexClient plex) {
//        this.plex = plex;
//    }
//
//    public void setServer(ServerContent server) {
//        this.server = server;
//    }
//
//    public Integer getParentRatingKey() {
//        return parentRatingKey;
//    }
//
//    public Integer getGrandparentRatingKey() {
//        return grandparentRatingKey;
//    }
//
//    public String getParentGuid() {
//        return parentGuid;
//    }
//
//    public String getGrandparentGuid() {
//        return grandparentGuid;
//    }
//
//    public String getGrandparentKey() {
//        return grandparentKey;
//    }
//
//    public String getParentKey() {
//        return parentKey;
//    }
//
//    public String getLibrarySectionTitle() {
//        return librarySectionTitle;
//    }
//
//    public Integer getLibrarySectionID() {
//        return librarySectionID;
//    }
//
//    public String getLibrarySectionKey() {
//        return librarySectionKey;
//    }
//
//    public String getGrandparentTitle() {
//        return grandparentTitle;
//    }
//
//    public String getParentTitle() {
//        return parentTitle;
//    }
//
//    public Integer getIndex() {
//        return index;
//    }
//
//    public Integer getParentIndex() {
//        return parentIndex;
//    }
//
//    public Long getViewOffset() {
//        return viewOffset;
//    }
//
//    public Integer getViewCount() {
//        return viewCount;
//    }
//
//    public Integer getSkipCount() {
//        return skipCount;
//    }
//
//    public Date getLastViewedAt() {
//        return lastViewedAt;
//    }
//
//    public Integer getParentYear() {
//        return parentYear;
//    }
//
//    public URI getParentThumbURI() {
//        return plex.uriBuilder()
//                .fromKey(parentThumb, null, server)
//                .build();
//    }
//
//    public String getParentThumb() {
//        return parentThumb;
//    }
//
//    public URI getGrandparentThumbURI() {
//        return plex.uriBuilder()
//                .fromKey(grandparentThumb, null, server)
//                .build();
//    }
//
//    public String getGrandparentThumb() {
//        return grandparentThumb;
//    }
//
//    public URI getGrandparentArtURI() {
//        return plex.uriBuilder()
//                .fromKey(grandparentArt, null, server)
//                .build();
//    }
//
//    public String getGrandparentArt() {
//        return grandparentArt;
//    }
//
//    public String getGrandparentTheme() {
//        return grandparentTheme;
//    }
//
//}
