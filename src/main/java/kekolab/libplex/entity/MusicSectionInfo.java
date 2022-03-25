package kekolab.libplex.entity;

import kekolab.libplex.xmladapter.SectionInfoXML;

public class MusicSectionInfo extends SectionInfo {
    public MusicSectionInfo(SectionInfoXML xml) {
        super(xml);
    }

    public MusicSection section() {
        return (MusicSection) MusicSection.build(MusicSection.class, getClient(), keyUri(), getServer());
    }
}