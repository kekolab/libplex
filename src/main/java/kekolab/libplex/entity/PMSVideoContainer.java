package kekolab.libplex.entity;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "MediaDirectory")
public class PMSVideoContainer extends PMSMovieSectionContent {
    private PMSVideoDetailDirectory video;

    public PMSVideoDetailDirectory getVideo() {
        return video;
    }

    public void setVideo(PMSVideoDetailDirectory video) {
        this.video = video;
    }
}
