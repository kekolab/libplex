package libplex.plex.entity;

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
    @XmlAttribute private Integer size;
    @XmlAttribute private Integer allowCameraUpload;
    @XmlAttribute private Integer allowChannelAccess;
    @XmlAttribute private Integer allowMediaDeletion;
    @XmlAttribute private Integer allowSharing;
    @XmlAttribute private Integer allowSync;
    @XmlAttribute private Integer allowTuners;
    @XmlAttribute private Integer backgroundProcessing;
    @XmlAttribute private Integer certificate;
    @XmlAttribute private Integer companionProxy;
    @XmlAttribute private String countryCode;
    @XmlAttribute private String diagnostics;
    @XmlAttribute private Integer eventStream;
    @XmlAttribute private String friendlyName;
    @XmlAttribute private Integer hubSearch;
    @XmlAttribute private Integer itemClusters;
    @XmlAttribute private Integer livetv;
    @XmlAttribute private String machineIdentifier;
    @XmlAttribute private Integer mediaProviders;
    @XmlAttribute private Integer multiuser;
    @XmlAttribute private Integer myPlex;
    @XmlAttribute private String myPlexMappingState;
    @XmlAttribute private String myPlexSigninState;
    @XmlAttribute private Integer myPlexSubscription;
    @XmlAttribute private String myPlexUsername;
    @XmlAttribute private Integer offlineTranscode;
    @XmlAttribute
    @XmlJavaTypeAdapter(StringListAdapter.class) private List<String> ownerFeatures;
    @XmlAttribute private Integer photoAutoTag;
    @XmlAttribute private String platform;
    @XmlAttribute private String platformVersion;
    @XmlAttribute private Integer pluginHost;
    @XmlAttribute private Integer pushNotifications;
    @XmlAttribute private Integer readOnlyLibraries;
    @XmlAttribute private Integer requestParametersInCookie;
    @XmlAttribute private Integer streamingBrainABRVersion;
    @XmlAttribute private Integer streamingBrainVersion;
    @XmlAttribute private Integer sync;
    @XmlAttribute private Integer transcoderActiveVideoSessions;
    @XmlAttribute private Integer transcoderAudio;
    @XmlAttribute private Integer transcoderLyrics;
    @XmlAttribute private Integer transcoderPhoto;
    @XmlAttribute private Integer transcoderSubtitles;
    @XmlAttribute private Integer transcoderVideo;
    @XmlAttribute
    @XmlJavaTypeAdapter(IntegerListAdapter.class) private List<Integer> transcoderVideoBitrates;
    @XmlAttribute
    @XmlJavaTypeAdapter(IntegerListAdapter.class) private List<Integer> transcoderVideoQualities;
    @XmlAttribute
    @XmlJavaTypeAdapter(IntegerListAdapter.class) private List<Integer> transcoderVideoResolutions;
    @XmlAttribute
    @XmlJavaTypeAdapter(TimestampAdapter.class) private Date updatedAt;
    @XmlAttribute private Integer updater;
    @XmlAttribute private String version;
    @XmlAttribute private Integer voiceSearch;

    @XmlElement(name = "Directory") private List<Directory> directories;
    @XmlAttribute private String art;
    @XmlAttribute private String content;
    @XmlAttribute private String identifier;
    @XmlAttribute private String mediaTagPrefix;
    @XmlAttribute private Integer mediaTagVersion;
    @XmlAttribute private String title1;
    @XmlAttribute private String title2;
    @XmlAttribute private Integer librarySectionID;
    @XmlAttribute private Integer nocache;
    @XmlAttribute private String thumb;
    @XmlAttribute private String viewGroup;
    @XmlAttribute private Integer viewMode;
    @XmlAttribute private Integer mixedParents;
    @XmlAttribute private String librarySectionTitle;
    @XmlAttribute private String librarySectionUUID;
    @XmlAttribute private Integer grandparentRatingKey;
    @XmlAttribute private String grandparentThumb;
    @XmlAttribute private String grandparentTitle;
    @XmlAttribute private Integer key;
    @XmlAttribute private Integer parentIndex;
    @XmlAttribute private String parentTitle;
    @XmlAttribute private Integer parentYear;
    @XmlAttribute private String summary;
    @XmlElement(name = "Track") private List<Track> tracks;

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

    public String getCountryCode() {
	return countryCode;
    }

    public String getDiagnostics() {
	return diagnostics;
    }

    public Integer getEventStream() {
	return eventStream;
    }

    public String getFriendlyName() {
	return friendlyName;
    }

    public Integer getHubSearch() {
	return hubSearch;
    }

    public Integer getItemClusters() {
	return itemClusters;
    }

    public Integer getLivetv() {
	return livetv;
    }

    public String getMachineIdentifier() {
	return machineIdentifier;
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

    public String getMyPlexMappingState() {
	return myPlexMappingState;
    }

    public String getMyPlexSigninState() {
	return myPlexSigninState;
    }

    public Integer getMyPlexSubscription() {
	return myPlexSubscription;
    }

    public String getMyPlexUsername() {
	return myPlexUsername;
    }

    public Integer getOfflineTranscode() {
	return offlineTranscode;
    }

    public List<String> getOwnerFeatures() {
	return ownerFeatures;
    }

    public Integer getPhotoAutoTag() {
	return photoAutoTag;
    }

    public String getPlatform() {
	return platform;
    }

    public String getPlatformVersion() {
	return platformVersion;
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

    public Integer getUpdater() {
	return updater;
    }

    public String getVersion() {
	return version;
    }

    public Integer getVoiceSearch() {
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

    public Integer getMediaTagVersion() {
	return mediaTagVersion;
    }

    public String getTitle1() {
	return title1;
    }

    public String getTitle2() {
	return title2;
    }

    public Integer getLibrarySectionID() {
	return librarySectionID;
    }

    public Integer getNocache() {
	return nocache;
    }

    public String getThumb() {
	return thumb;
    }

    public String getViewGroup() {
	return viewGroup;
    }

    public Integer getViewMode() {
	return viewMode;
    }

    public Integer getMixedParents() {
	return mixedParents;
    }

    protected String getLibrarySectionTitle() {
	return librarySectionTitle;
    }

    protected String getLibrarySectionUUID() {
	return librarySectionUUID;
    }

    protected Integer getGrandparentRatingKey() {
	return grandparentRatingKey;
    }

    protected String getGrandparentThumb() {
	return grandparentThumb;
    }

    protected String getGrandparentTitle() {
	return grandparentTitle;
    }

    protected Integer getKey() {
	return key;
    }

    protected Integer getParentIndex() {
	return parentIndex;
    }

    protected String getParentTitle() {
	return parentTitle;
    }

    protected Integer getParentYear() {
	return parentYear;
    }

    protected String getSummary() {
	return summary;
    }

    protected List<Track> getTracks() {
	return tracks;
    }
}
