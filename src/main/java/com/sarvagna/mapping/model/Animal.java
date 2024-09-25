package com.sarvagna.mapping.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;

@Data
@MappedSuperclass
public class Animal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer animalId;
	
	 public String color;
	 
	 public double weight;
	 
	 

}
