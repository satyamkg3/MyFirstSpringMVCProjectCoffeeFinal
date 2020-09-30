package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages= "com.satyam")
@EntityScan(basePackages="com.satyam.bean")
@EnableJpaRepositories(basePackages= "com.satyam.dao")
public class MyFirstSpringMvcProject3Application {

	public static void main(String[] args) {
		SpringApplication.run(MyFirstSpringMvcProject3Application.class, args);
	}

}
