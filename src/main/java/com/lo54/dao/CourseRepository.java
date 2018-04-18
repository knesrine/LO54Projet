package com.lo54.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.lo54.entities.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
	public List<Course> findByTitle(String title);
	
	@Query ("select cr from course cr where cr.code in ( select cs.code from courseSession cs where  d in cs.startDate and cs.endDate ")
	public List<Course> searchByDate(@Param("d")Date date);
	
	
}
