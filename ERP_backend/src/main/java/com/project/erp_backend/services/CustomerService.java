package com.project.erp_backend.services;

import java.util.List;

import com.project.erp_backend.dto.CustomerDto;

public interface CustomerService {
	
	public String addCustomer(CustomerDto customerDto);

	public List<CustomerDto> getAllCustomers();

}
