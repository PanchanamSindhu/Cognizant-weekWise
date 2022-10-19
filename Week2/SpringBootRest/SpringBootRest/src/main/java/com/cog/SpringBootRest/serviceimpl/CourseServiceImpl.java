package com.cog.SpringBootRest.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cog.SpringBootRest.coursedao.CourseDAO;
import com.cog.SpringBootRest.entity.Course;
import com.cog.SpringBootRest.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseDAO courseDAO;

	@Override
	public List<Course> getCourses() {
		return courseDAO.findAll();
	}

	@Override
	public Course addCourse(Course course) {
		courseDAO.save(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		courseDAO.save(course);
		return course;
	}

	@Override
	public void deleteCourse(long parseLong) {
		@SuppressWarnings("deprecation")
		Course course = courseDAO.getOne(parseLong);
		courseDAO.delete(course);
	}

}
