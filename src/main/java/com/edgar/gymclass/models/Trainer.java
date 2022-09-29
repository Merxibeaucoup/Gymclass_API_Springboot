package com.edgar.gymclass.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;


@Entity
public class Trainer extends Person {
	
	public Trainer() {
		
	}
	

	public Trainer(Long id, @NotBlank String fullname) {
		super(id, fullname);
		// TODO Auto-generated constructor stub
	}

}
