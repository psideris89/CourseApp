package com.psideris.springBootStarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringBootTutorialApp extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTutorialApp.class, args);
	}

}
