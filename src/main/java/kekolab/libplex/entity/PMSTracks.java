package kekolab.libplex.entity;

import java.util.List;
import java.util.stream.Collectors;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "MediaContainer")
public class PMSTracks extends PMSMusicSectionContent {
    private Integer grandparentRatingKey, key, nocache, parentIdex, parentYear, viewMode;
    private String art, grandparentThumb, grandparentTitle, parentTitle, summary, thumb, title1, title2, viewGroup;
    private List<PMSTrackDirectory> tracks;

    public Integer getGrandparentRatingKey() {
        return grandparentRatingKey;
    }

    public Integer getKey() {
        return key;
    }

    public Integer getNocache() {
        return nocache;
    }

    public Integer getParentIdex() {
        return parentIdex;
    }

    public Integer getParentYear() {
        return parentYear;
    }

    public Integer getViewMode() {
        return viewMode;
    }

    public String getArt() {
        return art;
    }

    public String getGrandparentThumb() {
        return grandparentThumb;
    }

    public String getGrandparentTitle() {
        return grandparentTitle;
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

    public List<PMSTrackDirectory> getTracks() {
        if (tracks != null)
            setTracks(tracks.stream()
                    .map(t -> {
                        t.setClient(getClient());
                        t.setParent(this);
                        t.setServer(getServer());
                        return t;
                    })
                    .collect(Collectors.toList()));
        return tracks;
    }

    @XmlAttribute
    public void setGrandparentRatingKey(Integer grandparentRatingKey) {
        this.grandparentRatingKey = grandparentRatingKey;
    }

    @XmlAttribute
    public void setKey(Integer key) {
        this.key = key;
    }

    @XmlAttribute
    public void setNocache(Integer nocache) {
        this.nocache = nocache;
    }

    @XmlAttribute
    public void setParentIdex(Integer parentIdex) {
        this.parentIdex = parentIdex;
    }

    @XmlAttribute
    public void setParentYear(Integer parentYear) {
        this.parentYear = parentYear;
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
    public void setGrandparentThumb(String grandparentThumb) {
        this.grandparentThumb = grandparentThumb;
    }

    @XmlAttribute
    public void setGrandparentTitle(String grandparentTitle) {
        this.grandparentTitle = grandparentTitle;
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

    @XmlElement(name = "Track")
    public void setTracks(List<PMSTrackDirectory> tracks) {
        this.tracks = tracks;
    }
}
