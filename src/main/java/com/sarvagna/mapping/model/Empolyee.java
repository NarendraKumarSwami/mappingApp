package com.sarvagna.mapping.model;



import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import lombok.Builder;
import lombok.Data;

@Data
@Entity
@Builder
public class Empolyee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer empId;
	
	public String name;
	
	public Double salary;
	
	
	@ElementCollection(fetch = FetchType.LAZY)
	@Embedded
	@JoinTable(name="emps_address", joinColumns = @JoinColumn(name="empid"))
	public List<Address> addresses;
	
	
	
	

}
