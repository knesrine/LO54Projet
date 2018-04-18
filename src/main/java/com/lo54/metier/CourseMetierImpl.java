package com.lo54.metier;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.lo54.dao.CourseRepository;
import com.lo54.dao.LocationRepository;
import com.lo54.entities.Course;

@Component
public class CourseMetierImpl implements CourseMetier{
	private CourseRepository courseRepository ;
	private LocationRepository locationRepository ;
	@Override
	public List<Course> SearchByTitle(String title) {
		return courseRepository.findByTitle(title);
	}

	@Override
	public List<Course> SearchByDate(Date date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Course> SearchByCity(String city) {
		
		return null;
	}
	

}
