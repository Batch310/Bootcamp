package com.example.dogservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class DogApiCobaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DogApiCobaApplication.class, args);
	}

}

