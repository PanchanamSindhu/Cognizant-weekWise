package com.cog.SpringBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cog.SpringBoot.model.Customer;
import com.cog.SpringBoot.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService cs;

	@GetMapping(value = "/getcustomer")
	public List<Customer> getCustomerDetails() {
		return this.cs.getCustomer();
	}

	@PostMapping(value = "/addcustomer")
	public Customer addCustomer(@RequestBody Customer customer) {
		return this.cs.saveCustomer(customer);
	}

	@PutMapping(value = "/update/{custId}")
	public Customer updateCustomer(@RequestBody Customer customer) {
		return this.cs.saveCustomer(customer);
	}

	@DeleteMapping(value = "/delete/{custId}")
	public ResponseEntity<HttpStatus> deleteCustomer(@PathVariable int custId) {
		try {
			this.cs.deleteCustomet(custId);
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		} catch (Exception e) {

			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
