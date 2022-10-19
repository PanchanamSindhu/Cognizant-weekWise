package com.cog.Student.service;

import java.util.List;

import com.cog.Student.entity.Student;

public interface StudentService {
	
	public Student addStudent(Student student);
	public List<Student> getStudent();
	public Student getStudentById(int studentID);
	
	
}
