package com.cog.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cog.entity.Student;
import com.cog.entity.StudentList;
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
		Teacher teacher = teacherRepo.findByTeacherId(teacherId);
		List<Student> response=restTemplate.getForObject("http://localhost:8055/student/getstudents/"+teacher.getTeacherId(), List.class);
		//List<Student> studentList = restTemplate.getForObject("http://localhost:8055/student/getstudents/", List.class);
		//List<TodoItem> todoItems = response.as(new TypeRef<>() {});
		//List stu1=this.restTemplate.getForObject("http://localhost:8055/student/getstudents/",List.class);
		//stu1.)
		responseTemplateVO.setStudent(response);
		responseTemplateVO.setTeacher(teacher);
		return responseTemplateVO;

	}

}
