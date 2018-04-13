package com.lo54.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.ForeignKey;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;


@SuppressWarnings({ "serial", "deprecation" })
@Entity
public class CourseSession implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_COURSESESSION")
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

	@OneToMany(mappedBy="courseSession")
	private Collection<Client> clients;
	
	@ManyToOne
	@JoinColumn(name="CODE_COURSE")
	@ForeignKey(name="fk_codecourse")
	private Course course;
	
	@ManyToOne
	@JoinColumn(name="ID_LOCATION")
	@ForeignKey(name="fk_idlocation")
	private Location location;
	
	//Constructors
	public CourseSession() {
		super();
		// TODO Auto-generated constructor stub
	}
		
	public CourseSession(int id, @NotNull LocalDate startDate, @NotNull LocalDate endDate, int max,
			Collection<Client> clients, Course course, Location location) {
		super();
		
		this.startDate = startDate;
		this.endDate = endDate;
		this.max = max;
		this.clients = clients;
		this.course = course;
		this.location = location;
	}





	//Getters & Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public Collection<Client> getClients() {
		return clients;
	}

	public void setClients(Collection<Client> clients) {
		this.clients = clients;
	}

	
}
