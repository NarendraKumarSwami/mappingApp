package com.sarvagna.mapping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sarvagna.mapping.dto.AnimalDto;
import com.sarvagna.mapping.model.Animal;
import com.sarvagna.mapping.service.AnimalService;


@RestController
public class AnimalController {
	
	@Autowired
	public AnimalService animalService;
	
	@PostMapping("/animal")
	public ResponseEntity<Animal> addAnimal(@RequestBody AnimalDto animaldto) {
		
		
		   System.out.println(animaldto);
		
		
		return new ResponseEntity(animalService.addAnimal(animaldto), HttpStatus.CREATED);
		
		
	}

}
