package libplex.entity;

import java.net.URI;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import libplex.PlexClient;
import libplex.plex.entity.Directory;
import libplex.plex.entity.MediaContainer;

public abstract class MediaContainerPlexItem extends PlexItem {
	private MediaContainer mediaContainer;

	protected MediaContainerPlexItem(PlexClient plex, URI uri) {
		super(plex, uri);
		this.mediaContainer = plex.executeGet(uri, MediaContainer.class);
	}

	protected MediaContainer getMediaContainer() {
		return mediaContainer;
	}

	protected List<Directory> directoriesByKey(String key) {
		return filterDirectories(d -> d.getKey() != null && d.getKey()
				.equals(key));
	}

	protected List<Directory> directoriesByPrompt(String prompt) {
		return filterDirectories(d -> d.getPrompt() != null && d.getPrompt()
				.equals(prompt));
	}

	protected List<Directory> directoriesByType(String type) {
		return filterDirectories(d -> d.getType() != null && d.getType()
				.equals(type));
	}

	private List<Directory> filterDirectories(Predicate<? super Directory> filter) {
		List<Directory> directories = mediaContainer.getDirectories();
		if (directories != null && directories.size() > 0)
			return directories.stream()
					.filter(filter)
					.collect(Collectors.toList());
		return Collections.emptyList();
	}
}
