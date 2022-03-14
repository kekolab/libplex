package kekolab.libplex.entity;

import jakarta.xml.bind.annotation.XmlAttribute;

public abstract class PMSContainer extends PMSSimpleContainer {
    private Integer allowSync;

    public Integer getAllowSync() {
        return allowSync;
    }

    @XmlAttribute
    public void setAllowSync(Integer allowSync) {
        this.allowSync = allowSync;
    }
}
