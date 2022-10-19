package com.cog.SpringBoot.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="customer")
@Entity
public class Customer {
	
	@Id
	private int custID;
	private String name;
	
	@Override
	public String toString() {
		return "Customer [custID=" + custID + ", name=" + name + "]";
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int custID, String name) {
		super();
		this.custID = custID;
		this.name = name;
	}
	public int getCustID() {
		return custID;
	}
	public void setCustID(int custID) {
		this.custID = custID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	

}
