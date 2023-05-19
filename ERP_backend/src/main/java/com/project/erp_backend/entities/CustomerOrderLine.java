package com.project.erp_backend.entities;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import com.project.erp_backend.enums.OrderStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerOrderLine extends AbstractEntity {/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ManyToOne
	private SubAssembly subAssembly;
	
	@ManyToOne
	private Assembly assembly;
	
	private OrderStatus orderStatus;
	
	private int quantity;
	
}
