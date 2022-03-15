package kekolab.libplex.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import kekolab.libplex.entity.PMSSectionDirectory.PMSSectionDirectoryAdapter;

@XmlRootElement(name = "MediaContainer")
public class PMSSections extends PMSContainer {
    private String title1;
    private List<PMSSectionDirectory<?>> sections = new ArrayList<>(0);

    public List<PMSMusicSectionDirectory> musicSections() {
        return getSections().stream()
                .filter(d -> d instanceof PMSMusicSectionDirectory)
                .map(d -> (PMSMusicSectionDirectory) d)
                .collect(Collectors.toList());
    }

    public List<PMSMovieSectionDirectory> movieSections() {
        return getSections().stream()
                .filter(d -> d instanceof PMSMovieSectionDirectory)
                .map(d -> (PMSMovieSectionDirectory) d)
                .collect(Collectors.toList());
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

    public String getTitle1() {
        return title1;
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
