package libplex.plextv.entity;

import java.io.IOException;

public class UnmappedDirectory extends Directory<Void> {
    @Override
    public Void fetchDetails() throws IOException {
	return null;
    }
}
