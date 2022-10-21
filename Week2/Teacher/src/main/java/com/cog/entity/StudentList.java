package com.cog.entity;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class StudentList {
	
	 private List<Student> student;

	    public StudentList() {
	    	student = new ArrayList<>();
	    }

	    
}
