package libplex.plextv.entity;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class DirectoryAdapter extends XmlAdapter<libplex.plextv.entity.DirectoryAdapter.AdaptedDirectory, Directory> {

	@Override
	public Directory unmarshal(AdaptedDirectory v) throws Exception {
		Directory directory;
		if (v.title.toLowerCase().equals("library")) 
			directory = new LibraryDirectory();
		else 
			directory = new BasicDirectory();
		directory.setCount(v.count);
		directory.setKey(v.key);
		directory.setTitle(v.title);
		return directory;
	}

	@Override
	public AdaptedDirectory marshal(Directory v) throws Exception {
		AdaptedDirectory adaptedDirectory = new AdaptedDirectory();
		adaptedDirectory.count = v.getCount();
		adaptedDirectory.key = v.getKey();
		adaptedDirectory.title = v.getTitle();
		return adaptedDirectory;
	}

	public static class AdaptedDirectory {
		@XmlAttribute private int count;
		@XmlAttribute private String key;
		@XmlAttribute private String title;
	}

}
