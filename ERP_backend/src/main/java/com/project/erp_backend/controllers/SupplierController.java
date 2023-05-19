package com.project.erp_backend.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.erp_backend.dto.SupplierDto;
import com.project.erp_backend.services.SupplierService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/erp/supplier")
@CrossOrigin(origins = "*", maxAge = 3600)
@RequiredArgsConstructor
public class SupplierController {

	private final SupplierService service;

	@PostMapping
	public ResponseEntity<String> addSupplier(@RequestBody SupplierDto supplierDto) {
		return ResponseEntity.ok(service.addSupplier(supplierDto));
	}

	@GetMapping
	public ResponseEntity<List<SupplierDto>> getAllSuppliers() {
		return ResponseEntity.ok(service.getAllSuppliers());

	}
}
