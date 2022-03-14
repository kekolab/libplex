//package kekolab.libplex.entity;
//
//import java.net.URI;
//import java.util.Collections;
//import java.util.List;
//
//import jakarta.xml.bind.annotation.XmlAccessType;
//import jakarta.xml.bind.annotation.XmlAccessorType;
//import jakarta.xml.bind.annotation.XmlAttribute;
//import jakarta.xml.bind.annotation.XmlElement;
//import jakarta.xml.bind.annotation.XmlRootElement;
//import kekolab.libplex.PlexUriBuilder;
//
//@XmlRootElement
//@XmlAccessorType(XmlAccessType.NONE)
//public class Part {
//    @XmlAttribute private Integer id; // Track, Video, Episode
//    @XmlAttribute private String key; // Track, Video, Episode
//    @XmlAttribute private Integer duration; // Track, Video, Episode
//    @XmlAttribute private String file; // Track, Video, Episode
//    @XmlAttribute private Integer size; // Track, Video, Episode
//    @XmlAttribute private String container; // Track, Video, Episode
//    @XmlAttribute private Integer hasThumbnail; // Track
//    @XmlElement(name = "Stream") private List<Stream> streams; // Track, Episode
//    @XmlAttribute private String audioProfile; // Video
//    @XmlAttribute private String videoProfile; // Video, Episode
//
//    private ServerContent server;
//
//    public Integer getId() {
//        return id;
//    }
//
//    public String getKey() {
//        return key;
//    }
//
//    public Integer getDuration() {
//        return duration;
//    }
//
//    public String getFile() {
//        return file;
//    }
//
//    public Integer getSize() {
//        return size;
//    }
//
//    public String getContainer() {
//        return container;
//    }
//
//    public Integer getHasThumbnail() {
//        return hasThumbnail;
//    }
//
//    public List<Stream> getStreams() {
//        return streams != null ? streams : Collections.emptyList();
//    }
//
//    public void setServer(ServerContent server) {
//        this.server = server;
//    }
//
//    public URI getURI(PlexUriBuilder uriBuilder) {
//        return uriBuilder.fromKey(key, null, server)
//                .build();
//    }
//
//    public String getAudioProfile() {
//        return audioProfile;
//    }
//
//    public String getVideoProfile() {
//        return videoProfile;
//    }
//}
