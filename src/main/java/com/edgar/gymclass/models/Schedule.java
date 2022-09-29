package com.edgar.gymclass.models;

import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Schedule {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	private LocalDate startDate;
	
	private LocalDate endDate;
	
	private Long duration;
	
	private String location;
	
	
	
	public Schedule() {
		
	}

	public Schedule(Long id, LocalDate startDate, LocalDate endDate, Long duration, String location) {
		super();
		this.id = id;
		this.startDate = startDate;
		this.endDate = endDate;
		this.duration = duration;
		this.location = location;
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	

	@Override
	public String toString() {
		return "Schedule [id=" + id + ", starteDate=" + startDate + ", endDate=" + endDate + ", duration=" + duration
				+ ", location=" + location + ", training=" +   "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(duration, endDate, id, location, startDate);
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
				&& Objects.equals(startDate, other.startDate) ;
	}

	
	
	
	

}
