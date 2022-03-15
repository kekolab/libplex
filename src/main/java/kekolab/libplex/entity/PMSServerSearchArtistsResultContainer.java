package kekolab.libplex.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "MediaContainer")
public class PMSServerSearchArtistsResultContainer extends PMSSimpleContainer {
    private List<PMSArtistDirectory> results = new ArrayList<>(0);

    public List<PMSArtistDirectory> getResults() {
        return results;
    }

    @XmlElement(name = "Directory")
    public void setResults(List<PMSArtistDirectory> results) {
        this.results = results;
    }
}
