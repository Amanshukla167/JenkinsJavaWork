package com.Book.Spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsSetupApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsSetupApplication.class, args);
		System.out.println("this Spring boot project is running from the Jenkin.");
		
		int a = 10;
		int b = 5;
		int c = a+b;
		
		System.out.println("the sum of two digit  a and b is :" + c);
	}

}
