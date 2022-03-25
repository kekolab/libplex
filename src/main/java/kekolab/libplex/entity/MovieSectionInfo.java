package kekolab.libplex.entity;

import kekolab.libplex.xmladapter.SectionInfoXML;

public class MovieSectionInfo extends SectionInfo {
    public MovieSectionInfo(SectionInfoXML xml) {
        super(xml);
    }

    public MovieSection section() {
        return (MovieSection) MusicSection.build(MovieSection.class, getClient(), keyUri(), getServer());
    }
}