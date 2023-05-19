package com.project.erp_backend.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.erp_backend.dto.AssemblyDto;
import com.project.erp_backend.services.AssemblyService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/erp/Assembly")
@CrossOrigin(origins = "*", maxAge = 3600)
@RequiredArgsConstructor
public class AssemblyController {

	private final AssemblyService service;

	@PostMapping
	public ResponseEntity<String> addAssembly(@RequestBody AssemblyDto assemblyDto) {
		return ResponseEntity.ok(service.addAssembly(assemblyDto));
	}

	@GetMapping
	public ResponseEntity<List<AssemblyDto>> getAssemblies() {
		return ResponseEntity.ok(service.getAssemblies());
	}

}
