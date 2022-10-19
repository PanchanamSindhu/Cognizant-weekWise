package com.cog.UserServiceDemo.entity;

public class Contact {

	private long cID;
	private String email;
	private long userID;

	public long getcID() {
		return cID;
	}

	public void setcID(long cID) {
		this.cID = cID;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getUserID() {
		return userID;
	}

	public void setUserID(long userID) {
		this.userID = userID;
	}

	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Contact(long cID, String email, long userID) {
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
