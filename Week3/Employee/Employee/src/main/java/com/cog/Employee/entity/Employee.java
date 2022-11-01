package com.cog.Employee.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "EmployeeData")
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

	@Id
	private long id;
	private String firstName;
	private String lastName;
	private String emailId;

}
