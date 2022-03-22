package kekolab.libplex.entity;

import java.net.URI;

import kekolab.libplex.xmladapter.SectionInfoXML;

public class ShowSectionInfo extends SectionInfo {
    public ShowSectionInfo(SectionInfoXML xml) {
        super(xml);
    }

    public ShowSection section() {
    	URI uri = getClient().uriBuilder().fromKey(getKey(), getParent(), getServer()).build();
        return (ShowSection) ShowSection.build(MovieSection.class, getClient(), uri, getServer());
    }
}