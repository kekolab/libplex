package libplex.entity;

import java.io.IOException;
import java.net.URI;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;

import javax.net.ssl.HttpsURLConnection;

import jakarta.ws.rs.core.UriBuilder;
import libplex.PlexClient;
import libplex.plex.entity.Directory;
import libplex.plex.entity.RemoteServer;

public class Server extends MediaContainerPlexItem {
    public static Server buildRemote(PlexClient plexClient, RemoteServer summary) throws IOException {
        /*
         * TODO Qui potrei verificare se il client va bene per navigare il server remoto
         */
        return new Server(plexClient, uri(summary));
    }

    public static Server buildLocal(PlexClient plexClient, String host, int port) throws IOException {
        return new Server(plexClient, uri("http", host, port));
    }

    private static URI uri(String scheme, String host, int port) throws IOException {
        return UriBuilder.newInstance()
                .scheme(scheme)
                .host(host)
                .port(port)
                .build();
    }

    private static URI uri(RemoteServer summary) throws IOException {
        HttpsURLConnection connection = (HttpsURLConnection) UriBuilder.newInstance()
                .scheme("https")
                .host(summary.getHost())
                .port(summary.getPort())
                .build()
                .toURL()
                .openConnection();
        connection.setHostnameVerifier((hostname, session) -> true);
        connection.connect();
        X509Certificate serverCertificate = (X509Certificate) connection.getServerCertificates()[0];
        String cn = serverCertificate.getSubjectX500Principal()
                .getName();
        return uri("https", summary.getHost()
                .replaceAll(Pattern.quote("."), "-")
                .concat(cn.substring(4)), summary.getPort());
    }

    private Server(PlexClient plex, URI uri) {
        super(plex, uri);
    }

    public Library library() {
        Directory library = getMediaContainer().getDirectories()
                .stream()
                .filter(d -> "library".equals(d.getKey()))
                .findAny()
                .orElse(null);
        URI uri = getPlexClient().uri(library.getKey(), this, this, null);
        return new Library(getPlexClient(), uri, this);
    }

    public Integer getAllowCameraUpload() {
        return getMediaContainer().getAllowCameraUpload();
    }

    public Integer getAllowChannelAccess() {
        return getMediaContainer().getAllowChannelAccess();
    }

    public Integer getAllowMediaDeletion() {
        return getMediaContainer().getAllowMediaDeletion();
    }

    public Integer getAllowSharing() {
        return getMediaContainer().getAllowSharing();
    }

    public Integer getAllowSync() {
        return getMediaContainer().getAllowSync();
    }

    public Integer getAllowTuners() {
        return getMediaContainer().getAllowTuners();
    }

    public Integer getBackgroundProcessing() {
        return getMediaContainer().getBackgroundProcessing();
    }

    public Integer getCertificate() {
        return getMediaContainer().getCertificate();
    }

    public Integer getCompanionProxy() {
        return getMediaContainer().getCompanionProxy();
    }

    public String getCountryCode() {
        return getMediaContainer().getCountryCode();
    }

    public List<String> getDiagnostics() {
        return getMediaContainer().getDiagnostics();
    }

    public Integer getEventStream() {
        return getMediaContainer().getEventStream();
    }

    public String getFriendlyName() {
        return getMediaContainer().getFriendlyName();
    }

    public Integer getHubSearch() {
        return getMediaContainer().getHubSearch();
    }

    public Integer getItemClusters() {
        return getMediaContainer().getItemClusters();
    }

    public Integer getLivetv() {
        return getMediaContainer().getLivetv();
    }

    public String getMachineIdentifier() {
        return getMediaContainer().getMachineIdentifier();
    }

    public Integer getMediaProviders() {
        return getMediaContainer().getMediaProviders();
    }

    public Integer getMultiuser() {
        return getMediaContainer().getMultiuser();
    }

    public Integer getMyPlex() {
        return getMediaContainer().getMyPlex();
    }

    public String getMyPlexMappingState() {
        return getMediaContainer().getMyPlexMappingState();
    }

    public String getMyPlexSigninState() {
        return getMediaContainer().getMyPlexSigninState();
    }

    public Integer getMyPlexSubscription() {
        return getMediaContainer().getMyPlexSubscription();
    }

    public String getMyPlexUsername() {
        return getMediaContainer().getMyPlexUsername();
    }

    public Integer getOfflineTranscode() {
        return getMediaContainer().getOfflineTranscode();
    }

    public List<String> getOwnerFeatures() {
        return getMediaContainer().getOwnerFeatures();
    }

    public Integer getPhotoAutoTag() {
        return getMediaContainer().getPhotoAutoTag();
    }

    public String getPlatform() {
        return getMediaContainer().getPlatform();
    }

    public String getPlatformVersion() {
        return getMediaContainer().getPlatformVersion();
    }

    public Integer getPluginHost() {
        return getMediaContainer().getPluginHost();
    }

    public Integer getPushNotifications() {
        return getMediaContainer().getPushNotifications();
    }

    public Integer getReadOnlyLibraries() {
        return getMediaContainer().getReadOnlyLibraries();
    }

    public Integer getRequestParametersInCookie() {
        return getMediaContainer().getRequestParametersInCookie();
    }

    public Integer getStreamingBrainABRVersion() {
        return getMediaContainer().getStreamingBrainABRVersion();
    }

    public Integer getStreamingBrainVersion() {
        return getMediaContainer().getStreamingBrainVersion();
    }

    public Integer getSync() {
        return getMediaContainer().getSync();
    }

    public Integer getTranscoderActiveVideoSessions() {
        return getMediaContainer().getTranscoderActiveVideoSessions();
    }

    public Integer getTranscoderAudio() {
        return getMediaContainer().getTranscoderAudio();
    }

    public Integer getTranscoderLyrics() {
        return getMediaContainer().getTranscoderLyrics();
    }

    public Integer getTranscoderPhoto() {
        return getMediaContainer().getTranscoderPhoto();
    }

    public Integer getTranscoderSubtitles() {
        return getMediaContainer().getTranscoderSubtitles();
    }

    public Integer getTranscoderVideo() {
        return getMediaContainer().getTranscoderVideo();
    }

    public List<Integer> getTranscoderVideoBitrates() {
        return getMediaContainer().getTranscoderVideoBitrates();
    }

    public List<Integer> getTranscoderVideoQualities() {
        return getMediaContainer().getTranscoderVideoQualities();
    }

    public List<Integer> getTranscoderVideoResolutions() {
        return getMediaContainer().getTranscoderVideoResolutions();
    }

    public Date getUpdatedAt() {
        return getMediaContainer().getUpdatedAt();
    }

    public Integer getUpdater() {
        return getMediaContainer().getUpdater();
    }

    public String getVersion() {
        return getMediaContainer().getVersion();
    }

    public Integer getVoiceSearch() {
        return getMediaContainer().getVoiceSearch();
    }

    /*
     * TODO
     * - Actions
     * - Activities
     * - Butler
     * - Channela
     * - Clients
     * - Devices
     * - Diagnostics
     * - Hubs
     * - Livetv
     * - Media
     * - Metadata
     * - Neighboorhood
     * - playQueues
     * - player
     * - playlists
     * - resources
     * - search
     * - servers
     * - statistics
     * - system
     * - transcode
     * - updater
     * - user
     */
}
