package kekolab.libplex.entity;

import jakarta.ws.rs.core.UriBuilder;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "MediaContainer")
public class PMSLibrary extends PMSContainer {
    private String art, content, title1, title2;

    public PMSSections sections() {
        return new PMSItem.Builder<PMSSections>(getClient(), UriBuilder.fromUri(getUri())
                .path("sections")
                .build(), getServer()).build(PMSSections.class);
    }

    public String getArt() {
        return art;
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
    public void setArt(String art) {
        this.art = art;
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
