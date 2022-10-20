package com.cog.vo;

import com.cog.entity.UserService;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RestTemplateVO {
	
	private UserService user;
	private Department department;

}
