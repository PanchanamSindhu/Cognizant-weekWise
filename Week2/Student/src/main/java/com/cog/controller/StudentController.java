package com.cog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cog.entity.MessageResponse;
import com.cog.entity.Student;
import com.cog.exception.StudentNotFoundException;
import com.cog.service.StudentService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/student")
@Slf4j
public class StudentController {

	@Autowired
	private StudentService studentService;

	@GetMapping("/getstudents")
	public List<Student> getStudents() {
		return this.studentService.getStudents();
	}

	@GetMapping("/getstudents/{id}")
	public List<Student> getStudentsWithTeacherId(@PathVariable("id") Long id) {
		return this.studentService.getStudentsWithTeacherId(id);
	}

	@PostMapping(value = "/savestudent")
	public Student saveStudent(@RequestBody Student student) {
		return this.studentService.saveStudent(student);

	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Student> findByStudentId(@PathVariable("id") Long id) throws StudentNotFoundException {
		
		Student student=this.studentService.findByStudentId(id)
				.orElseThrow(() -> new StudentNotFoundException("Student with ID :" + id + " Not found"));
		return ResponseEntity.ok().body(student);

	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<MessageResponse> removeStudent(@PathVariable("id") Long id) {
		this.studentService.removeStudnet(id);
		return ResponseEntity.ok(new MessageResponse("Student Removed successfully!"));

	}

}
