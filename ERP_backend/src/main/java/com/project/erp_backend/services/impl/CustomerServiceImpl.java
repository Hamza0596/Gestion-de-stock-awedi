package com.project.erp_backend.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.erp_backend.dto.CustomerDto;
import com.project.erp_backend.entities.Customer;
import com.project.erp_backend.helpers.ModelMapperConverter;
import com.project.erp_backend.repositories.CustomerRepository;
import com.project.erp_backend.services.CustomerService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

	private final CustomerRepository repository;

	@Override
	public String addCustomer(CustomerDto customerDto) {
		repository.save(ModelMapperConverter.map(customerDto, Customer.class));

		return "Le client a été ajouté avec succès";
	}

	@Override
	public List<CustomerDto> getAllCustomers() {
		return ModelMapperConverter.mapAll(repository.findAll(), CustomerDto.class);
	}

}
