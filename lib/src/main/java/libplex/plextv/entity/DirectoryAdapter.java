package libplex.plextv.entity;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;
import libplex.plextv.entity.DirectoryAdapter.AdaptedDirectory;

public class DirectoryAdapter extends XmlAdapter<AdaptedDirectory, Directory<?>> {

	@Override
	public Directory<?> unmarshal(AdaptedDirectory v) throws Exception {
		Directory<?> directory;
		String key = v.getKey()
				.trim();
		if (key.equals("library")) {
			directory = new LibraryDirectory();
			((LibraryDirectory) directory).setCount(v.getCount());
		} else if (key.equals("sections")) {
			directory = new SectionsDirectory();
		} else if (key.equals("recentlyAdded")) {
			directory = new RecentlyAddedDirectory();
		} else if (key.equals("onDeck")) {
			directory = new OnDeckDirectory();
		} else if (v.getType() != null) {
			String type = v.getType()
					.trim();
			if (type.equals("movie")) {
				directory = new MediaDirectory<Movie>();
			} else if (type.equals("show")) {
				directory = new ShowDirectory();
			} else if (type.equals("artist")) {
				directory = new ArtistDirectory();
			} else {
				directory = new UnmappedDirectory();
			}
		} else {
			directory = new UnmappedDirectory();
		}
		directory.setKey(v.getKey());
		directory.setTitle(v.getTitle());
		if (directory instanceof MediaDirectory) {
			MediaDirectory<?> md = (MediaDirectory<?>) directory;
			md.setAllowSync(v.getAllowSync());
			md.setArt(v.getArt());
			md.setComposite(v.getComposite());
			md.setFilters(v.getFilters());
			md.setRefreshing(v.getRefreshing());
			md.setThumb(v.getThumb());
			md.setType(v.getType());
			md.setAgent(v.getAgent());
			md.setScanner(v.getScanner());
			md.setLanguage(v.getLanguage());
			md.setUuid(v.getUuid());
			md.setUpdatedAt(v.getUpdatedAt());
			md.setCreatedAt(v.getCreatedAt());
			md.setScannedAt(v.getScannedAt());
			md.setContent(v.getContent());
			md.setDirectory(v.getDirectory());
			md.setContentChangedAt(v.getContentChangedAt());
			md.setHidden(v.getHidden());
			md.setLocation(v.getLocation());
		}
		return directory;
	}

	@Override
	public AdaptedDirectory marshal(Directory<?> v) throws Exception {
		AdaptedDirectory adaptedDirectory = new AdaptedDirectory();
		adaptedDirectory.setKey(v.getKey());
		adaptedDirectory.setTitle(v.getTitle());
		if (v.getTitle()
				.trim()
				.toLowerCase()
				.equals("library")) {
			LibraryDirectory libraryDirectory = (LibraryDirectory) v;
			adaptedDirectory.setCount(libraryDirectory.getCount());
		}
		return adaptedDirectory;
	}

	public static class AdaptedDirectory {
		private int count;
		private String key; // Every directory has it
		private String title; // Every directory has it
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

		@XmlAttribute
		public int getCount() {
			return count;
		}

		public void setCount(int count) {
			this.count = count;
		}

		@XmlAttribute
		public String getKey() {
			return key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		@XmlAttribute
		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		@XmlAttribute
		public int getAllowSync() {
			return allowSync;
		}

		public void setAllowSync(int allowSync) {
			this.allowSync = allowSync;
		}

		@XmlAttribute
		public String getArt() {
			return art;
		}

		public void setArt(String art) {
			this.art = art;
		}

		@XmlAttribute
		public String getComposite() {
			return composite;
		}

		public void setComposite(String composite) {
			this.composite = composite;
		}

		@XmlAttribute
		public int getFilters() {
			return filters;
		}

		public void setFilters(int filters) {
			this.filters = filters;
		}

		@XmlAttribute
		public int getRefreshing() {
			return refreshing;
		}

		public void setRefreshing(int refreshing) {
			this.refreshing = refreshing;
		}

		@XmlAttribute
		public String getThumb() {
			return thumb;
		}

		public void setThumb(String thumb) {
			this.thumb = thumb;
		}

		@XmlAttribute
		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		@XmlAttribute
		public String getAgent() {
			return agent;
		}

		public void setAgent(String agent) {
			this.agent = agent;
		}

		@XmlAttribute
		public String getScanner() {
			return scanner;
		}

		public void setScanner(String scanner) {
			this.scanner = scanner;
		}

		@XmlAttribute
		public String getLanguage() {
			return language;
		}

		public void setLanguage(String language) {
			this.language = language;
		}

		@XmlAttribute
		public String getUuid() {
			return uuid;
		}

		public void setUuid(String uuid) {
			this.uuid = uuid;
		}

		@XmlAttribute
		public String getUpdatedAt() {
			return updatedAt;
		}

		public void setUpdatedAt(String updatedAt) {
			this.updatedAt = updatedAt;
		}

		@XmlAttribute
		public String getCreatedAt() {
			return createdAt;
		}

		public void setCreatedAt(String createdAt) {
			this.createdAt = createdAt;
		}

		@XmlAttribute
		public String getScannedAt() {
			return scannedAt;
		}

		public void setScannedAt(String scannedAt) {
			this.scannedAt = scannedAt;
		}

		@XmlAttribute
		public int getContent() {
			return content;
		}

		public void setContent(int content) {
			this.content = content;
		}

		@XmlAttribute
		public int getDirectory() {
			return directory;
		}

		public void setDirectory(int directory) {
			this.directory = directory;
		}

		@XmlAttribute
		public String getContentChangedAt() {
			return contentChangedAt;
		}

		public void setContentChangedAt(String contentChangedAt) {
			this.contentChangedAt = contentChangedAt;
		}

		@XmlAttribute
		public int getHidden() {
			return hidden;
		}

		public void setHidden(int hidden) {
			this.hidden = hidden;
		}

		@XmlElement(name = "Location")
		public Location getLocation() {
			return location;
		}

		public void setLocation(Location location) {
			this.location = location;
		}
	}
}
