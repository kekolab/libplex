package libplex.plextv.entity;

import java.io.IOException;
import java.net.URI;
import java.util.List;

import jakarta.ws.rs.client.Client;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "MediaContainer")
@XmlAccessorType(XmlAccessType.NONE)
public class Server implements Parent {
	@XmlAttribute private int size;
	@XmlAttribute private int allowCameraUpload;
	@XmlAttribute private int allowChannelAccess;
	@XmlAttribute private int allowMediaDeletion;
	@XmlAttribute private int allowSharing;
	@XmlAttribute private int allowSync;
	@XmlAttribute private int allowTuners;
	@XmlAttribute private int backgroundProcessing;
	@XmlAttribute private int certificate;
	@XmlAttribute private int companionProxy;
	@XmlAttribute private String countryCode;
	@XmlAttribute private String diagnostics;
	@XmlAttribute private int eventStream;
	@XmlAttribute private String friendlyName;
	@XmlAttribute private int hubSearch;
	@XmlAttribute private int itemClusters;
	@XmlAttribute private int livetv;
	@XmlAttribute private String machineIdentifier;
	@XmlAttribute private int mediaProviders;
	@XmlAttribute private int multiuser;
	@XmlAttribute private int myPlex;
	@XmlAttribute private String myPlexMappingState;
	@XmlAttribute private String myPlexSigninState;
	@XmlAttribute private int myPlexSubscription;
	@XmlAttribute private String myPlexUsername;
	@XmlAttribute private int offlineTranscode;
	@XmlAttribute private String ownerFeatures;
	@XmlAttribute private int photoAutoTag;
	@XmlAttribute private String platform;
	@XmlAttribute private String platformVersion;
	@XmlAttribute private int pluginHost;
	@XmlAttribute private int pushNotifications;
	@XmlAttribute private int readOnlyLibraries;
	@XmlAttribute private int requestParametersInCookie;
	@XmlAttribute private String streamingBrainABRVersion;
	@XmlAttribute private String streamingBrainVersion;
	@XmlAttribute private int sync;
	@XmlAttribute private int transcoderActiveVideoSessions;
	@XmlAttribute private int transcoderAudio;
	@XmlAttribute private int transcoderLyrics;
	@XmlAttribute private int transcoderPhoto;
	@XmlAttribute private int transcoderSubtitles;
	@XmlAttribute private int transcoderVideo;
	@XmlAttribute private String transcoderVideoBitrates;
	@XmlAttribute private String transcoderVideoQualities;
	@XmlAttribute private String transcoderVideoResolutions;
	@XmlAttribute private long updatedAt;
	@XmlAttribute private int updater;
	@XmlAttribute private String version;
	@XmlAttribute private int voiceSearch;
	@XmlElement(name = "Directory") private List<Directory> directories;
	private URI uri;
	private Client client;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getAllowCameraUpload() {
		return allowCameraUpload;
	}

	public void setAllowCameraUpload(int allowCameraUpload) {
		this.allowCameraUpload = allowCameraUpload;
	}

	public int getAllowChannelAccess() {
		return allowChannelAccess;
	}

	public void setAllowChannelAccess(int allowChannelAccess) {
		this.allowChannelAccess = allowChannelAccess;
	}

	public int getAllowMediaDeletion() {
		return allowMediaDeletion;
	}

	public void setAllowMediaDeletion(int allowMediaDeletion) {
		this.allowMediaDeletion = allowMediaDeletion;
	}

	public int getAllowSharing() {
		return allowSharing;
	}

	public void setAllowSharing(int allowSharing) {
		this.allowSharing = allowSharing;
	}

	public int getAllowSync() {
		return allowSync;
	}

	public void setAllowSync(int allowSync) {
		this.allowSync = allowSync;
	}

	public int getAllowTuners() {
		return allowTuners;
	}

	public void setAllowTuners(int allowTuners) {
		this.allowTuners = allowTuners;
	}

	public int getBackgroundProcessing() {
		return backgroundProcessing;
	}

	public void setBackgroundProcessing(int backgroundProcessing) {
		this.backgroundProcessing = backgroundProcessing;
	}

	public int getCertificate() {
		return certificate;
	}

	public void setCertificate(int certificate) {
		this.certificate = certificate;
	}

	public int getCompanionProxy() {
		return companionProxy;
	}

	public void setCompanionProxy(int companionProxy) {
		this.companionProxy = companionProxy;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getDiagnostics() {
		return diagnostics;
	}

	public void setDiagnostics(String diagnostics) {
		this.diagnostics = diagnostics;
	}

	public int getEventStream() {
		return eventStream;
	}

	public void setEventStream(int eventStream) {
		this.eventStream = eventStream;
	}

	public String getFriendlyName() {
		return friendlyName;
	}

	public void setFriendlyName(String friendlyName) {
		this.friendlyName = friendlyName;
	}

	public int getHubSearch() {
		return hubSearch;
	}

	public void setHubSearch(int hubSearch) {
		this.hubSearch = hubSearch;
	}

	public int getItemClusters() {
		return itemClusters;
	}

	public void setItemClusters(int itemClusters) {
		this.itemClusters = itemClusters;
	}

	public int getLivetv() {
		return livetv;
	}

	public void setLivetv(int livetv) {
		this.livetv = livetv;
	}

	public String getMachineIdentifier() {
		return machineIdentifier;
	}

	public void setMachineIdentifier(String machineIdentifier) {
		this.machineIdentifier = machineIdentifier;
	}

	public int getMediaProviders() {
		return mediaProviders;
	}

	public void setMediaProviders(int mediaProviders) {
		this.mediaProviders = mediaProviders;
	}

	public int getMultiuser() {
		return multiuser;
	}

	public void setMultiuser(int multiuser) {
		this.multiuser = multiuser;
	}

	public int getMyPlex() {
		return myPlex;
	}

	public void setMyPlex(int myPlex) {
		this.myPlex = myPlex;
	}

	public String getMyPlexMappingState() {
		return myPlexMappingState;
	}

	public void setMyPlexMappingState(String myPlexMappingState) {
		this.myPlexMappingState = myPlexMappingState;
	}

	public String getMyPlexSigninState() {
		return myPlexSigninState;
	}

	public void setMyPlexSigninState(String myPlexSigninState) {
		this.myPlexSigninState = myPlexSigninState;
	}

	public int getMyPlexSubscription() {
		return myPlexSubscription;
	}

	public void setMyPlexSubscription(int myPlexSubscription) {
		this.myPlexSubscription = myPlexSubscription;
	}

	public String getMyPlexUsername() {
		return myPlexUsername;
	}

	public void setMyPlexUsername(String myPlexUsername) {
		this.myPlexUsername = myPlexUsername;
	}

	public int getOfflineTranscode() {
		return offlineTranscode;
	}

	public void setOfflineTranscode(int offlineTranscode) {
		this.offlineTranscode = offlineTranscode;
	}

	public String getOwnerFeatures() {
		return ownerFeatures;
	}

	public void setOwnerFeatures(String ownerFeatures) {
		this.ownerFeatures = ownerFeatures;
	}

	public int getPhotoAutoTag() {
		return photoAutoTag;
	}

	public void setPhotoAutoTag(int photoAutoTag) {
		this.photoAutoTag = photoAutoTag;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public String getPlatformVersion() {
		return platformVersion;
	}

	public void setPlatformVersion(String platformVersion) {
		this.platformVersion = platformVersion;
	}

	public int getPluginHost() {
		return pluginHost;
	}

	public void setPluginHost(int pluginHost) {
		this.pluginHost = pluginHost;
	}

	public int getPushNotifications() {
		return pushNotifications;
	}

	public void setPushNotifications(int pushNotifications) {
		this.pushNotifications = pushNotifications;
	}

	public int getReadOnlyLibraries() {
		return readOnlyLibraries;
	}

	public void setReadOnlyLibraries(int readOnlyLibraries) {
		this.readOnlyLibraries = readOnlyLibraries;
	}

	public int getRequestParametersInCookie() {
		return requestParametersInCookie;
	}

	public void setRequestParametersInCookie(int requestParametersInCookie) {
		this.requestParametersInCookie = requestParametersInCookie;
	}

	public String getStreamingBrainABRVersion() {
		return streamingBrainABRVersion;
	}

	public void setStreamingBrainABRVersion(String streamingBrainABRVersion) {
		this.streamingBrainABRVersion = streamingBrainABRVersion;
	}

	public String getStreamingBrainVersion() {
		return streamingBrainVersion;
	}

	public void setStreamingBrainVersion(String streamingBrainVersion) {
		this.streamingBrainVersion = streamingBrainVersion;
	}

	public int getSync() {
		return sync;
	}

	public void setSync(int sync) {
		this.sync = sync;
	}

	public int getTranscoderActiveVideoSessions() {
		return transcoderActiveVideoSessions;
	}

	public void setTranscoderActiveVideoSessions(int transcoderActiveVideoSessions) {
		this.transcoderActiveVideoSessions = transcoderActiveVideoSessions;
	}

	public int getTranscoderAudio() {
		return transcoderAudio;
	}

	public void setTranscoderAudio(int transcoderAudio) {
		this.transcoderAudio = transcoderAudio;
	}

	public int getTranscoderLyrics() {
		return transcoderLyrics;
	}

	public void setTranscoderLyrics(int transcoderLyrics) {
		this.transcoderLyrics = transcoderLyrics;
	}

	public int getTranscoderPhoto() {
		return transcoderPhoto;
	}

	public void setTranscoderPhoto(int transcoderPhoto) {
		this.transcoderPhoto = transcoderPhoto;
	}

	public int getTranscoderSubtitles() {
		return transcoderSubtitles;
	}

	public void setTranscoderSubtitles(int transcoderSubtitles) {
		this.transcoderSubtitles = transcoderSubtitles;
	}

	public int getTranscoderVideo() {
		return transcoderVideo;
	}

	public void setTranscoderVideo(int transcoderVideo) {
		this.transcoderVideo = transcoderVideo;
	}

	public String getTranscoderVideoBitrates() {
		return transcoderVideoBitrates;
	}

	public void setTranscoderVideoBitrates(String transcoderVideoBitrates) {
		this.transcoderVideoBitrates = transcoderVideoBitrates;
	}

	public String getTranscoderVideoQualities() {
		return transcoderVideoQualities;
	}

	public void setTranscoderVideoQualities(String transcoderVideoQualities) {
		this.transcoderVideoQualities = transcoderVideoQualities;
	}

	public String getTranscoderVideoResolutions() {
		return transcoderVideoResolutions;
	}

	public void setTranscoderVideoResolutions(String transcoderVideoResolutions) {
		this.transcoderVideoResolutions = transcoderVideoResolutions;
	}

	public long getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(long updatedAt) {
		this.updatedAt = updatedAt;
	}

	public int getUpdater() {
		return updater;
	}

	public void setUpdater(int updater) {
		this.updater = updater;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public int getVoiceSearch() {
		return voiceSearch;
	}

	public void setVoiceSearch(int voiceSearch) {
		this.voiceSearch = voiceSearch;
	}

	public List<Directory> getDirectories() {
		return directories;
	}

	public void setDirectories(List<Directory> directories) {
		this.directories = directories;
	}

	public void setUri(URI uri) {
		this.uri = uri;
	}

	@Override
	public URI getUri() {
		return uri;
	}

	public Library library() throws IOException {
		return directories.stream()
				.filter(d -> d.getKey()
						.equals("library"))
				.map(d -> new DirectoryService<Library>(client, d, this, this))
				.findAny()
				.get()
				.get(Library.class)
				.setClient(client)
				.setParent(this)
				.setServer(this);
	}

	public void setClient(Client client) {
		this.client = client;
	}
}
