package com.lo54.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.lo54.metier.CourseSessionMetier;
import com.lo54.metier.LocationMetier;

import ch.qos.logback.core.net.SyslogOutputStream;

@Controller
public class CourseSessionController {
	
	@Autowired
	private CourseSessionMetier courseSessionMetier;
	@Autowired
	private LocationMetier locationMetier;
	
	
		@RequestMapping(value="/listCourseSession",method=RequestMethod.GET)
		public String listCourseSession(Model model, @RequestParam(name="city",defaultValue="%") String city,@RequestParam(name="date",required=false) @DateTimeFormat(iso = ISO.DATE) LocalDate date) {
			model.addAttribute("listelocation",locationMetier.listLocation());
			model.addAttribute("coursesessions", courseSessionMetier.listCourseSession());
			if (city!=null) {
			model.addAttribute("coursesessions", courseSessionMetier.SearchByCity(city));
			}
			if (date!=null) {
			model.addAttribute("coursesessions", courseSessionMetier.SearchByDate(date));
			}
			return "views/listcs";
			
		}
		
		/*@RequestMapping(method=RequestMethod.GET,value="/listCourseSession")
		public String listCourseSession (Model model) {
			List<CourseSession> coursesessions = courseSessionMetier.listCourseSession();
			List<Location> locations = locationMetier.listLocation();
			model.addAttribute("coursesessions", coursesessions);
			model.addAttribute("listville", locations);			
			return "listCourseSession" ; // return page name 
		}
		@RequestMapping(method=RequestMethod.POST,value="/listCourseSession")
		public String searchbycity (@RequestParam(value="cityName",required=false) String cityName,@RequestParam(value="dateCs",required=false) LocalDate dateCs, Model model) {
			System.out.println(cityName);
			System.out.println(dateCs);
			if (cityName != null) {
				List<CourseSession> coursesessions = courseSessionMetier.SearchByCity(cityName);
				model.addAttribute("coursesessions", coursesessions);
			}
			else  {
				List<CourseSession> coursesessions = courseSessionMetier.SearchByDate(dateCs);
				model.addAttribute("coursesessions", coursesessions);
				
			}
			List<Location> locations = locationMetier.listLocation();
			model.addAttribute("listville", locations);			
			return "listCourseSession" ; // return page name 
		}
		/*public String searchbydate (@RequestParam(value="dateCs") String dateCs, Model model) {
			List<CourseSession> coursesessions = courseSessionMetier.SearchByDate(LocalDate.now());
			List<Location> locations = locationMetier.listLocation();
			model.addAttribute("coursesessions", coursesessions);
			model.addAttribute("listville", locations);			
			return "listCourseSession" ; // return page name 
		}*/

}
