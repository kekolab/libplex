package kekolab.libplex.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import kekolab.libplex.xmladapter.SectionItemXML;

public class Artist extends SectionItem {
    private Integer viewCount, skipCount, albumSort;
    private Date lastViewedAt;
    private List<Tag> genres = new ArrayList<>(0);
    private List<Tag> countries = new ArrayList<>(0);
    private List<Tag> styles = new ArrayList<>(0);
    private List<Tag> similars = new ArrayList<>(0);
    private List<Tag> moods = new ArrayList<>(0);
    private List<Location> locations = new ArrayList<>(0);

    public Artist(SectionItemXML v) {
    	super(v);
        setAlbumSort(v.getAlbumSort());
        setCountries(v.getCountries());
        setGenres(v.getGenres());
        setLastViewedAt(v.getLastViewedAt());
        setLocations(v.getLocations());
        setMoods(v.getMoods());
        setSimilars(v.getSimilars());
        setSkipCount(v.getSkipCount());
        setStyles(v.getStyles());
        setViewCount(v.getViewCount());
    }
    
    @Override
    public MusicSection section() {
    	return (MusicSection) MusicSection.build(MusicSection.class, getClient(), sectionUri());
    }

    @Override
    public Artist details() {
        SectionItem mediaInfo = ((SectionItemList) SectionItemList.build(SectionItemList.class, getClient(),
                ratingKeyUri(), getServer())).getItems()
                        .get(0);
        return (Artist) mediaInfo;
    }

    public List<Album> albums() {
        SectionItemList mil = (SectionItemList) SectionItemList.build(SectionItemList.class, getClient(), keyUri(),
                getServer());
        return mil.getItems()
                .stream()
                .map(mi -> (Album) mi)
                .collect(Collectors.toList());
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

    public List<Tag> getGenres() {
        return genres;
    }

    public List<Tag> getCountries() {
        return countries;
    }

    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    public void setSkipCount(Integer skipCount) {
        this.skipCount = skipCount;
    }

    public void setAlbumSort(Integer albumSort) {
        this.albumSort = albumSort;
    }

    public void setLastViewedAt(Date lastViewedAt) {
        this.lastViewedAt = lastViewedAt;
    }

    public void setGenres(List<Tag> genres) {
        this.genres = genres;
    }

    public void setCountries(List<Tag> countries) {
        this.countries = countries;
    }

    public List<Tag> getStyles() {
        return styles;
    }

    public List<Tag> getSimilars() {
        return similars;
    }

    public List<Tag> getMoods() {
        return moods;
    }

    public List<Location> getLocations() {
        return locations;
    }

    public void setStyles(List<Tag> styles) {
        this.styles = styles;
    }

    public void setSimilars(List<Tag> similars) {
        this.similars = similars;
    }

    public void setMoods(List<Tag> moods) {
        this.moods = moods;
    }

    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }
}
