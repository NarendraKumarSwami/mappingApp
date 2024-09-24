package com.sarvagna.mapping.model;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Address {
	
	
	
	public String state;
	
	public String city;
	
	
	public String pincode;

}
