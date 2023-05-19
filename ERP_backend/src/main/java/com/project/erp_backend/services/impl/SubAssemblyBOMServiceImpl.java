package com.project.erp_backend.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.erp_backend.dto.SubAssemblyBOMDto;
import com.project.erp_backend.entities.SubAssemblyBOM;
import com.project.erp_backend.helpers.ModelMapperConverter;
import com.project.erp_backend.repositories.SubAssemblyBOMRepository;
import com.project.erp_backend.services.SubAssemblyBOMService;

import lombok.RequiredArgsConstructor;



@Service
@RequiredArgsConstructor
public class SubAssemblyBOMServiceImpl implements SubAssemblyBOMService {
	
	private final SubAssemblyBOMRepository repository;

	@Override
	public String addSubAssemblyBOM(SubAssemblyBOMDto subAssemblyBOMDto) {
		
	repository.save(ModelMapperConverter.map(subAssemblyBOMDto, SubAssemblyBOM.class));
		
		return "Le produit a été ajouté au sous assemblage avec succès";
	}

	@Override
	public List<SubAssemblyBOMDto> getSubAssemblyBOM(Long subAssemblyId) {
		
		return ModelMapperConverter.mapAll( repository.findBySubAssemblyId(subAssemblyId), SubAssemblyBOMDto.class);
	}

	@Override
	public List<SubAssemblyBOMDto> getSubAssembliesBOMs() {
		
		return ModelMapperConverter.mapAll(repository.findAll(), SubAssemblyBOMDto.class) ;
	}

}
