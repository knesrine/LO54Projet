package com.lo54.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import com.lo54.entities.Location;

public interface LocationRepository extends JpaRepository <Location , Integer> {
	
}
