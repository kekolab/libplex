package kekolab.libplex.entity;

import java.util.List;
import java.util.stream.Collectors;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import kekolab.libplex.xmladapter.SectionInfoAdapter;

@XmlRootElement(name = "MediaContainer")
public class Sections extends SyncableMediaContainer {
    private String title1;
    private List<SectionInfo> sections;

    public List<MusicSectionInfo> musicSections() {
        return getSections().stream()
                .filter(d -> d instanceof MusicSectionInfo)
                .map(d -> (MusicSectionInfo) d)
                .collect(Collectors.toList());
    }

    public List<MovieSectionInfo> movieSections() {
        return getSections().stream()
                .filter(d -> d instanceof MovieSectionInfo)
                .map(d -> (MovieSectionInfo) d)
                .collect(Collectors.toList());
    }

    public List<ShowSectionInfo> showSections() {
        return getSections().stream()
                .filter(d -> d instanceof ShowSectionInfo)
                .map(d -> (ShowSectionInfo) d)
                .collect(Collectors.toList());
    }

    public List<SectionInfo> getSections() {
        if (sections != null)
            sections.stream()
                    .filter(s -> s != null && s.getClient() == null)
                    .forEach(s -> {
                        s.setClient(getClient());
                        s.setParent(this);
                        s.setServer(getServer());
                    });
        return sections;
    }

    public String getTitle1() {
        return title1;
    }

    @XmlAttribute
    public void setTitle1(String title1) {
        this.title1 = title1;
    }

    @XmlElement(name = "Directory")
    @XmlJavaTypeAdapter(value = SectionInfoAdapter.class)
    public void setSections(List<SectionInfo> sections) {
        this.sections = sections;
    }
}
