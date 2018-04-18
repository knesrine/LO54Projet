package com.lo54.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import com.lo54.entities.CourseSession;

public interface CourseSessionRepository extends JpaRepository <CourseSession ,Long> {
}
