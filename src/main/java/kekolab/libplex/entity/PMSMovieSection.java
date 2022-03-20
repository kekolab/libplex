package kekolab.libplex.entity;

import java.net.URI;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "MediaContainer")
public class PMSMovieSection extends Section {
    public PMSVideos all() {
        URI uri = getClient().uriBuilder()
                .fromKey("all", this, getServer())
                .build();
        return (PMSVideos) PMSVideos.build(PMSVideos.class, getClient(), uri, getServer());
    }
}
