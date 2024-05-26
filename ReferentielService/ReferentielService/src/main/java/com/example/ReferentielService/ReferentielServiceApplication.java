package com.example.ReferentielService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class ReferentielServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReferentielServiceApplication.class, args);
	}

}
