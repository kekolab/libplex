package libplex.plex.entity;

import java.net.URI;
import java.util.Date;
import java.util.List;

import libplex.Plex;

public class Server implements Parent {
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
    private List<String> ownerFeatures;
    private int photoAutoTag;
    private String platform;
    private String platformVersion;
    private int pluginHost;
    private int pushNotifications;
    private int readOnlyLibraries;
    private int requestParametersInCookie;
    private int streamingBrainABRVersion;
    private int streamingBrainVersion;
    private int sync;
    private int transcoderActiveVideoSessions;
    private int transcoderAudio;
    private int transcoderLyrics;
    private int transcoderPhoto;
    private int transcoderSubtitles;
    private int transcoderVideo;
    private List<Integer> transcoderVideoBitrates;
    private String transcoderVideoQualities;
    private String transcoderVideoResolutions;
    private Date updatedAt;
    private int updater;
    private String version;
    private int voiceSearch;

    private URI uri;
    private MediaContainer mc;
    private Directory libraryDirectory;
    private Plex plex;

    public Server(MediaContainer mc, URI uri, Plex plex) {
	this.uri = uri;
	this.mc = mc;
	this.plex = plex;
    }

    public Library library() {
	if (libraryDirectory == null)
	    libraryDirectory = mc.getDirectories()
		    .stream()
		    .filter(d -> "library".equals(d.getKey()))
		    .findAny()
		    .orElse(null);
	URI uri = plex.uri(libraryDirectory.getKey(), this, this, null);
	MediaContainer mc = plex.executeGet(uri, MediaContainer.class);
	return new Library(mc, uri, this, plex);
    }

    @Override
    public URI getUri() {
	return uri;
    }
}
