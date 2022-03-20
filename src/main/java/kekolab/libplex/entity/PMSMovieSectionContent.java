package kekolab.libplex.entity;

public class PMSMovieSectionContent extends PMSSectionContent {
    @Override
    public PMSMovieSection section() {
        return (PMSMovieSection) PMSMovieSection.build(PMSMovieSection.class, getClient(), sectionUri(), getServer());
    }
}
