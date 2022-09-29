package com.edgar.gymclass.controllers;

import java.util.Set;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edgar.gymclass.models.Client;
import com.edgar.gymclass.models.Trainer;
import com.edgar.gymclass.models.Training;
import com.edgar.gymclass.repositories.ClientRepository;
import com.edgar.gymclass.repositories.TrainerRepository;
import com.edgar.gymclass.repositories.TrainingRepository;
import com.edgar.gymclass.services.ClientService;
import com.edgar.gymclass.services.TrainerService;
import com.edgar.gymclass.services.TrainingService;

@RestController
@RequestMapping("/api")
public class clientTrainerTrainingRegistrationController {
	
	
	 /*
	  * Declare Services
	  */
	
	@Autowired
	private TrainerService trainerService; //trainer
	
	@Autowired
	private TrainingService trainingService; //training
	
		
	@Autowired
	private ClientService clientService; //client
	
	
	 /*
	  * Declare Repositories
	  */
	
	@Autowired
	private TrainingRepository t_repo;
	
	@Autowired
	private TrainerRepository TrainerRepo;
	
	@Autowired
	private ClientRepository clientRepo;
	
	
	/***********************************************************************
	 * Add section
	 ************************************************************************/
	
	
	@PostMapping("/trainer")
	public ResponseEntity<Trainer> newTrainer( @Valid @RequestBody Trainer trainer) { //Trainer
		Trainer newTrainer = trainerService.add(trainer);
		return ResponseEntity.ok(newTrainer);
		
	}
	
	
	@PostMapping("/training")
	public ResponseEntity<Training> newTrainingClass(@Valid @RequestBody Training training){ //training
		Training newTraining = trainingService.add(training);
		return ResponseEntity.ok(newTraining);
		
	}
	
	
	@PostMapping("/client")
	public ResponseEntity<Client> newClient(@Valid @RequestBody Client client){ //client
		Client newClient = clientService.add(client);
		return ResponseEntity.ok(newClient);
		
	}
	
	
	
	//get all
	
	//get one 
	
	//update one 
	
	// delete one 
	
	
	
	/* 
	 * 
	 * register client for training
	 * 
	 */
	@PostMapping("/register/client/training/{trainigId}")
	public void RegisterClientForGymClass(@PathVariable long trainigId, @RequestBody Set<Client>client){
		 trainingService.registerClientForTraining(trainigId, client);
	}
	

}
