package com.cog.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cog.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
	
	Optional<Student> findByStudentId(Long studentId);
	
	List<Student> findByTeacherId(Long teacherId);
	

}
