package kekolab.libplex.entity;

public class PMSVideoContainer extends PMSMovieSectionContent {
    private PMSVideoDetailDirectory video;

    public PMSVideoDetailDirectory getVideo() {
        return video;
    }

    public void setVideo(PMSVideoDetailDirectory video) {
        this.video = video;
    }
}
