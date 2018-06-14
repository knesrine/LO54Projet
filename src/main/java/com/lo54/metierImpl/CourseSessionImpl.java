package com.lo54.metierImpl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lo54.dao.CourseSessionRepository;
import com.lo54.entities.CourseSession;
import com.lo54.metier.CourseSessionMetier;

@Service
public class CourseSessionImpl implements CourseSessionMetier {

	@Autowired
	CourseSessionRepository courseSessionRepository;
	
	@Override
	public List<CourseSession> SearchByDate(LocalDate date) {
		// TODO Auto-generated method stub
		return courseSessionRepository.findByDate(date);
	}

	@Override
	public List<CourseSession> SearchByCity(String city) {
		// TODO Auto-generated method stub
		return courseSessionRepository.findByCity(city);
	}

	@Override
	public List<CourseSession> listCourseSession() {
		// TODO Auto-generated method stub
		return courseSessionRepository.findAll();
	}

}
