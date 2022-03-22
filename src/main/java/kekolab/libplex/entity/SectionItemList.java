package kekolab.libplex.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import kekolab.libplex.xmladapter.SectionItemAdapter;

@XmlRootElement(name = "MediaContainer")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class SectionItemList extends GenericMediaContainer {
    private List<? extends SectionItem> items = new ArrayList<>(0);

    public List<? extends SectionItem> getItems() {
        items.stream()
                .filter(item -> item.getClient() == null)
                .forEach(item -> {
                    item.setClient(getClient());
                    item.setParent(this);
                    item.setServer(getServer());
                    item.setUri(null);
                });
        return items;
    }

    @XmlElements({ @XmlElement(name = "Directory"), @XmlElement(name = "Video"), @XmlElement(name = "Track") })
    @XmlJavaTypeAdapter(value = SectionItemAdapter.class)
    public void setItems(List<? extends SectionItem> items) {
        this.items = items;
    }
}