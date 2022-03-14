package kekolab.libplex.entity;

import jakarta.xml.bind.annotation.XmlElement;

public abstract class PMSAlbum extends PMSSectionContentContainer {
    private PMSAlbumDirectory album;

    public PMSAlbumDirectory getAlbum() {
        if (album != null) {
            album.setClient(getClient());
            album.setParent(this);
            album.setServer(getServer());
        }
        return album;
    }

    @XmlElement(name = "Directory")
    public void setAlbum(PMSAlbumDirectory album) {
        this.album = album;
    }

}
