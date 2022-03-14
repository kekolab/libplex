package kekolab.libplex.entity;

import jakarta.xml.bind.annotation.XmlAttribute;

public class PMSTag {
    private Integer id;
    private String filter;
    private String tag;

    public String getTag() {
        return tag;
    }

    public Integer getId() {
        return id;
    }

    public String getFilter() {
        return filter;
    }

    @XmlAttribute
    public void setId(Integer id) {
        this.id = id;
    }

    @XmlAttribute
    public void setFilter(String filter) {
        this.filter = filter;
    }

    @XmlAttribute
    public void setTag(String tag) {
        this.tag = tag;
    }
}
