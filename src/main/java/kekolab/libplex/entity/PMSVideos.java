package kekolab.libplex.entity;

import java.util.List;
import java.util.stream.Collectors;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "MediaContainer")
public class PMSVideos extends PMSMovieSectionContent {
    private Integer viewMode;
    private String art, thumb, title1, title2, viewGroup;
    private List<VideoInfo> videos;

    public Integer getViewMode() {
        return viewMode;
    }

    public String getArt() {
        return art;
    }

    public String getThumb() {
        return thumb;
    }

    public String getTitle1() {
        return title1;
    }

    public String getTitle2() {
        return title2;
    }

    public String getViewGroup() {
        return viewGroup;
    }

    public List<VideoInfo> getVideos() {
        if (videos != null)
            videos = videos.stream()
                    .map(v -> {
                        v.setClient(getClient());
                        v.setParent(this);
                        v.setServer(getServer());
                        return v;
                    })
                    .collect(Collectors.toList());
        return videos;
    }

    @XmlAttribute
    public void setViewMode(Integer viewMode) {
        this.viewMode = viewMode;
    }

    @XmlAttribute
    public void setArt(String art) {
        this.art = art;
    }

    @XmlAttribute
    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    @XmlAttribute
    public void setTitle1(String title1) {
        this.title1 = title1;
    }

    @XmlAttribute
    public void setTitle2(String title2) {
        this.title2 = title2;
    }

    @XmlAttribute
    public void setViewGroup(String viewGroup) {
        this.viewGroup = viewGroup;
    }

    @XmlElement(name = "Video")
    public void setVideos(List<VideoInfo> videos) {
        this.videos = videos;
    }
}
