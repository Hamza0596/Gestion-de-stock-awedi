package com.project.erp_backend.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.erp_backend.dto.CategoryDto;
import com.project.erp_backend.helpers.ModelMapperConverter;
import com.project.erp_backend.repositories.CategoryRepository;
import com.project.erp_backend.services.CategoryService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {
	
	private final CategoryRepository repository;

	@Override
	public List<CategoryDto> getAllCategories() {
		
		return ModelMapperConverter.mapAll(repository.findAll(),CategoryDto.class);
	}

}
