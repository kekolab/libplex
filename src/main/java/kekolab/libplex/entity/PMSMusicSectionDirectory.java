package kekolab.libplex.entity;

public class PMSMusicSectionDirectory extends PMSSectionDirectory<PMSMusicSection> {
    public PMSMusicSectionDirectory(SectionDirectoryXML xml) {
        super(xml);
    }

    @Override
    public PMSMusicSection content() {
        return super.content(PMSMusicSection.class);
    }
}