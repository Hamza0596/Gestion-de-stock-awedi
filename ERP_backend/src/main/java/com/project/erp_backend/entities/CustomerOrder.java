package com.project.erp_backend.entities;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.project.erp_backend.enums.OrderStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerOrder extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	private String code;

	private LocalDateTime OrderDate;

	@ManyToOne
	private Customer customer;

	private OrderStatus orderStatus;
	
	@OneToMany
	private List<CustomerOrderLine> customerOrderLines;

}
