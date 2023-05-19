package com.project.erp_backend.services.impl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.project.erp_backend.dto.SubAssemblyDto;
import com.project.erp_backend.entities.SubAssembly;
import com.project.erp_backend.enums.Type;
import com.project.erp_backend.helpers.ModelMapperConverter;
import com.project.erp_backend.repositories.SubAssemblyRepository;
import com.project.erp_backend.services.SubAssemblyService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SubAssemblyServiceImpl implements SubAssemblyService {

	private final SubAssemblyRepository repository;

	@Override
	public SubAssemblyDto addSubAssembly(SubAssemblyDto subAssemblyDto) {
		subAssemblyDto.setType(Type.SUBASSEMBLY);

		repository.save(ModelMapperConverter.map(subAssemblyDto, SubAssembly.class));

		return subAssemblyDto;

	}

	@Override
	public Page<SubAssemblyDto> getSubAssemblies(int page,int pageSize) {
		return repository.findAll(PageRequest.of(page, pageSize))
				.map(entity -> ModelMapperConverter.map(entity, SubAssemblyDto.class));
	}

}
