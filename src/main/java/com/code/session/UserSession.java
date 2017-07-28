<<<<<<< HEAD
package com.code.session;

import org.springframework.context.annotation.Scope;


@Scope("session")
public class UserSession {
	private String username;
	private String profile;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}

}
=======
package com.code.session;

import org.springframework.context.annotation.Scope;


@Scope("session")
public class UserSession {
	private String username;
	private String profile;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}

}
>>>>>>> 4c2f064d4805a20514232872b5c5aa58104d0d12
