package com.conventiontracker.conventions.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import java.time.LocalDate;

@Entity
public class Convention {

	@Id
	@GeneratedValue
	private Long id;

	private String name;
	private String location;
	private LocalDate startDate;
	private LocalDate endDate;
	private String description;

	public Convention() {
	}

	public Convention(String name, String location, LocalDate startDate, LocalDate endDate, String description) {
		this.name = name;
		this.location = location;
		this.startDate = startDate;
		this.endDate = endDate;
		this.description = description;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}