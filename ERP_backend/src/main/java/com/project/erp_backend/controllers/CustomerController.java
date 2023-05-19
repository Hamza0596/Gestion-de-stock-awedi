package com.project.erp_backend.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.erp_backend.dto.CustomerDto;
import com.project.erp_backend.services.CustomerService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/erp/customer")
@CrossOrigin(origins = "*", maxAge = 3600)
@RequiredArgsConstructor
public class CustomerController {

	private final CustomerService service;

	@PostMapping
	public ResponseEntity<String> addCustomer(@RequestBody CustomerDto customerDto) {
		return ResponseEntity.ok(service.addCustomer(customerDto));
	}

	@GetMapping
	public ResponseEntity<List<CustomerDto>> getAllCustomers() {
		return ResponseEntity.ok(service.getAllCustomers());
	}

}
