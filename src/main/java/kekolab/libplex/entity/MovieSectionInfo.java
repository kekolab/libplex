package kekolab.libplex.entity;

import java.net.URI;

import kekolab.libplex.xmladapter.SectionInfoXML;

public class MovieSectionInfo extends SectionInfo {
    public MovieSectionInfo(SectionInfoXML xml) {
        super(xml);
    }

    public MovieSection section() {
    	URI uri = getClient().uriBuilder().fromKey(getKey(), getParent(), getServer()).build();
        return (MovieSection) MusicSection.build(MovieSection.class, getClient(), uri, getServer());
    }
}