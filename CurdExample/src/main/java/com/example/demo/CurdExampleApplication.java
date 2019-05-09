package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.app")
public class CurdExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurdExampleApplication.class, args);
	}

}
