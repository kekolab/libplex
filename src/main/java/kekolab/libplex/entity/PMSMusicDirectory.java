package kekolab.libplex.entity;

import jakarta.xml.bind.annotation.XmlAttribute;

public abstract class PMSMusicDirectory<Content extends PMSItem, Details extends PMSItem>
        extends PMSMediaDirectory<Content, Details> {
    private Integer index;

    public Integer getIndex() {
        return index;
    }

    @XmlAttribute
    public void setIndex(Integer index) {
        this.index = index;
    }
}
