package com.edgar.gymclass.models;

import java.time.LocalDateTime;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Schedule {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	private LocalDateTime startDate;
	
	private LocalDateTime endDate;
	
	private Long duration;
	
	private String location;
	
	@OneToOne( cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER) 
	private Training training;

	public Schedule(Long id, LocalDateTime startDate, LocalDateTime endDate, Long duration, String location,
			Training training) {
		super();
		this.id = id;
		this.startDate = startDate;
		this.endDate = endDate;
		this.duration = duration;
		this.location = location;
		this.training = training;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDateTime startDate) {
		this.startDate = startDate;
	}

	public LocalDateTime getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDateTime endDate) {
		this.endDate = endDate;
	}

	public Long getDuration() {
		return duration;
	}

	public void setDuration(Long duration) {
		this.duration = duration;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Training getTraining() {
		return training;
	}

	public void setTraining(Training training) {
		this.training = training;
	}

	@Override
	public String toString() {
		return "Schedule [id=" + id + ", starteDate=" + startDate + ", endDate=" + endDate + ", duration=" + duration
				+ ", location=" + location + ", training=" + training + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(duration, endDate, id, location, startDate, training);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Schedule other = (Schedule) obj;
		return Objects.equals(duration, other.duration) && Objects.equals(endDate, other.endDate)
				&& Objects.equals(id, other.id) && Objects.equals(location, other.location)
				&& Objects.equals(startDate, other.startDate) && Objects.equals(training, other.training);
	}

	
	
	
	

}
