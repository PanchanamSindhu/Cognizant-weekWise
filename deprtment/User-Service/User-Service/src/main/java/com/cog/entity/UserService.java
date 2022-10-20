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
public class UserService {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long userId;
	private String firstName;
	private String LastName;
	private String email;
	private Long departmentId;
	

}
