package com.project.erp_backend.services;

import java.util.List;

import com.project.erp_backend.dto.CustomerOrderDto;
import com.project.erp_backend.entities.CustomerOrderLine;

public interface CustomerOrderService {
	
	public String addCustomerOrder(CustomerOrderDto customerOrderDto);
	
	public List<CustomerOrderLine>  getCustomerOrderLines(long customerOrderId);

}
