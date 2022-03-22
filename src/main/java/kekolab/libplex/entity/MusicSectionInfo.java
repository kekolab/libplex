package kekolab.libplex.entity;

import java.net.URI;

import kekolab.libplex.xmladapter.SectionInfoXML;

public class MusicSectionInfo extends SectionInfo {
    public MusicSectionInfo(SectionInfoXML xml) {
        super(xml);
    }

    public MusicSection content() {
    	URI uri = getClient().uriBuilder().fromKey(getKey(), getParent(), getServer()).build();
        return (MusicSection) MusicSection.build(MusicSection.class, getClient(), uri, getServer());
    }
}