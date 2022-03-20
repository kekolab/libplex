package kekolab.libplex.entity;

import kekolab.libplex.xmladapter.SectionInfoXML;

public class PMSMovieSectionDirectory extends PMSSectionDirectory<PMSMovieSection> {
    public PMSMovieSectionDirectory(SectionInfoXML xml) {
        super(xml);
    }

    @Override
    public PMSMovieSection tracks() {
        return super.content(PMSMovieSection.class);
    }
}