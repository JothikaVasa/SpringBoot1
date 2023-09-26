package com.amdocs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demo_02 {
	@GetMapping("/in")
	public String show() {
		String s= "Hello, Jothika . Welcome to Spring Boot. your id is:";
		return s + "3445";
		
	}
	

}
