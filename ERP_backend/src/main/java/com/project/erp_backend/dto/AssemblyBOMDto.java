package com.project.erp_backend.dto;

import com.project.erp_backend.entities.Assembly;
import com.project.erp_backend.entities.SubAssembly;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AssemblyBOMDto {

	Assembly assembly;

	SubAssembly subAssembly;

	int quantity;
}
