package com.lo54.metierImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lo54.dao.LocationRepository;
import com.lo54.entities.Location;
import com.lo54.metier.LocationMetier;

@Service
public class LocationMetierImpl implements LocationMetier {
	
	@Autowired
	LocationRepository locationRepository;
	
	@Override
	public List<Location> listLocation() {
		// TODO Auto-generated method stub
		return locationRepository.findAll();
	}
	
}
