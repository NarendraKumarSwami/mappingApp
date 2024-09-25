package com.sarvagna.mapping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sarvagna.mapping.dto.EmployeeDto;
import com.sarvagna.mapping.service.EmpService;

@RestController
public class EmployeeController {
	
	  @Autowired
	  private EmpService empService;
	
	  @PostMapping("/emp")
	  public ResponseEntity<String> addEmpController(@RequestBody  EmployeeDto empDto){
		    
//		  System.out.println(empDto);
		
		  
		  return new ResponseEntity(empService.addEmployee(empDto), HttpStatus.CREATED);
	  }

}
