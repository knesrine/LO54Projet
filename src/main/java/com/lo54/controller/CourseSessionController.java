package com.lo54.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.lo54.entities.Client;
import com.lo54.entities.CourseSession;
import com.lo54.metier.ClientMetier;
import com.lo54.metier.CourseSessionMetier;
import com.lo54.metier.LocationMetier;

import ch.qos.logback.core.net.SyslogOutputStream;

@Controller
public class CourseSessionController {
	
	@Autowired
	private CourseSessionMetier courseSessionMetier;
	@Autowired
	private LocationMetier locationMetier;
	@Autowired
	private ClientMetier clientMetier;
	
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
		@GetMapping("/register")
		public String registerForm(Model model , int idcourseSession , HttpSession session) {
			session.setAttribute("idcourseSession",idcourseSession);
			model.addAttribute("client", new Client());
			return "views/registerForm";
		}
		@PostMapping("/register")
		public String registerClient(@Valid Client client, BindingResult bindingResult, HttpSession session) {
			if(bindingResult.hasErrors()) {
				return "views/registerForm";
			}
			int idcourseSession = (int) session.getAttribute("idcourseSession");
			client.setCourseSession(new CourseSession(idcourseSession));
			clientMetier.addClient(client);
			return "redirect:/listCourseSession";
		}
		
}
