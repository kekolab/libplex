package kekolab.libplex.entity;

import java.util.Date;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import kekolab.libplex.xmladapter.TimestampAdapter;

public abstract class PMSSectionDirectory<A extends PMSSection> extends PMSDirectory<A> {
    private SectionDirectoryXML xml;

    protected PMSSectionDirectory(SectionDirectoryXML xml) {
        this.xml = xml;
        super.setKey(xml.getKey());
    }

    public Integer getAllowSync() {
        return xml.getAllowSync();
    }

    public Integer getFilters() {
        return xml.getFilters();
    }

    public Integer getRefreshing() {
        return xml.getRefreshing();
    }

    public Integer getContent() {
        return xml.getContent();
    }

    public Integer getDirectory() {
        return xml.getDirectory();
    }

    public Integer getContentChangedAt() {
        return xml.getContentChangedAt();
    }

    public Integer getHidden() {
        return xml.getHidden();
    }

    public String getArt() {
        return xml.getArt();
    }

    public String getComposite() {
        return xml.getComposite();
    }

    public String getThumb() {
        return xml.getThumb();
    }

    public String getType() {
        return xml.getType();
    }

    public String getTitle() {
        return xml.getTitle();
    }

    public String getAgent() {
        return xml.getAgent();
    }

    public String getScanner() {
        return xml.getScanner();
    }

    public String getLanguage() {
        return xml.getLanguage();
    }

    public String getUuid() {
        return xml.getUuid();
    }

    public Date getCreatedAt() {
        return xml.getCreatedAt();
    }

    public Date getScannedAt() {
        return xml.getScannedAt();
    }

    public PMSLocation getLocation() {
        return xml.getLocation();
    }

    public void setAllowSync(Integer allowSync) {
        xml.setAllowSync(allowSync);
    }

    public void setFilters(Integer filters) {
        xml.setFilters(filters);
    }

    public void setRefreshing(Integer refreshing) {
        xml.setRefreshing(refreshing);
    }

    public void setContent(Integer content) {
        xml.setContent(content);
    }

    public void setDirectory(Integer directory) {
        xml.setDirectory(directory);
    }

    public void setContentChangedAt(Integer contentChangedAt) {
        xml.setContentChangedAt(contentChangedAt);
    }

    public void setHidden(Integer hidden) {
        xml.setHidden(hidden);
    }

    public void setArt(String art) {
        xml.setArt(art);
    }

    public void setComposite(String composite) {
        xml.setComposite(composite);
    }

    public void setThumb(String thumb) {
        xml.setThumb(thumb);
    }

    public void setType(String type) {
        xml.setType(type);
    }

    public void setTitle(String title) {
        xml.setTitle(title);
    }

    public void setAgent(String agent) {
        xml.setAgent(agent);
    }

    public void setScanner(String scanner) {
        xml.setScanner(scanner);
    }

    public void setLanguage(String language) {
        xml.setLanguage(language);
    }

    public void setUuid(String uuid) {
        xml.setUuid(uuid);
    }

    public void setCreatedAt(Date createdAt) {
        xml.setCreatedAt(createdAt);
    }

    public void setScannedAt(Date scannedAt) {
        xml.setScannedAt(scannedAt);
    }

    public void setLocation(PMSLocation location) {
        xml.setLocation(location);
    }

    public static class SectionDirectoryXML {
        private Integer allowSync, filters, refreshing, content, directory, contentChangedAt, hidden;
        private String art, composite, thumb, key, type, title, agent, scanner, language, uuid;
        private Date createdAt, scannedAt;
        private PMSLocation location;

        public Integer getAllowSync() {
            return allowSync;
        }

        public Integer getFilters() {
            return filters;
        }

        public Integer getRefreshing() {
            return refreshing;
        }

        public Integer getContent() {
            return content;
        }

        public Integer getDirectory() {
            return directory;
        }

        public Integer getContentChangedAt() {
            return contentChangedAt;
        }

        public Integer getHidden() {
            return hidden;
        }

        public String getArt() {
            return art;
        }

        public String getComposite() {
            return composite;
        }

        public String getThumb() {
            return thumb;
        }

        public String getKey() {
            return key;
        }

        public String getType() {
            return type;
        }

        public String getTitle() {
            return title;
        }

        public String getAgent() {
            return agent;
        }

        public String getScanner() {
            return scanner;
        }

        public String getLanguage() {
            return language;
        }

        public String getUuid() {
            return uuid;
        }

        public Date getCreatedAt() {
            return createdAt;
        }

        public Date getScannedAt() {
            return scannedAt;
        }

        public PMSLocation getLocation() {
            return location;
        }

        @XmlAttribute
        public void setAllowSync(Integer allowSync) {
            this.allowSync = allowSync;
        }

        @XmlAttribute
        public void setFilters(Integer filters) {
            this.filters = filters;
        }

        @XmlAttribute
        public void setRefreshing(Integer refreshing) {
            this.refreshing = refreshing;
        }

        @XmlAttribute
        public void setContent(Integer content) {
            this.content = content;
        }

        @XmlAttribute
        public void setDirectory(Integer directory) {
            this.directory = directory;
        }

        @XmlAttribute
        public void setContentChangedAt(Integer contentChangedAt) {
            this.contentChangedAt = contentChangedAt;
        }

        @XmlAttribute
        public void setHidden(Integer hidden) {
            this.hidden = hidden;
        }

        @XmlAttribute
        public void setArt(String art) {
            this.art = art;
        }

        @XmlAttribute
        public void setComposite(String composite) {
            this.composite = composite;
        }

        @XmlAttribute
        public void setThumb(String thumb) {
            this.thumb = thumb;
        }

        @XmlAttribute
        public void setType(String type) {
            this.type = type;
        }

        @XmlAttribute
        public void setTitle(String title) {
            this.title = title;
        }

        @XmlAttribute
        public void setAgent(String agent) {
            this.agent = agent;
        }

        @XmlAttribute
        public void setScanner(String scanner) {
            this.scanner = scanner;
        }

        @XmlAttribute
        public void setLanguage(String language) {
            this.language = language;
        }

        @XmlAttribute
        public void setUuid(String uuid) {
            this.uuid = uuid;
        }

        @XmlAttribute
        @XmlJavaTypeAdapter(TimestampAdapter.class)
        public void setCreatedAt(Date createdAt) {
            this.createdAt = createdAt;
        }

        @XmlAttribute
        @XmlJavaTypeAdapter(TimestampAdapter.class)
        public void setScannedAt(Date scannedAt) {
            this.scannedAt = scannedAt;
        }

        @XmlElement(name = "Location")
        public void setLocation(PMSLocation location) {
            this.location = location;
        }

        @XmlAttribute
        public void setKey(String key) {
            this.key = key;
        }
    }

    public static class PMSSectionDirectoryAdapter extends XmlAdapter<SectionDirectoryXML, PMSSectionDirectory<?>> {
        @Override
        public PMSSectionDirectory<?> unmarshal(SectionDirectoryXML v) throws Exception {
            if ("artist".equals(v.getType()))
                return new PMSMusicSectionDirectory(v);
            return null;
        }

        @Override
        public SectionDirectoryXML marshal(PMSSectionDirectory<?> v) throws Exception {
            // TODO Auto-generated method stub
            return null;
        }
    }
}
