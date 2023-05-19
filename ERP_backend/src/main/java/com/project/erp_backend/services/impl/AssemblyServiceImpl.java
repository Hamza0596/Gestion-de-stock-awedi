package com.project.erp_backend.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.erp_backend.dto.AssemblyDto;
import com.project.erp_backend.entities.Assembly;
import com.project.erp_backend.enums.Type;
import com.project.erp_backend.helpers.ModelMapperConverter;
import com.project.erp_backend.repositories.AssemblyRepository;
import com.project.erp_backend.services.AssemblyService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AssemblyServiceImpl implements AssemblyService {

	private final AssemblyRepository repository;

	@Override
	public String addAssembly(AssemblyDto assemblyDto) {
		
		assemblyDto.setType(Type.ASSEMBLY);

		repository.save(ModelMapperConverter.map(assemblyDto, Assembly.class));

		return "L'assemblage a été ajouté avec succès";
	}

	@Override
	public List<AssemblyDto> getAssemblies() {

		return ModelMapperConverter.mapAll(repository.findAll(), AssemblyDto.class);
	}

}
