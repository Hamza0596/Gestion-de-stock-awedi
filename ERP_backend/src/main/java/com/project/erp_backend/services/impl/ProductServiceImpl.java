package com.project.erp_backend.services.impl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.project.erp_backend.dto.ProductDto;
import com.project.erp_backend.entities.Product;
import com.project.erp_backend.helpers.ModelMapperConverter;
import com.project.erp_backend.repositories.ProductRepository;
import com.project.erp_backend.services.ProductService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

	private final ProductRepository repository;

	@Override
	public ProductDto addProduct(ProductDto productDto) {

		repository.save(ModelMapperConverter.map(productDto, Product.class));

		return productDto;

	}

	@Override
	public Page<ProductDto> getAllProducts(int page, int pageSize) {

		return repository.findAll(PageRequest.of(page, pageSize))
				.map(entity -> ModelMapperConverter.map(entity, ProductDto.class));
	}
}
