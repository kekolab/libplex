package kekolab.libplex.entity;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import jakarta.xml.bind.annotation.XmlAttribute;
import kekolab.libplex.misc.Searcher;

public class Section extends MediaContainerWithArt {
    private Integer librarySectionID, viewMode;
    private String content, thumb, title1, viewGroup;
    private Searcher searcher;
    
    protected <A extends SectionItem> List<A> listAndMap(String key, Class<A> cls) {
        URI uri = getClient().uriBuilder()
                .fromKey(key, this, getServer())
                .build();
        SectionItemList mediaInfoList = (SectionItemList) SectionItemList.build(SectionItemList.class, getClient(), uri,
                getServer());
    	return mediaInfoList.getItems().stream().map(item -> cls.cast(item)).collect(Collectors.toList());
    }
    
    public List<CollectionDirectory> collections() {
    	URI uri = getClient().uriBuilder().fromKey("collection", this, getServer()).build();
    	CollectionsContainer cc = (CollectionsContainer) CollectionsContainer.build(CollectionsContainer.class, getClient(), uri, getServer());
    	List<CollectionDirectory> collections = cc.getCollections();
		collections.forEach(collection -> collection.setParent(this));
    	return collections;
    }

    public URI thumbUri() {
    	String thumb = getThumb();
    	if (thumb != null)
    		return getClient().uriBuilder().fromKey(thumb, this, getServer()).build();
    	return null;
    }
    
    public Integer getLibrarySectionID() {
        return librarySectionID;
    }

    public Integer getViewMode() {
        return viewMode;
    }

    public String getContent() {
        return content;
    }

    public String getThumb() {
        return thumb;
    }

    public String getTitle1() {
        return title1;
    }

    public String getViewGroup() {
        return viewGroup;
    }

    @XmlAttribute
    public void setLibrarySectionID(Integer librarySectionID) {
        this.librarySectionID = librarySectionID;
    }

    @XmlAttribute
    public void setViewMode(Integer viewMode) {
        this.viewMode = viewMode;
    }

    @XmlAttribute
    public void setContent(String content) {
        this.content = content;
    }

    @XmlAttribute
    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    @XmlAttribute
    public void setTitle1(String title1) {
        this.title1 = title1;
    }

    @XmlAttribute
    public void setViewGroup(String viewGroup) {
        this.viewGroup = viewGroup;
    }
    
    protected Searcher getSearcher() {
        if (searcher == null)
            setSearcher(new Searcher(getClient(), this, getServer()));
        return searcher;
    }

    private void setSearcher(Searcher searcher) {
        this.searcher = searcher;
    }
}
