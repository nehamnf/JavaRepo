package com.luv2code.springboot.cruddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(CruddemoApplication.class, args);

	}

}
