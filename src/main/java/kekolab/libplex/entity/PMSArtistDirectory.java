package kekolab.libplex.entity;

import java.net.URI;
import java.util.Date;
import java.util.List;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import kekolab.libplex.xmladapter.TimestampAdapter;

public class PMSArtistDirectory extends PMSDirectory<PMSAlbums> {
    private Integer ratingKey, index, viewCount, skipCount, albumSort;
    private String guid, type, title, summary, thumb, art;
    private Date lastViewedAt, addedAt, updatedAd;
    private List<Tag> genres;
    private List<Tag> countries;

    public PMSArtist details() {
        URI uri = getClient().uriBuilder()
                .fromKey("/library/metadata/{ratingKey}", null, getServer())
                .build(getRatingKey());
        return getClient().executeGet(uri, PMSArtist.class);
    }

    @Override
    public PMSAlbums content() {
        return super.content(PMSAlbums.class);
    }

    public Integer getRatingKey() {
        return ratingKey;
    }

    public Integer getIndex() {
        return index;
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

    public String getGuid() {
        return guid;
    }

    public String getType() {
        return type;
    }

    public String getTitle() {
        return title;
    }

    public String getSummary() {
        return summary;
    }

    public String getThumb() {
        return thumb;
    }

    public String getArt() {
        return art;
    }

    public Date getLastViewedAt() {
        return lastViewedAt;
    }

    public Date getAddedAt() {
        return addedAt;
    }

    public Date getUpdatedAd() {
        return updatedAd;
    }

    public List<Tag> getGenres() {
        return genres;
    }

    public List<Tag> getCountries() {
        return countries;
    }

    @XmlAttribute
    public void setRatingKey(Integer ratingKey) {
        this.ratingKey = ratingKey;
    }

    @XmlAttribute
    public void setIndex(Integer index) {
        this.index = index;
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
    public void setGuid(String guid) {
        this.guid = guid;
    }

    @XmlAttribute
    public void setType(String type) {
        this.type = type;
    }

    @XmlAttribute
    public void setTitle(String title) {
        this.title = title;
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
    public void setArt(String art) {
        this.art = art;
    }

    @XmlAttribute
    @XmlJavaTypeAdapter(TimestampAdapter.class)
    public void setLastViewedAt(Date lastViewedAt) {
        this.lastViewedAt = lastViewedAt;
    }

    @XmlAttribute
    @XmlJavaTypeAdapter(TimestampAdapter.class)
    public void setAddedAt(Date addedAt) {
        this.addedAt = addedAt;
    }

    @XmlAttribute
    @XmlJavaTypeAdapter(TimestampAdapter.class)
    public void setUpdatedAd(Date updatedAd) {
        this.updatedAd = updatedAd;
    }

    @XmlElement(name = "Genre")
    public void setGenres(List<Tag> genres) {
        this.genres = genres;
    }

    @XmlElement(name = "Country")
    public void setCountries(List<Tag> countries) {
        this.countries = countries;
    }
}
