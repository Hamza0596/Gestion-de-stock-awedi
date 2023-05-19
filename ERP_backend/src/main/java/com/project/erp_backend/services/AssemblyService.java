package com.project.erp_backend.services;

import java.util.List;

import com.project.erp_backend.dto.AssemblyDto;

public interface AssemblyService {

	public String addAssembly(AssemblyDto assemblyDto);

	public List<AssemblyDto> getAssemblies();

}
