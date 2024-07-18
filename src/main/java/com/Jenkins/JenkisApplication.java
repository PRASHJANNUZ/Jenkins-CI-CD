package com.Jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkisApplication {

	@GetMapping("/ping")
	public String message() {
		return "Wao!! Application Deployed successfully in SAP Cloud..";
	}

	public static void main(String[] args) {
		SpringApplication.run(JenkisApplication.class, args);
		System.out.println("Hii Prashant Let's Start...");
		System.out.println("Hiii Tanamy....");
		.
		Student.msg();
	}

}
