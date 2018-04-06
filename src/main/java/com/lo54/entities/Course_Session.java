package com.lo54.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;


@SuppressWarnings("serial")
public class Course_Session implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_coursesession")
	private int id;
	
	@NotNull
	@DateTimeFormat(iso=ISO.DATE)
	@Column(name="START_DATE")
	private LocalDate startDate;
	
	@NotNull
	@DateTimeFormat(iso=ISO.DATE)
	@Column(name="END_DATE")
	private LocalDate endDate;
	
	@Column(name="MAX")
	private int max;

	
	//Constructors
	
	//Getters & Setters
}
