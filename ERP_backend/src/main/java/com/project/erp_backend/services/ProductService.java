package com.project.erp_backend.services;

import org.springframework.data.domain.Page;

import com.project.erp_backend.dto.ProductDto;

public interface ProductService {
	
	public ProductDto addProduct(ProductDto productDto);
	
	public Page<ProductDto> getAllProducts(int page,int pageSize);
	
	

}
