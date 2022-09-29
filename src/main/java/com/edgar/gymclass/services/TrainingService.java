package com.edgar.gymclass.services;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edgar.gymclass.models.Client;
import com.edgar.gymclass.models.Training;
import com.edgar.gymclass.repositories.TrainingRepository;

@Service
public class TrainingService {

	@Autowired
	private TrainingRepository trainingRepo;

	// add

	public Training add(Training training) {
		return trainingRepo.save(training);

	}

	// get all
	public List<Training> getAll() {
		return trainingRepo.findAll();
	}

	// get one

	public Training getOne(long id) {
		return trainingRepo.findById(id).get();
	}

	// update one

	public Training updateOne(long id, Training training) {
		training.setId(id);
		return trainingRepo.save(training);
	}

	// delete one
	public void deleteOne(long id) {
		trainingRepo.deleteById(id);
	}

	// register for Training
	public void registerClientForTraining(long trainingId, Set<Client> client) {
		Optional<Training> trainingOpt = trainingRepo.findById(trainingId);

		// if id not present
		if (!trainingOpt.isPresent()) {
			throw new IllegalStateException("failed to register client. Invalid training Id  ::" + trainingId);
		} 
		else {

			Training training = trainingOpt.get();
			client.addAll(training.getClients());
			training.setClients(client);
			trainingRepo.save(training);

		}
	}

}
