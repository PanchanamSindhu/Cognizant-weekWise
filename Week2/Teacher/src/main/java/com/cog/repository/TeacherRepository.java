package com.cog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cog.entity.Teacher;
@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long>{
	
	Teacher findByTeacherId(Long teacherId);

}
