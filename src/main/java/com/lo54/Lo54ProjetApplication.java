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
public class Lo54ProjetApplication extends SpringBootServletInitializer implements CommandLineRunner{
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Lo54ProjetApplication.class);
	}
	
	@Autowired
	private CourseSessionRepository courseSessionRepository;
	
	@Autowired
	private ClientRepository clientRepository;
	
	
	public static void main(String[] args) {
		
		SpringApplication.run(Lo54ProjetApplication.class, args);
	/*	ConfigurableApplicationContext ctx=SpringApplication.run(Lo54ProjetApplication.class, args);
		CourseMetier courseMetier=ctx.getBean(CourseMetier.class);
		List<Course> courses=courseMetier.SearchByTitle("Math");
		for(Course c:courses)
			System.out.println(c.getCode());
		*/
//		CourseSessionRepository csr = ctx.getBean(CourseSessionRepository.class);
//		List<CourseSession> x = csr.findAll();
//		for (CourseSession cs:x)
//			System.out.println(cs.getId());
		

	}
	
	@Override
	public void run(String... args) {
		List<CourseSession> x = courseSessionRepository.findByDate(LocalDate.of(2018, Month.MAY,11));
		for (CourseSession cs:x)
			System.out.println(cs.getCourse().getTitle());
		List<CourseSession> y = courseSessionRepository.findByCity("Belfort");
		for (CourseSession cs:y)
			System.out.println(cs.getCourse().getTitle());
		
		
		
//		Client cl = new Client("test", "test", "test", "0760606060", "test@test.com", new CourseSession(1));
//		clientRepository.save(cl);
		
	}
	
}
