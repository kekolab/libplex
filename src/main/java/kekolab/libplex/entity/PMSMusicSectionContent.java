package kekolab.libplex.entity;

public abstract class PMSMusicSectionContent extends PMSSectionContent {
    @Override
    public PMSMusicSection section() {
        return new PMSItem.Builder<PMSMusicSection>(getClient(), sectionUri(), getServer())
                .build(PMSMusicSection.class);
    }
}