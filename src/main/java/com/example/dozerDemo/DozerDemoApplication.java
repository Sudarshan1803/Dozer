package com.example.dozerDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DozerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DozerDemoApplication.class, args);

	}
}
