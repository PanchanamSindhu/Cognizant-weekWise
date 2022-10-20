package com.cog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cog.entity.UserService;
import com.cog.service.UserServiceImpl;
import com.cog.vo.RestTemplateVO;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {
	@Autowired
	private UserServiceImpl userServiceImpl;

	@PostMapping(value = "/saveuser")
	public UserService saveUSer(@RequestBody UserService user) {
		return userServiceImpl.saveUser(user);

	}

	@GetMapping(value = "/getUser/{id}")
	public RestTemplateVO getUserWithDepartmnet(@PathVariable("id") Long userId) {
		return userServiceImpl.getUserWithDepartment(userId);
	}

}
