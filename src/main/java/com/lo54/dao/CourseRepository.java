package com.lo54.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.lo54.entities.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, String> {
	@Query("select cr from Course cr where cr.title like :x")
	public List<Course> findByTitle(@Param("x")String title);
	
	
}
