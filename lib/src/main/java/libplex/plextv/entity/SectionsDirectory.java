package libplex.plextv.entity;

import java.io.IOException;

public class SectionsDirectory extends Directory<SectionDetails> {

	@Override
	public SectionDetails fetchDetails() throws IOException {
		SectionDetails details = super.fetchDetails(SectionDetails.class);
		details.getDirectories()
				.forEach(d -> d.setClient(getClient())
						.setParent(this)
						.setServer(getServer()));
		return details;
	}
}
