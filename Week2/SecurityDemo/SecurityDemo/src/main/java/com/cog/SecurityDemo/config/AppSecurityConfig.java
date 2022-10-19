package com.cog.SecurityDemo.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class AppSecurityConfig {
	
	@Bean
	
	protected UserDetailsService userDetailsSrvice() {
		List<UserDetails>users=new  ArrayList<UserDetails>();
		users.add(org.springframework.security.core.userdetails.User.withDefaultPasswordEncoder().username("sindhu").password("12345").
				roles("USER").build());
		return new InMemoryUserDetailsManager(users);
		
		
		
	}

}
