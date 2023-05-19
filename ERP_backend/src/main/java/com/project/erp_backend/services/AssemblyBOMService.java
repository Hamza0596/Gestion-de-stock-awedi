package com.project.erp_backend.services;

import java.util.List;

import com.project.erp_backend.dto.AssemblyBOMDto;
import com.project.erp_backend.dto.SubAssemblyDto;

public interface AssemblyBOMService {
	
	public String addAssemblyBOM(AssemblyBOMDto assemblyBOMDto);
	
	public List<SubAssemblyDto> getAssemblyBOM(Long assemblyId);
	
	public List<AssemblyBOMDto> getAssembliesBOMs();


}
