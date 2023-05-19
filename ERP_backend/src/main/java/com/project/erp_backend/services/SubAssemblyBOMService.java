package com.project.erp_backend.services;

import java.util.List;

import com.project.erp_backend.dto.SubAssemblyBOMDto;



public interface SubAssemblyBOMService {
	
	public String addSubAssemblyBOM(SubAssemblyBOMDto subAssemblyBOMDto);
	
	public List<SubAssemblyBOMDto> getSubAssemblyBOM(Long subAssemblyId);
	
	public List<SubAssemblyBOMDto> getSubAssembliesBOMs();

}
