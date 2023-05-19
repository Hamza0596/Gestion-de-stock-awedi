package com.project.erp_backend.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.project.erp_backend.dto.CustomerOrderDto;
import com.project.erp_backend.entities.CustomerOrder;
import com.project.erp_backend.entities.CustomerOrderLine;
import com.project.erp_backend.helpers.ModelMapperConverter;
import com.project.erp_backend.repositories.CustomerOrderLineRepository;
import com.project.erp_backend.repositories.CustomerOrderRepository;
import com.project.erp_backend.services.CustomerOrderService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CustomerOrderServiceImpl implements CustomerOrderService {
	
	private final CustomerOrderRepository repository;
	
	private final CustomerOrderLineRepository customerOrderLinerepository;

	@Override
	public String addCustomerOrder(CustomerOrderDto customerOrderDto) {
		
		customerOrderDto.getCustomerOrderLines().forEach(customerOrderLine ->customerOrderLinerepository.save(customerOrderLine) );
		
		repository.save(ModelMapperConverter.map(customerOrderDto, CustomerOrder.class));

		return "La commande client a été ajouté avec succès";
	}

	@Override
	public List<CustomerOrderLine> getCustomerOrderLines(long customerOrderId) {
		
		Optional<CustomerOrder> customerOrder=repository.findById(customerOrderId);
		CustomerOrder found = null;
		
		if (!customerOrder.isEmpty()) 
			found = customerOrder.get();
		
		return (List<CustomerOrderLine>) found.getCustomerOrderLines();
	}

}
