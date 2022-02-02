package libplex.plextv.entity;

import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "MediaContainer")
@XmlAccessorType(XmlAccessType.NONE)
public class SectionDetails {
	private int size;
	private int allowSync;
	private String identifier;
	private String mediaTagPrefix;
	private String mediaTagVersion;
	private String title1;
	private List<Directory<?>> directories;
	@XmlAttribute
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	@XmlAttribute
	public int getAllowSync() {
		return allowSync;
	}
	public void setAllowSync(int allowSync) {
		this.allowSync = allowSync;
	}
	@XmlAttribute
	public String getIdentifier() {
		return identifier;
	}
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
	@XmlAttribute
	public String getMediaTagPrefix() {
		return mediaTagPrefix;
	}
	public void setMediaTagPrefix(String mediaTagPrefix) {
		this.mediaTagPrefix = mediaTagPrefix;
	}
	@XmlAttribute
	public String getMediaTagVersion() {
		return mediaTagVersion;
	}
	public void setMediaTagVersion(String mediaTagVersion) {
		this.mediaTagVersion = mediaTagVersion;
	}
	@XmlAttribute
	public String getTitle1() {
		return title1;
	}
	public void setTitle1(String title1) {
		this.title1 = title1;
	}
	@XmlElement(name = "Directory")
	public List<Directory<?>> getDirectories() {
		return directories;
	}
	public void setDirectories(List<Directory<?>> directories) {
		this.directories = directories;
	}
	
	/*
	 * <MediaContainer size="4" allowSync="0" identifier="com.plexapp.plugins.library" mediaTagPrefix="/system/bundle/media/flags/" 
	 * mediaTagVersion="1626066886" title1="Plex Library">
<Directory allowSync="0" art="/:/resources/movie-fanart.jpg" composite="/library/sections/6/composite/1643748242" filters="1" refreshing="0" thumb="/:/resources/movie.png" key="6" type="movie" title="Film" agent="tv.plex.agents.movie" scanner="Plex Movie" language="it-IT" uuid="79dcaff1-4fff-4cf6-88fe-cf1e82fc6a91" updatedAt="1642799362" createdAt="1512856966" scannedAt="1643748242" content="1" directory="1" contentChangedAt="2008778" hidden="0">
<Location id="8" path="/mnt/toshiba/server/media/Film"/>
</Directory>
<Directory allowSync="0" art="/:/resources/show-fanart.jpg" composite="/library/sections/10/composite/1643746745" filters="1" refreshing="0" thumb="/:/resources/show.png" key="10" type="show" title="Cartoni animati" agent="tv.plex.agents.series" scanner="Plex TV Series" language="it-IT" uuid="c1471d37-cc39-4856-a138-3eeb8c09590e" updatedAt="1642799360" createdAt="1546463050" scannedAt="1643746745" content="1" directory="1" contentChangedAt="0" hidden="0">
<Location id="12" path="/mnt/toshiba/server/media/Cartoni animati"/>
</Directory>
<Directory allowSync="0" art="/:/resources/show-fanart.jpg" composite="/library/sections/5/composite/1643747342" filters="1" refreshing="0" thumb="/:/resources/show.png" key="5" type="show" title="Serie TV" agent="tv.plex.agents.series" scanner="Plex TV Series" language="it-IT" uuid="8f639667-e2fd-44c9-8097-2ebbe2c2d93c" updatedAt="1642799360" createdAt="1512856663" scannedAt="1643747342" content="1" directory="1" contentChangedAt="2005876" hidden="0">
<Location id="7" path="/mnt/toshiba/server/media/Serie"/>
</Directory>
<Directory allowSync="0" art="/:/resources/artist-fanart.jpg" composite="/library/sections/14/composite/1643747342" filters="1" refreshing="0" thumb="/:/resources/artist.png" key="14" type="artist" title="Musica" agent="tv.plex.agents.music" scanner="Plex Music" language="it" uuid="aad82711-701f-4b4d-a325-f2b3aed252c7" updatedAt="1643295343" createdAt="1643223673" scannedAt="1643747342" content="1" directory="1" contentChangedAt="2004266" hidden="0">
<Location id="18" path="/mnt/toshiba/server/media/Music"/>
</Directory>
</MediaContainer>
	 */
}
