package com.cog.user.model;

import java.util.Set;

import javax.validation.constraints.NotBlank;

/*simply a data transfer object to hold some data from the hibernate entity
 * 
 */
public class SignUpRequest {

	@NotBlank(message = "name cannot be blank#######")
	private String name;
	private String userName;
	private String emailId;
	private String password;
	private Set<String> role;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<String> getRole() {
		return role;
	}

	public void setRole(Set<String> role) {
		this.role = role;
	}

}
