package com.cog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cog.entity.Department;
import com.cog.service.DepartmentService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/department")
@Slf4j
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;

	@PostMapping(value = "/savedep")
	public Department saveDepartment(@RequestBody Department department) {
		return this.departmentService.saveDepartment(department);

	}

	@GetMapping(value = "/{id}")
	public Department findByDepartmentId(@PathVariable("id") Long id) {
		return this.departmentService.findByDepartmentId(id);

	}
	

}
