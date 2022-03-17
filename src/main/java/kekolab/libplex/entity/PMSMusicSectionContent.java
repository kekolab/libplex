package kekolab.libplex.entity;

public abstract class PMSMusicSectionContent extends PMSSectionContent {
    @Override
    public MusicSection section() {
        return new ServerItem.Builder<MusicSection>(getClient(), sectionUri(), getServer())
                .build(MusicSection.class);
    }
}