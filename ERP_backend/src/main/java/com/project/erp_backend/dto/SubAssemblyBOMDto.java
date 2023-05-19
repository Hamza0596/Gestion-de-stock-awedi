package com.project.erp_backend.dto;

import com.project.erp_backend.entities.Product;
import com.project.erp_backend.entities.SubAssembly;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SubAssemblyBOMDto {

	Product product;

	SubAssembly subAssembly;

	int quantity;

}
