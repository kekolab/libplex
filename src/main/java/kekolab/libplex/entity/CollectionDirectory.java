package kekolab.libplex.entity;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jakarta.xml.bind.annotation.XmlAttribute;

public class CollectionDirectory extends BaseDirectory {
	private String fastKey;

	public String getFastKey() {
		return fastKey;
	}

	@XmlAttribute
	public void setFastKey(String fastKey) {
		this.fastKey = fastKey;
	}

	@Override
	protected void setParent(PlexMediaServerItem parent) {
		if (!(parent instanceof Section))
			throw new RuntimeException("The parent of a collectionDirectory must be a Section");
		super.setParent(parent);

	}

	@Override
	protected Section getParent() {
		return (Section) super.getParent();
	}

	public List<? extends SectionItem> items() {
		Section parent = getParent();
		Map<String, Object[]> queryParameters = new HashMap<>(1);
		queryParameters.put("collection", new Object[] { getKey() });
		if (parent instanceof MusicSection) {
			MusicSection musicSection = (MusicSection) parent;
			List<? extends SectionItem> items = musicSection.searchArtists(null, queryParameters);
			if (items.size() > 0)
				return items;
			items = musicSection.searchAlbums(null, queryParameters);
			if (items.size() > 0)
				return items;
			return musicSection.searchTracks(null, queryParameters);			
		} else if (parent instanceof MovieSection) {
			return ((MovieSection) parent).searchMovies(null, queryParameters);
		} else if (parent instanceof ShowSection) {
			ShowSection showSection = (ShowSection) parent;
			List<? extends SectionItem> items = showSection.searchShows(null, queryParameters);
			if (items.size() > 0)
				return items;
			items = showSection.searchSeasons(null, queryParameters);
			if (items.size() > 0)
				return items;
			return showSection.searchEpisodes(null, queryParameters);
		}
		return Collections.emptyList();
	}
}
