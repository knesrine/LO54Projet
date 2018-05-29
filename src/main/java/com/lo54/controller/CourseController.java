package com.lo54.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lo54.metier.CourseMetier;

@Controller
public class CourseController {
	
	@Autowired
	private CourseMetier courseMetier;
	
	@GetMapping("/listCourse")
	public String listCourseSession(Model model, @RequestParam(defaultValue="") String name) {
		model.addAttribute("courses", courseMetier.SearchByTitle(name));
		return "views/listc";
	}

}
