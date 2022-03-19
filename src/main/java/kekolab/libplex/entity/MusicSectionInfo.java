package kekolab.libplex.entity;

public class MusicSectionInfo extends SectionInfo<MusicSection> {
    public MusicSectionInfo(SectionDirectoryXML xml) {
        super(xml);
    }

    @Override
    public MusicSection content() {
    	return (MusicSection) MusicSection.build(MusicSection.class, getClient(), contentUri(), getServer());
    }
}