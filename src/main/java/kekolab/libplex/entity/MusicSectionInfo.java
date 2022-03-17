package kekolab.libplex.entity;

public class MusicSectionInfo extends SectionInfo<MusicSection> {
    public MusicSectionInfo(SectionDirectoryXML xml) {
        super(xml);
    }

    @Override
    public MusicSection content() {
        return super.content(MusicSection.class);
    }
}