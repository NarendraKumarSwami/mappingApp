package com.sarvagna.mapping.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sarvagna.mapping.model.Animal;

public interface AnimalRepo extends JpaRepository<Animal, Integer> {
	
	
	

}
