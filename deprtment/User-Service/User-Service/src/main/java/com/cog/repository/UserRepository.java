package com.cog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cog.entity.UserService;

@Repository
public interface UserRepository extends JpaRepository<UserService, Long> {
	UserService findByUserId(Long userId);
}
