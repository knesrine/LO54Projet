package com.lo54.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@SuppressWarnings("serial")
@Entity
public class Client implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;
	
	@NotNull
	@Size(min=1,max=40)
	@Column(name="LASTNAME")
	private String lastName;
	
	@NotNull
	@Size(min=1,max=40)
	@Column(name="FIRSTNAME")
	private String firstName;
	
	@NotNull
	@Size(min=1,max=120)
	@Column(name="ADDRESS")
	private String address;
	
	@NotNull
	@Size(min=1,max=20)
	@Column(name="PHONE")
	private String phone;
	
	@Size(min=1,max=40)
	@Column(name="EMAIL")
	private String email;
	
	//Constructors
	
	//Getters & Setters
	
}
