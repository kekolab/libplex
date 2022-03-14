//package kekolab.libplex.entity;
//
//import java.net.URI;
//import java.util.Date;
//import java.util.List;
//import java.util.stream.Collectors;
//
//import kekolab.libplex.PlexClient;
//
//public class Show extends MediaDirectory {
//    public Show(PlexClient plex, Directory d, ServerContent server) {
//        this(plex, plex.uriBuilder()
//                .fromKey("/library/metadata/{ratingKey}", null, server)
//                .build(d.getRatingKey()), server);
//    }
//
//    public Show(PlexClient plex, URI uri, ServerContent server) {
//        super(plex, uri, server);
//    }
//
//    public String getStudio() {
//        return getDirectory().getStudio();
//    }
//
//    public String getOriginalTitle() {
//        return getDirectory().getOriginalTitle();
//    }
//
//    public String getContentRating() {
//        return getDirectory().getContentRating();
//    }
//
//    public Double getAudienceRating() {
//        return getDirectory().getAudienceRating();
//    }
//
//    public Integer getYear() {
//        return getDirectory().getYear();
//    }
//
//    public String getTagLine() {
//        return getDirectory().getTagline();
//    }
//
//    public String getTheme() {
//        return getDirectory().getTheme();
//    }
//
//    public Long getDuration() {
//        return getDirectory().getDuration();
//    }
//
//    public Date getOriginallyAvailableAt() {
//        return getDirectory().getOriginallyAvailableAt();
//    }
//
//    public Integer getLeafCount() {
//        return getDirectory().getLeafCount();
//    }
//
//    public Integer getViewedLeafCount() {
//        return getDirectory().getViewedLeafCount();
//    }
//
//    public Integer getChildCount() {
//        return getDirectory().getChildCount();
//    }
//
//    public String getAudienceRatingImage() {
//        return getDirectory().getAudienceRatingImage();
//    }
//
//    public List<Tag> getGenres() {
//        return getDirectory().getGenres();
//    }
//
//    public List<Tag> getRoles() {
//        return getDirectory().getRoles();
//    }
//
//    public List<Tag> getSimilars() {
//        return getDirectory().getSimilars();
//    }
//
//    public List<Location> getLocations() {
//        return getDirectory().getLocations();
//    }
//
//    @Override
//    public ShowSection section() {
//        return new ShowSection(getPlexClient(), getPlexClient().uriBuilder()
//                .fromKey(getDirectory().getLibrarySectionKey(), this, getServer())
//                .build(), getServer());
//    }
//
//    public List<Video> allEpisodes() {
//        List<Video> episodes = getPlexClient().executeGet(getPlexClient().uriBuilder()
//                .fromKey("/library/metadata/{ratingKey}/allLeaves", null, getServer())
//                .build(getRatingKey()), MediaContainer.class)
//                .getVideos();
//        episodes.forEach(t -> {
//            t.setPlex(getPlexClient());
//            t.setServer(getServer());
//        });
//        return episodes;
//    }
//
//    public List<Season> seasons() {
//        return getPlexClient().executeGet(getPlexClient().uriBuilder()
//                .fromKey(getDirectory().getKey(), null, getServer())
//                .build(), MediaContainer.class)
//                .getDirectories()
//                .stream()
//                .filter(d -> !d.getKey()
//                        .contains("allLeaves"))
//                .map(d -> new Season(getPlexClient(), getPlexClient().uriBuilder()
//                        .fromKey(getDirectory().getKey(), this, getServer())
//                        .build(), getServer()))
//                .collect(Collectors.toList());
//    }
//}
