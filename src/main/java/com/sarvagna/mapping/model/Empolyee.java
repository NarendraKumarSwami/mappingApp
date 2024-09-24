package com.sarvagna.mapping.model;



import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Empolyee {
	
	@Id
	public Integer empId;
	
	public String name;
	
	public Double salary;
	
	
	@Embedded
	public Address address;
	
	
	
	

}
