package com.example.restbasedspringbootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan("com.example")
@EntityScan("com.example.model")
@EnableJpaRepositories("com.example.dao")
@SpringBootApplication
public class RestBasedSpringBootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestBasedSpringBootAppApplication.class, args);
	}

}
