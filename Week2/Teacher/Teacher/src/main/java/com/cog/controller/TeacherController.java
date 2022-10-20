package com.cog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cog.entity.Teacher;
import com.cog.service.TeacherService;
import com.cog.vo.ResponseTemplateVO;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/teacher")
@Slf4j
public class TeacherController {
	
	@Autowired
	private TeacherService teacherService;
	
	@PostMapping(value = "/savestudent")
	public Teacher saveTeacher(@RequestBody Teacher teacher) {
		return teacherService.saveTeacher(teacher);

	}

	@GetMapping(value = "/getTeacher/{id}")
	public ResponseTemplateVO getUserWithDepartmnet(@PathVariable("id") Long teacherId) {
		return teacherService.getTeacherWithStudent(teacherId);
	}
	
	

}
