package com.ilenlab.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class SpringBootController {
	@RequestMapping("/")
	public String hello(Model model) {
		model.addAttribute("greeting", "Welcome to Spring Boot MVC");
		return "index";
	}
	
	//@RequestMapping(value="/employee", method = )
}
