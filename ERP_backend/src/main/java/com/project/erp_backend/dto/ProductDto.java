package com.project.erp_backend.dto;

import com.project.erp_backend.entities.Category;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {

	private String code;
	private String designation;
	private double price;
	private Category category;
	private int leadTime;
	private int stockMin;

}
