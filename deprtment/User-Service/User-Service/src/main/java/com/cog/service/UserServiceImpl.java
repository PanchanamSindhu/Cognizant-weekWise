package com.cog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cog.entity.UserService;
import com.cog.repository.UserRepository;
import com.cog.vo.Department;
import com.cog.vo.RestTemplateVO;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserServiceImpl {

	@Autowired
	private UserRepository userRepo;

	@Autowired
	private RestTemplate restTemplate;

	public UserService saveUser(UserService user) {
		return userRepo.save(user);
	}

	public RestTemplateVO getUserWithDepartment(Long userId) {
		RestTemplateVO responseTemplateVO = new RestTemplateVO();
		UserService user = userRepo.findByUserId(userId);
		Department department = restTemplate.getForObject("http://localhost:8059/department/" + user.getDepartmentId(),
				Department.class);
		responseTemplateVO.setUser(user);
		responseTemplateVO.setDepartment(department);
		return responseTemplateVO;

	}

}
