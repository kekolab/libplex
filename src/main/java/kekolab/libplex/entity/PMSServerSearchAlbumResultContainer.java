package kekolab.libplex.entity;

import java.util.List;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "MediaContainer")
public class PMSServerSearchAlbumResultContainer extends PMSSimpleContainer {
    private List<PMSAlbumDirectory> results;

    public List<PMSAlbumDirectory> getResults() {
        return results;
    }

    @XmlElement(name = "Directory")
    public void setResults(List<PMSAlbumDirectory> results) {
        this.results = results;
    }
}
