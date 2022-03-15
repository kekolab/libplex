package kekolab.libplex.entity;

import java.net.URI;

import jakarta.xml.bind.annotation.XmlAttribute;

public abstract class PMSDirectory<Content extends PMSItem> extends PMSItem {
    private String key, art, thumb, title, type;
    private PMSItem parent;

    protected void setParent(PMSItem parent) {
        this.parent = parent;
    }

    protected PMSItem getParent() {
        return parent;
    }

    protected Content content(Class<Content> target) {
        return new PMSItem.Builder<Content>(getClient(), getClient().uriBuilder()
                .fromKey(getKey(), getParent(), getServer())
                .build(), getServer()).build(target);
    }

    public URI artUri() {
        return getClient().uriBuilder()
                .fromKey(getArt(), getParent(), getServer())
                .build();
    }

    public URI thumbUri() {
        return getClient().uriBuilder()
                .fromKey(getThumb(), getParent(), getServer())
                .build();
    }

    public abstract Content content();

    public String getKey() {
        return key;
    }

    public String getArt() {
        return art;
    }

    public String getThumb() {
        return thumb;
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }

    @XmlAttribute
    public void setKey(String key) {
        this.key = key;
    }

    @XmlAttribute
    public void setArt(String art) {
        this.art = art;
    }

    @XmlAttribute
    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    @XmlAttribute
    public void setTitle(String title) {
        this.title = title;
    }

    @XmlAttribute
    public void setType(String type) {
        this.type = type;
    }
}
