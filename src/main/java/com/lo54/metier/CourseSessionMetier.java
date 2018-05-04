package com.lo54.metier;
import com.lo54.entities.CourseSession;
import com.lo54.entities.Location;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;


	

public interface CourseSessionMetier {
	public List<CourseSession> SearchByDate(LocalDate date);
	public List<CourseSession> SearchByCity(String city);
	public List<CourseSession> listCourseSession();
}
