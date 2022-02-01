package libplex.plextv.entity;

import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "MediaContainer")
@XmlAccessorType(XmlAccessType.NONE)
public class ServerDetails {
    private int size;
    private int allowCameraUpload;
    private int allowChannelAccess;
    private int allowMediaDeletion;
    private int allowSharing;
    private int allowSync;
    private int allowTuners;
    private int backgroundProcessing;
    private int certificate;
    private int companionProxy;
    private String countryCode;
    private String diagnostics;
    private int eventStream;
    private String friendlyName;
    private int hubSearch;
    private int itemClusters;
    private int livetv;
    private String machineIdentifier;
    private int mediaProviders;
    private int multiuser;
    private int myPlex;
    private String myPlexMappingState;
    private String myPlexSigninState;
    private int myPlexSubscription;
    private String myPlexUsername;
    private int offlineTranscode;
    private String ownerFeatures;
    private int photoAutoTag;
    private String platform;
    private String platformVersion;
    private int pluginHost;
    private int pushNotifications;
    private int readOnlyLibraries;
    private int requestParametersInCookie;
    private String streamingBrainABRVersion;
    private String streamingBrainVersion;
    private int sync;
    private int transcoderActiveVideoSessions;
    private int transcoderAudio;
    private int transcoderLyrics;
    private int transcoderPhoto;
    private int transcoderSubtitles;
    private int transcoderVideo;
    private String transcoderVideoBitrates;
    private String transcoderVideoQualities;
    private String transcoderVideoResolutions;
    private long updatedAt;
    private int updater;
    private String version;
    private int voiceSearch;
    private List<Directory<?>> directories;

    @XmlAttribute
    public int getSize() {
	return size;
    }

    public void setSize(int size) {
	this.size = size;
    }

    @XmlAttribute
    public int getAllowCameraUpload() {
	return allowCameraUpload;
    }

    public void setAllowCameraUpload(int allowCameraUpload) {
	this.allowCameraUpload = allowCameraUpload;
    }

    @XmlAttribute
    public int getAllowChannelAccess() {
	return allowChannelAccess;
    }

    public void setAllowChannelAccess(int allowChannelAccess) {
	this.allowChannelAccess = allowChannelAccess;
    }

    @XmlAttribute
    public int getAllowMediaDeletion() {
	return allowMediaDeletion;
    }

    public void setAllowMediaDeletion(int allowMediaDeletion) {
	this.allowMediaDeletion = allowMediaDeletion;
    }

    @XmlAttribute
    public int getAllowSharing() {
	return allowSharing;
    }

    public void setAllowSharing(int allowSharing) {
	this.allowSharing = allowSharing;
    }

    @XmlAttribute
    public int getAllowSync() {
	return allowSync;
    }

    public void setAllowSync(int allowSync) {
	this.allowSync = allowSync;
    }

    @XmlAttribute
    public int getAllowTuners() {
	return allowTuners;
    }

    public void setAllowTuners(int allowTuners) {
	this.allowTuners = allowTuners;
    }

    @XmlAttribute
    public int getBackgroundProcessing() {
	return backgroundProcessing;
    }

    public void setBackgroundProcessing(int backgroundProcessing) {
	this.backgroundProcessing = backgroundProcessing;
    }

    @XmlAttribute
    public int getCertificate() {
	return certificate;
    }

    public void setCertificate(int certificate) {
	this.certificate = certificate;
    }

    @XmlAttribute
    public int getCompanionProxy() {
	return companionProxy;
    }

    public void setCompanionProxy(int companionProxy) {
	this.companionProxy = companionProxy;
    }

    @XmlAttribute
    public String getCountryCode() {
	return countryCode;
    }

    public void setCountryCode(String countryCode) {
	this.countryCode = countryCode;
    }

    @XmlAttribute
    public String getDiagnostics() {
	return diagnostics;
    }

    public void setDiagnostics(String diagnostics) {
	this.diagnostics = diagnostics;
    }

    @XmlAttribute
    public int getEventStream() {
	return eventStream;
    }

    public void setEventStream(int eventStream) {
	this.eventStream = eventStream;
    }

    @XmlAttribute
    public String getFriendlyName() {
	return friendlyName;
    }

    public void setFriendlyName(String friendlyName) {
	this.friendlyName = friendlyName;
    }

    @XmlAttribute
    public int getHubSearch() {
	return hubSearch;
    }

    public void setHubSearch(int hubSearch) {
	this.hubSearch = hubSearch;
    }

    @XmlAttribute
    public int getItemClusters() {
	return itemClusters;
    }

    public void setItemClusters(int itemClusters) {
	this.itemClusters = itemClusters;
    }

    @XmlAttribute
    public int getLivetv() {
	return livetv;
    }

    public void setLivetv(int livetv) {
	this.livetv = livetv;
    }

    @XmlAttribute
    public String getMachineIdentifier() {
	return machineIdentifier;
    }

    public void setMachineIdentifier(String machineIdentifier) {
	this.machineIdentifier = machineIdentifier;
    }

    @XmlAttribute
    public int getMediaProviders() {
	return mediaProviders;
    }

    public void setMediaProviders(int mediaProviders) {
	this.mediaProviders = mediaProviders;
    }

    @XmlAttribute
    public int getMultiuser() {
	return multiuser;
    }

    public void setMultiuser(int multiuser) {
	this.multiuser = multiuser;
    }

    @XmlAttribute
    public int getMyPlex() {
	return myPlex;
    }

    public void setMyPlex(int myPlex) {
	this.myPlex = myPlex;
    }

    @XmlAttribute
    public String getMyPlexMappingState() {
	return myPlexMappingState;
    }

    public void setMyPlexMappingState(String myPlexMappingState) {
	this.myPlexMappingState = myPlexMappingState;
    }

    @XmlAttribute
    public String getMyPlexSigninState() {
	return myPlexSigninState;
    }

    public void setMyPlexSigninState(String myPlexSigninState) {
	this.myPlexSigninState = myPlexSigninState;
    }

    @XmlAttribute
    public int getMyPlexSubscription() {
	return myPlexSubscription;
    }

    public void setMyPlexSubscription(int myPlexSubscription) {
	this.myPlexSubscription = myPlexSubscription;
    }

    @XmlAttribute
    public String getMyPlexUsername() {
	return myPlexUsername;
    }

    public void setMyPlexUsername(String myPlexUsername) {
	this.myPlexUsername = myPlexUsername;
    }

    @XmlAttribute
    public int getOfflineTranscode() {
	return offlineTranscode;
    }

    public void setOfflineTranscode(int offlineTranscode) {
	this.offlineTranscode = offlineTranscode;
    }

    @XmlAttribute
    public String getOwnerFeatures() {
	return ownerFeatures;
    }

    public void setOwnerFeatures(String ownerFeatures) {
	this.ownerFeatures = ownerFeatures;
    }

    @XmlAttribute
    public int getPhotoAutoTag() {
	return photoAutoTag;
    }

    public void setPhotoAutoTag(int photoAutoTag) {
	this.photoAutoTag = photoAutoTag;
    }

    @XmlAttribute
    public String getPlatform() {
	return platform;
    }

    public void setPlatform(String platform) {
	this.platform = platform;
    }

    @XmlAttribute
    public String getPlatformVersion() {
	return platformVersion;
    }

    public void setPlatformVersion(String platformVersion) {
	this.platformVersion = platformVersion;
    }

    @XmlAttribute
    public int getPluginHost() {
	return pluginHost;
    }

    public void setPluginHost(int pluginHost) {
	this.pluginHost = pluginHost;
    }

    @XmlAttribute
    public int getPushNotifications() {
	return pushNotifications;
    }

    public void setPushNotifications(int pushNotifications) {
	this.pushNotifications = pushNotifications;
    }

    @XmlAttribute
    public int getReadOnlyLibraries() {
	return readOnlyLibraries;
    }

    public void setReadOnlyLibraries(int readOnlyLibraries) {
	this.readOnlyLibraries = readOnlyLibraries;
    }

    @XmlAttribute
    public int getRequestParametersInCookie() {
	return requestParametersInCookie;
    }

    public void setRequestParametersInCookie(int requestParametersInCookie) {
	this.requestParametersInCookie = requestParametersInCookie;
    }

    @XmlAttribute
    public String getStreamingBrainABRVersion() {
	return streamingBrainABRVersion;
    }

    public void setStreamingBrainABRVersion(String streamingBrainABRVersion) {
	this.streamingBrainABRVersion = streamingBrainABRVersion;
    }

    @XmlAttribute
    public String getStreamingBrainVersion() {
	return streamingBrainVersion;
    }

    public void setStreamingBrainVersion(String streamingBrainVersion) {
	this.streamingBrainVersion = streamingBrainVersion;
    }

    @XmlAttribute
    public int getSync() {
	return sync;
    }

    public void setSync(int sync) {
	this.sync = sync;
    }

    @XmlAttribute
    public int getTranscoderActiveVideoSessions() {
	return transcoderActiveVideoSessions;
    }

    public void setTranscoderActiveVideoSessions(int transcoderActiveVideoSessions) {
	this.transcoderActiveVideoSessions = transcoderActiveVideoSessions;
    }

    @XmlAttribute
    public int getTranscoderAudio() {
	return transcoderAudio;
    }

    public void setTranscoderAudio(int transcoderAudio) {
	this.transcoderAudio = transcoderAudio;
    }

    @XmlAttribute
    public int getTranscoderLyrics() {
	return transcoderLyrics;
    }

    public void setTranscoderLyrics(int transcoderLyrics) {
	this.transcoderLyrics = transcoderLyrics;
    }

    @XmlAttribute
    public int getTranscoderPhoto() {
	return transcoderPhoto;
    }

    public void setTranscoderPhoto(int transcoderPhoto) {
	this.transcoderPhoto = transcoderPhoto;
    }

    @XmlAttribute
    public int getTranscoderSubtitles() {
	return transcoderSubtitles;
    }

    public void setTranscoderSubtitles(int transcoderSubtitles) {
	this.transcoderSubtitles = transcoderSubtitles;
    }

    @XmlAttribute
    public int getTranscoderVideo() {
	return transcoderVideo;
    }

    public void setTranscoderVideo(int transcoderVideo) {
	this.transcoderVideo = transcoderVideo;
    }

    @XmlAttribute
    public String getTranscoderVideoBitrates() {
	return transcoderVideoBitrates;
    }

    public void setTranscoderVideoBitrates(String transcoderVideoBitrates) {
	this.transcoderVideoBitrates = transcoderVideoBitrates;
    }

    @XmlAttribute
    public String getTranscoderVideoQualities() {
	return transcoderVideoQualities;
    }

    public void setTranscoderVideoQualities(String transcoderVideoQualities) {
	this.transcoderVideoQualities = transcoderVideoQualities;
    }

    @XmlAttribute
    public String getTranscoderVideoResolutions() {
	return transcoderVideoResolutions;
    }

    public void setTranscoderVideoResolutions(String transcoderVideoResolutions) {
	this.transcoderVideoResolutions = transcoderVideoResolutions;
    }

    @XmlAttribute
    public long getUpdatedAt() {
	return updatedAt;
    }

    public void setUpdatedAt(long updatedAt) {
	this.updatedAt = updatedAt;
    }

    @XmlAttribute
    public int getUpdater() {
	return updater;
    }

    public void setUpdater(int updater) {
	this.updater = updater;
    }

    @XmlAttribute
    public String getVersion() {
	return version;
    }

    public void setVersion(String version) {
	this.version = version;
    }

    @XmlAttribute
    public int getVoiceSearch() {
	return voiceSearch;
    }

    public void setVoiceSearch(int voiceSearch) {
	this.voiceSearch = voiceSearch;
    }

    @XmlElement(name = "Directory")
    public List<Directory<?>> getDirectories() {
	return directories;
    }

    public void setDirectories(List<Directory<?>> directories) {
	this.directories = directories;
    }
}
