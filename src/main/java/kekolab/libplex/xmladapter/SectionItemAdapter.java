package kekolab.libplex.xmladapter;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;
import kekolab.libplex.entity.Album;
import kekolab.libplex.entity.Artist;
import kekolab.libplex.entity.Season;
import kekolab.libplex.entity.SectionItem;
import kekolab.libplex.entity.Show;
import kekolab.libplex.entity.Track;
import kekolab.libplex.entity.Video;

public class SectionItemAdapter extends XmlAdapter<SectionItemXML, SectionItem> {
    @Override
    public SectionItem unmarshal(SectionItemXML v) throws Exception {
        switch (v.getType()
                .toLowerCase()) {
        case "artist":
            return new Artist(v);
        case "album":
            return new Album(v);
        case "track":
            return new Track(v);
        case "movie":
            return new Video(v);
        case "show":
            return new Show(v);
        case "season":
            return new Season(v);
        case "episode":
            return new Video(v);
        }
        return null;
    }

    @Override
    public SectionItemXML marshal(SectionItem v) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }
}