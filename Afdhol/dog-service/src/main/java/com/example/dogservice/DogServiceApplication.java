package com.example.dogservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@EnableCaching
@SpringBootApplication
public class DogServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DogServiceApplication.class, args);
	}

	@Bean //termasuk singleton pattern, objek satu digunakan untuk semua
	public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder) { //mengambil api dari luar
		return restTemplateBuilder.build();
	}
}
