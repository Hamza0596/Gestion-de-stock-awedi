package com.project.erp_backend.controllers;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.erp_backend.dto.ProductDto;
import com.project.erp_backend.services.ProductService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/erp/product")
@CrossOrigin(origins = "*", maxAge = 3600)
@RequiredArgsConstructor
public class ProductController {

	private final ProductService service;

	@PostMapping
	public ResponseEntity<ProductDto> addProduct(@RequestBody ProductDto productDto) {
		return ResponseEntity.ok(service.addProduct(productDto));
	}

	@GetMapping("/{page}/{pageSize}")
	public ResponseEntity<Page<ProductDto>> getAllProducts(@PathVariable int page, @PathVariable int pageSize) {
		return ResponseEntity.ok(service.getAllProducts(page,pageSize));
	}
}
