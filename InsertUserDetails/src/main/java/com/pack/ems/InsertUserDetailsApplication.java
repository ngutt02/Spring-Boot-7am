package com.pack.ems;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InsertUserDetailsApplication {

	public static void main(String[] args) {
		System.out.println("from main");
		SpringApplication.run(InsertUserDetailsApplication.class, args);
	}

}
