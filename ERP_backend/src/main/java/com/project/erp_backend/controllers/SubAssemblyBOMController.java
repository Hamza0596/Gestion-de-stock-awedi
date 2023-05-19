package com.project.erp_backend.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.erp_backend.dto.SubAssemblyBOMDto;
import com.project.erp_backend.services.SubAssemblyBOMService;

import lombok.RequiredArgsConstructor;


@RestController
@RequestMapping("/erp/subAssemblyBOM")
@CrossOrigin(origins = "*", maxAge = 3600)
@RequiredArgsConstructor
public class SubAssemblyBOMController {
	
	private final SubAssemblyBOMService service;
	
	@PostMapping
	public ResponseEntity<String> addSubAssemblyBOM(@RequestBody SubAssemblyBOMDto subAssemblyBOMDto) {
		return ResponseEntity.ok(service.addSubAssemblyBOM(subAssemblyBOMDto));
	}
	
	@GetMapping("subAssembly/{subAssemblyId}")
	public ResponseEntity<List<SubAssemblyBOMDto>> getSubAssemblyBOM(@PathVariable Long subAssemblyId) {
		return ResponseEntity.ok(service.getSubAssemblyBOM(subAssemblyId));
	}
	
	@GetMapping
	public ResponseEntity<List<SubAssemblyBOMDto>> getSubAssembliesBOMs() {
		return ResponseEntity.ok(service.getSubAssembliesBOMs());
	}
	

}
