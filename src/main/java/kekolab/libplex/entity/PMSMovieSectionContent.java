package kekolab.libplex.entity;

public class PMSMovieSectionContent extends PMSSectionContent {
    @Override
    public PMSMovieSection section() {
        return new ServerItem.Builder<PMSMovieSection>(getClient(), sectionUri(), getServer())
                .build(PMSMovieSection.class);
    }
}
