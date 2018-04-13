package com.lo54.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@SuppressWarnings("serial")
@Entity
public class Location implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_LOCATION")
	private int id;
	
	@NotNull
	@Size(min=1,max=40)
	@Column(name="CITY")
	private String city;
	
	@OneToMany(mappedBy="location")
	private Collection<CourseSession> courseSessions;

	//Constructors
	
	public Location() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Location(int id, @NotNull @Size(min = 1, max = 40) String city, Collection<CourseSession> courseSessions) {
		super();
		this.city = city;
		this.courseSessions = courseSessions;
	}

	

	//Getters & Setters
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Collection<CourseSession> getCourseSessions() {
		return courseSessions;
	}

	public void setCourseSessions(Collection<CourseSession> courseSessions) {
		this.courseSessions = courseSessions;
	}
	
	
	
	
	
}
