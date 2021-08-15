package com.lti;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.lti")
public class OnlineShoppingProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineShoppingProjectApplication.class, args);
	}

}
