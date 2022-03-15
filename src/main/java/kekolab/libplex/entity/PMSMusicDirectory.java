package kekolab.libplex.entity;

import jakarta.xml.bind.annotation.XmlAttribute;

public abstract class PMSMusicDirectory<A extends PMSItem> extends PMSMediaDirectory<A> {
    private Integer index;
    public Integer getIndex() {
        return index;
    }

    @XmlAttribute
    public void setIndex(Integer index) {
        this.index = index;
    }
}
