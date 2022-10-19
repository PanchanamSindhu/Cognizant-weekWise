package com.cog.SpringBoot.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cog.SpringBoot.model.Customer;
import com.cog.SpringBoot.rpository.CustomerRepository;
import com.cog.SpringBoot.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository cr;

	@Override
	public List<Customer> getCustomer() {

		return cr.findAll();
	}

	@Override
	public Customer saveCustomer(Customer customer) {
//		if(customer.getName().isEmpty())
//		return null;
		cr.save(customer);
		return customer;
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		cr.save(customer);
		return customer;
	}

	@Override
	public void deleteCustomet(int customerID) {
		// TODO Auto-generated method stub
		cr.deleteById(customerID);

	}

}
