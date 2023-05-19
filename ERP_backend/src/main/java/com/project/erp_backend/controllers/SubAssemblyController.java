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

import com.project.erp_backend.dto.SubAssemblyDto;
import com.project.erp_backend.services.SubAssemblyService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/erp/subAssembly")
@CrossOrigin(origins = "*", maxAge = 3600)
@RequiredArgsConstructor
public class SubAssemblyController {

	private final SubAssemblyService service;

	@PostMapping
	public ResponseEntity<SubAssemblyDto> addSubAssembly(@RequestBody SubAssemblyDto subAssemblyDto) {
		return ResponseEntity.ok(service.addSubAssembly(subAssemblyDto));
	}
	
	@GetMapping("/{page}/{pageSize}")
	public ResponseEntity<Page<SubAssemblyDto>> getSubAssemblies(@PathVariable int page, @PathVariable int pageSize){
		return ResponseEntity.ok(service.getSubAssemblies(page,pageSize));
	}

}
