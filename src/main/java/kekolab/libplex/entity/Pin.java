package kekolab.libplex.entity;

import java.util.Date;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Pin {
    private Integer id;
    private String code;
    private Date expiresAt;
    private String clientIdentifier;
    private Boolean trusted;
    private Integer userId;
    private String authToken;
    private String auth_Token;

    public boolean isExpired() {
        return new Date().after(expiresAt);
    }

    public Integer getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public Date getExpiresAt() {
        return expiresAt;
    }

    public String getClientIdentifier() {
        return clientIdentifier;
    }

    public Boolean getTrusted() {
        return trusted;
    }

    public Integer getUserId() {
        return userId;
    }

    public String getAuthToken() {
        return authToken;
    }

    public String getAuth_Token() {
        return auth_Token;
    }

    @XmlElement
    public void setId(Integer id) {
        this.id = id;
    }

    @XmlElement
    public void setCode(String code) {
        this.code = code;
    }

    @XmlElement(name = "expires-at")
    public void setExpiresAt(Date expiresAt) {
        this.expiresAt = expiresAt;
    }

    @XmlElement(name = "client-identifier")
    public void setClientIdentifier(String clientIdentifier) {
        this.clientIdentifier = clientIdentifier;
    }

    @XmlElement
    public void setTrusted(Boolean trusted) {
        this.trusted = trusted;
    }

    @XmlElement(name = "user-id")
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @XmlElement(name = "auth-token")
    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    @XmlElement(name = "auth_token")
    public void setAuth_Token(String auth_Token) {
        this.auth_Token = auth_Token;
    }
}
