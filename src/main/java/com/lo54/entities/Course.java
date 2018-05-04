package com.lo54.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@SuppressWarnings("serial")
@Entity
public class Course implements Serializable {
	@Id
	@Size(min=1,max=10)
	@Column(name="CODE_COURSE")
	private String code;
	
	@NotNull
	@Size(min=1,max=40)
	@Column(name="TITLE")
	private String title;
	
	@OneToMany(mappedBy="course",fetch=FetchType.LAZY)
	private Collection<CourseSession> courseSessions;
	
	
	//Constructors
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Course(String code, String title, Collection<CourseSession> courseSessions) {
		super();
		this.code = code;
		this.title = title;
		this.courseSessions = courseSessions;
	}
	
	
	//Getters & Setters
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Collection<CourseSession> getCourseSessions() {
		return courseSessions;
	}
	public void setCourseSessions(Collection<CourseSession> courseSessions) {
		this.courseSessions = courseSessions;
	}
	
	
	
	
	
	
}
