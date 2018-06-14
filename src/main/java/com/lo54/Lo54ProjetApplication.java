package com.lo54;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import javax.validation.constraints.Null;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.lo54.dao.ClientRepository;
import com.lo54.dao.CourseSessionRepository;
import com.lo54.entities.Client;
import com.lo54.entities.Course;
import com.lo54.entities.CourseSession;
import com.lo54.entities.Location;
import com.lo54.metier.CourseMetier;
import com.lo54.metier.CourseSessionMetier;


@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
public class Lo54ProjetApplication {
	
	public static void main(String[] args) {
		
		SpringApplication.run(Lo54ProjetApplication.class, args);

	}
	
	
}
