package kekolab.libplex.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import kekolab.libplex.xmladapter.TimestampAdapter;

public class PMSArtistDirectory extends PMSMusicDirectory<PMSAlbums, PMSArtist> {
    private Integer viewCount, skipCount, albumSort;
    private Date lastViewedAt;
    private List<PMSTag> genres = new ArrayList<>(0);
    private List<PMSTag> countries = new ArrayList<>(0);

    @Override
    public PMSArtist details() {
        return super.details(PMSArtist.class);
    }

    @Override
    public PMSAlbums content() {
        return super.content(PMSAlbums.class);
    }

    public Integer getViewCount() {
        return viewCount;
    }

    public Integer getSkipCount() {
        return skipCount;
    }

    public Integer getAlbumSort() {
        return albumSort;
    }

    public Date getLastViewedAt() {
        return lastViewedAt;
    }

    public List<PMSTag> getGenres() {
        return genres;
    }

    public List<PMSTag> getCountries() {
        return countries;
    }

    @XmlAttribute
    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    @XmlAttribute
    public void setSkipCount(Integer skipCount) {
        this.skipCount = skipCount;
    }

    @XmlAttribute
    public void setAlbumSort(Integer albumSort) {
        this.albumSort = albumSort;
    }

    @XmlAttribute
    @XmlJavaTypeAdapter(TimestampAdapter.class)
    public void setLastViewedAt(Date lastViewedAt) {
        this.lastViewedAt = lastViewedAt;
    }

    @XmlElement(name = "Genre")
    public void setGenres(List<PMSTag> genres) {
        this.genres = genres;
    }

    @XmlElement(name = "Country")
    public void setCountries(List<PMSTag> countries) {
        this.countries = countries;
    }
}
