package libplex.plextv.entity;

import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "MediaContainer")
@XmlAccessorType(XmlAccessType.NONE)
public class MediaContainer_Server {

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
}
