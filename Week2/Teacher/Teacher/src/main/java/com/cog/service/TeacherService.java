package com.cog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cog.entity.Student;
import com.cog.entity.Teacher;
import com.cog.repository.TeacherRepository;
import com.cog.vo.ResponseTemplateVO;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class TeacherService {
	
	@Autowired
	private TeacherRepository teacherRepo;
	
	@Autowired
	private RestTemplate restTemplate;
	
	public Teacher saveTeacher(Teacher teacher) {
		return teacherRepo.save(teacher);
	}
	
	public ResponseTemplateVO getTeacherWithStudent(Long teacherId) {
		ResponseTemplateVO responseTemplateVO = new ResponseTemplateVO();
		Teacher teacher=teacherRepo.findByTeacherId(teacherId);
		List<Student> studentList=restTemplate.getForObject("http://localhost:8055/student/getstudents/", List.class);
		responseTemplateVO.setStudent(studentList);
		responseTemplateVO.setTeacher(teacher);
		return responseTemplateVO;

	}

}
