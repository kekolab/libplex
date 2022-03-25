package kekolab.libplex.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "MediaContainer")
public class CollectionsContainer extends Section {
	private String title2;
	private List<CollectionDirectory> collections = new ArrayList<CollectionDirectory>(0);

	public String getTitle2() {
		return title2;
	}

	@XmlAttribute
	public void setTitle2(String title2) {
		this.title2 = title2;
	}

	public List<CollectionDirectory> getCollections() {
		collections.stream().filter(collection -> collection.getClient() == null).forEach(collection -> {
			collection.setClient(getClient());
			collection.setServer(getServer());
		});
		return collections;
	}

	@XmlElement(name = "Directory")
	public void setCollections(List<CollectionDirectory> collections) {
		this.collections = collections;
	}	
}
