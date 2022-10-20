package com.cog.SecurityDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cog.SecurityDemo.model.User;

public interface UserRepository  extends JpaRepository<User, Long>{

	User findByUserName(String username);
	//Optional<User> findByUserName(String username);


}
