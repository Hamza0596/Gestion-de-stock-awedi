package com.project.erp_backend.dto;

import com.project.erp_backend.entities.Category;
import com.project.erp_backend.enums.Type;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SubAssemblyDto {

	private String code;

	private String designation;

	private double manufacturingCost;

	private double deliveryCost;

	private double preparationTime;

	private double manufacturingTime;

	private double waitingTime;

	private double deliveryTime;
	
	private int numberOperators;

	private Category category;
	
	private Type type;

}
