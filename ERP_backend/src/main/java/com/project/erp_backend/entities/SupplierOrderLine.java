package com.project.erp_backend.entities;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SupplierOrderLine extends AbstractEntity {
	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	@ManyToOne
	private Product product;

	@ManyToOne
	private SupplierOrder supplierOrder;

	private int quantity;
}
