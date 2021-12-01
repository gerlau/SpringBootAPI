package com.buildapi.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootBuildapiApplication {

	public static void main(String[] args) {
		
		/*
		 * if port 8080 is already in use
		 * - start a cmd session
		 * - run the command -> netstat -ano | findstr :8080
		 * - run the command -> taskkill /PID <yourid> /F
		 * 
		 * */
		
		SpringApplication.run(SpringBootBuildapiApplication.class, args);
	}

}
