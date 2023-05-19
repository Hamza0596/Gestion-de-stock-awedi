package com.project.erp_backend.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.erp_backend.dto.AssemblyBOMDto;
import com.project.erp_backend.dto.SubAssemblyDto;
import com.project.erp_backend.entities.AssemblyBOM;
import com.project.erp_backend.helpers.ModelMapperConverter;
import com.project.erp_backend.repositories.AssemblyBOMRepository;
import com.project.erp_backend.services.AssemblyBOMService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AssemblyBOMServiceImpl implements AssemblyBOMService {

	private final AssemblyBOMRepository repository;

	@Override
	public String addAssemblyBOM(AssemblyBOMDto assemblyBOMDto) {

		repository.save(ModelMapperConverter.map(assemblyBOMDto, AssemblyBOM.class));

		return "Le sous-assemblage a été ajouté à l'assemblage avec succès";
	}

	@Override
	public List<SubAssemblyDto> getAssemblyBOM(Long assemblyId) {
	
		return ModelMapperConverter.mapAll( repository.findByAssemblyId(assemblyId), SubAssemblyDto.class);
	}

	@Override
	public List<AssemblyBOMDto> getAssembliesBOMs() {
		
		return ModelMapperConverter.mapAll(repository.findAll(), AssemblyBOMDto.class) ;
	}

}
