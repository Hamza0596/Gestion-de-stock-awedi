package com.project.erp_backend.dto;

import java.time.LocalDateTime;
import java.util.Set;

import com.project.erp_backend.entities.Customer;
import com.project.erp_backend.entities.CustomerOrderLine;
import com.project.erp_backend.enums.OrderStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerOrderDto {
	
	private String code;

	private LocalDateTime OrderDate;

	private Customer customer;

	private OrderStatus orderStatus;
	
	private Set<CustomerOrderLine> customerOrderLines;

}
