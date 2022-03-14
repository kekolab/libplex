package kekolab.libplex.entity;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "MediaContainer")
public class PMSTrack extends PMSMusicSectionContent {
    private PMSDetailedTrackDirectory track;

    public PMSDetailedTrackDirectory getTrack() {
        if (track != null) {
            track.setClient(getClient());
            track.setParent(this);
            track.setServer(getServer());
        }
        return track;
    }

    @XmlElement(name = "Track")
    public void setTrack(PMSDetailedTrackDirectory track) {
        this.track = track;
    }
}
