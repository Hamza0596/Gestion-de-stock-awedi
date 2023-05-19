package com.project.erp_backend.entities;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer extends AbstractEntity {/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;
	
	private String email;
	
	private String code;
	
	private String currency;
	
	private String taxRegistrationNumber;
	
	private String adress;
	
	private String phone;
	

	

}
