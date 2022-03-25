package kekolab.libplex.entity;

import java.net.URI;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import kekolab.libplex.xmladapter.SectionItemXML;

public class Album extends SectionItem {
	private List<Tag> directors = new ArrayList<>(0);
	private List<Tag> genres = new ArrayList<>(0);
	private Date lastViewedAt;
	private Integer leafCount;
	private Integer loudnessAnalysisVersion;
	private List<Tag> moods = new ArrayList<>(0);
	private Date originallyAvailableAt;
	private String parentGuid;
	private String parentKey;
	private Integer parentRatingKey;
	private String parentThumb;
	private String parentTitle;
	private Double rating;
	private String studio;
	private List<Tag> styles = new ArrayList<>(0);
	private Integer viewCount;
	private Integer year;

	public Album(SectionItemXML v) {
		super(v);
		setDirectors(v.getDirectors());
		setGenres(v.getGenres());
		setLastViewedAt(v.getLastViewedAt());
		setLeafCount(v.getLeafCount());
		setLoudnessAnalysisVersion(v.getLoudnessAnalysisVersion());
		setMoods(v.getMoods());
		setOriginallyAvailableAt(v.getOriginallyAvailableAt());
		setParentGuid(v.getParentGuid());
		setParentKey(v.getParentKey());
		setParentRatingKey(v.getParentRatingKey());
		setParentThumb(v.getParentThumb());
		setParentTitle(v.getParentTitle());
		setRating(v.getRating());
		setStudio(v.getStudio());
		setStyles(v.getStyles());
		setViewCount(v.getViewCount());
		setYear(v.getYear());
	}

	public List<Track> tracks() {
		return ((SectionItemList) SectionItemList.build(SectionItemList.class, getClient(), keyUri(), getServer()))
				.getItems()
				.stream()
				.map(mi -> (Track) mi)
				.collect(Collectors.toList());
	}
	
	public URI artistThumbUri() {
		String key = getParentThumb();
		if (key != null)
			return getClient().uriBuilder().fromKey(key, null, getServer()).build();
		return null;
	}

	@Override
	public Album details() {
		List<? extends SectionItem> mis = ((SectionItemList) SectionItemList.build(SectionItemList.class, getClient(),
				ratingKeyUri(), getServer())).getItems();
		return mis.size() > 0 ? (Album) mis.get(0) : null;
	}

	public URI artistUri() {    	
		String key = getParentKey();
		if (key != null) 
			return getClient().uriBuilder().fromKey(key, getParent(), getServer()).build();
		return null;
	}

	public Artist artist() {    	
		URI uri = artistUri();
		if (uri != null)
			return (Artist) Artist.build(Artist.class, getClient(), uri, getServer());
		return null;
	}

	@Override
	public MusicSection section() {
		return (MusicSection) MusicSection.build(MusicSection.class, getClient(), sectionUri());
	}

	public List<Tag> getDirectors() {
		return directors;
	}

	public List<Tag> getGenres() {
		return genres;
	}

	public Date getLastViewedAt() {
		return lastViewedAt;
	}

	public Integer getLeafCount() {
		return leafCount;
	}

	public Integer getLoudnessAnalysisVersion() {
		return loudnessAnalysisVersion;
	}

	public List<Tag> getMoods() {
		return moods;
	}

	public Date getOriginallyAvailableAt() {
		return originallyAvailableAt;
	}

	public String getParentGuid() {
		return parentGuid;
	}

	public String getParentKey() {
		return parentKey;
	}

	public Integer getParentRatingKey() {
		return parentRatingKey;
	}

	public String getParentThumb() {
		return parentThumb;
	}

	public String getParentTitle() {
		return parentTitle;
	}

	public Double getRating() {
		return rating;
	}

	public String getStudio() {
		return studio;
	}

	public List<Tag> getStyles() {
		return styles;
	}

	public Integer getViewCount() {
		return viewCount;
	}

	public Integer getYear() {
		return year;
	}

	public void setDirectors(List<Tag> directors) {
		this.directors = directors;
	}

	public void setGenres(List<Tag> genres) {
		this.genres = genres;
	}

	public void setLastViewedAt(Date lastViewedAt) {
		this.lastViewedAt = lastViewedAt;
	}

	public void setLeafCount(Integer leafCount) {
		this.leafCount = leafCount;
	}

	public void setLoudnessAnalysisVersion(Integer loudnessAnalysisVersion) {
		this.loudnessAnalysisVersion = loudnessAnalysisVersion;
	}

	public void setMoods(List<Tag> moods) {
		this.moods = moods;
	}

	public void setOriginallyAvailableAt(Date originallyAvailableAt) {
		this.originallyAvailableAt = originallyAvailableAt;
	}

	public void setParentGuid(String parentGuid) {
		this.parentGuid = parentGuid;
	}

	public void setParentKey(String parentKey) {
		this.parentKey = parentKey;
	}

	public void setParentRatingKey(Integer parentRatingKey) {
		this.parentRatingKey = parentRatingKey;
	}

	public void setParentThumb(String parentThumb) {
		this.parentThumb = parentThumb;
	}

	public void setParentTitle(String parentTitle) {
		this.parentTitle = parentTitle;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	public void setStudio(String studio) {
		this.studio = studio;
	}

	public void setStyles(List<Tag> styles) {
		this.styles = styles;
	}

	public void setViewCount(Integer viewCount) {
		this.viewCount = viewCount;
	}

	public void setYear(Integer year) {
		this.year = year;
	}
}
