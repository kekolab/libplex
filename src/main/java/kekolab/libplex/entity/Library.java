package kekolab.libplex.entity;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "MediaContainer")
public class Library extends MediaContainerWithArt {
    private String content, title1, title2;

    public Sections sections() {
        URI uri = getClient().uriBuilder()
                .fromKey("sections", this, getServer())
                .build();
        return (Sections) Sections.build(Sections.class, getClient(), uri, getServer());
    }

    public List<? extends SectionItem> recentlyAdded() {
        URI uri = getClient().uriBuilder()
                .fromKey("recentlyAdded", this, getServer())
                .build();
        return ((SectionItemList) SectionItemList.build(SectionItemList.class, getClient(), uri, getServer()))
                .getItems();
    }

    public List<Video> onDeck() {
        URI uri = getClient().uriBuilder()
                .fromKey("onDeck", this, getServer())
                .build();
        return ((SectionItemList) SectionItemList.build(SectionItemList.class, getClient(), uri, getServer()))
                .getItems()
                .stream()
                .map(item -> (Video) item)
                .collect(Collectors.toList());
    }

    public String getContent() {
        return content;
    }

    public String getTitle1() {
        return title1;
    }

    public String getTitle2() {
        return title2;
    }

    @XmlAttribute
    public void setContent(String content) {
        this.content = content;
    }

    @XmlAttribute
    public void setTitle1(String title1) {
        this.title1 = title1;
    }

    @XmlAttribute
    public void setTitle2(String title2) {
        this.title2 = title2;
    }
}
