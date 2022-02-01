package libplex.plextv.entity;

import jakarta.xml.bind.annotation.XmlAttribute;
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
	} else {
	    directory = new UnmappedDirectory();
	}
	directory.setKey(v.getKey());
	directory.setTitle(v.getTitle());
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
    }
}
