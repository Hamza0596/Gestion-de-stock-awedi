package com.project.erp_backend.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.erp_backend.dto.CategoryDto;
import com.project.erp_backend.services.CategoryService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/erp/category")
@CrossOrigin(origins = "*", maxAge = 3600)
@RequiredArgsConstructor
public class CategoryController {
	
	private final CategoryService service;
	
	@GetMapping
	public ResponseEntity<List<CategoryDto>> getAllCategories() {
		return ResponseEntity.ok(service.getAllCategories());
	}

}
