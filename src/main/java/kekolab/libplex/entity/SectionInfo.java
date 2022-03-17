package kekolab.libplex.entity;

import java.net.URI;
import java.util.Date;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import kekolab.libplex.xmladapter.TimestampAdapter;

public abstract class SectionInfo<Content extends PMSSection> extends PMSDirectory<Content> {
    private Integer allowSync, filters, refreshing, content, directory, contentChangedAt, hidden;
    private String composite, agent, scanner, language, uuid;
    private Date createdAt, scannedAt;
    private PMSLocation location;

    protected SectionInfo(SectionDirectoryXML xml) {
        setAllowSync(xml.getAllowSync());
        setFilters(xml.getFilters());
        setRefreshing(xml.getRefreshing());
        setContent(xml.getContent());
        setDirectory(xml.getDirectory());
        setContentChangedAt(xml.getContentChangedAt());
        setHidden(xml.getHidden());
        setArt(xml.getArt());
        setComposite(xml.getComposite());
        setThumb(xml.getThumb());
        setKey(xml.getKey());
        setType(xml.getType());
        setTitle(xml.getTitle());
        setAgent(xml.getAgent());
        setScanner(xml.getScanner());
        setLanguage(xml.getLanguage());
        setUuid(xml.getUuid());
        setCreatedAt(xml.getCreatedAt());
        setScannedAt(xml.getScannedAt());
        setLocation(xml.getLocation());
    }

    public URI compositeUri() {
        return getClient().uriBuilder()
                .fromKey(getComposite(), getParent(), getServer())
                .build();
    }

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

    public String getComposite() {
        return composite;
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

    public void setAllowSync(Integer allowSync) {
        this.allowSync = allowSync;
    }

    public void setFilters(Integer filters) {
        this.filters = filters;
    }

    public void setRefreshing(Integer refreshing) {
        this.refreshing = refreshing;
    }

    public void setContent(Integer content) {
        this.content = content;
    }

    public void setDirectory(Integer directory) {
        this.directory = directory;
    }

    public void setContentChangedAt(Integer contentChangedAt) {
        this.contentChangedAt = contentChangedAt;
    }

    public void setHidden(Integer hidden) {
        this.hidden = hidden;
    }

    public void setComposite(String composite) {
        this.composite = composite;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public void setScanner(String scanner) {
        this.scanner = scanner;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public void setScannedAt(Date scannedAt) {
        this.scannedAt = scannedAt;
    }

    public void setLocation(PMSLocation location) {
        this.location = location;
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

    public static class PMSSectionDirectoryAdapter extends XmlAdapter<SectionDirectoryXML, SectionInfo<?>> {
        @Override
        public SectionInfo<?> unmarshal(SectionDirectoryXML v) throws Exception {
            if ("artist".equals(v.getType()))
                return new MusicSectionInfo(v);
            return null;
        }

        @Override
        public SectionDirectoryXML marshal(SectionInfo<?> v) throws Exception {
            // TODO Auto-generated method stub
            return null;
        }
    }
}
