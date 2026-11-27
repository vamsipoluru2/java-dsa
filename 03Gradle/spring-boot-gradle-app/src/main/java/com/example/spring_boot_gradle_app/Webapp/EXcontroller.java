package com.example.spring_boot_gradle_app.Webapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EXcontroller {
	
	@GetMapping("/")
	public String getInfo() {
		return "Gradle app";
	}

}
