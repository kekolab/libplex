package libplex.plextv.entity;

public class MediaDirectory<A> extends Directory<A> {
	private int allowSync;
	private String art;
	private String composite;
	private int filters;
	private int refreshing;
	private String thumb;
	private String type;
	private String agent;
	private String scanner;
	private String language;
	private String uuid;
	private String updatedAt; // TODO Change to Date
	private String createdAt; // TODO Change to Date
	private String scannedAt; // TODO Change to Date
	private int content;
	private int directory;
	private String contentChangedAt; // TODO Does not seem a Date
	private int hidden;
	private Location location;

	public int getAllowSync() {
		return allowSync;
	}

	public void setAllowSync(int allowSync) {
		this.allowSync = allowSync;
	}

	public String getArt() {
		return art;
	}

	public void setArt(String art) {
		this.art = art;
	}

	public String getComposite() {
		return composite;
	}

	public void setComposite(String composite) {
		this.composite = composite;
	}

	public int getFilters() {
		return filters;
	}

	public void setFilters(int filters) {
		this.filters = filters;
	}

	public int getRefreshing() {
		return refreshing;
	}

	public void setRefreshing(int refreshing) {
		this.refreshing = refreshing;
	}

	public String getThumb() {
		return thumb;
	}

	public void setThumb(String thumb) {
		this.thumb = thumb;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAgent() {
		return agent;
	}

	public void setAgent(String agent) {
		this.agent = agent;
	}

	public String getScanner() {
		return scanner;
	}

	public void setScanner(String scanner) {
		this.scanner = scanner;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public String getScannedAt() {
		return scannedAt;
	}

	public void setScannedAt(String scannedAt) {
		this.scannedAt = scannedAt;
	}

	public int getContent() {
		return content;
	}

	public void setContent(int content) {
		this.content = content;
	}

	public int getDirectory() {
		return directory;
	}

	public void setDirectory(int directory) {
		this.directory = directory;
	}

	public String getContentChangedAt() {
		return contentChangedAt;
	}

	public void setContentChangedAt(String contentChangedAt) {
		this.contentChangedAt = contentChangedAt;
	}

	public int getHidden() {
		return hidden;
	}

	public void setHidden(int hidden) {
		this.hidden = hidden;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	/*
	 * <Directory allowSync="0" art="/:/resources/movie-fanart.jpg"
	 * composite="/library/sections/6/composite/1643748242" filters="1"
	 * refreshing="0" thumb="/:/resources/movie.png" key="6" type="movie"
	 * title="Film" agent="tv.plex.agents.movie" scanner="Plex Movie"
	 * language="it-IT" uuid="79dcaff1-4fff-4cf6-88fe-cf1e82fc6a91"
	 * updatedAt="1642799362" createdAt="1512856966" scannedAt="1643748242"
	 * content="1" directory="1" contentChangedAt="2008778" hidden="0"> <Location
	 * id="8" path="/mnt/toshiba/server/media/Film"/> </Directory>
	 */
}
