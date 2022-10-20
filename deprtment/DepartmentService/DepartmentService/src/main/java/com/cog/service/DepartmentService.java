package com.cog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cog.entity.Department;
import com.cog.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepo;

	public Department saveDepartment(Department department) {
		return departmentRepo.save(department);
	}

	public Department findByDepartmentId(Long depId) {
		return departmentRepo.findByDepartmentId(depId);

	}

}
