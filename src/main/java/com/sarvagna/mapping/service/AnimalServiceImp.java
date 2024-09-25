package com.sarvagna.mapping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sarvagna.mapping.dto.AnimalDto;
import com.sarvagna.mapping.model.Animal;
import com.sarvagna.mapping.model.Cat;
import com.sarvagna.mapping.model.Dog;
import com.sarvagna.mapping.repo.AnimalRepo;


@Service
public class AnimalServiceImp implements AnimalService {
	
	@Autowired
	public AnimalRepo animalRepo;

	@Override
	public Animal addAnimal(AnimalDto animalDto) {
		// TODO Auto-generated method stub
		
		
		if(animalDto.getCat() != null) {
			 
			 Cat c = new Cat();
					 
			c.setColor(animalDto.getColor());
			c.setWeight(animalDto.getWeight());
			c.setAge(animalDto.getCat().getAge());
			c.setName(animalDto.getCat().getName());
			
			 return animalRepo.save(c);
			  
		}else {
			Dog d = new Dog();
			 
				d.setColor(animalDto.getColor());
				d.setWeight(animalDto.getWeight());
				
				d.setName(animalDto.getDog().getName());
				
			 return	animalRepo.save(d);
			
		}
		
		
		
		
	}

}
