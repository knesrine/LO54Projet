package com.lo54.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lo54.entities.Location;

public interface LocationRepository extends JpaRepository <Location , Long> {
	public List<Location> findByCity(String city);
}
