package kekolab.libplex.entity;

import jakarta.xml.bind.annotation.XmlAttribute;

public abstract class SyncableMediaContainer extends GenericMediaContainer {
    private Integer allowSync;

    public Integer getAllowSync() {
        return allowSync;
    }

    @XmlAttribute
    public void setAllowSync(Integer allowSync) {
        this.allowSync = allowSync;
    }
}
