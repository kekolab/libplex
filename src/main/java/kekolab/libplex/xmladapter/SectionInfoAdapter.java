package kekolab.libplex.xmladapter;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;
import kekolab.libplex.entity.MusicSectionInfo;
import kekolab.libplex.entity.SectionInfo;

public class SectionInfoAdapter extends XmlAdapter<SectionInfoXML, SectionInfo> {
    @Override
    public SectionInfo unmarshal(SectionInfoXML v) throws Exception {
        if ("artist".equals(v.getType()))
            return new MusicSectionInfo(v);
        return null;
    }

    @Override
    public SectionInfoXML marshal(SectionInfo v) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }
}