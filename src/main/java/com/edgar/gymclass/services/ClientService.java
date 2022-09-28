package com.edgar.gymclass.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edgar.gymclass.models.Client;
import com.edgar.gymclass.repositories.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository clientRepo;
	
	//add

	public Client add(Client client ) {
		return clientRepo.save(client);
	}
	
	//get all 
	
	public List<Client> getAll(){
		return clientRepo.findAll();
	}
	
	//get one 
	public Client getOne(long id) {
		return clientRepo.findById(id).get();
	}
	
	//update one 
	
	public Client updateOne(long id, Client client) {
		client.setId(id);
		return clientRepo.save(client);
	}
	
	//delete one
	public void deleteOne(long id) {
		clientRepo.deleteById(id);
	}
	

}
