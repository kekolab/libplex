//package kekolab.libplex.entity;
//
//import java.net.URI;
//import java.util.Date;
//import java.util.List;
//
//import jakarta.xml.bind.annotation.XmlAccessType;
//import jakarta.xml.bind.annotation.XmlAccessorType;
//import jakarta.xml.bind.annotation.XmlAttribute;
//import jakarta.xml.bind.annotation.XmlElement;
//import jakarta.xml.bind.annotation.XmlRootElement;
//import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
//import kekolab.libplex.PlexClient;
//import kekolab.libplex.xmladapter.IntegerListAdapter;
//import kekolab.libplex.xmladapter.StringListAdapter;
//import kekolab.libplex.xmladapter.TimestampAdapter;
//
//@XmlRootElement(name = "MediaContainer")
//@XmlAccessorType(XmlAccessType.NONE)
//public class MediaContainer {
//    @XmlAttribute private Integer size;
//    @XmlAttribute private Integer allowCameraUpload;
//    @XmlAttribute private Integer allowChannelAccess;
//    @XmlAttribute private Integer allowMediaDeletion;
//    @XmlAttribute private Integer allowSharing;
//    @XmlAttribute private Integer allowSync;
//    @XmlAttribute private Integer allowTuners;
//    @XmlAttribute private Integer backgroundProcessing;
//    @XmlAttribute private Integer certificate;
//    @XmlAttribute private Integer companionProxy;
//    @XmlAttribute private String countryCode;
//    @XmlElement(name = "Server") private List<Server> servers;
//    @XmlAttribute
//    @XmlJavaTypeAdapter(StringListAdapter.class) private List<String> diagnostics;
//    @XmlAttribute private Integer eventStream;
//    @XmlAttribute private String friendlyName;
//    @XmlAttribute private Integer hubSearch;
//    @XmlAttribute private Integer itemClusters;
//    @XmlAttribute private Integer livetv;
//    @XmlAttribute private String machineIdentifier;
//    @XmlAttribute private Integer mediaProviders;
//    @XmlAttribute private Integer multiuser;
//    @XmlAttribute private Integer myPlex;
//    @XmlAttribute private String myPlexMappingState;
//    @XmlAttribute private String myPlexSigninState;
//    @XmlAttribute private Integer myPlexSubscription;
//    @XmlAttribute private String myPlexUsername;
//    @XmlAttribute private Integer offlineTranscode;
//    @XmlAttribute
//    @XmlJavaTypeAdapter(StringListAdapter.class) private List<String> ownerFeatures;
//    @XmlAttribute private Integer photoAutoTag;
//    @XmlAttribute private String platform;
//    @XmlAttribute private String platformVersion;
//    @XmlAttribute private Integer pluginHost;
//    @XmlAttribute private Integer pushNotifications;
//    @XmlAttribute private Integer readOnlyLibraries;
//    @XmlAttribute private Integer requestParametersInCookie;
//    @XmlAttribute private Integer streamingBrainABRVersion;
//    @XmlAttribute private Integer streamingBrainVersion;
//    @XmlAttribute private Integer sync;
//    @XmlAttribute private Integer transcoderActiveVideoSessions;
//    @XmlAttribute private Integer transcoderAudio;
//    @XmlAttribute private Integer transcoderLyrics;
//    @XmlAttribute private Integer transcoderPhoto;
//    @XmlAttribute private Integer transcoderSubtitles;
//    @XmlAttribute private Integer transcoderVideo;
//    @XmlAttribute
//    @XmlJavaTypeAdapter(IntegerListAdapter.class) private List<Integer> transcoderVideoBitrates;
//    @XmlAttribute
//    @XmlJavaTypeAdapter(IntegerListAdapter.class) private List<Integer> transcoderVideoQualities;
//    @XmlAttribute
//    @XmlJavaTypeAdapter(IntegerListAdapter.class) private List<Integer> transcoderVideoResolutions;
//    @XmlAttribute
//    @XmlJavaTypeAdapter(TimestampAdapter.class) private Date updatedAt;
//    @XmlAttribute private Integer updater;
//    @XmlAttribute private String version;
//    @XmlAttribute private Integer voiceSearch;
//    @XmlElement(name = "Directory") private List<Directory> directories;
//    @XmlAttribute private String art;
//    @XmlAttribute private String content;
//    @XmlAttribute private String identifier;
//    @XmlAttribute private String mediaTagPrefix;
//    @XmlAttribute private Integer mediaTagVersion;
//    @XmlAttribute private String title1;
//    @XmlAttribute private String title2;
//    @XmlAttribute private Integer librarySectionID;
//    @XmlAttribute private Integer nocache;
//    @XmlAttribute private String thumb;
//    @XmlAttribute private String viewGroup;
//    @XmlAttribute private Integer viewMode;
//    @XmlAttribute private Integer mixedParents;
//    @XmlAttribute private String librarySectionTitle;
//    @XmlAttribute private String librarySectionUUID;
//    @XmlAttribute private Integer grandparentRatingKey;
//    @XmlAttribute private String grandparentThumb;
//    @XmlAttribute private String grandparentTitle;
//    @XmlAttribute private Integer key;
//    @XmlAttribute private Integer parentIndex;
//    @XmlAttribute private String parentTitle;
//    @XmlAttribute private Integer parentYear;
//    @XmlAttribute private String summary;
//    @XmlElement(name = "Track") private List<Track> tracks;
//    @XmlElement(name = "Video") private List<Video> videos;
//    private PlexClient client;
//    private URI uri;
//
//    protected void setClient(PlexClient client) {
//        this.client = client;
//    }
//
//    protected PlexClient getClient() {
//        return client;
//    }
//
//    protected void setUri(URI uri) {
//        this.uri = uri;
//    }
//
//    public URI getUri() {
//        return uri;
//    }
//
//    protected String getSummary() {
//        return summary;
//    }
//
//    protected List<Directory> getDirectories() {
//        return directories;
//    }
//}
