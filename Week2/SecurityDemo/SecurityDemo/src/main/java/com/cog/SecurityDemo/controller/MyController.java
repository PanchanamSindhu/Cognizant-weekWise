package com.cog.SecurityDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	@RequestMapping("/hm")
	public String home() {
		return "home.jsp";
	}

	
}
