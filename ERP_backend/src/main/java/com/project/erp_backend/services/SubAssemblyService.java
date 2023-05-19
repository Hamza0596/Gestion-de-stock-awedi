package com.project.erp_backend.services;

import org.springframework.data.domain.Page;

import com.project.erp_backend.dto.SubAssemblyDto;

public interface SubAssemblyService {
	
	public SubAssemblyDto addSubAssembly(SubAssemblyDto subAssemblyDto);
	
	public Page<SubAssemblyDto> getSubAssemblies(int page,int pageSize);

}
