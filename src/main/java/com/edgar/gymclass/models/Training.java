package com.edgar.gymclass.models;

import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;

@Entity
public class Training {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	@NotBlank
	private String className;

	@Column(nullable = false)
	@NotBlank
	private String intensity;

	@Column(nullable = false)
	@NotBlank
	private String type;

	@Column(nullable = false)
	@NotBlank
	private Long maxClassSize;

	@Column
	private Integer attendees ;

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Client> clients;

	@Column(nullable = false)
	private Trainer trainer;

	@Column(nullable = false)
	private Schedule schedule;

	

	public Training(Long id, @NotBlank String className, @NotBlank String intensity, @NotBlank String type,
			@NotBlank Long maxClassSize, Integer attendees, Set<Client> clients, Trainer trainer, Schedule schedule) {
		super();
		this.id = id;
		this.className = className;
		this.intensity = intensity;
		this.type = type;
		this.maxClassSize = maxClassSize;
		this.attendees = attendees;
		this.clients = clients;
		this.trainer = trainer;
		this.schedule = schedule;
	}
	
	

	public Set<Client> getClients() {
		return clients;
	}



	public void setClients(Set<Client> clients) {
		this.clients = clients;
	}



	public void setAttendees(Integer attendees) {
		this.attendees = attendees;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getIntensity() {
		return intensity;
	}

	public void setIntensity(String intensity) {
		this.intensity = intensity;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Long getMaxClassSize() {
		return maxClassSize;
	}

	public void setMaxClassSize(Long maxClassSize) {
		this.maxClassSize = maxClassSize;
	}

	public int getAttendees() {
		return attendees;
	}

	public void setAttendees(int attendees) {
		this.attendees = attendees;
	}

	

	public Trainer getTrainer() {
		return trainer;
	}

	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}

	public Schedule getSchedule() {
		return schedule;
	}

	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}
	

	

	@Override
	public String toString() {
		return "Training [id=" + id + ", className=" + className + ", intensity=" + intensity + ", type=" + type
				+ ", maxClassSize=" + maxClassSize + ", attendees=" + attendees + ", clients=" + clients + ", trainer="
				+ trainer + ", schedule=" + schedule + "]";
	}



	@Override
	public int hashCode() {
		return Objects.hash(attendees, className, clients, id, intensity, maxClassSize, schedule, trainer, type);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Training other = (Training) obj;
		return Objects.equals(attendees, other.attendees) && Objects.equals(className, other.className)
				&& Objects.equals(clients, other.clients) && Objects.equals(id, other.id)
				&& Objects.equals(intensity, other.intensity) && Objects.equals(maxClassSize, other.maxClassSize)
				&& Objects.equals(schedule, other.schedule) && Objects.equals(trainer, other.trainer)
				&& Objects.equals(type, other.type);
	}



	

}
