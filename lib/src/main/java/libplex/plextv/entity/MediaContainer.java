package libplex.plextv.entity;

import java.util.Date;
import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement(name = "MediaContainer")
@XmlAccessorType(XmlAccessType.NONE)
public class MediaContainer {
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
	@XmlAttribute
	@XmlJavaTypeAdapter(StringListAdapter.class) private List<String> ownerFeatures;
	@XmlAttribute private int photoAutoTag;
	@XmlAttribute private String platform;
	@XmlAttribute private String platformVersion;
	@XmlAttribute private int pluginHost;
	@XmlAttribute private int pushNotifications;
	@XmlAttribute private int readOnlyLibraries;
	@XmlAttribute private int requestParametersInCookie;
	@XmlAttribute private int streamingBrainABRVersion;
	@XmlAttribute private int streamingBrainVersion;
	@XmlAttribute private int sync;
	@XmlAttribute private int transcoderActiveVideoSessions;
	@XmlAttribute private int transcoderAudio;
	@XmlAttribute private int transcoderLyrics;
	@XmlAttribute private int transcoderPhoto;
	@XmlAttribute private int transcoderSubtitles;
	@XmlAttribute private int transcoderVideo;
	@XmlAttribute
	@XmlJavaTypeAdapter(IntegerListAdapter.class) private List<Integer> transcoderVideoBitrates;
	@XmlAttribute
	@XmlJavaTypeAdapter(IntegerListAdapter.class) private List<Integer> transcoderVideoQualities;
	@XmlAttribute
	@XmlJavaTypeAdapter(IntegerListAdapter.class) private List<Integer> transcoderVideoResolutions;
	@XmlAttribute
	@XmlJavaTypeAdapter(TimestampAdapter.class) private Date updatedAt;
	@XmlAttribute private int updater;
	@XmlAttribute private String version;
	@XmlAttribute private int voiceSearch;
	@XmlElement(name = "Directory") private List<Directory> directories;
	@XmlAttribute private String art;
	@XmlAttribute private String content;
	@XmlAttribute private String identifier;
	@XmlAttribute private String mediaTagPrefix;
	@XmlAttribute private int mediaTagVersion;
	@XmlAttribute private String title1;
	@XmlAttribute private String title2;
	@XmlAttribute private int librarySectionID;
	@XmlAttribute private int nocache;
	@XmlAttribute private String thumb;
	@XmlAttribute private String viewGroup;
	@XmlAttribute private int viewMode;
	@XmlAttribute private int mixedParents;

	public int getSize() {
		return size;
	}

	public int getAllowCameraUpload() {
		return allowCameraUpload;
	}

	public int getAllowChannelAccess() {
		return allowChannelAccess;
	}

	public int getAllowMediaDeletion() {
		return allowMediaDeletion;
	}

	public int getAllowSharing() {
		return allowSharing;
	}

	public int getAllowSync() {
		return allowSync;
	}

	public int getAllowTuners() {
		return allowTuners;
	}

	public int getBackgroundProcessing() {
		return backgroundProcessing;
	}

	public int getCertificate() {
		return certificate;
	}

	public int getCompanionProxy() {
		return companionProxy;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public String getDiagnostics() {
		return diagnostics;
	}

	public int getEventStream() {
		return eventStream;
	}

	public String getFriendlyName() {
		return friendlyName;
	}

	public int getHubSearch() {
		return hubSearch;
	}

	public int getItemClusters() {
		return itemClusters;
	}

	public int getLivetv() {
		return livetv;
	}

	public String getMachineIdentifier() {
		return machineIdentifier;
	}

	public int getMediaProviders() {
		return mediaProviders;
	}

	public int getMultiuser() {
		return multiuser;
	}

	public int getMyPlex() {
		return myPlex;
	}

	public String getMyPlexMappingState() {
		return myPlexMappingState;
	}

	public String getMyPlexSigninState() {
		return myPlexSigninState;
	}

	public int getMyPlexSubscription() {
		return myPlexSubscription;
	}

	public String getMyPlexUsername() {
		return myPlexUsername;
	}

	public int getOfflineTranscode() {
		return offlineTranscode;
	}

	public List<String> getOwnerFeatures() {
		return ownerFeatures;
	}

	public int getPhotoAutoTag() {
		return photoAutoTag;
	}

	public String getPlatform() {
		return platform;
	}

	public String getPlatformVersion() {
		return platformVersion;
	}

	public int getPluginHost() {
		return pluginHost;
	}

	public int getPushNotifications() {
		return pushNotifications;
	}

	public int getReadOnlyLibraries() {
		return readOnlyLibraries;
	}

	public int getRequestParametersInCookie() {
		return requestParametersInCookie;
	}

	public int getStreamingBrainABRVersion() {
		return streamingBrainABRVersion;
	}

	public int getStreamingBrainVersion() {
		return streamingBrainVersion;
	}

	public int getSync() {
		return sync;
	}

	public int getTranscoderActiveVideoSessions() {
		return transcoderActiveVideoSessions;
	}

	public int getTranscoderAudio() {
		return transcoderAudio;
	}

	public int getTranscoderLyrics() {
		return transcoderLyrics;
	}

	public int getTranscoderPhoto() {
		return transcoderPhoto;
	}

	public int getTranscoderSubtitles() {
		return transcoderSubtitles;
	}

	public int getTranscoderVideo() {
		return transcoderVideo;
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

	public int getUpdater() {
		return updater;
	}

	public String getVersion() {
		return version;
	}

	public int getVoiceSearch() {
		return voiceSearch;
	}

	public List<Directory> getDirectories() {
		return directories;
	}

	public String getArt() {
		return art;
	}

	public String getContent() {
		return content;
	}

	public String getIdentifier() {
		return identifier;
	}

	public String getMediaTagPrefix() {
		return mediaTagPrefix;
	}

	public int getMediaTagVersion() {
		return mediaTagVersion;
	}

	public String getTitle1() {
		return title1;
	}

	public String getTitle2() {
		return title2;
	}

	public int getLibrarySectionID() {
		return librarySectionID;
	}

	public int getNocache() {
		return nocache;
	}

	public String getThumb() {
		return thumb;
	}

	public String getViewGroup() {
		return viewGroup;
	}

	public int getViewMode() {
		return viewMode;
	}

	public int getMixedParents() {
		return mixedParents;
	}
}
