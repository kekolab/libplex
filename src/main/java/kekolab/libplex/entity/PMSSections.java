package kekolab.libplex.entity;

import java.util.List;
import java.util.stream.Collectors;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import kekolab.libplex.entity.PMSSectionDirectory.PMSMusicSectionDirectory;
import kekolab.libplex.entity.PMSSectionDirectory.PMSSectionDirectoryAdapter;

@XmlRootElement(name = "MediaContainer")
public class PMSSections extends PMSItem {
    private Integer size, allowSync, mediaTagVersion;
    private String identifier, mediaTagPrefix, title1;
    private List<PMSSectionDirectory<?>> sections;

    public List<PMSMusicSectionDirectory> musicSections() {
        return getSections().stream()
                .filter(d -> d instanceof PMSMusicSectionDirectory)
                .map(d -> (PMSMusicSectionDirectory) d)
                .collect(Collectors.toList());
    }

    public Integer getSize() {
        return size;
    }

    public Integer getAllowSync() {
        return allowSync;
    }

    public Integer getMediaTagVersion() {
        return mediaTagVersion;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getMediaTagPrefix() {
        return mediaTagPrefix;
    }

    public String getTitle1() {
        return title1;
    }

    public List<PMSSectionDirectory<?>> getSections() {
        if (sections != null)
            setSections(sections.stream()
                    .filter(s -> s != null)
                    .map(s -> {
                        s.setClient(getClient());
                        s.setParent(this);
                        s.setServer(getServer());
                        return s;
                    })
                    .collect(Collectors.toList()));
        return sections;
    }

    @XmlAttribute
    public void setSize(Integer size) {
        this.size = size;
    }

    @XmlAttribute
    public void setAllowSync(Integer allowSync) {
        this.allowSync = allowSync;
    }

    @XmlAttribute
    public void setMediaTagVersion(Integer mediaTagVersion) {
        this.mediaTagVersion = mediaTagVersion;
    }

    @XmlAttribute
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @XmlAttribute
    public void setMediaTagPrefix(String mediaTagPrefix) {
        this.mediaTagPrefix = mediaTagPrefix;
    }

    @XmlAttribute
    public void setTitle1(String title1) {
        this.title1 = title1;
    }

    @XmlElement(name = "Directory")
    @XmlJavaTypeAdapter(value = PMSSectionDirectoryAdapter.class)
    public void setSections(List<PMSSectionDirectory<?>> sections) {
        this.sections = sections;
    }
}
