package com.joao.firstjavaproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.joao.firstjavaproject.classes")
public class FirstJavaProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstJavaProjectApplication.class, args);
	}

}
