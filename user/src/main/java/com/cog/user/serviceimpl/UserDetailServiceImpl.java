package com.cog.user.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.cog.user.model.User;
import com.cog.user.repository.UserRepository;

@Service
public class UserDetailServiceImpl implements UserDetailsService{
	
	@Autowired
	UserRepository userRepository;


	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.findByUserName(username)
				.orElseThrow(() -> new UsernameNotFoundException("User Not Found with username: " + username));

		return UserPrinciple.build(user);
	}
	

}
