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

import com.project.erp_backend.dto.CustomerOrderDto;
import com.project.erp_backend.entities.CustomerOrderLine;
import com.project.erp_backend.services.CustomerOrderService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/erp/customerOrder")
@CrossOrigin(origins = "*", maxAge = 3600)
@RequiredArgsConstructor
public class CustomerOrderController {
	
	private final CustomerOrderService service;

	@PostMapping
	public ResponseEntity<String> addCustomerOrder(@RequestBody CustomerOrderDto customerOrderDto) {
		return ResponseEntity.ok(service.addCustomerOrder(customerOrderDto));
	}
	
	@GetMapping("{customerOrderId}")
	public ResponseEntity<List<CustomerOrderLine>> getCustomerOrderLines(@PathVariable long customerOrderId ) {
		return ResponseEntity.ok(service.getCustomerOrderLines(customerOrderId));
	}

}
