package com.lo54.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.ForeignKey;

@SuppressWarnings({ "serial", "deprecation" })
@Entity
public class Client implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_CLIENT")
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

	@ManyToOne
	@JoinColumn(name="ID_COURSESESSION")
	@ForeignKey(name="fk_idcourseSession")
	private CourseSession courseSession;
	
	//Constructors
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	
		
	
	public Client(@NotNull @Size(min = 1, max = 40) String lastName, @NotNull @Size(min = 1, max = 40) String firstName,
			@NotNull @Size(min = 1, max = 120) String address, @NotNull @Size(min = 1, max = 20) String phone,
			@Size(min = 1, max = 40) String email, CourseSession courseSession) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.courseSession = courseSession;
	}


	//Getters & Setters
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}



	public CourseSession getCourseSession() {
		return courseSession;
	}



	public void setCourseSession(CourseSession courseSession) {
		this.courseSession = courseSession;
	}

	
}
