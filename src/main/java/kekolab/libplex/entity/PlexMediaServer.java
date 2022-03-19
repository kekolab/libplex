package kekolab.libplex.entity;

import java.net.URI;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import kekolab.libplex.xmladapter.IntegerListAdapter;
import kekolab.libplex.xmladapter.StringListAdapter;
import kekolab.libplex.xmladapter.TimestampAdapter;

@XmlRootElement(name = "MediaContainer")
public class PlexMediaServer extends PlexItem {
    private Integer size, allowCameraUpload, allowChannelAccess, allowMediaDeletion, allowSharing, allowSync,
            allowTuners, backgroundProcessing, certificate, companionProxy, eventStream, hubSearch, itemClusters,
            liveTv, mediaProviders, multiuser, myPlex, myPlexSubscription, offlineTranscode, photoAutoTag, pluginHost,
            pushNotifications, readOnlyLibraries, requestParametersInCookie, streamingBrainABRVersion,
            streamingBrainVersion, sync, transcoderActiveVideoSessions, transcoderAudio, transcoderLyrics,
            transcoderPhoto, transcoderSubtitles, transcoderVideo, updater, voiceSearch;
    private String countryCode, friendlyName, machineIdentifier, myPlexMappingState, myPlexSigninState, myPlexUsername,
            platform, platformVersion, version;
    private List<String> diagnostics = new ArrayList<>(0), ownerFeatures = new ArrayList<>(0);
    private List<Integer> transcoderVideoBitrates = new ArrayList<>(0), transcoderVideoQualities = new ArrayList<>(0),
            transcoderVideoResolutions = new ArrayList<>(0);
    private Date updatedAt;

    public Library library() {
    	URI uri = getClient().uriBuilder().fromKey("library", this, this).build();
    	return (Library) Library.build(Library.class, getClient(), uri, this);
        }



    public Integer getSize() {
        return size;
    }

    public Integer getAllowCameraUpload() {
        return allowCameraUpload;
    }

    public Integer getAllowChannelAccess() {
        return allowChannelAccess;
    }

    public Integer getAllowMediaDeletion() {
        return allowMediaDeletion;
    }

    public Integer getAllowSharing() {
        return allowSharing;
    }

    public Integer getAllowSync() {
        return allowSync;
    }

    public Integer getAllowTuners() {
        return allowTuners;
    }

    public Integer getBackgroundProcessing() {
        return backgroundProcessing;
    }

    public Integer getCertificate() {
        return certificate;
    }

    public Integer getCompanionProxy() {
        return companionProxy;
    }

    public Integer getEventStream() {
        return eventStream;
    }

    public Integer getHubSearch() {
        return hubSearch;
    }

    public Integer getItemClusters() {
        return itemClusters;
    }

    public Integer getLiveTv() {
        return liveTv;
    }

    public Integer getMediaProviders() {
        return mediaProviders;
    }

    public Integer getMultiuser() {
        return multiuser;
    }

    public Integer getMyPlex() {
        return myPlex;
    }

    public Integer getMyPlexSubscription() {
        return myPlexSubscription;
    }

    public Integer getOfflineTranscode() {
        return offlineTranscode;
    }

    public Integer getPhotoAutoTag() {
        return photoAutoTag;
    }

    public Integer getPluginHost() {
        return pluginHost;
    }

    public Integer getPushNotifications() {
        return pushNotifications;
    }

    public Integer getReadOnlyLibraries() {
        return readOnlyLibraries;
    }

    public Integer getRequestParametersInCookie() {
        return requestParametersInCookie;
    }

    public Integer getStreamingBrainABRVersion() {
        return streamingBrainABRVersion;
    }

    public Integer getStreamingBrainVersion() {
        return streamingBrainVersion;
    }

    public Integer getSync() {
        return sync;
    }

    public Integer getTranscoderActiveVideoSessions() {
        return transcoderActiveVideoSessions;
    }

    public Integer getTranscoderAudio() {
        return transcoderAudio;
    }

    public Integer getTranscoderLyrics() {
        return transcoderLyrics;
    }

    public Integer getTranscoderPhoto() {
        return transcoderPhoto;
    }

    public Integer getTranscoderSubtitles() {
        return transcoderSubtitles;
    }

    public Integer getTranscoderVideo() {
        return transcoderVideo;
    }

    public Integer getUpdater() {
        return updater;
    }

    public Integer getVoiceSearch() {
        return voiceSearch;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getFriendlyName() {
        return friendlyName;
    }

    public String getMachineIdentifier() {
        return machineIdentifier;
    }

    public String getMyPlexMappingState() {
        return myPlexMappingState;
    }

    public String getMyPlexSigninState() {
        return myPlexSigninState;
    }

    public String getMyPlexUsername() {
        return myPlexUsername;
    }

    public String getPlatform() {
        return platform;
    }

    public String getPlatformVersion() {
        return platformVersion;
    }

    public String getVersion() {
        return version;
    }

    public List<String> getDiagnostics() {
        return diagnostics;
    }

    public List<String> getOwnerFeatures() {
        return ownerFeatures;
    }

    public List<Integer> getTranscoderVideoBitrates() {
        return transcoderVideoBitrates;
    }

    public List<Integer> getTranscoderVideoQualities() {
        return transcoderVideoQualities;
    }

    public List<Integer> getTranscoderVideoResolutions() {
        return transcoderVideoResolutions;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    @XmlAttribute
    public void setSize(Integer size) {
        this.size = size;
    }

    @XmlAttribute
    public void setAllowCameraUpload(Integer allowCameraUpload) {
        this.allowCameraUpload = allowCameraUpload;
    }

    @XmlAttribute
    public void setAllowChannelAccess(Integer allowChannelAccess) {
        this.allowChannelAccess = allowChannelAccess;
    }

    @XmlAttribute
    public void setAllowMediaDeletion(Integer allowMediaDeletion) {
        this.allowMediaDeletion = allowMediaDeletion;
    }

    @XmlAttribute
    public void setAllowSharing(Integer allowSharing) {
        this.allowSharing = allowSharing;
    }

    @XmlAttribute
    public void setAllowSync(Integer allowSync) {
        this.allowSync = allowSync;
    }

    @XmlAttribute
    public void setAllowTuners(Integer allowTuners) {
        this.allowTuners = allowTuners;
    }

    @XmlAttribute
    public void setBackgroundProcessing(Integer backgroundProcessing) {
        this.backgroundProcessing = backgroundProcessing;
    }

    @XmlAttribute
    public void setCertificate(Integer certificate) {
        this.certificate = certificate;
    }

    @XmlAttribute
    public void setCompanionProxy(Integer companionProxy) {
        this.companionProxy = companionProxy;
    }

    @XmlAttribute
    public void setEventStream(Integer eventStream) {
        this.eventStream = eventStream;
    }

    @XmlAttribute
    public void setHubSearch(Integer hubSearch) {
        this.hubSearch = hubSearch;
    }

    @XmlAttribute
    public void setItemClusters(Integer itemClusters) {
        this.itemClusters = itemClusters;
    }

    @XmlAttribute
    public void setLiveTv(Integer liveTv) {
        this.liveTv = liveTv;
    }

    @XmlAttribute
    public void setMediaProviders(Integer mediaProviders) {
        this.mediaProviders = mediaProviders;
    }

    @XmlAttribute
    public void setMultiuser(Integer multiuser) {
        this.multiuser = multiuser;
    }

    @XmlAttribute
    public void setMyPlex(Integer myPlex) {
        this.myPlex = myPlex;
    }

    @XmlAttribute
    public void setMyPlexSubscription(Integer myPlexSubscription) {
        this.myPlexSubscription = myPlexSubscription;
    }

    @XmlAttribute
    public void setOfflineTranscode(Integer offlineTranscode) {
        this.offlineTranscode = offlineTranscode;
    }

    @XmlAttribute
    public void setPhotoAutoTag(Integer photoAutoTag) {
        this.photoAutoTag = photoAutoTag;
    }

    @XmlAttribute
    public void setPluginHost(Integer pluginHost) {
        this.pluginHost = pluginHost;
    }

    @XmlAttribute
    public void setPushNotifications(Integer pushNotifications) {
        this.pushNotifications = pushNotifications;
    }

    @XmlAttribute
    public void setReadOnlyLibraries(Integer readOnlyLibraries) {
        this.readOnlyLibraries = readOnlyLibraries;
    }

    @XmlAttribute
    public void setRequestParametersInCookie(Integer requestParametersInCookie) {
        this.requestParametersInCookie = requestParametersInCookie;
    }

    @XmlAttribute
    public void setStreamingBrainABRVersion(Integer streamingBrainABRVersion) {
        this.streamingBrainABRVersion = streamingBrainABRVersion;
    }

    @XmlAttribute
    public void setStreamingBrainVersion(Integer streamingBrainVersion) {
        this.streamingBrainVersion = streamingBrainVersion;
    }

    @XmlAttribute
    public void setSync(Integer sync) {
        this.sync = sync;
    }

    @XmlAttribute
    public void setTranscoderActiveVideoSessions(Integer transcoderActiveVideoSessions) {
        this.transcoderActiveVideoSessions = transcoderActiveVideoSessions;
    }

    @XmlAttribute
    public void setTranscoderAudio(Integer transcoderAudio) {
        this.transcoderAudio = transcoderAudio;
    }

    @XmlAttribute
    public void setTranscoderLyrics(Integer transcoderLyrics) {
        this.transcoderLyrics = transcoderLyrics;
    }

    @XmlAttribute
    public void setTranscoderPhoto(Integer transcoderPhoto) {
        this.transcoderPhoto = transcoderPhoto;
    }

    @XmlAttribute
    public void setTranscoderSubtitles(Integer transcoderSubtitles) {
        this.transcoderSubtitles = transcoderSubtitles;
    }

    @XmlAttribute
    public void setTranscoderVideo(Integer transcoderVideo) {
        this.transcoderVideo = transcoderVideo;
    }

    @XmlAttribute
    public void setUpdater(Integer updater) {
        this.updater = updater;
    }

    @XmlAttribute
    public void setVoiceSearch(Integer voiceSearch) {
        this.voiceSearch = voiceSearch;
    }

    @XmlAttribute
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @XmlAttribute
    public void setFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
    }

    @XmlAttribute
    public void setMachineIdentifier(String machineIdentifier) {
        this.machineIdentifier = machineIdentifier;
    }

    @XmlAttribute
    public void setMyPlexMappingState(String myPlexMappingState) {
        this.myPlexMappingState = myPlexMappingState;
    }

    @XmlAttribute
    public void setMyPlexSigninState(String myPlexSigninState) {
        this.myPlexSigninState = myPlexSigninState;
    }

    @XmlAttribute
    public void setMyPlexUsername(String myPlexUsername) {
        this.myPlexUsername = myPlexUsername;
    }

    @XmlAttribute
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    @XmlAttribute
    public void setPlatformVersion(String platformVersion) {
        this.platformVersion = platformVersion;
    }

    @XmlAttribute
    public void setVersion(String version) {
        this.version = version;
    }

    @XmlJavaTypeAdapter(StringListAdapter.class)
    @XmlAttribute
    public void setDiagnostics(List<String> diagnostics) {
        this.diagnostics = diagnostics;
    }

    @XmlJavaTypeAdapter(StringListAdapter.class)
    @XmlAttribute
    public void setOwnerFeatures(List<String> ownerFeatures) {
        this.ownerFeatures = ownerFeatures;
    }

    @XmlJavaTypeAdapter(IntegerListAdapter.class)
    @XmlAttribute
    public void setTranscoderVideoBitrates(List<Integer> transcoderVideoBitrates) {
        this.transcoderVideoBitrates = transcoderVideoBitrates;
    }

    @XmlJavaTypeAdapter(IntegerListAdapter.class)
    @XmlAttribute
    public void setTranscoderVideoQualities(List<Integer> transcoderVideoQualities) {
        this.transcoderVideoQualities = transcoderVideoQualities;
    }

    @XmlJavaTypeAdapter(IntegerListAdapter.class)
    @XmlAttribute
    public void setTranscoderVideoResolutions(List<Integer> transcoderVideoResolutions) {
        this.transcoderVideoResolutions = transcoderVideoResolutions;
    }

    @XmlJavaTypeAdapter(TimestampAdapter.class)
    @XmlAttribute
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
