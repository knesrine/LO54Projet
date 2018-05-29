package com.lo54.metierImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lo54.dao.CourseRepository;
import com.lo54.dao.LocationRepository;
import com.lo54.entities.Course;
import com.lo54.metier.CourseMetier;

@Service
public class CourseMetierImpl implements CourseMetier{
	
	@Autowired
	private CourseRepository courseRepository ;
	@Autowired
	private LocationRepository locationRepository ;
	
	@Override
	public List<Course> SearchByTitle(String title) {
		return courseRepository.findByTitle("%"+title+"%");
	}

	

}
