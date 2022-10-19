package com.cog.Student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cog.Student.entity.Student;
import com.cog.Student.service.StudentService;

@RestController
@RequestMapping(name="/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping(value="/addstudent")
	public Student addStudnet(@RequestBody Student student) {
		return this.studentService.addStudent(student);
	}
	
	@GetMapping(value="/getStudents")
	//@RequestMapping(value="/getStudents",method = RequestMethod. GET)
	public List<Student> getCourses(){
		return this.studentService.getStudent();
		
	}
	
	

}
