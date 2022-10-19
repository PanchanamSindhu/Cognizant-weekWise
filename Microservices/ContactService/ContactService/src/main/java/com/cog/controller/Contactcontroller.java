package com.cog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cog.entity.Contact;
import com.cog.service.ContactService;

@RestController
@RequestMapping("/contact")
public class Contactcontroller {
	
	@Autowired
	private ContactService contactService;
	
	@GetMapping(value="/getuser/{id}")
	public List<Contact> getContact(@PathVariable(value="id") Long id){
		return this.contactService.getContactOfuser(id);
	}

}
