package kekolab.libplex.entity;

public abstract class PMSMusicSectionContent extends PMSSectionContent {
    @Override
    public MusicSection section() {
        return (MusicSection) MusicSection.build(MusicSection.class, getClient(), sectionUri(), getServer());
    }
}