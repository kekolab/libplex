//package kekolab.libplex.entity;
//
//import java.net.URI;
//import java.util.Date;
//import java.util.List;
//
//import kekolab.libplex.PlexClient;
//import kekolab.libplex.misc.Search;
//
//public class ServerContent extends MediaContainerPlexItem {
//    public ServerContent(PlexClient plex, URI uri) {
//        super(plex, uri);
//    }
//
//    public int getSize() {
//        return getMediaContainer().getSize();
//    }
//
//    public Integer getAllowCameraUpload() {
//        return getMediaContainer().getAllowCameraUpload();
//    }
//
//    public Integer getAllowChannelAccess() {
//        return getMediaContainer().getAllowChannelAccess();
//    }
//
//    public Integer getAllowMediaDeletion() {
//        return getMediaContainer().getAllowMediaDeletion();
//    }
//
//    public Integer getAllowSharing() {
//        return getMediaContainer().getAllowSharing();
//    }
//
//    public Integer getAllowSync() {
//        return getMediaContainer().getAllowSync();
//    }
//
//    public Integer getAllowTuners() {
//        return getMediaContainer().getAllowTuners();
//    }
//
//    public Integer getBackgroundProcessing() {
//        return getMediaContainer().getBackgroundProcessing();
//    }
//
//    public Integer getCertificate() {
//        return getMediaContainer().getCertificate();
//    }
//
//    public Integer getCompanionProxy() {
//        return getMediaContainer().getCompanionProxy();
//    }
//
//    public String getCountryCode() {
//        return getMediaContainer().getCountryCode();
//    }
//
//    public List<String> getDiagnostics() {
//        return getMediaContainer().getDiagnostics();
//    }
//
//    public Integer getEventStream() {
//        return getMediaContainer().getEventStream();
//    }
//
//    public String getFriendlyName() {
//        return getMediaContainer().getFriendlyName();
//    }
//
//    public Integer getHubSearch() {
//        return getMediaContainer().getHubSearch();
//    }
//
//    public Integer getItemClusters() {
//        return getMediaContainer().getItemClusters();
//    }
//
//    public Integer getLivetv() {
//        return getMediaContainer().getLivetv();
//    }
//
//    public String getMachineIdentifier() {
//        return getMediaContainer().getMachineIdentifier();
//    }
//
//    public Integer getMediaProviders() {
//        return getMediaContainer().getMediaProviders();
//    }
//
//    public Integer getMultiuser() {
//        return getMediaContainer().getMultiuser();
//    }
//
//    public Integer getMyPlex() {
//        return getMediaContainer().getMyPlex();
//    }
//
//    public String getMyPlexMappingState() {
//        return getMediaContainer().getMyPlexMappingState();
//    }
//
//    public String getMyPlexSigninState() {
//        return getMediaContainer().getMyPlexSigninState();
//    }
//
//    public Integer getMyPlexSubscription() {
//        return getMediaContainer().getMyPlexSubscription();
//    }
//
//    public String getMyPlexUsername() {
//        return getMediaContainer().getMyPlexUsername();
//    }
//
//    public Integer getOfflineTranscode() {
//        return getMediaContainer().getOfflineTranscode();
//    }
//
//    public List<String> getOwnerFeatures() {
//        return getMediaContainer().getOwnerFeatures();
//    }
//
//    public Integer getPhotoAutoTag() {
//        return getMediaContainer().getPhotoAutoTag();
//    }
//
//    public String getPlatform() {
//        return getMediaContainer().getPlatform();
//    }
//
//    public String getPlatformVersion() {
//        return getMediaContainer().getPlatformVersion();
//    }
//
//    public Integer getPluginHost() {
//        return getMediaContainer().getPluginHost();
//    }
//
//    public Integer getPushNotifications() {
//        return getMediaContainer().getPushNotifications();
//    }
//
//    public Integer getReadOnlyLibraries() {
//        return getMediaContainer().getReadOnlyLibraries();
//    }
//
//    public Integer getRequestParametersInCookie() {
//        return getMediaContainer().getRequestParametersInCookie();
//    }
//
//    public Integer getStreamingBrainABRVersion() {
//        return getMediaContainer().getStreamingBrainABRVersion();
//    }
//
//    public Integer getStreamingBrainVersion() {
//        return getMediaContainer().getStreamingBrainVersion();
//    }
//
//    public Integer getSync() {
//        return getMediaContainer().getSync();
//    }
//
//    public Integer getTranscoderActiveVideoSessions() {
//        return getMediaContainer().getTranscoderActiveVideoSessions();
//    }
//
//    public Integer getTranscoderAudio() {
//        return getMediaContainer().getTranscoderAudio();
//    }
//
//    public Integer getTranscoderLyrics() {
//        return getMediaContainer().getTranscoderLyrics();
//    }
//
//    public Integer getTranscoderPhoto() {
//        return getMediaContainer().getTranscoderPhoto();
//    }
//
//    public Integer getTranscoderSubtitles() {
//        return getMediaContainer().getTranscoderSubtitles();
//    }
//
//    public Integer getTranscoderVideo() {
//        return getMediaContainer().getTranscoderVideo();
//    }
//
//    public List<Integer> getTranscoderVideoBitrates() {
//        return getMediaContainer().getTranscoderVideoBitrates();
//    }
//
//    public List<Integer> getTranscoderVideoQualities() {
//        return getMediaContainer().getTranscoderVideoQualities();
//    }
//
//    public List<Integer> getTranscoderVideoResolutions() {
//        return getMediaContainer().getTranscoderVideoResolutions();
//    }
//
//    public Date getUpdatedAt() {
//        return getMediaContainer().getUpdatedAt();
//    }
//
//    public Integer getUpdater() {
//        return getMediaContainer().getUpdater();
//    }
//
//    public String getVersion() {
//        return getMediaContainer().getVersion();
//    }
//
//    public Integer getVoiceSearch() {
//        return getMediaContainer().getVoiceSearch();
//    }
//
//    /*
//     * TODO - Actions - Activities - Butler - Channela - Clients - Devices -
//     * Diagnostics - Hubs - Livetv - Media - Metadata - Neighboorhood - playQueues -
//     * player - playlists - resources - search - servers - statistics - system -
//     * transcode - updater - user
//     */
//
//    public Library library() {
//        return new Library(getPlexClient(), getPlexClient().uriBuilder()
//                .fromKey(directoriesByKey("library").get(0)
//                        .getKey(), this, this)
//                .build(), this);
//    }
//
//    public Search search() {
//        return new Search(getPlexClient(), getUri(), this);
//    }
//}
