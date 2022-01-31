package libplex.plextv.entity;

import java.io.IOException;
import java.net.URL;
import java.security.cert.X509Certificate;
import java.util.regex.Pattern;

import javax.net.ssl.HttpsURLConnection;

import jakarta.ws.rs.core.Link;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;

@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public class Server {
    @XmlAttribute private String accessToken;
    @XmlAttribute private String name;
    @XmlAttribute private String address;
    @XmlAttribute private int port;
    @XmlAttribute private String version;
    @XmlAttribute private String scheme;
    @XmlAttribute private String host;
    @XmlAttribute private String localAddresses;
    @XmlAttribute private String machineIdentifier;
    @XmlAttribute private long createdAt;
    @XmlAttribute private long updatedAt;
    @XmlAttribute private int owned;
    @XmlAttribute private int synced;
    @XmlTransient private Link publicBaseLink;
    
    public Link getPublicBaseLink() throws IOException {
        if (this.publicBaseLink == null) {
            HttpsURLConnection connection = (HttpsURLConnection) new URL(new StringBuilder()
            .append("https://")
            .append(this.getHost())
            .append(":")
            .append(this.getPort())
            .toString()).openConnection();
            connection.setHostnameVerifier((arg0, arg1) -> true);
            connection.connect();
            X509Certificate serverCertificate = (X509Certificate) connection.getServerCertificates()[0];
            String cn = serverCertificate.getSubjectDN().getName();
            this.publicBaseLink = Link.fromUri(new StringBuilder()
            .append("https://")
            .append(this.getHost().replaceAll(Pattern.quote("."), "-"))
            .append(cn.substring(4))
            .append(":")
            .append(this.getPort())
            .toString()).build();            
        }
        return this.publicBaseLink;
    }


    public String getAccessToken() {
        return accessToken;
    }
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getPort() {
        return port;
    }
    public void setPort(int port) {
        this.port = port;
    }
    public String getVersion() {
        return version;
    }
    public void setVersion(String version) {
        this.version = version;
    }
    public String getScheme() {
        return scheme;
    }
    public void setScheme(String scheme) {
        this.scheme = scheme;
    }
    public String getHost() {
        return host;
    }
    public void setHost(String host) {
        this.host = host;
    }
    public String getLocalAddresses() {
        return localAddresses;
    }
    public void setLocalAddresses(String localAddresses) {
        this.localAddresses = localAddresses;
    }
    public String getMachineIdentifier() {
        return machineIdentifier;
    }
    public void setMachineIdentifier(String machineIdentifier) {
        this.machineIdentifier = machineIdentifier;
    }
    public long getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }
    public long getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(long updatedAt) {
        this.updatedAt = updatedAt;
    }
    public int getOwned() {
        return owned;
    }
    public void setOwned(int owned) {
        this.owned = owned;
    }
    public int getSynced() {
        return synced;
    }
    public void setSynced(int synced) {
        this.synced = synced;
    }

    

    /*
    <Server accessToken="jySVFB8thowQn3T5zfZB" name="raspberrypi" address="95.252.89.21" port="32400" 
    version="1.23.4.4805-186bae04e" scheme="http" host="95.252.89.21" localAddresses="192.168.1.232" 
    machineIdentifier="f2d354af228ccac5ba677e10c7bb01d2030b60b9" createdAt="1511809864" updatedAt="1643491304" 
    owned="1" synced="0"/>
    */

}
