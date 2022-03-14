package kekolab.libplex.entity;

import jakarta.ws.rs.core.UriBuilder;

public class PMSMovieSection extends PMSSection {
    public PMSVideos all() {
        return new PMSItem.Builder<PMSVideos>(getClient(), UriBuilder.fromUri(getUri())
                .path("all")
                .build(), getServer()).build(PMSVideos.class);
    }
}
