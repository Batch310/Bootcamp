package com.example.dogservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class DogServiceMasterApplication {

	public static void main(String[] args) {
		SpringApplication.run(DogServiceMasterApplication.class, args);
	}

}
