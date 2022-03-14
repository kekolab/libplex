package kekolab.libplex.entity;

import java.util.List;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "MediaContainer")
public class PMSServerSearchTracksResultContainer extends PMSSimpleContainer {
    private List<PMSTrackDirectory> results;

    public List<PMSTrackDirectory> getResults() {
        return results;
    }

    @XmlElement(name = "Track")
    public void setResults(List<PMSTrackDirectory> results) {
        this.results = results;
    }

}
