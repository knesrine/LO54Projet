package com.lo54.dao;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.lo54.entities.CourseSession;

public interface CourseSessionRepository extends JpaRepository <CourseSession ,Integer> {
	
	@Query("select crs from CourseSession crs where crs.startDate<=:d and crs.endDate>=:d")
	public List<CourseSession> findByDate(@Param("d")LocalDate date);
	@Query("select crs from Location lo join lo.courseSessions crs where lo.city=:c")
	public List<CourseSession> findByCity(@Param("c")String city);
	
}
