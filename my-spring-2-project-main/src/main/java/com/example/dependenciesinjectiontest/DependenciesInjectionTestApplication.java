package com.example.dependenciesinjectiontest;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  
public class DependenciesInjectionTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(DependenciesInjectionTestApplication.class, args);
	}

}
