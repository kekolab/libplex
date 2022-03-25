package kekolab.libplex.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import kekolab.libplex.entity.CollectionDirectory;
import kekolab.libplex.entity.Section;
import kekolab.libplex.entity.SectionItem;
import kekolab.libplex.entity.Sections;

public class CollectionsTest extends WithPlexClientTests {
	private List<Section> sections;

	@BeforeEach
	public void init() throws IOException {
		sections = new ArrayList<Section>(0);
		Sections _sections = getClient().servers()
				.getServers()
				.get(0)
				.plexMediaServer()
				.library()
				.sections();
		_sections.movieSections().forEach(section -> sections.add(section.section()));
		_sections.musicSections().forEach(section -> sections.add(section.section()));
		_sections.showSections().forEach(section -> sections.add(section.section()));
	}

	@Test 
	public void listCollections() {
		sections.forEach(section -> {
			List<CollectionDirectory> collections = section.collections();
			assertNotNull(collections);
			assertTrue(collections.size() > 0);
			collections.forEach(c -> {
				assertNotNull(c.getFastKey());
				assertNotNull(c.getKey());
				assertNotNull(c.getTitle());
				List<? extends SectionItem> items = c.items();
				assertTrue(items.size() > 0);
			});
		});
	}


}
