package libplex.plex.entity;

import java.util.Date;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public class Pin {
    private int id;
    private String code;
    private Date expiresAt;
    private String clientIdentifier;
    private boolean trusted;
    private int userId;
    private String authToken;
    private String auth_Token;

    @XmlElement(name = "user-id")
    public int getUserId() {
	return userId;
    }

    public void setUserId(int userId) {
	this.userId = userId;
    }

    @XmlElement
    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    @XmlElement
    public String getCode() {
	return code;
    }

    public void setCode(String code) {
	this.code = code;
    }

    @XmlElement(name = "expires-at")
    public Date getExpiresAt() {
	return expiresAt;
    }

    public void setExpiresAt(Date expiresAt) {
	this.expiresAt = expiresAt;
    }

    @XmlElement(name = "client-identifier")
    public String getClientIdentifier() {
	return clientIdentifier;
    }

    public void setClientIdentifier(String clientIdentifier) {
	this.clientIdentifier = clientIdentifier;
    }

    @XmlElement
    public boolean isTrusted() {
	return trusted;
    }

    public void setTrusted(boolean trusted) {
	this.trusted = trusted;
    }

    @XmlElement(name = "auth-token")
    public String getAuthToken() {
	return authToken;
    }

    public void setAuthToken(String authToken) {
	this.authToken = authToken;
    }

    @XmlElement(name = "auth_token")
    public String getAuth_Token() {
	return auth_Token;
    }

    public void setAuth_Token(String auth_Token) {
	this.auth_Token = auth_Token;
    }
}
