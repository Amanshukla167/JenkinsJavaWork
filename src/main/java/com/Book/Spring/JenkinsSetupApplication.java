package com.Book.Spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsSetupApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsSetupApplication.class, args);
		System.out.println("this Spring boot project is running from the Jenkin.");
	}

}
