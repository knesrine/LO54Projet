package com.lo54.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.lo54.entities.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, String> {
	/*@Query("select cr from Course cr where cr.title like :x")
	public List<Course> findByTitle(@Param("x")String title);*/
	
	public List<Course> findByTitle(String title);
	
	//@Query ("select cr from course cr where cr.code in ( select cs.code from courseSession cs where  d in cs.startDate and cs.endDate ")
	//public List<Course> searchByDate(@Param("d")Date date);
	
	
}
