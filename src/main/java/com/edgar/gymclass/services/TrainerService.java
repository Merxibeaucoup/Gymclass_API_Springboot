package com.edgar.gymclass.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edgar.gymclass.models.Trainer;
import com.edgar.gymclass.repositories.TrainerRepository;

@Service
public class TrainerService {
	
	@Autowired
	private TrainerRepository trainerRepo;
	
	//add 
	
	public Trainer add(Trainer trainer) {
		return trainerRepo.save(trainer);
	}
	
	// get all 
	
	public List<Trainer> getAll(){
		return trainerRepo.findAll();
	}
	
	//get one
	
	public Trainer getOne(long id) {
		return trainerRepo.findById(id).get();
	}
	
	// update one
	
	public Trainer updateOne(long id , Trainer trainer) {
		trainer.setId(id);
		return trainerRepo.save(trainer);
	}
	
	//delete one 
	
	public void deleteOne(long id ) {
		trainerRepo.deleteById(id);
	}

}
