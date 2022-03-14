package kekolab.libplex.entity;

public class PMSTrackDirectory extends PMSDirectory<PMSTrack> {
    @Override
    public PMSTrack content() {
        return super.content(PMSTrack.class);
    }
}
