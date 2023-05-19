package com.project.erp_backend.entities;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Category extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	private String code;

	private String designation;
	
	

}
