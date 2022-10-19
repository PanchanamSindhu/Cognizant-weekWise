package com.cog.Student.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cog.Student.DAO.StudentDAO;
import com.cog.Student.entity.Student;
import com.cog.Student.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentDAO studentDAO;

	@Override
	public Student addStudent(Student student) {
		
		return studentDAO.save(student);
	}

	@Override
	public List<Student> getStudent() {
	
		return studentDAO.findAll();
	}

	@Override
	public Student getStudentById(int studentID) {
		// TODO Auto-generated method stub
		return null;
	}

}
