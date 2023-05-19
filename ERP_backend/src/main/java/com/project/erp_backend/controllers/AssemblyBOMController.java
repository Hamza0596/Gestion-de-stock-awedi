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

import com.project.erp_backend.dto.AssemblyBOMDto;
import com.project.erp_backend.dto.SubAssemblyDto;
import com.project.erp_backend.services.AssemblyBOMService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/erp/AssemblyBOM")
@CrossOrigin(origins = "*", maxAge = 3600)
@RequiredArgsConstructor
public class AssemblyBOMController {

	
	private final AssemblyBOMService service;
	
	@PostMapping
	public ResponseEntity<String> addAssemblyBOM(@RequestBody AssemblyBOMDto assemblyBOMDto) {
		return ResponseEntity.ok(service.addAssemblyBOM(assemblyBOMDto));
	}
	
	@GetMapping("assembly/{assemblyId}")
	public ResponseEntity<List<SubAssemblyDto>> getAssemblyBOM(@PathVariable Long assemblyId) {
		return ResponseEntity.ok(service.getAssemblyBOM(assemblyId));
	}
	
	@GetMapping
	public ResponseEntity<List<AssemblyBOMDto>> getAssembliesBOMs() {
		return ResponseEntity.ok(service.getAssembliesBOMs());
	}
	
	
}
