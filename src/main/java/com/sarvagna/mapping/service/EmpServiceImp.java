package com.sarvagna.mapping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sarvagna.mapping.dto.EmployeeDto;
import com.sarvagna.mapping.model.Empolyee;
import com.sarvagna.mapping.repo.EmpRepository;

import jakarta.transaction.Transactional;




@Service
public class EmpServiceImp  implements EmpService {
	
	
	@Autowired
	private EmpRepository empRepo;

	@Override
	public String addEmployee(EmployeeDto empDto) {
		// TODO Auto-generated method stub
		
		// create 
	Empolyee emp = Empolyee.builder()
		        .addresses(empDto.getAddresses())
		        .name(empDto.getName())
		        .salary(empDto.getSalary())
		        .build();
		        
		
		
	    Empolyee emp1 =  empRepo.save(emp);
	    
	    
	    System.out.println(emp1);
		
		return "employee is saved";
	}
 
}
