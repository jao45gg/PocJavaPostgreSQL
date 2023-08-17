package com.joao.PocJavPostgreSQL;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.joao.PocJavPostgreSQL.classes")
public class PocJavPostgreSQL {

	public static void main(String[] args) {
		SpringApplication.run(PocJavPostgreSQL.class, args);
	}

}
