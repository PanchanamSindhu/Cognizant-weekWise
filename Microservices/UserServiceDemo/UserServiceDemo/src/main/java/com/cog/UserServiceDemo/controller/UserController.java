package com.cog.UserServiceDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cog.UserServiceDemo.entity.User;
import com.cog.UserServiceDemo.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping(value="/getuser/{id}")
	public User getUser(@PathVariable(value="id") Long id) {
		//return this.userService.getUser(id);
		User user=this.userService.getUser(id) ;
		List contact=this.restTemplate.getForObject("http://localhost:8096/contact/getuser/"+user.getUserId(),List.class);
		user.setContact(contact);
		return user;
	}
	
	

}
