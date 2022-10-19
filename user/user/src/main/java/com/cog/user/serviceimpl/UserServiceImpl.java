package com.cog.user.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cog.user.model.ERole;
import com.cog.user.model.Role;
import com.cog.user.model.User;
import com.cog.user.repository.RoleRepository;
import com.cog.user.repository.UserRepository;
import com.cog.user.service.UserInterface;

@Service
public class UserServiceImpl implements UserInterface {

	@Autowired
	UserRepository userRepository;

	@Autowired
	RoleRepository roleRepository;

	@Override
	public User getUser(int userId, ERole roleUser) {
		User user = null;
		Role userRole = roleRepository.findByName(roleUser)
				.orElseThrow(() -> new RuntimeException("Error: Role is not found."));
		Optional<User> userOptional = userRepository.findById(userId);
		if (userOptional.isPresent()
				&& userOptional.get().getUserRole().stream().anyMatch(r -> r.getName().equals(userRole.getName()))) {
			user = userOptional.get();
		}
		return user;
	}

}
