package com.cog.SpringBootRest.coursedao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cog.SpringBootRest.entity.Course;

@Repository
public interface CourseDAO extends JpaRepository<Course, Long>{
	

}
