package kekolab.libplex.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;

public class PMSAlbumDirectory extends PMSMusicChildDirectory<PMSTracks, PMSAlbum> {
    private Integer year, loudnessAnalysisVersion;
    private String studio;
    private Double rating;
    private Date originallyAvailableAt;
    private List<PMSTag> genres = new ArrayList<>(0), directors = new ArrayList<>(0);

    @Override
    public PMSTracks content() {
        return super.content(PMSTracks.class);
    }

    @Override
    public PMSAlbum details() {
        return super.details(PMSAlbum.class);
    }

    public Integer getYear() {
        return year;
    }

    public Integer getLoudnessAnalysisVersion() {
        return loudnessAnalysisVersion;
    }

    public String getStudio() {
        return studio;
    }

    public Double getRating() {
        return rating;
    }

    public Date getOriginallyAvailableAt() {
        return originallyAvailableAt;
    }

    public List<PMSTag> getGenres() {
        return genres;
    }

    public List<PMSTag> getDirectors() {
        return directors;
    }

    @XmlAttribute
    public void setYear(Integer year) {
        this.year = year;
    }

    @XmlAttribute
    public void setLoudnessAnalysisVersion(Integer loudnessAnalysisVersion) {
        this.loudnessAnalysisVersion = loudnessAnalysisVersion;
    }

    @XmlAttribute
    public void setStudio(String studio) {
        this.studio = studio;
    }

    @XmlAttribute
    public void setRating(Double rating) {
        this.rating = rating;
    }

    @XmlAttribute
    public void setOriginallyAvailableAt(Date originallyAvailableAt) {
        this.originallyAvailableAt = originallyAvailableAt;
    }

    @XmlElement(name = "Genre")
    public void setGenres(List<PMSTag> genres) {
        this.genres = genres;
    }

    @XmlElement(name = "Director")
    public void setDirectors(List<PMSTag> directors) {
        this.directors = directors;
    }
}
