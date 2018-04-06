package com.lo54;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
public class Lo54ProjetApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lo54ProjetApplication.class, args);
	}
}
