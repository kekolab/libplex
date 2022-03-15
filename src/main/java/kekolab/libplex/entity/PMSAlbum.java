package kekolab.libplex.entity;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "MediaContainer")
public class PMSAlbum extends PMSMusicSectionContent {
    private PMSAlbumDetailsDirectory album;

    public PMSAlbumDetailsDirectory getAlbum() {
        if (album != null) {
            album.setClient(getClient());
            album.setParent(this);
            album.setServer(getServer());
        }
        return album;
    }

    @XmlElement(name = "Directory")
    public void setAlbum(PMSAlbumDetailsDirectory album) {
        this.album = album;
    }
}
