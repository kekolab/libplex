package kekolab.libplex.entity;

import java.util.Date;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public class Pin {
	@XmlElement private Integer id;
	@XmlElement private String code;
	@XmlElement(name = "expires-at") private Date expiresAt;
	@XmlElement(name = "client-identifier") private String clientIdentifier;
	@XmlElement private Boolean trusted;
	@XmlElement(name = "user-id") private Integer userId;
	@XmlElement(name = "auth-token") private String authToken;
	@XmlElement(name = "auth_token") private String auth_Token;

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

	public void setId(Integer id) {
		this.id = id;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setExpiresAt(Date expiresAt) {
		this.expiresAt = expiresAt;
	}

	public void setClientIdentifier(String clientIdentifier) {
		this.clientIdentifier = clientIdentifier;
	}

	public void setTrusted(Boolean trusted) {
		this.trusted = trusted;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}

	public void setAuth_Token(String auth_Token) {
		this.auth_Token = auth_Token;
	}

	public boolean isExpired() {
		return new Date().after(expiresAt);
	}

}
