package com.cog.SecurityDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cog.SecurityDemo.model.User;
import com.cog.SecurityDemo.repository.UserRepository;

@Controller
public class MyController {

	@Autowired
	private UserRepository userRepo;

	@RequestMapping("/hm")
	public String home() {
		return "home.jsp";
	}

	@GetMapping("/user")
	public List<User> getUser() {
		return userRepo.findAll();
	}

	@PostMapping
	public User adduser(@RequestBody User user) {
		return userRepo.save(user);
	}

	@RequestMapping("/login")
	public String loginPage() {
		return "login.jsp";
	}

	@RequestMapping("/logout-success")
	public String logouPage() {
		return "logout.jsp";
	}

}
