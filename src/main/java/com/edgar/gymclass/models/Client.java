package com.edgar.gymclass.models;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;

@Entity
public class Client extends Person  {
	

	
	public Client() {
		
	}
	
	
	public Client(Long id, @NotBlank String fullname) {
		super(id, fullname);
		// TODO Auto-generated constructor stub
	}

	@ManyToMany( cascade = CascadeType.ALL, fetch = FetchType.LAZY) 
	private Set<Training> trainings;

	public Client(Long id, @NotBlank String fullname, Set<Training> trainings) {
		super(id, fullname);
		this.trainings = trainings;
	}
	
	
	

	

	

}
