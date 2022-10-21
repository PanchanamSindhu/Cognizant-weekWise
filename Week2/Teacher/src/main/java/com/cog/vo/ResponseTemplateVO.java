package com.cog.vo;

import java.util.List;

import com.cog.entity.Student;
import com.cog.entity.Teacher;
import com.thoughtworks.xstream.mapper.Mapper;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {
	private Teacher teacher;
	private List<Student> student;
	

}
