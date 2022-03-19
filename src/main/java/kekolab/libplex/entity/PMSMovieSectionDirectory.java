package kekolab.libplex.entity;

public class PMSMovieSectionDirectory extends PMSSectionDirectory<PMSMovieSection> {
    public PMSMovieSectionDirectory(SectionDirectoryXML xml) {
        super(xml);
    }

    @Override
    public PMSMovieSection content() {
        return super.content(PMSMovieSection.class);
    }
}