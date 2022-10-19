package com.cog.SpringBootRest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cog.SpringBootRest.entity.Course;
import com.cog.SpringBootRest.service.CourseService;

@RestController
@RequestMapping("/course")
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@GetMapping(value="/getCourses")
	//@RequestMapping(value="/getCourses",method = RequestMethod. GET)
	public List<Course> getCourses(){
		return this.courseService.getCourses();
		
	}

	@PostMapping("/addCourse")
	public Course addCourses(@RequestBody Course course){
		return this.courseService.addCourse(course);
		
	}
	
	@PutMapping("/updatecourse/{id}")
	public Course updateCourse(@PathVariable(value = "id") Long productId, @RequestBody Course course) {
		return this.courseService.updateCourse(course);
		
	}
	
	
	@DeleteMapping(value="/deletecourse/{id}")
	public ResponseEntity<Long> deleteCourse(@PathVariable(value = "id") Long courseID){
		try {
			this.courseService.deleteCourse(courseID);
			return new ResponseEntity<Long>(HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<Long>(HttpStatus.NOT_FOUND);
			
		}
		
	}
	
}
