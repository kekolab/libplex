package kekolab.libplex.entity;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "MediaDirectory")
public class PMSVideoContainer extends PMSMovieSectionContent {
    private VideoDetails video;

    public VideoDetails getVideo() {
        return video;
    }

    public void setVideo(VideoDetails video) {
        this.video = video;
    }
}
