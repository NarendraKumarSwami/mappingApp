package com.sarvagna.mapping.dto;

import java.util.List;

import com.sarvagna.mapping.model.Address;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmployeeDto {
	
	
	  public String name;
	  
	  public Double salary;
	  
	  
	  
	  public List<Address> addresses;

}
