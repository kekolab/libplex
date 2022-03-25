package kekolab.libplex.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import kekolab.libplex.entity.Playlist;
import kekolab.libplex.entity.Track;
import kekolab.libplex.entity.Video;

public class PlaylistTests extends WithPlexClientTests {
	List<Playlist> playlists;

	@BeforeEach
	public void init() throws IOException {
		playlists = getClient().servers()
				.getServers()
				.get(0)
				.plexMediaServer()
				.playlists();
	}

	@Test public void fields() {
		playlists.stream().forEach(playlist -> {
			assertNotNull(playlist.compositeUri());
			assertNotNull(playlist.getAddedAt());
			assertNotNull(playlist.getComposite());
			assertNotNull(playlist.getDuration());
			assertNotNull(playlist.getGuid());
			assertNotNull(playlist.getKey());
			assertNotNull(playlist.getLastViewedAt());
			assertNotNull(playlist.getLeafCount());
			assertNotNull(playlist.getPlaylistType());
			assertNotNull(playlist.getRatingKey());
			assertNotNull(playlist.getSmart());
			assertNotNull(playlist.getSummary());
			assertNotNull(playlist.getType());
			assertNotNull(playlist.getUpdatedAt());
			assertNotNull(playlist.getViewCount());
		});
	}
	
	@Test public void audioPlaylist() {
		Playlist playlist = playlists.stream().filter(playlists -> playlists.getPlaylistType().equalsIgnoreCase("audio"))
				.findAny().get();
		assertTrue(playlist.items().stream().allMatch(item -> item instanceof Track));
	}
	
	@Test public void videoPlaylist() {
		Playlist playlist = playlists.stream().filter(playlists -> playlists.getPlaylistType().equalsIgnoreCase("video"))
				.findAny().get();
		assertTrue(playlist.items().stream().allMatch(item -> item instanceof Video));
	}
}
