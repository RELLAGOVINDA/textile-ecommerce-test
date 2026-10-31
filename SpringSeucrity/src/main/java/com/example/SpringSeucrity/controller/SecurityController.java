package com.example.SpringSeucrity.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/controller")
public class SecurityController {
	
	
	@RequestMapping("/public")
	public String openResource() {
		return "public Resource";
	}
	
	@RequestMapping("/private")
	public String protectedResource() {
		return "Protected Resource";
	}
}
