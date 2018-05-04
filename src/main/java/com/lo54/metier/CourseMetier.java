package com.lo54.metier;

import java.util.Date;
import java.util.List;

import com.lo54.entities.Course;

public interface CourseMetier {
	public List<Course> SearchByTitle(String title);
	
}
