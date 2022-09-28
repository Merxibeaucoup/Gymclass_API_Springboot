package com.edgar.gymclass.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edgar.gymclass.models.Client;

@Repository
public interface ClientRepository  extends JpaRepository<Client, Long> {

}
