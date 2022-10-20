package com.cog.SecurityDemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.cog.SecurityDemo.model.User;
import com.cog.SecurityDemo.repository.UserRepository;

@Service
public class UserDetailServiceImpl implements UserDetailsService{

	@Autowired
	private UserRepository userRepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepo.findByUserName(username);
				//.orElseThrow(() -> new UsernameNotFoundException("User Not Found with username: " + userName));
		if(user == null) {
			throw new UsernameNotFoundException("User Not Found with username: " + username);
			
		}

		return new UserPrinciple(user);
	}
	
	

}
