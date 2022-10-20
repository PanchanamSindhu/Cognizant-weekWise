package com.cog.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	
	private Long studentId;
	private String studentFirstName;
	private int classId;
	private String studentLastName;
	private Long marks;

}
