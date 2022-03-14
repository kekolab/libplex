package kekolab.libplex.entity;

public class PMSAlbumDirectory extends PMSDirectory<PMSTracks> {
    @Override
    public PMSTracks content() {
        return super.content(PMSTracks.class);
    }
}
