package kekolab.libplex.entity;

import jakarta.xml.bind.annotation.XmlAttribute;

public abstract class PMSDirectory<A extends PMSItem> extends PMSItem {
    private String key;
    private PMSItem parent;

    public String getKey() {
        return key;
    }

    @XmlAttribute
    public void setKey(String key) {
        this.key = key;
    }

    protected void setParent(PMSItem parent) {
        this.parent = parent;
    }

    protected A content(Class<A> target) {
        return new PMSItem.Builder<A>(getClient(), getClient().uriBuilder()
                .fromKey(getKey(), parent, getServer())
                .build(), getServer()).build(target);
    }

    public abstract A content();
}
