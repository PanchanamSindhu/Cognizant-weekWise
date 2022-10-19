package com.cog.UserServiceDemo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cog.UserServiceDemo.entity.User;

@Service
public class UserServiceImpl implements UserService {

	List<User> user = List.of(new User(22L, "Ram", "1234"), new User(23L, "Jhon", "5678"), new User(24L, "Tom", "9101"),
			new User(25L, "Peter", "1213"), new User(26L, "ABc", "1415"));

	@Override
	public User getUser(Long id) {

		return user.stream().filter(us -> us.getUserId().equals(id)).findAny().orElse(null);
	}

}
