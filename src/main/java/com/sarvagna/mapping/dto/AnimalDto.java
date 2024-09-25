package com.sarvagna.mapping.dto;

import com.sarvagna.mapping.model.Cat;
import com.sarvagna.mapping.model.Dog;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AnimalDto {
	

	 public String color;
	 
	 public double weight;
	 
	 
	 public Dog dog;
	 
	 
	 public Cat cat;
	

}
