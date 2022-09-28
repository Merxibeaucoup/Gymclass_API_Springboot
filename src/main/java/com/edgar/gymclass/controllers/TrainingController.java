package com.edgar.gymclass.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edgar.gymclass.repositories.TrainingRepository;
import com.edgar.gymclass.services.TrainingService;

@RestController
@RequestMapping("api/training/")
public class TrainingController {
	
	
	@Autowired
	private TrainingService t_serv;
	
	private TrainingRepository t_repo;
	
	// add
	
	//get all
	
	//get one 
	
	//update one 
	
	// delete one 
	
	// register client to training
	

}
