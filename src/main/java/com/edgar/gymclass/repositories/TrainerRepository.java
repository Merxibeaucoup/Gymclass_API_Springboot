package com.edgar.gymclass.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edgar.gymclass.models.Trainer;


@Repository
public interface TrainerRepository extends JpaRepository<Trainer, Long> {

}