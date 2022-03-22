package kekolab.libplex.xmladapter;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;
import kekolab.libplex.entity.MovieSectionInfo;
import kekolab.libplex.entity.MusicSectionInfo;
import kekolab.libplex.entity.SectionInfo;
import kekolab.libplex.entity.ShowSectionInfo;

public class SectionInfoAdapter extends XmlAdapter<SectionInfoXML, SectionInfo> {
    @Override
    public SectionInfo unmarshal(SectionInfoXML v) throws Exception {
    	switch (v.getType().toLowerCase()) {
    	case "artist":
            return new MusicSectionInfo(v);
    	case "movie":
            return new MovieSectionInfo(v);
    	case "show":
    		return new ShowSectionInfo(v);
    	}
        return null;
    }

    @Override
    public SectionInfoXML marshal(SectionInfo v) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }
}