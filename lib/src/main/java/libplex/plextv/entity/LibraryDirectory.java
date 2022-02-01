package libplex.plextv.entity;

import java.io.IOException;

public class LibraryDirectory extends Directory<LibraryDetails> {
    private int count;

    public int getCount() {
	return count;
    }

    public void setCount(int count) {
	this.count = count;
    }

    @Override
    public LibraryDetails fetchDetails() throws IOException {
	LibraryDetails details = super.fetchDetails(LibraryDetails.class);
	details.getDirectories()
		.forEach(d -> d.setClient(getClient())
			.setParent(this)
			.setServer(getServer()));
	return details;
    }

}
