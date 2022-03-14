package kekolab.libplex.entity;

public class PMSMovieSectionContent extends PMSSectionContent {
    @Override
    public PMSMovieSection section() {
        return new PMSItem.Builder<PMSMovieSection>(getClient(), sectionUri(), getServer())
                .build(PMSMovieSection.class);
    }
}
