package com.cog.SpringBoot.service;

import java.util.List;

import com.cog.SpringBoot.model.Customer;

public interface CustomerService {
	
	public List<Customer> getCustomer();
	public Customer saveCustomer(Customer customer);
	public Customer updateCustomer(Customer customer);
	public void deleteCustomet(int customerID);


}
