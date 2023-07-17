package com.coforge.jobs.entities;

import org.hibernate.annotations.GeneratorType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class JobApplication {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	private String qualification;
	private String location;
	private String percentage;
	private int yearOfPassedOut;
	private String[] languagesKnown;
	@ManyToOne
    @JoinColumn(name = "user_id")
	private User user;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getPercentage() {
		return percentage;
	}
	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}
	public int getYearOfPassedOut() {
		return yearOfPassedOut;
	}
	public void setYearOfPassedOut(int yearOfPassedOut) {
		this.yearOfPassedOut = yearOfPassedOut;
	}
	public String[] getLanguagesKnown() {
		return languagesKnown;
	}
	public void setLanguagesKnown(String[] languagesKnown) {
		this.languagesKnown = languagesKnown;
	}
	
	
	
	

}
