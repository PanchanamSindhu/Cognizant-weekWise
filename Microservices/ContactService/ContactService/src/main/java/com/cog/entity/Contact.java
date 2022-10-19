package com.cog.entity;

public class Contact {

	private Long cID;
	private String email;
	private Long userID;
	public Long getcID() {
		return cID;
	}
	public void setcID(Long cID) {
		this.cID = cID;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getUserID() {
		return userID;
	}
	public void setUserID(Long userID) {
		this.userID = userID;
	}
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Contact(Long cID, String email, Long userID) {
		super();
		this.cID = cID;
		this.email = email;
		this.userID = userID;
	}
	@Override
	public String toString() {
		return "Contact [cID=" + cID + ", email=" + email + ", userID=" + userID + "]";
	}

	
}
