package kekolab.libplex.entity;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "MediaContainer")
public class PMSArtist extends PMSMusicSectionContent {
    private ArtistDetails artist;

    public ArtistDetails getArtist() {
        if (artist != null) {
            artist.setClient(getClient());
            artist.setParent(this);
            artist.setServer(getServer());
        }
        return artist;
    }

    @XmlElement(name = "Directory")
    public void setArtist(ArtistDetails artist) {
        this.artist = artist;
    }
}
