package com.cog.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cog.entity.Student;
import com.cog.repository.StudentRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class StudentService {
	
	@Autowired
	private StudentRepository studentRep;
	
	public List<Student> getStudents(){
		return this.studentRep.findAll();
	}
	
	public List<Student> getStudentsWithTeacherId(Long teacherId){
		return this.studentRep.findByTeacherId(teacherId);
	}
	
	public Student saveStudent(Student student) {
		return studentRep.save(student);
	}

	public Student findByStudentId(Long studentId) {
		return studentRep.findByStudentId(studentId);

	}
	
	public void removeStudnet(Long studentId) {
		studentRep.deleteById(studentId);
	}

}
