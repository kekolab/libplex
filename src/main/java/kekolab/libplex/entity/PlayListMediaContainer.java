package kekolab.libplex.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "MediaContainer")
public class PlayListMediaContainer extends BaseMediaContainer {
	private List<Playlist> playlists = new ArrayList<>(0);

	public List<Playlist> getPlaylists() {
		playlists.stream().filter(playlist -> playlist.getClient() == null).forEach(playlist -> {
			playlist.setClient(getClient());
			playlist.setParent(this);
			playlist.setServer(getServer());
		});
		return playlists;
	}

	@XmlElement(name = "Playlist")
	public void setPlaylists(List<Playlist> playlists) {
		this.playlists = playlists;
	}
	
	
}
