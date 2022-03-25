package kekolab.libplex.entity;

import kekolab.libplex.xmladapter.SectionInfoXML;

public class ShowSectionInfo extends SectionInfo {
    public ShowSectionInfo(SectionInfoXML xml) {
        super(xml);
    }

    @Override
    public ShowSection section() {
        return (ShowSection) ShowSection.build(ShowSection.class, getClient(), keyUri(), getServer());
    }
}