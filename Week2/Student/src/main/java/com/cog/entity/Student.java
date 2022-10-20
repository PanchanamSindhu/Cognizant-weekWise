package com.cog.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Student {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long studentId;
	private String studentFirstName;
	private int classId;
	private String studentLastName;
	private Long marks;

}
