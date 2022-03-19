package kekolab.libplex.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "MediaContainer")
public class PMSAlbums extends PMSMusicSectionContent {
    private Integer nocache, parentIndex, viewMode;
    private String art, parentTitle, summary, thumb, title1, title2, viewGroup;
    private List<AlbumInfo> albums = new ArrayList<>(0);

    public Integer getNocache() {
        return nocache;
    }

    public Integer getParentIndex() {
        return parentIndex;
    }

    public Integer getViewMode() {
        return viewMode;
    }

    public String getArt() {
        return art;
    }

    public String getParentTitle() {
        return parentTitle;
    }

    public String getSummary() {
        return summary;
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

    public List<AlbumInfo> getAlbums() {
        if (albums != null)
            setAlbums(albums.stream()
                    .map(a -> {
                        a.setClient(getClient());
                        a.setParent(this);
                        a.setServer(getServer());
                        return a;
                    })
                    .collect(Collectors.toList()));
        return albums;
    }

    @XmlAttribute
    public void setNocache(Integer nocache) {
        this.nocache = nocache;
    }

    @XmlAttribute
    public void setParentIndex(Integer parentIndex) {
        this.parentIndex = parentIndex;
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
    public void setParentTitle(String parentTitle) {
        this.parentTitle = parentTitle;
    }

    @XmlAttribute
    public void setSummary(String summary) {
        this.summary = summary;
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

    @XmlElement(name = "Directory")
    public void setAlbums(List<AlbumInfo> albums) {
        this.albums = albums;
    }
}
